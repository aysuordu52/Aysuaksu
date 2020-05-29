/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication3;




import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.util.CellRangeAddress;  
import java.io.FileNotFoundException;  
import java.io.FileOutputStream;  
import java.io.IOException;  
import java.io.InputStream;
import java.io.OutputStream;  
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.embed.swing.SwingFXUtils;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.SnapshotParameters;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javax.imageio.ImageIO;
import org.apache.commons.compress.utils.IOUtils;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;  
import org.apache.poi.ss.usermodel.Cell;  
import org.apache.poi.ss.usermodel.CellStyle;  
import org.apache.poi.ss.usermodel.ClientAnchor;
import org.apache.poi.ss.usermodel.CreationHelper;  
import org.apache.poi.ss.usermodel.Drawing; 
import org.apache.poi.ss.usermodel.Row;  
import org.apache.poi.ss.usermodel.Sheet;  
import org.apache.poi.ss.usermodel.Workbook;  
import org.apache.poi.ss.usermodel.FillPatternType;  
import org.apache.poi.ss.usermodel.Picture;




/**
 *
 * @author aysuaksu
 */
public class BerichtController implements Initializable {

    ObservableList<String> ProjeAdıchoiceBoxList = FXCollections.observableArrayList("KAYNAKÇI TESTİ","AAA");
    ObservableList<String> MuayeneDurumuchoiceBoxList = FXCollections.observableArrayList("Untreated");
    ObservableList<String> AkımTipichoiceBoxList=FXCollections.observableArrayList("AC","DC");
    ObservableList<String> SonucchoiceBoxList=FXCollections.observableArrayList("OK","RED");
       
    
    

            
    @FXML
    private ChoiceBox TeklifNochoiceBox;
    @FXML
    private ChoiceBox MusterichoiceBox;
    @FXML
    private ChoiceBox ProjeAdıchoiceBox;  
    @FXML
    private ChoiceBox YuzeyDurumuchoiceBox;
    @FXML
    private ChoiceBox MuayeneDurumuchoiceBox;
    @FXML
    private ChoiceBox AkımTipichoiceBox;
    @FXML
    public ChoiceBox SonucchoiceBox;
     
     @FXML
    private TextField txtad; 
    @FXML
    private TextField txt1;   
    @FXML
    private TextField txt2;  
    @FXML
    private TextField txt3;    
    @FXML
    private TextField txt4;   
     @FXML
    private TextField txt5;
      @FXML
    private TextField txt6;
      @FXML
    private TextField txt7;       
      @FXML
    private TextField txt8;     
     @FXML
    private TextField txt9;
     @FXML
    private TextField txt10;
      @FXML
    private TextField txt11;
     @FXML
    private TextField txt12;
    @FXML
    private TextField txt13;
    @FXML
    private TextField txt14;
     @FXML
    private TextField txt15;
    @FXML
    private TextField txt16;
    @FXML
    private TextField txt17;
    @FXML
    private TextField txt18;
    @FXML
    private TextField txt19;
    @FXML
    private TextField txt20;
    @FXML
    private TextField txt21;
    @FXML
    private TextField txt22;
    @FXML
    private TextField txt23;
    @FXML
    private TextField txt24;    
    @FXML
    private TextField txt25;    
    @FXML
    private TextField txt26;    
    @FXML
    private TextField txt27;
    @FXML
    private TextField txt28;
     @FXML
    private TextField txt29;
    @FXML
    private TextField txt30;
    @FXML
    private TextField txt31;
    @FXML
    private TextField txt32;
    @FXML
    private TextField txt33;
    @FXML
    private TextField txt34;
    @FXML
    private TextField txt35;
    @FXML
    private TextField txt36;
    @FXML
    private TextField txt37;
    @FXML
    private TextField txt38;
    @FXML
    private TextField txt39;
    @FXML
    private TextField txt40;
    @FXML
    private TextField txt41;
    @FXML
    private TextField txt42;
    @FXML
    private TextField txt43;
    @FXML
    private TextField txt44;
    @FXML
    private TextField txt45;
    @FXML
    private TextField txt46;
    @FXML
    private TextField txt47;
     @FXML
    private TextField txt48;
       
    @FXML
    private TextField txt49;
    @FXML
    private TextField txt50;
    @FXML
    private TextField txt51;
    @FXML
    private TextField txt52;
    @FXML
    private TextField txt53;
    @FXML
    private TextField txt54;
    @FXML
    private TextField txt55;
    @FXML
    private TextField txt56;
    @FXML
    private TextField txt57;    
    @FXML
    private TextField txt58;    
    @FXML
    private TextField txt59;    
    @FXML
    private TextField txt60;
    @FXML
    private TextField txt61;
     @FXML
    private TextField txt62;
    @FXML
    private TextField txt63;
    @FXML
    private TextField txt64;
    @FXML
    private TextField txt65;
    @FXML
    private TextField txt66;
    @FXML
    private TextField txt67;
    @FXML
    private TextField txt68;
    @FXML
    private TextField txt69;
    @FXML
    private TextField txt70;
    @FXML
    private TextField txt71;
    @FXML
    private TextField txt72;
    @FXML
    private TextField txt73;
    @FXML
    private TextField txt74;
    @FXML
    private TextField txt75;
    @FXML
    private TextField txt76;
    @FXML
    private TextField txt77;
    @FXML
    private TextField txt78;
    @FXML
    private TextField txt79; 

    @FXML
    private TextField txt80;
    @FXML
    private TextField txt81;
    @FXML
    private TextField txt82;
    @FXML
    private TextField txt83;
     @FXML
    private TextField txt84;
       
    @FXML
    private TextField txt85;
    @FXML
    private TextField txt86;
    @FXML
    private TextField txt87;
    @FXML
    private TextField txt88;
    @FXML
    private TextField txt89;
    @FXML
    private TextField txt90;
    @FXML
    private TextField txt91;
    @FXML
    private TextField txt92;
    @FXML
    private TextField txt93;    
    @FXML
    private TextField txt94;    
    @FXML
    private TextField txt95;    
    @FXML
    private TextField txt96;
    @FXML
    private TextField txt97;
     @FXML
    private TextField txt98;
    @FXML
    private TextField txt99;
    @FXML
    private TextField txt100;
    @FXML
    private TextField txt101;
    @FXML
    private TextField txt102;
    @FXML
    private TextField txt103;
    @FXML
    private TextField txt104;
    @FXML
    private TextField txt105;
    @FXML
    private TextField txt106;
    @FXML
    private TextField txt107;
    @FXML
    private TextField txt108;
    @FXML
    private TextField txt109;
    @FXML
    private TextField txt110;
    @FXML
    private TextField txt111;
    @FXML
    private TextField txt112;
    @FXML
    private TextField txt113;
    @FXML
    private TextField txt114;
    @FXML
    private TextField txt115;
    @FXML
    private TextField txt116;    
    @FXML
    private TextField txt117;    
    @FXML
    private TextField txt118;    
    @FXML
    private TextField txt119;
    @FXML
    private TextField txt120;
     @FXML
    private TextField txt121;
    @FXML
    private TextField txt122;
    @FXML
    private TextField txt123;
    @FXML
    private TextField txt124;
    @FXML
    private TextField txt125;
    @FXML
    private TextField txt126;
    @FXML
    private TextField txt127;
    @FXML
    private TextField txt128;
    @FXML
    private TextField txt129;
    @FXML
    private TextField txt130;
    @FXML
    private TextField txt131;
    @FXML
    private TextField txt132;
   
    private TextField txt133;
    @FXML
    private TextField txt134;
    @FXML
    private TextField txt135;
    @FXML
    private TextField txt136;
    @FXML
    private TextField txt137;
    @FXML
    private TextField txt138;
    
    private TextField ad1;
    private TextField ad2;
    @FXML
    private TextField txtAd;
    @FXML
    private TextField txttc;
    @FXML
    private ComboBox combobox;
    @FXML
    private TextField txtseviye;
    @FXML
    private TextField txtseviye1;
    @FXML
    private TextField txtseviye2;
    @FXML
    private ComboBox combobox1;
    @FXML
    private ComboBox combobox2;
    @FXML
    private ComboBox ekipman;
       
    @FXML
    private ComboBox IsEmri;
    @FXML
    private Button PDF;
       
            
    private FileChooser fc = new FileChooser();
    
   

    
    @FXML
    private VBox v;

        public void PDF(ActionEvent event){
            StackPane root = new StackPane(v);
            
             try {
            WritableImage nodeshot = root.snapshot(new SnapshotParameters(), null);

           
            ByteArrayOutputStream output = new ByteArrayOutputStream();
            ImageIO.write(SwingFXUtils.fromFXImage(nodeshot, null), "png", output);
            output.close();

            PDDocument doc = new PDDocument();
            PDPage page = new PDPage();
            PDImageXObject pdimage;
            PDPageContentStream content;

            pdimage = PDImageXObject.createFromByteArray(doc, output.toByteArray(), "png");
            content = new PDPageContentStream(doc, page);

            
            PDRectangle box = page.getMediaBox();
            double factor = Math.min(box.getWidth() / nodeshot.getWidth(), box.getHeight() / nodeshot.getHeight());

            float height = (float) (nodeshot.getHeight() * factor);

            
            content.drawImage(pdimage, 0, box.getHeight() - height, (float) (nodeshot.getWidth() * factor), height);

            content.close();
            doc.addPage(page);

            File outputFile = new File("Rapor.pdf");

            doc.save(outputFile);
            doc.close();

           System.out.println("PDF çevrildi");
        
        } catch (Exception e) {
            System.out.println(e.toString());
        }


        }
        
        

     

     

        
    
   
    
   

      
     public void Excel() throws FileNotFoundException, IOException{
        
         Workbook wb = new HSSFWorkbook();  
        try  (OutputStream os = new FileOutputStream("Rapor.xls")) {  
            Sheet sheet = wb.createSheet("Rapor");  
            Row row = sheet.createRow(0);  
            Cell cell = row.createCell(0);  
            cell.setCellValue(""); 
            sheet.addMergedRegion(new CellRangeAddress(0,1,0,2));
            CellStyle cellStyle = wb.createCellStyle();  
            
            
           
             CellStyle style = wb.createCellStyle();  
            style.setFillForegroundColor(IndexedColors.ROSE.getIndex());  
            style.setFillPattern(FillPatternType.SOLID_FOREGROUND);  
             cell = row.createCell(3); 
             sheet.addMergedRegion(new CellRangeAddress(0,0,3,9));
             cell.setCellValue("                          GÖZETİM MUAYENE VE EĞİTİM HİZMETLERİ "); 
             cell.setCellStyle(style);
             
             

             row = sheet.createRow(1);
             cell = row.createCell(3); 
             sheet.addMergedRegion(new CellRangeAddress(1,1,3,9));
             cell.setCellValue("                          MANYETİK PARÇACIK MUAYENE RAPORU \n                           MAGNETIC PARTICLE INSPECTION REPORT ");  
             CellStyle cs = wb.createCellStyle();  
             cs.setBorderBottom(BorderStyle.THIN);
             cs.setBorderLeft(BorderStyle.THIN);
             cs.setBorderRight(BorderStyle.THIN);
             cs.setBorderTop(BorderStyle.THIN);   
             cs.setFillForegroundColor(IndexedColors.ROSE.getIndex());  
             cs.setFillPattern(FillPatternType.SOLID_FOREGROUND);
             cs.setWrapText(true);  
             cell.setCellStyle(cs);  
             row.setHeightInPoints((2*sheet.getDefaultRowHeightInPoints()));  
             sheet.autoSizeColumn(2);  
            
            row= sheet.createRow(2);  
            cell = row.createCell(0); 
            sheet.addMergedRegion(new CellRangeAddress(2,2,0,1));
            cell.setCellValue("Müşteri\nCustomer ");  
            cs = wb.createCellStyle();  
            cs.setFillForegroundColor(IndexedColors.ROSE.getIndex());  
            cs.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            cs.setWrapText(true);  
            cell.setCellStyle(cs);  
            row.setHeightInPoints((2*sheet.getDefaultRowHeightInPoints()));  
            sheet.autoSizeColumn(2);  
            
            cell = row.createCell(2); 
            sheet.addMergedRegion(new CellRangeAddress(2,2,2,3));
            cell.setCellValue((String)MusterichoiceBox.getSelectionModel().getSelectedItem());
            
            cell = row.createCell(4); 
            sheet.addMergedRegion(new CellRangeAddress(2,2,4,5));
            cell.setCellValue("Muayene Prosedürü\nInspection Procedure");  
            cs = wb.createCellStyle();  
            cs.setFillForegroundColor(IndexedColors.ROSE.getIndex());  
            cs.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            cs.setWrapText(true);  
            cell.setCellStyle(cs);  
            row.setHeightInPoints((2*sheet.getDefaultRowHeightInPoints()));  
            sheet.autoSizeColumn(2);
            
             cell = row.createCell(6); 
            cell.setCellValue(txt4.getText());
            
            cell = row.createCell(7); 
            sheet.addMergedRegion(new CellRangeAddress(2,2,7,8));
            cell.setCellValue("Sayfa No\nPage ");  
            cs = wb.createCellStyle();  
            cs.setFillForegroundColor(IndexedColors.ROSE.getIndex());  
            cs.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            cs.setWrapText(true);  
            cell.setCellStyle(cs);  
            row.setHeightInPoints((2*sheet.getDefaultRowHeightInPoints()));  
            sheet.autoSizeColumn(2);
            
             cell = row.createCell(9); 
            cell.setCellValue(txt7.getText());
                      
            row= sheet.createRow(3);  
            cell = row.createCell(0); 
            sheet.addMergedRegion(new CellRangeAddress(3,3,0,1));
            cell.setCellValue("Proje Adı\nProject Name  ");  
            cs = wb.createCellStyle();  
            cs.setFillForegroundColor(IndexedColors.ROSE.getIndex());  
            cs.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            cs.setWrapText(true);  
            cell.setCellStyle(cs);  
            row.setHeightInPoints((2*sheet.getDefaultRowHeightInPoints()));  
            sheet.autoSizeColumn(2); 
            
             cell = row.createCell(2); 
            sheet.addMergedRegion(new CellRangeAddress(3,3,2,3));
            System.out.println(ProjeAdıchoiceBox.getItems());
            cell.setCellValue((String)ProjeAdıchoiceBox.getSelectionModel().getSelectedItem());
            
            
            cell = row.createCell(4); 
            sheet.addMergedRegion(new CellRangeAddress(3,3,4,5));
            cell.setCellValue("Muayene Kapsamı\nInspection Scope ");  
            cs = wb.createCellStyle();  
            cs.setFillForegroundColor(IndexedColors.ROSE.getIndex());  
            cs.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            cs.setWrapText(true);  
            cell.setCellStyle(cs);  
            row.setHeightInPoints((2*sheet.getDefaultRowHeightInPoints()));  
            sheet.autoSizeColumn(2);
            cell = row.createCell(6); 
            cell.setCellValue(txt5.getText());
                       
            cell = row.createCell(7); 
            sheet.addMergedRegion(new CellRangeAddress(3,3,7,8));
            cell.setCellValue("Rapor No\nReport No ");  
            cs = wb.createCellStyle();  
            cs.setFillForegroundColor(IndexedColors.ROSE.getIndex());  
            cs.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            cs.setWrapText(true);  
            cell.setCellStyle(cs);  
            row.setHeightInPoints((2*sheet.getDefaultRowHeightInPoints()));  
            sheet.autoSizeColumn(2);
            cell = row.createCell(9); 
            cell.setCellValue(txt8.getText());
            
                       
            row= sheet.createRow(4);  
            cell = row.createCell(0); 
            sheet.addMergedRegion(new CellRangeAddress(4,4,0,1));
            cell.setCellValue("Test Yeri\nInspection Place ");  
            cs = wb.createCellStyle();  
            cs.setFillForegroundColor(IndexedColors.ROSE.getIndex());  
            cs.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            cs.setWrapText(true);  
            cell.setCellStyle(cs);  
            row.setHeightInPoints((2*sheet.getDefaultRowHeightInPoints()));  
            sheet.autoSizeColumn(2);
                       
            cell = row.createCell(2); 
            sheet.addMergedRegion(new CellRangeAddress(4,4,2,3));
            cell.setCellValue(txt1.getText());  
            
                      
            cell = row.createCell(4); 
            sheet.addMergedRegion(new CellRangeAddress(4,4,4,5));
            cell.setCellValue("Resim No\nDrawing No ");  
            cs = wb.createCellStyle();  
            cs.setFillForegroundColor(IndexedColors.ROSE.getIndex());  
            cs.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            cs.setWrapText(true);  
            cell.setCellStyle(cs);  
            row.setHeightInPoints((2*sheet.getDefaultRowHeightInPoints()));  
            sheet.autoSizeColumn(2);
            cell = row.createCell(6); 
            cell.setCellValue(txt6.getText());
                       
            cell = row.createCell(7); 
            sheet.addMergedRegion(new CellRangeAddress(4,4,7,8));
            cell.setCellValue("Rapor Tarihi \nReport Date");  
            cs = wb.createCellStyle();  
            cs.setFillForegroundColor(IndexedColors.ROSE.getIndex());  
            cs.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            cs.setWrapText(true);  
            cell.setCellStyle(cs);  
            row.setHeightInPoints((2*sheet.getDefaultRowHeightInPoints()));  
            sheet.autoSizeColumn(2);
            
                       
            cell = row.createCell(9); 
            cell.setCellValue(txt136.getText());

                       
            row= sheet.createRow(5);  
            cell = row.createCell(0); 
            sheet.addMergedRegion(new CellRangeAddress(5,5,0,1));
            cell.setCellValue("Muayene Standardı\nInspection Standart");  
            cs = wb.createCellStyle();  
            cs.setFillForegroundColor(IndexedColors.ROSE.getIndex());  
            cs.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            cs.setWrapText(true);  
            cell.setCellStyle(cs);  
            row.setHeightInPoints((2*sheet.getDefaultRowHeightInPoints()));  
            sheet.autoSizeColumn(2);
             
            cell = row.createCell(2); 
            sheet.addMergedRegion(new CellRangeAddress(5,5,2,3));
            cell.setCellValue(txt2.getText());  

                      
            cell = row.createCell(4); 
            sheet.addMergedRegion(new CellRangeAddress(5,5,4,5));
            cell.setCellValue("Yüzey Durumu\nSurface Condition");  
            cs = wb.createCellStyle();  
            cs.setFillForegroundColor(IndexedColors.ROSE.getIndex());  
            cs.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            cs.setWrapText(true);  
            cell.setCellStyle(cs);  
            row.setHeightInPoints((2*sheet.getDefaultRowHeightInPoints()));  
            sheet.autoSizeColumn(2);
                        
            cell = row.createCell(6); 
            cell.setCellValue((String)YuzeyDurumuchoiceBox.getSelectionModel().getSelectedItem());
            
                       
            cell = row.createCell(7); 
            sheet.addMergedRegion(new CellRangeAddress(5,5,7,8));
            cell.setCellValue(" İş Emri No\nJob Order No");  
            cs = wb.createCellStyle();  
            cs.setFillForegroundColor(IndexedColors.ROSE.getIndex());  
            cs.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            cs.setWrapText(true);  
            cell.setCellStyle(cs);  
            row.setHeightInPoints((2*sheet.getDefaultRowHeightInPoints()));  
            sheet.autoSizeColumn(2);
            cell = row.createCell(9); 
            cell.setCellValue((String)IsEmri.getSelectionModel().getSelectedItem());
                       
            row= sheet.createRow(6);  
            cell = row.createCell(0); 
            sheet.addMergedRegion(new CellRangeAddress(6,6,0,1));
            cell.setCellValue("Değerlen. Standardı\nEvaluation Standart");  
            cs = wb.createCellStyle();  
            cs.setFillForegroundColor(IndexedColors.ROSE.getIndex());  
            cs.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            cs.setWrapText(true);  
            cell.setCellStyle(cs);  
            row.setHeightInPoints((2*sheet.getDefaultRowHeightInPoints()));  
            sheet.autoSizeColumn(2);
                       
            cell = row.createCell(2); 
            sheet.addMergedRegion(new CellRangeAddress(6,6,2,3));
            cell.setCellValue(txt3.getText());  
             
                      
            cell = row.createCell(4); 
            sheet.addMergedRegion(new CellRangeAddress(6,6,4,5));
            cell.setCellValue("Muayene Aşaması\nStage Of Examination");  
            cs = wb.createCellStyle();  
            cs.setFillForegroundColor(IndexedColors.ROSE.getIndex());  
            cs.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            cs.setWrapText(true);  
            cell.setCellStyle(cs);  
            row.setHeightInPoints((2*sheet.getDefaultRowHeightInPoints()));  
            sheet.autoSizeColumn(2);
                      
            cell = row.createCell(6); 
            cell.setCellValue((String)MuayeneDurumuchoiceBox.getSelectionModel().getSelectedItem());
                       
            cell = row.createCell(7); 
            sheet.addMergedRegion(new CellRangeAddress(6,6,7,8));
            cell.setCellValue("Teklif No\nOffer No");  
            cs = wb.createCellStyle();  
            cs.setFillForegroundColor(IndexedColors.ROSE.getIndex());  
            cs.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            cs.setWrapText(true);  
            cell.setCellStyle(cs);  
            row.setHeightInPoints((2*sheet.getDefaultRowHeightInPoints()));  
            sheet.autoSizeColumn(2);
            

            cell = row.createCell(9); 
            cell.setCellValue((String)TeklifNochoiceBox.getSelectionModel().getSelectedItem());
            
            
             row= sheet.createRow(7);  
             cell = row.createCell(0); 
            sheet.addMergedRegion(new CellRangeAddress(7,7,0,9));
            cell.setCellValue("                                                         Ekipman Bilgileri/ Equipment Informations");  
            cs = wb.createCellStyle();  
            cs.setFillForegroundColor(IndexedColors.ROSE.getIndex());  
            cs.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            cell.setCellStyle(cs); 
            
                       
            row= sheet.createRow(8);  
             cell = row.createCell(0); 
            sheet.addMergedRegion(new CellRangeAddress(8,8,0,1));
            cell.setCellValue("Kutup Mesafesi,mm\nPole Distance");  
            cs = wb.createCellStyle();  
            cs.setFillForegroundColor(IndexedColors.ROSE.getIndex());  
            cs.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            cs.setWrapText(true);  
            cell.setCellStyle(cs);  
            row.setHeightInPoints((2*sheet.getDefaultRowHeightInPoints()));  
            sheet.autoSizeColumn(2);
            
            cell = row.createCell(2); 
            sheet.addMergedRegion(new CellRangeAddress(8,8,2,3));
            cell.setCellValue(txt9.getText());
            
            cell = row.createCell(4); 
            sheet.addMergedRegion(new CellRangeAddress(8,8,4,5));
            cell.setCellValue("Muayene Bölgesi \nExamination Area");  
            cs = wb.createCellStyle();  
            cs.setFillForegroundColor(IndexedColors.ROSE.getIndex());  
            cs.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            cs.setWrapText(true);  
            cell.setCellStyle(cs);  
            row.setHeightInPoints((2*sheet.getDefaultRowHeightInPoints()));  
            sheet.autoSizeColumn(2);
            
             cell = row.createCell(6); 
            cell.setCellValue(txt15.getText());
            
            cell = row.createCell(7); 
            sheet.addMergedRegion(new CellRangeAddress(8,8,7,8));
            cell.setCellValue("Yüzey Sıcaklığı (ºC)\nSurface Temperature");  
            cs = wb.createCellStyle();  
            cs.setFillForegroundColor(IndexedColors.ROSE.getIndex());  
            cs.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            cs.setWrapText(true);  
            cell.setCellStyle(cs);  
            row.setHeightInPoints((2*sheet.getDefaultRowHeightInPoints()));  
            sheet.autoSizeColumn(2);
            
             cell = row.createCell(9); 
            cell.setCellValue(txt20.getText());
            
                      
            row= sheet.createRow(9);  
             cell = row.createCell(0); 
            sheet.addMergedRegion(new CellRangeAddress(9,9,0,1));
            cell.setCellValue("Cihaz\nEquipment");  
            cs = wb.createCellStyle();  
            cs.setFillForegroundColor(IndexedColors.ROSE.getIndex());  
            cs.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            cs.setWrapText(true);  
            cell.setCellStyle(cs);  
            row.setHeightInPoints((2*sheet.getDefaultRowHeightInPoints()));  
            sheet.autoSizeColumn(2);
            
            cell = row.createCell(2); 
            sheet.addMergedRegion(new CellRangeAddress(9,9,2,3));
            cell.setCellValue(txt10.getText());
            
            cell = row.createCell(4); 
            sheet.addMergedRegion(new CellRangeAddress(9,9,4,5));
            cell.setCellValue("Akım Tipi\nCurrent Type");  
            cs = wb.createCellStyle();  
            cs.setFillForegroundColor(IndexedColors.ROSE.getIndex());  
            cs.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            cs.setWrapText(true);  
            cell.setCellStyle(cs);  
            row.setHeightInPoints((2*sheet.getDefaultRowHeightInPoints()));  
            sheet.autoSizeColumn(2);
            
             cell = row.createCell(6); 
            cell.setCellValue(AkımTipichoiceBox.getItems().addAll("AC","DC"));
            
            cell = row.createCell(7); 
            sheet.addMergedRegion(new CellRangeAddress(9,10,7,8));
            cell.setCellValue("Muayene Bölgesindeki Alan Şiddeti, kA/m\nGauss Field Strength");  
            cs = wb.createCellStyle();  
            cs.setFillForegroundColor(IndexedColors.ROSE.getIndex());  
            cs.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            cs.setWrapText(true);  
            cell.setCellStyle(cs);  
            row.setHeightInPoints((2*sheet.getDefaultRowHeightInPoints()));  
            sheet.autoSizeColumn(2);
            
             cell = row.createCell(9); 
             sheet.addMergedRegion(new CellRangeAddress(9,10,9,9));
            cell.setCellValue(txt21.getText());
            
                      
            row= sheet.createRow(10);  
             cell = row.createCell(0); 
            sheet.addMergedRegion(new CellRangeAddress(10,10,0,1));
            cell.setCellValue("MP Taşıyıcı Ortam\nMP Carrier Medium");  
            cs = wb.createCellStyle();  
            cs.setFillForegroundColor(IndexedColors.ROSE.getIndex());  
            cs.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            cs.setWrapText(true);  
            cell.setCellStyle(cs);  
            row.setHeightInPoints((2*sheet.getDefaultRowHeightInPoints()));  
            sheet.autoSizeColumn(2);
            
                       
            cell = row.createCell(2); 
            sheet.addMergedRegion(new CellRangeAddress(10,10,2,3));
            cell.setCellValue(txt11.getText());
            
            cell = row.createCell(4); 
            sheet.addMergedRegion(new CellRangeAddress(10,10,4,5));
            cell.setCellValue("Luxmetre/Işık Şiddeti\nLuxmeter");  
            cs = wb.createCellStyle();  
            cs.setFillForegroundColor(IndexedColors.ROSE.getIndex());  
            cs.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            cs.setWrapText(true);  
            cell.setCellStyle(cs);  
            row.setHeightInPoints((2*sheet.getDefaultRowHeightInPoints()));  
            sheet.autoSizeColumn(2);
            
             cell = row.createCell(6); 
            cell.setCellValue(txt16.getText());
            

           
                       
            row= sheet.createRow(11);  
             cell = row.createCell(0); 
            sheet.addMergedRegion(new CellRangeAddress(11,11,0,1));
            cell.setCellValue("Mıknatıslama Tekniği\nMag.Tech.");  
            cs = wb.createCellStyle();  
            cs.setFillForegroundColor(IndexedColors.ROSE.getIndex());  
            cs.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            cs.setWrapText(true);  
            cell.setCellStyle(cs);  
            row.setHeightInPoints((2*sheet.getDefaultRowHeightInPoints()));  
            sheet.autoSizeColumn(2);
                        
            cell = row.createCell(2); 
            sheet.addMergedRegion(new CellRangeAddress(11,11,2,3));
            cell.setCellValue(txt12.getText());
            
            cell = row.createCell(4); 
            sheet.addMergedRegion(new CellRangeAddress(11,11,4,5));
            cell.setCellValue("Muayene Ortamı\nTest Medium");  
            cs = wb.createCellStyle();  
            cs.setFillForegroundColor(IndexedColors.ROSE.getIndex());  
            cs.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            cs.setWrapText(true);  
            cell.setCellStyle(cs);  
            row.setHeightInPoints((2*sheet.getDefaultRowHeightInPoints()));  
            sheet.autoSizeColumn(2);
            
             cell = row.createCell(6); 
            cell.setCellValue(txt17.getText());
            
            cell = row.createCell(7); 
            sheet.addMergedRegion(new CellRangeAddress(11,11,7,8));
            cell.setCellValue("Yüzey\nSurface Condition");  
            cs = wb.createCellStyle();  
            cs.setFillForegroundColor(IndexedColors.ROSE.getIndex());  
            cs.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            cs.setWrapText(true);  
            cell.setCellStyle(cs);  
            row.setHeightInPoints((2*sheet.getDefaultRowHeightInPoints()));  
            sheet.autoSizeColumn(2);
            
             cell = row.createCell(9); 
            cell.setCellValue(txt22.getText());
            
            
                       
            row= sheet.createRow(12);  
             cell = row.createCell(0); 
            sheet.addMergedRegion(new CellRangeAddress(12,12,0,1));
            cell.setCellValue("UV Işık Şiddeti\nUV Light Intensity");  
            cs = wb.createCellStyle();  
            cs.setFillForegroundColor(IndexedColors.ROSE.getIndex());  
            cs.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            cs.setWrapText(true);  
            cell.setCellStyle(cs);  
            row.setHeightInPoints((2*sheet.getDefaultRowHeightInPoints()));  
            sheet.autoSizeColumn(2);
            
                      
            cell = row.createCell(2); 
            sheet.addMergedRegion(new CellRangeAddress(12,12,2,3));
            cell.setCellValue(txt13.getText());
            
            cell = row.createCell(4); 
            sheet.addMergedRegion(new CellRangeAddress(12,12,4,5));
            cell.setCellValue("Mıknatıs Giderimi\nDemagnetization");  
            cs = wb.createCellStyle();  
            cs.setFillForegroundColor(IndexedColors.ROSE.getIndex());  
            cs.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            cs.setWrapText(true);  
            cell.setCellStyle(cs);  
            row.setHeightInPoints((2*sheet.getDefaultRowHeightInPoints()));  
            sheet.autoSizeColumn(2);
            
             cell = row.createCell(6); 
            cell.setCellValue(txt18.getText());
            
            cell = row.createCell(7); 
            sheet.addMergedRegion(new CellRangeAddress(12,12,7,8));
            cell.setCellValue("Işık Cihazı Tanımı\nIdentification of Light Equip.");  
            cs = wb.createCellStyle();  
            cs.setFillForegroundColor(IndexedColors.ROSE.getIndex());  
            cs.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            cs.setWrapText(true);  
            cell.setCellStyle(cs);  
            row.setHeightInPoints((2*sheet.getDefaultRowHeightInPoints()));  
            sheet.autoSizeColumn(2);
            
            cell = row.createCell(9); 
            cell.setCellValue(txt23.getText());
            
                        
            row= sheet.createRow(13);  
             cell = row.createCell(0); 
            sheet.addMergedRegion(new CellRangeAddress(13,13,0,1));
            cell.setCellValue("Işık mesafesi\nDistance of Light");  
            cs = wb.createCellStyle();  
            cs.setFillForegroundColor(IndexedColors.ROSE.getIndex());  
            cs.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            cs.setWrapText(true);  
            cell.setCellStyle(cs);  
            row.setHeightInPoints((2*sheet.getDefaultRowHeightInPoints()));  
            sheet.autoSizeColumn(2);
                        
            cell = row.createCell(2); 
            sheet.addMergedRegion(new CellRangeAddress(13,13,2,3));
            cell.setCellValue(txt14.getText());
            
            cell = row.createCell(4); 
            sheet.addMergedRegion(new CellRangeAddress(13,13,4,5));
            cell.setCellValue("Isıl İşlem\nHeat Treatment");  
            cs = wb.createCellStyle();  
            cs.setFillForegroundColor(IndexedColors.ROSE.getIndex());  
            cs.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            cs.setWrapText(true);  
            cell.setCellStyle(cs);  
            row.setHeightInPoints((2*sheet.getDefaultRowHeightInPoints()));  
            sheet.autoSizeColumn(2);
            
             cell = row.createCell(6); 
            cell.setCellValue(txt19.getText());
            
            cell = row.createCell(7); 
            sheet.addMergedRegion(new CellRangeAddress(13,13,7,8));
            cell.setCellValue("Kaldırma Testi Tarih / No\nLifting Test Date / Number");  
            cs = wb.createCellStyle();  
            cs.setFillForegroundColor(IndexedColors.ROSE.getIndex());  
            cs.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            cs.setWrapText(true);  
            cell.setCellStyle(cs);  
            row.setHeightInPoints((2*sheet.getDefaultRowHeightInPoints()));  
            sheet.autoSizeColumn(2);
            
            cell = row.createCell(9); 
            cell.setCellValue(txt24.getText());
            
            
           InputStream is = new FileInputStream("image1.png");
           byte [] bytes = IOUtils.toByteArray(is); 
           int pictureIndex = wb.addPicture(bytes, Workbook.PICTURE_TYPE_PNG);
           is.close();

           CreationHelper helper = wb.getCreationHelper();
          Drawing drawingPatriarch = sheet.createDrawingPatriarch();
          ClientAnchor anchor = helper.createClientAnchor();

          anchor.setCol1(0);
          anchor.setCol2(2);
          anchor.setRow1(12);
          anchor.setRow1(14);
          Picture pict = drawingPatriarch.createPicture(anchor, pictureIndex);
          pict.resize();
   
          
          InputStream is2 = new FileInputStream("image2.png");
           byte [] bytes2 = IOUtils.toByteArray(is2); 
           int pictureIndex2 = wb.addPicture(bytes2, Workbook.PICTURE_TYPE_PNG);
           is2.close();

          CreationHelper helper2 = wb.getCreationHelper();
          Drawing drawingPatriarch2 = sheet.createDrawingPatriarch();
          ClientAnchor anchor2 = helper2.createClientAnchor();

          anchor2.setCol1(2);
          anchor2.setCol2(4);
          anchor2.setRow1(12);
          anchor2.setRow1(14);
          Picture pict2 = drawingPatriarch2.createPicture(anchor2, pictureIndex2);
          pict2.resize();
           
          
             row= sheet.createRow(14);  
             cell = row.createCell(5); 
            sheet.addMergedRegion(new CellRangeAddress(14,14,5,9));
            cell.setCellValue("Süreksizliğin Yeri / Location of Discontinuity");  
  
          
            row= sheet.createRow(15);  
             cell = row.createCell(5); 
            cell.setCellValue("BM");  
            cs = wb.createCellStyle();  
            cs.setFillForegroundColor(IndexedColors.ROSE.getIndex());  
            cs.setFillPattern(FillPatternType.SOLID_FOREGROUND);  
            cell.setCellStyle(cs);  
            
            cell = row.createCell(6); 
             sheet.addMergedRegion(new CellRangeAddress(15,15,6,9));
            cell.setCellValue("Ana Metal / Base Metal");  
            cs = wb.createCellStyle();  
            cs.setFillForegroundColor(IndexedColors.ROSE.getIndex());  
            cs.setFillPattern(FillPatternType.SOLID_FOREGROUND);  
            cell.setCellStyle(cs);  
            
                        
            row= sheet.createRow(16);  
             cell = row.createCell(5); 
            cell.setCellValue("HAZ");  
            cs = wb.createCellStyle();  
            cs.setFillForegroundColor(IndexedColors.ROSE.getIndex());  
            cs.setFillPattern(FillPatternType.SOLID_FOREGROUND);  
            cell.setCellStyle(cs);  
            
            cell = row.createCell(6); 
             sheet.addMergedRegion(new CellRangeAddress(16,16,6,9));
            cell.setCellValue("Isıdan etkilenen bölge / Heat afffected zone");  
            cs = wb.createCellStyle();  
            cs.setFillForegroundColor(IndexedColors.ROSE.getIndex());  
            cs.setFillPattern(FillPatternType.SOLID_FOREGROUND);  
            cell.setCellStyle(cs);
            
           
            row= sheet.createRow(17);  
             cell = row.createCell(5); 
            cell.setCellValue("W");  
            cs = wb.createCellStyle();  
            cs.setFillForegroundColor(IndexedColors.ROSE.getIndex());  
            cs.setFillPattern(FillPatternType.SOLID_FOREGROUND);  
            cell.setCellStyle(cs);  
            
            cell = row.createCell(6); 
             sheet.addMergedRegion(new CellRangeAddress(17,17,6,9));
            cell.setCellValue("Kaynak / Weld");  
            cs = wb.createCellStyle();  
            cs.setFillForegroundColor(IndexedColors.ROSE.getIndex());  
            cs.setFillPattern(FillPatternType.SOLID_FOREGROUND);  
            cell.setCellStyle(cs);            

             row= sheet.createRow(18);  
             cell = row.createCell(5); 
            cell.setCellValue("B");  
            cs = wb.createCellStyle();  
            cs.setFillForegroundColor(IndexedColors.ROSE.getIndex());  
            cs.setFillPattern(FillPatternType.SOLID_FOREGROUND);  
            cell.setCellStyle(cs);  
            
             cell = row.createCell(6); 
             sheet.addMergedRegion(new CellRangeAddress(18,18,6,9));
            cell.setCellValue("Kaynak ağzı / Bevel ");  
             cs = wb.createCellStyle();  
            cs.setFillForegroundColor(IndexedColors.WHITE.getIndex());  
            cs.setFillPattern(FillPatternType.SOLID_FOREGROUND);  
            cell.setCellStyle(cs);
            
            
            
                        
            row= sheet.createRow(19);  
             cell = row.createCell(0); 
            sheet.addMergedRegion(new CellRangeAddress(19,19,0,4));
            cell.setCellValue("Standarttan Sapmalar\nStandard Deviations");  
            cs = wb.createCellStyle();  
            cs.setFillForegroundColor(IndexedColors.ROSE.getIndex());  
            cs.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            cs.setWrapText(true);  
            cell.setCellStyle(cs);  
            row.setHeightInPoints((2*sheet.getDefaultRowHeightInPoints()));  
            sheet.autoSizeColumn(2);
                        
            cell = row.createCell(5); 
            sheet.addMergedRegion(new CellRangeAddress(19,19,5,9));
            cell.setCellValue(txt25.getText());
            
            row= sheet.createRow(20);  
             cell = row.createCell(0); 
            sheet.addMergedRegion(new CellRangeAddress(20,20,0,4));
            cell.setCellValue("Muayene Tarihleri\nInspection Dates");  
            cs = wb.createCellStyle();  
            cs.setFillForegroundColor(IndexedColors.ROSE.getIndex());  
            cs.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            cs.setWrapText(true);  
            cell.setCellStyle(cs);  
            row.setHeightInPoints((2*sheet.getDefaultRowHeightInPoints()));  
            sheet.autoSizeColumn(2);
                        
            cell = row.createCell(5); 
            sheet.addMergedRegion(new CellRangeAddress(20,20,5,9));
            cell.setCellValue(txt26.getText());
            
            
                     
            row= sheet.createRow(21);  
             cell = row.createCell(0); 
            sheet.addMergedRegion(new CellRangeAddress(21,21,0,4));
            cell.setCellValue("Açıklamalar ve Ekler\nDescription and Attachments");  
            cs = wb.createCellStyle();  
            cs.setFillForegroundColor(IndexedColors.ROSE.getIndex());  
            cs.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            cs.setWrapText(true);  
            cell.setCellStyle(cs);  
            row.setHeightInPoints((2*sheet.getDefaultRowHeightInPoints()));  
            sheet.autoSizeColumn(2);
                        
            cell = row.createCell(5); 
            sheet.addMergedRegion(new CellRangeAddress(21,21,5,9));
            cell.setCellValue(txt27.getText());
            
            row= sheet.createRow(22);  
             cell = row.createCell(0); 
            sheet.addMergedRegion(new CellRangeAddress(22,22,0,9));
            cell.setCellValue("                                             Muayene Sonuçları / Inspection Results");  
            cs = wb.createCellStyle();  
            cs.setFillForegroundColor(IndexedColors.ROSE.getIndex());  
            cs.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            cs.setWrapText(true);  
            cell.setCellStyle(cs);  
            
             row= sheet.createRow(23);  
             cell = row.createCell(0); 
            cell.setCellValue("Sıra No\nSerial No");  
            cs = wb.createCellStyle();  
            cs.setFillForegroundColor(IndexedColors.ROSE.getIndex());  
            cs.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            cs.setWrapText(true);  
            cell.setCellStyle(cs);  
            row.setHeightInPoints((2*sheet.getDefaultRowHeightInPoints()));  
            sheet.autoSizeColumn(2);
            
             cell = row.createCell(1); 
            sheet.addMergedRegion(new CellRangeAddress(23,23,1,2));
            cell.setCellValue("Kaynak/ Parça No\nWeld/ Piece No");  
            cs = wb.createCellStyle();  
            cs.setFillForegroundColor(IndexedColors.ROSE.getIndex());  
            cs.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            cs.setWrapText(true);  
            cell.setCellStyle(cs);  
            row.setHeightInPoints((2*sheet.getDefaultRowHeightInPoints()));  
            sheet.autoSizeColumn(2);
            
            cell = row.createCell(3); 
            cell.setCellValue("Kontrol Uzun.\nTest Lenght");  
            cs = wb.createCellStyle();  
            cs.setFillForegroundColor(IndexedColors.ROSE.getIndex());  
            cs.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            cs.setWrapText(true);  
            cell.setCellStyle(cs);  
            row.setHeightInPoints((2*sheet.getDefaultRowHeightInPoints()));  
            sheet.autoSizeColumn(2);
                       
            cell = row.createCell(4); 
            cell.setCellValue("Kaynak Yön.\nWelding Process");  
            cs = wb.createCellStyle();  
            cs.setFillForegroundColor(IndexedColors.ROSE.getIndex());  
            cs.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            cs.setWrapText(true);  
            cell.setCellStyle(cs);  
            row.setHeightInPoints((2*sheet.getDefaultRowHeightInPoints()));  
            sheet.autoSizeColumn(2);
                        
            cell = row.createCell(5); 
            cell.setCellValue("Kalınlık (mm)\nThickness");  
            cs = wb.createCellStyle();  
            cs.setFillForegroundColor(IndexedColors.ROSE.getIndex());  
            cs.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            cs.setWrapText(true);  
            cell.setCellStyle(cs);  
            row.setHeightInPoints((2*sheet.getDefaultRowHeightInPoints()));  
            sheet.autoSizeColumn(2);
                        
            cell = row.createCell(6); 
            cell.setCellValue("Çap (mm)\nDiameter");  
            cs = wb.createCellStyle();  
            cs.setFillForegroundColor(IndexedColors.ROSE.getIndex());  
            cs.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            cs.setWrapText(true);  
            cell.setCellStyle(cs);  
            row.setHeightInPoints((2*sheet.getDefaultRowHeightInPoints()));  
            sheet.autoSizeColumn(2);
                        
            cell = row.createCell(7); 
            cell.setCellValue("Hata Tipi\nDefect Type");  
            cs = wb.createCellStyle();  
            cs.setFillForegroundColor(IndexedColors.ROSE.getIndex());  
            cs.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            cs.setWrapText(true);  
            cell.setCellStyle(cs);  
            row.setHeightInPoints((2*sheet.getDefaultRowHeightInPoints()));  
            sheet.autoSizeColumn(2);
            
                        
            cell = row.createCell(8); 
            cell.setCellValue("Hatanın Yeri\nDefect Loc.");  
            cs = wb.createCellStyle();  
            cs.setFillForegroundColor(IndexedColors.ROSE.getIndex());  
            cs.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            cs.setWrapText(true);  
            cell.setCellStyle(cs);  
            row.setHeightInPoints((2*sheet.getDefaultRowHeightInPoints()));  
            sheet.autoSizeColumn(2);
            
                        
            cell = row.createCell(9); 
            cell.setCellValue("Sonuç\nResult");  
            cs = wb.createCellStyle();  
            cs.setFillForegroundColor(IndexedColors.ROSE.getIndex());  
            cs.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            cs.setWrapText(true);  
            cell.setCellStyle(cs);  
            row.setHeightInPoints((2*sheet.getDefaultRowHeightInPoints()));  
            sheet.autoSizeColumn(2);
            
            row= sheet.createRow(24);  
             cell = row.createCell(0); 
            cell.setCellValue("1");  
                        
            cell = row.createCell(1); 
            sheet.addMergedRegion(new CellRangeAddress(24,24,1,2));
            cell.setCellValue(txt35.getText());
            
            cell = row.createCell(3); 
            cell.setCellValue(txt42.getText());
            
            cell = row.createCell(3); 
            cell.setCellValue(txt42.getText());
            
            cell = row.createCell(4); 
            cell.setCellValue(txt58.getText());
            
            cell = row.createCell(5); 
            cell.setCellValue(txt73.getText());
            
            cell = row.createCell(6); 
            cell.setCellValue(txt88.getText());
            
            cell = row.createCell(7); 
            cell.setCellValue(txt103.getText());
            
            cell = row.createCell(8); 
            cell.setCellValue(txt118.getText());
                        
            row= sheet.createRow(25);  
            cell = row.createCell(0); 
            cell.setCellValue("2"); 
            
            cell = row.createCell(1); 
            sheet.addMergedRegion(new CellRangeAddress(25,25,1,2));
            cell.setCellValue(txt36.getText());
            
            cell = row.createCell(3); 
            cell.setCellValue(txt43.getText());
            
            cell = row.createCell(4); 
            cell.setCellValue(txt59.getText());
            
            cell = row.createCell(5); 
            cell.setCellValue(txt74.getText());
            
            cell = row.createCell(6); 
            cell.setCellValue(txt89.getText());
            
            cell = row.createCell(7); 
            cell.setCellValue(txt104.getText());
            
            cell = row.createCell(8); 
            cell.setCellValue(txt119.getText());
                       
            row= sheet.createRow(26);  
            cell = row.createCell(0); 
            cell.setCellValue("3");
            
            cell = row.createCell(1); 
            sheet.addMergedRegion(new CellRangeAddress(26,26,1,2));
            cell.setCellValue(txt37.getText());
            
            cell = row.createCell(3); 
            cell.setCellValue(txt44.getText());
            
            cell = row.createCell(4); 
            cell.setCellValue(txt60.getText());
            
            cell = row.createCell(5); 
            cell.setCellValue(txt75.getText());
            
            cell = row.createCell(6); 
            cell.setCellValue(txt90.getText());
            
            cell = row.createCell(7); 
            cell.setCellValue(txt105.getText());
            
            cell = row.createCell(8); 
            cell.setCellValue(txt120.getText());
            
                       
            row= sheet.createRow(27);  
            cell = row.createCell(0); 
            cell.setCellValue("4"); 
            
            cell = row.createCell(1); 
            sheet.addMergedRegion(new CellRangeAddress(27,27,1,2));
            cell.setCellValue(txt38.getText());
            
            cell = row.createCell(3); 
            cell.setCellValue(txt45.getText());
            
            cell = row.createCell(4); 
            cell.setCellValue(txt61.getText());
            
            cell = row.createCell(5); 
            cell.setCellValue(txt76.getText());
            
            cell = row.createCell(6); 
            cell.setCellValue(txt91.getText());
            
            cell = row.createCell(7); 
            cell.setCellValue(txt106.getText());
            
            cell = row.createCell(8); 
            cell.setCellValue(txt121.getText());
            
                        
            row= sheet.createRow(28);  
            cell = row.createCell(0); 
            cell.setCellValue("5");
            
            cell = row.createCell(1); 
            sheet.addMergedRegion(new CellRangeAddress(28,28,1,2));
            cell.setCellValue(txt39.getText());
            
            cell = row.createCell(3); 
            cell.setCellValue(txt46.getText());
            
            cell = row.createCell(4); 
            cell.setCellValue(txt62.getText());
            
            cell = row.createCell(5); 
            cell.setCellValue(txt77.getText());
            
            cell = row.createCell(6); 
            cell.setCellValue(txt92.getText());
            
            cell = row.createCell(7); 
            cell.setCellValue(txt107.getText());
            
            cell = row.createCell(8); 
            cell.setCellValue(txt122.getText());
                        
            row= sheet.createRow(29);  
            cell = row.createCell(0); 
            cell.setCellValue("6");
            
            cell = row.createCell(1); 
            sheet.addMergedRegion(new CellRangeAddress(29,29,1,2));
            cell.setCellValue(txt40.getText());
            
            cell = row.createCell(3); 
            cell.setCellValue(txt48.getText());
            
            cell = row.createCell(4); 
            cell.setCellValue(txt63.getText());
            
            cell = row.createCell(5); 
            cell.setCellValue(txt78.getText());
            
            cell = row.createCell(6); 
            cell.setCellValue(txt93.getText());
            
            cell = row.createCell(7); 
            cell.setCellValue(txt108.getText());
            
            cell = row.createCell(8); 
            cell.setCellValue(txt123.getText());
            
            row= sheet.createRow(30);  
            cell = row.createCell(0); 
            cell.setCellValue("7");
            
            cell = row.createCell(1); 
            sheet.addMergedRegion(new CellRangeAddress(30,30,1,2));
            cell.setCellValue(txt41.getText());
            
            cell = row.createCell(3); 
            cell.setCellValue(txt49.getText());
            
            cell = row.createCell(4); 
            cell.setCellValue(txt64.getText());
            
            cell = row.createCell(5); 
            cell.setCellValue(txt79.getText());
            
            cell = row.createCell(6); 
            cell.setCellValue(txt94.getText());
            
            cell = row.createCell(7); 
            cell.setCellValue(txt109.getText());
            
            cell = row.createCell(8); 
            cell.setCellValue(txt124.getText());
            
            row= sheet.createRow(31);  
            cell = row.createCell(0); 
            cell.setCellValue("8");
            
            cell = row.createCell(1); 
            sheet.addMergedRegion(new CellRangeAddress(31,31,1,2));
            cell.setCellValue(txt28.getText());
            
            cell = row.createCell(3); 
            cell.setCellValue(txt50.getText());
            
            cell = row.createCell(4); 
            cell.setCellValue(txt65.getText());
            
            cell = row.createCell(5); 
            cell.setCellValue(txt80.getText());
            
            cell = row.createCell(6); 
            cell.setCellValue(txt95.getText());
            
            cell = row.createCell(7); 
            cell.setCellValue(txt110.getText());
            
            cell = row.createCell(8); 
            cell.setCellValue(txt125.getText());
            
            row= sheet.createRow(32);  
            cell = row.createCell(0); 
            cell.setCellValue("9");
            
            cell = row.createCell(1); 
            sheet.addMergedRegion(new CellRangeAddress(32,32,1,2));
            cell.setCellValue(txt29.getText());
            
            cell = row.createCell(3); 
            cell.setCellValue(txt51.getText());
            
            cell = row.createCell(4); 
            cell.setCellValue(txt66.getText());
            
            cell = row.createCell(5); 
            cell.setCellValue(txt81.getText());
            
            cell = row.createCell(6); 
            cell.setCellValue(txt96.getText());
            
            cell = row.createCell(7); 
            cell.setCellValue(txt111.getText());
            
            cell = row.createCell(8); 
            cell.setCellValue(txt126.getText());
            
            row= sheet.createRow(33);  
            cell = row.createCell(0); 
            cell.setCellValue("10");
            
            cell = row.createCell(1); 
            sheet.addMergedRegion(new CellRangeAddress(33,33,1,2));
            cell.setCellValue(txt30.getText());
            
            cell = row.createCell(3); 
            cell.setCellValue(txt52.getText());
            
            cell = row.createCell(4); 
            cell.setCellValue(txt67.getText());
            
            cell = row.createCell(5); 
            cell.setCellValue(txt82.getText());
            
            cell = row.createCell(6); 
            cell.setCellValue(txt97.getText());
            
            cell = row.createCell(7); 
            cell.setCellValue(txt112.getText());
            
            cell = row.createCell(8); 
            cell.setCellValue(txt127.getText());
            
            row= sheet.createRow(34);  
            cell = row.createCell(0); 
            cell.setCellValue("11"); 
            
            cell = row.createCell(1); 
            sheet.addMergedRegion(new CellRangeAddress(34,34,1,2));
            cell.setCellValue(txt31.getText());
            
            cell = row.createCell(3); 
            cell.setCellValue(txt53.getText());
            
            cell = row.createCell(4); 
            cell.setCellValue(txt68.getText());
            
            cell = row.createCell(5); 
            cell.setCellValue(txt83.getText());
            
            cell = row.createCell(6); 
            cell.setCellValue(txt98.getText());
            
            cell = row.createCell(7); 
            cell.setCellValue(txt113.getText());
            
            cell = row.createCell(8); 
            cell.setCellValue(txt128.getText());
            
            row= sheet.createRow(35);  
            cell = row.createCell(0); 
            cell.setCellValue("12");
            
            cell = row.createCell(1); 
            sheet.addMergedRegion(new CellRangeAddress(35,35,1,2));
            cell.setCellValue(txt32.getText());
            
            cell = row.createCell(3); 
            cell.setCellValue(txt54.getText());
            
            cell = row.createCell(4); 
            cell.setCellValue(txt69.getText());
            
            cell = row.createCell(5); 
            cell.setCellValue(txt84.getText());
            
            cell = row.createCell(6); 
            cell.setCellValue(txt99.getText());
            
            cell = row.createCell(7); 
            cell.setCellValue(txt114.getText());
            
            cell = row.createCell(8); 
            cell.setCellValue(txt129.getText());
            
            row= sheet.createRow(36);  
            cell = row.createCell(0); 
            cell.setCellValue("13"); 
            
            cell = row.createCell(1); 
            sheet.addMergedRegion(new CellRangeAddress(36,36,1,2));
            cell.setCellValue(txt33.getText());
            
            cell = row.createCell(3); 
            cell.setCellValue(txt55.getText());
            
            cell = row.createCell(4); 
            cell.setCellValue(txt70.getText());
            
            cell = row.createCell(5); 
            cell.setCellValue(txt85.getText());
            
            cell = row.createCell(6); 
            cell.setCellValue(txt100.getText());
            
            cell = row.createCell(7); 
            cell.setCellValue(txt115.getText());
            
            cell = row.createCell(8); 
            cell.setCellValue(txt130.getText());
            
            row= sheet.createRow(37);  
            cell = row.createCell(0); 
            cell.setCellValue("14"); 
            
            cell = row.createCell(1); 
            sheet.addMergedRegion(new CellRangeAddress(37,37,1,2));
            cell.setCellValue(txt34.getText());
            
            cell = row.createCell(3); 
            cell.setCellValue(txt56.getText());
            
            cell = row.createCell(4); 
            cell.setCellValue(txt71.getText());
            
            cell = row.createCell(5); 
            cell.setCellValue(txt86.getText());
            
            cell = row.createCell(6); 
            cell.setCellValue(txt101.getText());
            
            cell = row.createCell(7); 
            cell.setCellValue(txt116.getText());
            
            cell = row.createCell(8); 
            cell.setCellValue(txt131.getText());
            
            row= sheet.createRow(38);  
            cell = row.createCell(0); 
            cell.setCellValue("15"); 
            
            cell = row.createCell(1); 
            sheet.addMergedRegion(new CellRangeAddress(38,38,1,2));
            cell.setCellValue(txt47.getText());
            
            cell = row.createCell(3); 
            cell.setCellValue(txt57.getText());
            
            cell = row.createCell(4); 
            cell.setCellValue(txt72.getText());
            
            cell = row.createCell(5); 
            cell.setCellValue(txt87.getText());
            
            cell = row.createCell(6); 
            cell.setCellValue(txt102.getText());
 
            cell = row.createCell(7); 
            cell.setCellValue(txt117.getText());
            
            cell = row.createCell(8); 
            cell.setCellValue(txt132.getText());
            
                         
            row= sheet.createRow(39);  
            cell = row.createCell(0); 
            sheet.addMergedRegion(new CellRangeAddress(39,39,0,1));
            cell.setCellValue("Personel Bilgileri /\nPerson. Infor. ");  
            cs = wb.createCellStyle();  
            cs.setFillForegroundColor(IndexedColors.ROSE.getIndex());  
            cs.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            cs.setWrapText(true);  
            cell.setCellStyle(cs);
            row.setHeightInPoints((2*sheet.getDefaultRowHeightInPoints()));  
            sheet.autoSizeColumn(2);
            
            

            
             cell = row.createCell(2); 
            sheet.addMergedRegion(new CellRangeAddress(39,39,2,3));
            cell.setCellValue("Operatör /\nOperator");  
            cs = wb.createCellStyle();  
            cs.setFillForegroundColor(IndexedColors.ROSE.getIndex());  
            cs.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            cs.setWrapText(true);  
            cell.setCellStyle(cs); 
            row.setHeightInPoints((2*sheet.getDefaultRowHeightInPoints()));  
            sheet.autoSizeColumn(2);

            
            cell = row.createCell(4);
            sheet.addMergedRegion(new CellRangeAddress(39,39,4,5));
            cell.setCellValue("Değerlendiren /\nEvaluated by ");  
            cs = wb.createCellStyle();  
            cs.setFillForegroundColor(IndexedColors.ROSE.getIndex());  
            cs.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            cs.setWrapText(true);  
            cell.setCellStyle(cs);  

                       
            cell = row.createCell(6); 
            cell.setCellValue("Onay /\nConfirmation "); 
            sheet.addMergedRegion(new CellRangeAddress(39,39,6,7));
            cs = wb.createCellStyle();  
            cs.setFillForegroundColor(IndexedColors.ROSE.getIndex());  
            cs.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            cs.setWrapText(true);  
            cell.setCellStyle(cs);
            row.setHeightInPoints((2*sheet.getDefaultRowHeightInPoints()));  
            sheet.autoSizeColumn(2);

                        
            cell = row.createCell(8);
            sheet.addMergedRegion(new CellRangeAddress(39,39,8,9));
            cell.setCellValue("Müşteri /\nCustomer");  
            cs = wb.createCellStyle();  
            cs.setFillForegroundColor(IndexedColors.ROSE.getIndex());  
            cs.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            cs.setWrapText(true);  
            cell.setCellStyle(cs);
            row.setHeightInPoints((2*sheet.getDefaultRowHeightInPoints()));  
            sheet.autoSizeColumn(2);
            
            row= sheet.createRow(40);  
            cell = row.createCell(0); 
            sheet.addMergedRegion(new CellRangeAddress(40,40,0,1));
            cell.setCellValue("Adı Soyadı /Name Surname ");  
            cs = wb.createCellStyle();  
            cs.setFillForegroundColor(IndexedColors.ROSE.getIndex());  
            cs.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            cs.setWrapText(true);  
            cell.setCellStyle(cs);
            
            
          
            cell = row.createCell(2); 
            sheet.addMergedRegion(new CellRangeAddress(40,40,2,3));
            cell.setCellValue((String)combobox.getSelectionModel().getSelectedItem());  
      
           cell = row.createCell(4); 
           sheet.addMergedRegion(new CellRangeAddress(40,40,4,5));
           cell.setCellValue((String)combobox1.getSelectionModel().getSelectedItem()); 
           
           cell = row.createCell(6); 
           sheet.addMergedRegion(new CellRangeAddress(40,40,6,7));
           cell.setCellValue((String)combobox2.getSelectionModel().getSelectedItem());
           
           cell = row.createCell(8); 
           sheet.addMergedRegion(new CellRangeAddress(40,40,8,9));
           cell.setCellValue(txt134.getText());

        
            
            
           
            
             
            row= sheet.createRow(41);  
            cell = row.createCell(0); 
            sheet.addMergedRegion(new CellRangeAddress(41,41,0,1));
            cell.setCellValue("Seviye / Level ");  
            cs = wb.createCellStyle();  
            cs.setFillForegroundColor(IndexedColors.ROSE.getIndex());  
            cs.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            cs.setWrapText(true);  
            cell.setCellStyle(cs);
           
            cell = row.createCell(2); 
           sheet.addMergedRegion(new CellRangeAddress(41,41,2,3));
           cell.setCellValue(txtseviye.getText());
           
           cell = row.createCell(4); 
           sheet.addMergedRegion(new CellRangeAddress(41,41,4,5));
           cell.setCellValue(txtseviye1.getText());
           
           cell = row.createCell(6); 
           sheet.addMergedRegion(new CellRangeAddress(41,41,6,7));
           cell.setCellValue(txtseviye2.getText());
           
           cell = row.createCell(8); 
           sheet.addMergedRegion(new CellRangeAddress(41,41,8,9));
           cell.setCellValue(txt135.getText());
           
           
            
            row= sheet.createRow(42);  
            cell = row.createCell(0); 
            sheet.addMergedRegion(new CellRangeAddress(42,42,0,1));
            cell.setCellValue("Tarih / Date ");  
            cs = wb.createCellStyle();  
            cs.setFillForegroundColor(IndexedColors.ROSE.getIndex());  
            cs.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            cs.setWrapText(true);  
            cell.setCellStyle(cs);

            row= sheet.createRow(43);  
            cell = row.createCell(0); 
            sheet.addMergedRegion(new CellRangeAddress(43,44,0,1));
            cell.setCellValue("İmza / Signature ");  
            cs = wb.createCellStyle();  
            cs.setFillForegroundColor(IndexedColors.ROSE.getIndex());  
            cs.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            cs.setWrapText(true);  
            cell.setCellStyle(cs);
                        
 
            cell = row.createCell(2); 
            sheet.addMergedRegion(new CellRangeAddress(43,44,2,3));
            
            cell = row.createCell(4); 
            sheet.addMergedRegion(new CellRangeAddress(43,44,4,5));

            cell = row.createCell(6); 
            sheet.addMergedRegion(new CellRangeAddress(43,44,6,7));
            
            cell = row.createCell(8); 
            sheet.addMergedRegion(new CellRangeAddress(43,44,8,9));
            
          
          wb.write(os);  
       
        
        }catch(Exception e) {  
            System.out.println(e.getMessage());  
        }  
         
     }
     
      public void Excel3(TextField ad1) throws IOException {
           
   
            System.out.println("ad yazıldı 3" + ad1.getText());
            
           
        
    }


    public BerichtController() {
        this.AkımTipichoiceBoxList = FXCollections.observableArrayList("AC","DC");
        
    }
    public void combo() throws IOException{
    
        Connection c;
             try{
                 c = (Connection) DB.connect();
                 
                 String query = "Select * from Bilgi where ad=? ";
                 
                 
                 PreparedStatement preparedStmt = c.prepareStatement(query);
                 
                 preparedStmt.setString(1,(String)combobox.getSelectionModel().getSelectedItem());
                 
                 ResultSet rs = preparedStmt.executeQuery();
                 
                 while(rs.next()){
                     
                     txtseviye.setText(rs.getString("seviye"));
                     
                 }
                 preparedStmt.close();
                 rs.close();
                 
             }
             catch(SQLException e){
                 System.out.println(e.toString());
             }
     
    System.out.println("1 seçildi");
    
        
    }
    public void combo2() throws IOException{
    
        Connection c;
             try{
                 c = (Connection) DB.connect();
                 
                 String query = "Select * from Bilgi where ad=? ";
                 
                 
                 PreparedStatement preparedStmt = c.prepareStatement(query);
                 
                 preparedStmt.setString(1,(String)combobox1.getSelectionModel().getSelectedItem());
                 
                 ResultSet rs = preparedStmt.executeQuery();
                 
                 while(rs.next()){
                     
                     txtseviye1.setText(rs.getString("seviye"));
                     
                 }
                 preparedStmt.close();
                 rs.close();
                 
             }
             catch(SQLException e){
                 System.out.println(e.toString());
             }
     
    System.out.println("2 seçildi");
    
        
    }
    
    public void combo3() throws IOException{
    
        Connection c;
             try{
                 c = (Connection) DB.connect();
                 
                 String query = "Select * from Bilgi where ad=? ";
                 
                 
                 PreparedStatement preparedStmt = c.prepareStatement(query);
                 
                 preparedStmt.setString(1,(String)combobox2.getSelectionModel().getSelectedItem());
                 
                 ResultSet rs = preparedStmt.executeQuery();
                 
                 while(rs.next()){
                     
                     txtseviye2.setText(rs.getString("seviye"));
                     
                 }
                 preparedStmt.close();
                 rs.close();
                 
             }
             catch(SQLException e){
                 System.out.println(e.toString());
             }
     
    System.out.println("3 seçildi");
    
        
    }
    public void Ekipman() throws IOException{
    
        Connection c;
             try{
                 c = (Connection) DB.connect();
                 
                 String query = "Select * from Ekipman_Bilgileri where EkipmanAd=? ";
                 
                 
                 PreparedStatement preparedStmt = c.prepareStatement(query);
                 
                 preparedStmt.setString(1,(String)ekipman.getSelectionModel().getSelectedItem());
                 
                 ResultSet rs = preparedStmt.executeQuery();
                 
                 while(rs.next()){
                     
                     txt9.setText(rs.getString("KutupMesafesi"));
                     txt10.setText(rs.getString("Cihaz"));
                     txt11.setText(rs.getString("MPTaşıyıcıOrtam"));
                     txt12.setText(rs.getString("MıknatıslamaTekniği"));
                     txt13.setText(rs.getString("UVIşıkŞiddeti"));
                     txt14.setText(rs.getString("IşıkMesafesi"));
                     
                     
                 }
                 preparedStmt.close();
                 rs.close();
                 
             }
             catch(SQLException e){
                 System.out.println(e.toString());
             }
     
    System.out.println("Ekipman seçildi");
    
        
    }
            
    
        @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
     
     ProjeAdıchoiceBox.setItems(ProjeAdıchoiceBoxList);
     ProjeAdıchoiceBox.setValue("mmm");
     MuayeneDurumuchoiceBox.setItems(MuayeneDurumuchoiceBoxList);
     MuayeneDurumuchoiceBox.setValue("mmm");
     AkımTipichoiceBox.setItems(AkımTipichoiceBoxList);
     AkımTipichoiceBox.setValue("mmm");
     SonucchoiceBox.setItems(SonucchoiceBoxList);
     SonucchoiceBox.setValue("mmm");
     
    
     Connection c;

     
    System.out.println("ss");
    
        try{
        c = (Connection) DB.connect();
        
        String query = "Select ad from Bilgi where departman='operatör' "; 
        
      
      PreparedStatement preparedStmt = c.prepareStatement(query);
      ResultSet rs = preparedStmt.executeQuery();
      
 

      
      while(rs.next()){
          combobox.getItems().addAll(rs.getString("ad"));
          System.out.println(combobox.getItems());
      
      }
      

        }
        catch(Exception e){
            System.out.println(e.toString());
        }
        
        try{
        c = (Connection) DB.connect();
 
        String query = "Select ad from Bilgi where departman='değerlendiren' "; 
        
      
      PreparedStatement preparedStmt = c.prepareStatement(query);
      ResultSet rs = preparedStmt.executeQuery();
      
      
      while(rs.next()){
          combobox1.getItems().addAll(rs.getString("ad"));
         
      
      }
      preparedStmt.close();
      rs.close();
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
        
                
        try{
        c = (Connection) DB.connect();
 
        String query = "Select ad from Bilgi where departman='onay' "; 
        
      
      PreparedStatement preparedStmt = c.prepareStatement(query);
      ResultSet rs = preparedStmt.executeQuery();
      
      
      while(rs.next()){
          combobox2.getItems().addAll(rs.getString("ad"));
          
      
      }
      preparedStmt.close();
      rs.close();
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
        
              
        try{
        c = (Connection) DB.connect();
 
        String query = "Select EkipmanAd from Ekipman_Bilgileri "; 
        
      
      PreparedStatement preparedStmt = c.prepareStatement(query);
      ResultSet rs = preparedStmt.executeQuery();
      
      
      while(rs.next()){
          ekipman.getItems().addAll(rs.getString("EkipmanAd"));
          
      
      }
      preparedStmt.close();
      rs.close();
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
        
                
        try{
        c = (Connection) DB.connect();
 
        String query = "Select Müsteri from Firma_Bilgileri "; 
        
      
      PreparedStatement preparedStmt = c.prepareStatement(query);
      ResultSet rs = preparedStmt.executeQuery();
      
      
      while(rs.next()){
          MusterichoiceBox.getItems().addAll(rs.getString("Müsteri"));
          
      
      }
      preparedStmt.close();
      rs.close();
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
                
                
        try{
        c = (Connection) DB.connect();
 
        String query = "Select YüzeyDurumu from Firma_Bilgileri "; 
        
      
      PreparedStatement preparedStmt = c.prepareStatement(query);
      ResultSet rs = preparedStmt.executeQuery();
      
      
      while(rs.next()){
          YuzeyDurumuchoiceBox.getItems().addAll(rs.getString("YüzeyDurumu"));
          
      
      }
      preparedStmt.close();
      rs.close();
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
                
        try{
        c = (Connection) DB.connect();
 
        String query = "Select İşEmriNo from Firma_Bilgileri "; 
        
      
      PreparedStatement preparedStmt = c.prepareStatement(query);
      ResultSet rs = preparedStmt.executeQuery();
      
      
      while(rs.next()){
         IsEmri.getItems().addAll(rs.getString("İşEmriNo"));
          
      
      }
      preparedStmt.close();
      rs.close();
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
        
         try{
        c = (Connection) DB.connect();
 
        String query = "Select TeklifNo from Firma_Bilgileri "; 
        
      
      PreparedStatement preparedStmt = c.prepareStatement(query);
      ResultSet rs = preparedStmt.executeQuery();
      
      
      while(rs.next()){
         TeklifNochoiceBox.getItems().addAll(rs.getString("TeklifNo"));
          
      
      }
      preparedStmt.close();
      rs.close();
        }
        catch(Exception e){
            System.out.println(e.toString());
        }


    }

        public void setAd(TextField ad1) {
        this.ad1 = ad1;
    }
       public TextField getAd() {
        return ad1;
    }
               
        public void setAd1(TextField txt133) {
        this.txt133 = txt133;
    }
       public TextField getAd1() {
        return txt133;
    }
  
}
