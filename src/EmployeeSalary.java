import java.util.Scanner;
public class EmployeeSalary{

    public static void getInformation() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter hourly rate (PHP): ");
        double hourlyRate = input.nextDouble();
        System.out.print("Enter daily working hours: ");
        int hoursWorked = input.nextInt();
        double initialSalary = hourlyRate*hoursWorked*25;
        System.out.println("Initial Monthly Salary: "+initialSalary);
        finalSalary(hoursWorked, initialSalary);
    }

    public static double addSalary(double monthlySalary) {
        return monthlySalary+4000;
    }

    public static double addOvertimePay(double monthlySalary) {
        return monthlySalary+2000;
    }

    public static void finalSalary(int hoursWorked, double initialSalary) {
        if(initialSalary<10000) {
            if (hoursWorked>6) {
                System.out.println("Final Monthly Salary: " + addSalary(addOvertimePay(initialSalary)));
            }
            else{
                System.out.println("Final Monthly Salary: " + addSalary(initialSalary));
            }
        }
        else {
            System.out.println("Final Monthly Salary: " + initialSalary);
        }
    }

    public static void main(String[] args) {
        System.out.println("Laboratory Activity 5");
        System.out.println("Please fill up Employee details...");
        getInformation();
    }
}

