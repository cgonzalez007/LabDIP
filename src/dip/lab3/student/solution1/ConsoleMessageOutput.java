
package dip.lab3.student.solution1;

/**
 *
 * @author cgonz
 */
public class ConsoleMessageOutput implements MessageOutput{

    @Override
    public final void outputMessage(String message) {
        System.out.println(message);
    }
    
}
