
package dip.lab3.student.solution1;

/**
 *
 * @author cgonz
 */
public class MessageManager {

    public void outputMessage(MessageInput messageInput,
            MessageOutput messageOutput) {
        String message = messageInput.getMessage();
        messageOutput.outputMessage(message);
    }
}
