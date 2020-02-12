/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdfconvert;


import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileOutputStream;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.*;
/**
 *
 * @author Bibek
 */
public class PDFConvert {
    public PDFConvert(String content)
    {
        try
        {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        JFileChooser fs=new JFileChooser(new File("c:\\"));
        fs.setDialogTitle("Save File");
        fs.addChoosableFileFilter(new FileTypeFilter(".pdf","PDF Files"));
        fs.setAcceptAllFileFilterUsed(true);
        int result=fs.showSaveDialog(null);
        
        if(result== JFileChooser.APPROVE_OPTION)
        {
            
            File fi = fs.getSelectedFile();
            try{
                
               com.itextpdf.text.Document doc = new com.itextpdf.text.Document();
               PdfWriter.getInstance(doc, new FileOutputStream(fi));
               doc.open();
               doc.add(new Paragraph(content));
               doc.close();
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,e.getMessage());
            }
            
        }
    }
    
}
