/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilitario;

import config.conexion;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.util.IOUtils;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
/**
 *
 * @author Miguel Casa
 */
public class EXCELcitas {
    
    public void reporteCitas(String order){
        
        // Obtiene la fecha actual
        LocalDate fechaActual = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String fechaTexto = fechaActual.format(formatter);
        
        // Ruta del archivo Excel de salida
        String ruta = System.getProperty("user.home");
        String rutaArchivo = ruta + "/Desktop/Reportes/Reporte_citas ("+ fechaTexto +").xlsx";

        try (Workbook workbook = new XSSFWorkbook()) {
            Sheet sheet = workbook.createSheet("Reporte de Citas");

            // Estilo de celda para el encabezado
            CellStyle headerStyle = workbook.createCellStyle();
            headerStyle.setBorderRight(BorderStyle.THIN);
            headerStyle.setAlignment(HorizontalAlignment.CENTER);
            headerStyle.setVerticalAlignment(VerticalAlignment.CENTER);
            headerStyle.setFillForegroundColor(IndexedColors.SKY_BLUE.getIndex());
            headerStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            Font headerFont = workbook.createFont();
            headerFont.setBold(true);
            headerStyle.setFont(headerFont);
            
            int imgIndex;
            InputStream is = getClass().getResourceAsStream("/img/logoLog.png"); 
            byte[] bytes = IOUtils.toByteArray(is);
            imgIndex = workbook.addPicture(bytes, Workbook.PICTURE_TYPE_PNG);
            

            CreationHelper help = workbook.getCreationHelper();
            Drawing draw = sheet.createDrawingPatriarch();

            ClientAnchor anchorImg = help.createClientAnchor();
            anchorImg.setCol1(9);
            anchorImg.setRow1(4);
            Picture pict = draw.createPicture(anchorImg, imgIndex);
            pict.resize(7, 17);
            
            Row dateRow = sheet.createRow(1);
            dateRow.createCell(0).setCellValue("Fecha de creación: "+fechaTexto);

            sheet.setColumnWidth(0, 2000); 
            sheet.setColumnWidth(1, 4000); 
            sheet.setColumnWidth(2, 4000); 
            sheet.setColumnWidth(3, 4000); 
            sheet.setColumnWidth(4, 5000); 
            sheet.setColumnWidth(5, 3000); 
            sheet.setColumnWidth(6, 3000); 
            sheet.setColumnWidth(7, 3000); 
            
            // Agrega el encabezado al documento Excel
            Row headerRow = sheet.createRow(3);
            String[] headers = {"ID", "CLIENTE", "MASCOTA", "VETERINARIO", "SERVICIO", "FECHA", "HORA", "ESTADO"};
            for (int i = 0; i < headers.length; i++) {
                Cell cell = headerRow.createCell(i);
                cell.setCellValue(headers[i]);
                cell.setCellStyle(headerStyle);
            }

            Connection cn;
            conexion conexion = new conexion();
            cn = conexion.getConnection();
            PreparedStatement ps;

            String sql = null;

            if (null != order) switch (order) {
                case "Id":
                    sql = "SELECT ID_CITA, ID_CLI, NOM_CLI, ID_PET, NOM_PET, ID_VET, NOM_VET, TIPO_CITA, FECHA_CITA, HORA_CITA, ESTADO_CITA FROM registrocitas ORDER BY ID_CITA ASC";
                    break;
                case "Cliente":
                    sql = "SELECT ID_CITA, ID_CLI, NOM_CLI, ID_PET, NOM_PET, ID_VET, NOM_VET, TIPO_CITA, FECHA_CITA, HORA_CITA, ESTADO_CITA FROM registrocitas ORDER BY NOM_CLI ASC";
                    break;
                case "Mascota":
                    sql = "SELECT ID_CITA, ID_CLI, NOM_CLI, ID_PET, NOM_PET, ID_VET, NOM_VET, TIPO_CITA, FECHA_CITA, HORA_CITA, ESTADO_CITA FROM registrocitas ORDER BY NOM_PET ASC";
                    break;
                case "Veterinario":
                    sql = "SELECT ID_CITA, ID_CLI, NOM_CLI, ID_PET, NOM_PET, ID_VET, NOM_VET, TIPO_CITA, FECHA_CITA, HORA_CITA, ESTADO_CITA FROM registrocitas ORDER BY NOM_VET ASC";
                    break;
                case "Servicio":
                    sql = "SELECT ID_CITA, ID_CLI, NOM_CLI, ID_PET, NOM_PET, ID_VET, NOM_VET, TIPO_CITA, FECHA_CITA, HORA_CITA, ESTADO_CITA FROM registrocitas ORDER BY TIPO_CITA ASC";
                    break;
                case "Fecha":
                    sql = "SELECT ID_CITA, ID_CLI, NOM_CLI, ID_PET, NOM_PET, ID_VET, NOM_VET, TIPO_CITA, FECHA_CITA, HORA_CITA, ESTADO_CITA FROM registrocitas ORDER BY FECHA_CITA ASC";
                    break;
                case "Hora":
                    sql = "SELECT ID_CITA, ID_CLI, NOM_CLI, ID_PET, NOM_PET, ID_VET, NOM_VET, TIPO_CITA, FECHA_CITA, HORA_CITA, ESTADO_CITA FROM registrocitas ORDER BY HORA_CITA ASC";
                    break;
                case "Estado":
                    sql = "SELECT ID_CITA, ID_CLI, NOM_CLI, ID_PET, NOM_PET, ID_VET, NOM_VET, TIPO_CITA, FECHA_CITA, HORA_CITA, ESTADO_CITA FROM registrocitas ORDER BY ESTADO_CITA ASC";
                    break;
                default:
                    break;
            }

            ps = cn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            CellStyle contentStyle = workbook.createCellStyle();
            contentStyle.setBorderRight(BorderStyle.THIN);
            contentStyle.setAlignment(HorizontalAlignment.CENTER);
            contentStyle.setFillForegroundColor(IndexedColors.YELLOW.getIndex());
            contentStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);

            // Recorre las filas del contenido y aplica el estilo a cada celda
            int rowNum = 4;
            while (rs.next()) {
                Row row = sheet.createRow(rowNum++);
                row.createCell(0).setCellValue(rs.getInt(1));
                row.createCell(1).setCellValue(rs.getString(3));
                row.createCell(2).setCellValue(rs.getString(5));
                row.createCell(3).setCellValue(rs.getString(7));
                row.createCell(4).setCellValue(rs.getString(8));
                row.createCell(5).setCellValue(rs.getString(9));
                row.createCell(6).setCellValue(rs.getString(10));
                row.createCell(7).setCellValue(rs.getString(11));

                for (int i = 0; i < headers.length; i++) {
                    Cell cell = row.getCell(i);
                    cell.setCellStyle(contentStyle);
                }
            }

            // Guarda el archivo Excel en la ubicación especificada
            try (FileOutputStream fileOut = new FileOutputStream(rutaArchivo)) {
                workbook.write(fileOut);
                JOptionPane.showMessageDialog(null, "Reporte Excel creado correctamente en su escritorio!", "OK", JOptionPane.INFORMATION_MESSAGE);
            } catch (IOException e) {
                System.out.println("Error al guardar el archivo Excel: " + e.getMessage());
            }
        } catch (SQLException e) {
            System.out.println("Error en el reporte de clientes " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error al crear el archivo Excel: " + e.getMessage());
        }

    }
}
