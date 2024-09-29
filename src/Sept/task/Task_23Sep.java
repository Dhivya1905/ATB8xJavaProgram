package Sept.task;

public class Task_23Sep {
    public static void main(String[] args)
    {

        /*
        Create a simple calculator that performs addition, subtraction, multiplication, and division, modus based on user input using switch statements.

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




/*Write a program that takes an integer input (1-12) and prints the name of the corresponding month using a switch statement.
Input  - 12
Out - Dec.*/

        int  Month=6;

        switch (Month) {
            case 1 -> System.out.println("Jan");
            case 2 -> System.out.println("Feb");
            case 3 -> System.out.println("Mar");
            case 4 -> System.out.println("Apr");
            case 5 -> System.out.println("May");
            case 6 -> System.out.println("June");
            case 7 -> System.out.println("July");
            case 8 -> System.out.println("Aug");
            case 9 -> System.out.println("Sep");
            case 10 -> System.out.println("oct");
            case 11 -> System.out.println("Nov");
            case 12 -> System.out.println("Dec");
            default -> System.out.println("Invalid Number");

        }


/*Write a program that converts between different units (e.g., kilometers to miles, Celsius to Fahrenheit) based on user selection using a switch statement.
Input. -
choice - 1 - km → m, km → 1km
choice - 2 - f → c, f → c
         */

        int val=20;
        int  choice=2;

        switch (choice) {
            case 1 -> System.out.println(val * 1000 + "m");
            case 2 -> System.out.println((val * 1.8) + 32 + "F");
        }
    }
}

