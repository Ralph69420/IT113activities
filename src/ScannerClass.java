import java.util.Scanner;

public class ScannerClass {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your name?: ");
        String yourName = scanner.nextLine();
        System.out.println("Ah I see, your name is " + yourName + ".");
    }
}
