
package dip.lab3.student.solution1;

/**
 *
 * @author cgonz
 */
public class Startup {
    public static void main(String[] args) {
        MessageInput messageInput = new KeyboardMessageInput();
        MessageOutput messageOutput = new GuiMessageOutput();
        
        MessageManager messageManager = new MessageManager();
        messageManager.outputMessage(messageInput, messageOutput);
    
    }
}
