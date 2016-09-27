
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

    private String fileName;

    public FileMessageOutput(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void outputMessage(String message) {
        File file = new File(fileName);
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
