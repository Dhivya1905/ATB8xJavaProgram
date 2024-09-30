package Sept.task;

public class Task_23Sep_Simple_Arithmetic_Operator {
    public static void main(String[] args){
/*
 Create a simple calculator that performs addition, subtraction, multiplication,
 and division, modlus based on user input using switch statements.

Inputs :   num 1, num 2, +
Output :  num1+num2 → print information.*/

        int  num1=40;
        int  num2=20;
        char oper= '/';

        switch (oper) {
            case '+' -> System.out.println(num1 + num2);
            case '-' -> System.out.println(num1 - num2);
            case '*' -> System.out.println(num1 * num2);
            case '/' -> System.out.println(num1 / num2);
            case '%' -> System.out.println(num1 % num2);
            default -> System.out.println("No such arithmetic operation");

        }
    }
}
