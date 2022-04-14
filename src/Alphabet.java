import java.util.Scanner;

public class Alphabet{

    public static void main (String[] args){
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter in the alphabet: ");
        String y = input.nextLine();
        int index = alphabet.indexOf(y)+1;
        System.out.println(y + " has an index of "+ index);
    }
}
