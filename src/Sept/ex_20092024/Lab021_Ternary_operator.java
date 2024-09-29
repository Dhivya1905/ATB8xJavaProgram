package Sept.ex_20092024;

public class Lab021_Ternary_operator {

    public static void main(String[] args)

            //Ternary operator Syntax ---- condtion ? True: false;

    {/*✅ By using Ternary Operators max between 3 numbers.

// Input int - a,b,c - a = 10, b = 20, c = 45

// Max → a,b,c → c

✅ Ternary Operators to handle multiple conditions.

// Input → int score = 85

// String grade →

//  score >= 90 → A
//  score >= 80 → B
//  score >= 70 → C
*/

        int a=10;
        int b=20;
        int c=45;

       String result =  (a>b) ? "A is greater than B ": (b>c)? "B is grater than c":" C is greatest";
       System.out.println (result);

       int Score=85;
       String Grade= (Score>=90) ? "A": (Score>=80)? "B":(Score>=70)? "C": "No grade";
       System.out.println(Grade);
    }
}
