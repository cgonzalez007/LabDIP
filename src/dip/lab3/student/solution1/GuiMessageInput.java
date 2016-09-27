
package dip.lab3.student.solution1;

import javax.swing.JOptionPane;

/**
 *
 * @author cgonz
 */
public class GuiMessageInput implements MessageInput {

    @Override
    public String getMessage() {
       return JOptionPane.showInputDialog(null,"Enter message: ");
    }
    
}
