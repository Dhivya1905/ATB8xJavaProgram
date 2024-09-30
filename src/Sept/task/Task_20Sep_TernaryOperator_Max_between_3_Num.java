package Sept.task;

public class Task_20Sep_TernaryOperator_Max_between_3_Num {

    public static void main(String[] args)

    //Ternary operator Syntax ---- condtion ? True: false;

    {
/*✅ By using Ternary Operators max between 3 numbers.

// Input int - a,b,c - a = 10, b = 20, c = 45

// Max → a,b,c → c */


        int a = 10;
        int b = 20;
        int c = 45;

        String result = (a > b) ? "A is greater than B " : (b > c) ? "B is grater than c" : " C is greatest";
        System.out.println(result);


    }
}