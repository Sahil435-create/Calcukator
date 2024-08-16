import java.util.Scanner;

public class Main {

    static double result = 0;

    public static double add(double a, double b){
        result = a+b;
        return result;
    }

    public static double sub(double a, double b){
        result = a+b;
        return result;
    }

    public static double mul(double a, double b){
        result = a+b;
        return result;
    }

    public static double div(double a, double b){
         result = a+b;
        return result;
    }





    public static void main(String[] args) {

        double num1=0;
        double num2=0;


        while(true){
            System.out.println();
            System.out.println("             **********************Calculator******************          ");
            System.out.println();
            Scanner sc =new Scanner(System.in);


            if (result == 0){
            System.out.print("Enter first number: ");
            num1 = sc.nextDouble();
            }

             System.out.println("Choose one of the operations: + , -, * , /");
            char op = sc.next().charAt(0);

            System.out.print("Enter second number: ");
            num2 = sc.nextDouble();



            switch (op) {
                case '+' -> System.out.println(add(num1 , num2));
                case '-' -> System.out.println(sub(num1 , num2));
                case '*' -> System.out.println(mul(num1 , num2));
                case '/' -> {
                    if (num2 == 0) System.out.println("Undefined");
                    else System.out.println(div(num1 , num2));
                }
                default -> System.out.println("Invalid Operation");
            }

            System.out.println("press 's' to start over or 'c' to continue");
            char ch = sc.next().charAt(0);

                if (ch == 's'){
                    result  = 0;
                }else if(ch == 'c'){
                    num1 = result;
                }else{
                    System.out.println("Invalid Choice");
            }

        }
    }
}