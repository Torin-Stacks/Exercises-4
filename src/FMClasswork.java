import java.io.InputStream;
import java.util.Scanner;

public class FMClasswork {

    public String prompt() {
        System.out.println("Enter your name: ");
        return "Enter your name: ";
    }

    public String printName(String name) {
        Scanner input = new Scanner(name);
        String newName = input.nextLine();
        System.out.println("Hello," + newName);
        return "Hello," + newName;
    }
}
