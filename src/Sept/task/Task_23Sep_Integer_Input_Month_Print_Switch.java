package Sept.task;

public class Task_23Sep_Integer_Input_Month_Print_Switch {
    public static void main(String[] args)
    {
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
    }
    }