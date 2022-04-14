import java.util.Scanner;

public class BMI {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your height in meters?: ");
        float height = scanner.nextFloat();
        System.out.print("What is your weight in kg?: ");
        float weight = scanner.nextFloat();
        float BMI = weight/(height*height);
        String health="";
        if (BMI<18.5){
            health="underweight";
        }
        if (BMI>=18.5 && BMI<=24.9){
            health="normal weight";
        }
        if (BMI>=25 && BMI<=29.9){
            health="overweight";
        }
        if (BMI>=30){
            health="Obesity";
        }
        System.out.println("Your BMI is " + BMI + ".");
        System.out.println("The User is " + health + ".");
    }
}



