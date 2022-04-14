import java.util.Scanner;

public class Account {
    public String name="Ralph Jansen";
    public String surname="Tolentino";
    public String phone="09663428320";
    public double balance=10000;

    void deposit(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter deposit amount: ");
        double dep = sc.nextDouble();
        balance=balance+dep;
    }
    void withdraw(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter withdraw amount: ");
        double wd = sc.nextDouble();
        balance=balance-wd;
    }
    double getBalance(){
        return balance;
    }
    void display(){
        System.out.println(name+" "+surname);
        System.out.println(phone);
    }
}
