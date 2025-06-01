
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TextUI textUI = new TextUI();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input string:");
        String stringInput = scanner.nextLine();
        System.out.println();
        textUI.printWithSpaces(stringInput);

    }
}
