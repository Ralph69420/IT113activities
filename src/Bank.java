import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account a = new Account();
        int option = 0;
        while (option != 5) {
            System.out.println("What do you want to do?");
            System.out.println("1 - Deposit");
            System.out.println("2 - Withdraw");
            System.out.println("3 - Display Balance");
            System.out.println("4 - Display Details");
            System.out.println("5 - Exit");
            System.out.print("Select: ");
            option = sc.nextInt();
            if(option == 1){
                a.deposit();
            }
            if(option == 2){
                a.withdraw();
            }
            if(option == 3){
                System.out.println("Current balance: "+ a.getBalance());
            }
            if(option == 4){
                a.display();
            }
            if(option == 5){
                System.out.println("Exit Program...");
            }

        }
    }
}

