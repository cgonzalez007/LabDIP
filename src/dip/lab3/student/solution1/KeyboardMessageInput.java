
package dip.lab3.student.solution1;

import java.util.Scanner;

/**
 *
 * @author cgonz
 */
public class KeyboardMessageInput implements MessageInput {

    @Override
    public String getMessage() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter message: ");
        return input.nextLine();

    }

}
