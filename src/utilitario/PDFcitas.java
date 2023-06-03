/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilitario;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import config.conexion;
import java.io.File;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Miguel Casa
 */
public class PDFcitas {
    
    public void reporteCitas(String order){
        
        // Obtiene la fecha actual
        LocalDate fechaActual = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String fechaTexto = fechaActual.format(formatter);
        
        // Ruta del archivo PDF de salida
        String ruta = System.getProperty("user.home");
        String folderPath = ruta + "/Desktop/Reportes";
        String rutaArchivo = folderPath + "/Reporte_citas (" + fechaTexto + ").pdf";
        File folder = new File(folderPath);
        folder.mkdir();
        
        try {
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream(rutaArchivo));
            document.open();

            Paragraph empresa = new Paragraph("[NOMBRE CLINICA]", new Font(Font.FontFamily.COURIER, 32, Font.BOLD));
            empresa.setAlignment(Element.ALIGN_CENTER);
            document.add(empresa);
            
            // Escala la imagen para ajustarse al tamaño deseado
            Image imagen = Image.getInstance(getClass().getResource("/img/logoLog.png"));
            imagen.scaleToFit(200, 200);
            
            PdfPTable table = new PdfPTable(1);
            PdfPCell cell = new PdfPCell(imagen);
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
            cell.setBorder(Rectangle.NO_BORDER);

            table.addCell(cell);

            document.add(table);

            // Agrega la fecha actual al documento PDF
            Paragraph fecha = new Paragraph("Fecha de creación: " + fechaTexto, new Font(Font.FontFamily.TIMES_ROMAN, 12));
            fecha.setAlignment(Element.ALIGN_LEFT);
            document.add(fecha);

            // Agrega la tabla al documento PDF
            PdfPTable tabla = new PdfPTable(8);
            tabla.setWidthPercentage(100);
            tabla.setSpacingBefore(10f);
            tabla.setSpacingAfter(10f);
            tabla.setHorizontalAlignment(Element.ALIGN_CENTER); 
            float[] anchosColumnas = {0.5f, 1.5f, 1.5f, 1.5f, 1.7f, 1.3f, 1f, 1f};
            tabla.setWidths(anchosColumnas);

            Font font = new Font(Font.FontFamily.HELVETICA, 9);

            // Agregar encabezados de columna con el tamaño de letra especificado
            tabla.addCell(new Phrase("ID", font));
            tabla.addCell(new Phrase("CLIENTE", font));
            tabla.addCell(new Phrase("MASCOTA", font));
            tabla.addCell(new Phrase("VETERINARIO", font));
            tabla.addCell(new Phrase("SERVICIO", font));
            tabla.addCell(new Phrase("FECHA", font));
            tabla.addCell(new Phrase("HORA", font));
            tabla.addCell(new Phrase("ESTADO", font));

            Connection cn ;
            conexion conexion = new conexion();
            cn= conexion.getConnection();
            PreparedStatement ps ; 
           
            String sql = null;

            if(null != order)switch (order) {
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
            while (rs.next()){
                    tabla.addCell(new Phrase(rs.getInt(1)+"", font));
                    tabla.addCell(new Phrase(rs.getString(3)+"", font));
                    tabla.addCell(new Phrase(rs.getString(5)+"", font));
                    tabla.addCell(new Phrase(rs.getString(7)+"", font));
                    tabla.addCell(new Phrase(rs.getString(8)+"", font));
                    tabla.addCell(new Phrase(rs.getString(9)+"", font));
                    tabla.addCell(new Phrase(rs.getString(10)+"", font));
                    tabla.addCell(new Phrase(rs.getString(11)+"", font));
            }
            
            document.add(tabla);
            document.close();
            JOptionPane.showMessageDialog(null, "Reporte Pdf creado correctamente en su escritorio!", "OK",JOptionPane.INFORMATION_MESSAGE);
            
        }catch (DocumentException | SQLException e){
          System.out.println("Error en el reporte de clientes "+e.getMessage());
        
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PDFcitas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PDFcitas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
