import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Calculator calc= new Calculator();

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the action to be performed\n"+"add\n"+"subtract\n"+"multiplication\n"+"division\n");
        String action=sc.nextLine();

        System.out.println("enter the first number");
        double firstNumber = sc.nextDouble();

        System.out.println("enter the second number");
        double secondNumber = sc.nextDouble();

        if(action.equalsIgnoreCase("add")){
            double result=calc.add(firstNumber,secondNumber);
            System.out.println("addition of two numbers is\t"+result);
        }
        else if(action.equalsIgnoreCase("subtract")){
            double result=calc.subtract(firstNumber,secondNumber);
            System.out.println("subtraction of two numbers is\t"+result);
        }
        else if(action.equalsIgnoreCase("multiplication")){
            double result=calc.multiplication(firstNumber,secondNumber);
            System.out.println("multiplication of two numbers is\t"+result);
        }
        else{
            double result=calc.division(firstNumber,secondNumber);
            System.out.println("division of two numbers is\t"+result);
        }
    }
}
