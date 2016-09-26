
package dip.lab3.student.solution1;

import javax.swing.JOptionPane;

/**
 *
 * @author cgonz
 */
public class GuiMessageOutput implements MessageOutput {

    @Override
    public void outputMessage(String message) {
        JOptionPane.showMessageDialog(null, message);
    }

}
