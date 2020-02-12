/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdfconvert;

import java.io.File;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author Bibek
 */
public class FileTypeFilter extends FileFilter {

    private final String description;
    private final String extension;
    
    public FileTypeFilter(String e, String d)
    {
        description=d;
        extension=e;
    }
    public boolean accept(File f) {
        if(f.isDirectory())
        {
            return true;
        }
        return f.getName().endsWith(extension);
    }

    @Override
    public String getDescription() {
        return description+ String.format("(*%s)", extension);
    }
    
}
