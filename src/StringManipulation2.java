import java.util.Scanner;
public class StringManipulation2 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input a string: ");
        String str = input.nextLine();
        String reverse = "";
        for(int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }
        System.out.println("The Reversed string: " + reverse);
    }
}
