import java.util.Scanner;
public class StringManipulation1 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input a String: ");
        String sentence = input.nextLine();
        System.out.print("Replace something from the String: ");
        String replace = input.nextLine();
        if(sentence.contains(replace)) {
            System.out.print("Replace " + replace + " with what?: ");
            String newword = input.nextLine();
            System.out.println(sentence.replace(replace, newword));
        }
        else {
            System.out.println("String/Character to replace is not found");
        }
    }
}
