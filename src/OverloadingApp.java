public class OverloadingApp {

    private static int computeSum(int num1, int num2){
        return num1 + num2;
    }
    private static int computeSum(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }

    private static int greaterValue(int a, int b){
        if(a>b)
            return a;
        if(b>a)
            return b;
        else
            return 0;
    }

    private static double greaterValue(double a, double b){
        if(a>b)
            return a;
        if(b>a)
            return b;
        else
            return 0;
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println("The greater value between 45 and 100 is " + greaterValue(45,100));
        System.out.println("The greater value between 3.14 and 9.8 is " + greaterValue(3.14,9.8));

    }
}

