
package dip.lab3.student.solution1;

import javax.swing.JOptionPane;

/**
 *
 * @author cgonz
 */
public class GuiMessageOutput implements MessageOutput {

    @Override
    public final void outputMessage(String message) {
        JOptionPane.showMessageDialog(null, message);
    }

}
