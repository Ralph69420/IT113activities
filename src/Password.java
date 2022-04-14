import java.util.Scanner;

public class Password {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter password(min 15 char): ");
        String pass = input.nextLine();
        int x = pass.length();
        if(x>=15){
            System.out.println("Password is valid. ");
        } else{
            System.out.println("Password is invalid. ");
        }
    }
}