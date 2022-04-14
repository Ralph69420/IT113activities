import java.util.Scanner;

public class Employee {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Employee firstname: ");
        String fname = input.nextLine();
        System.out.print("Enter Employee lastname: ");
        String lname = input.nextLine();
        System.out.print("Enter Employee monthly salary: ");
        int salary = input.nextInt();

        double salary2=salary+(salary*.25);

        System.out.println("Employee name: "+ fname +" "+ lname);
        System.out.println("Increased salary by 25%: "+salary2);
    }
}
