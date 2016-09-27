
package dip.lab3.student.solution1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cgonz
 */
public class FileMessageInput implements MessageInput {

    private String fileName;

    public FileMessageInput(String fileName) {

    }

    @Override
    public String getMessage() {
        File file = new File(fileName);
        String message = "";
        try {
            Scanner messageReader = new Scanner(file);
            message = messageReader.next();
            messageReader.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileMessageInput.class.getName()).log(Level.SEVERE,
                    null, ex);
        }

        return message;
    }

}
