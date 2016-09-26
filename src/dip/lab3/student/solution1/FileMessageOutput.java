
package dip.lab3.student.solution1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cgonz
 */
public class FileMessageOutput implements MessageOutput {
    private File file;

    public FileMessageOutput(File file) {
        this.file = file;
    }
    
    @Override
    public void outputMessage(String message) {
       File file = this.file;
        try {
            PrintWriter fileOutput = new PrintWriter(file);
            fileOutput.print(message);
            fileOutput.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileMessageOutput.class.getName()).log(Level.SEVERE,
                    null, ex);
        }
    }
    
}
