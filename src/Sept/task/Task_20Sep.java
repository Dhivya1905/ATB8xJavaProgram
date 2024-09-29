package Sept.task;

public class Task_20Sep {
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

        int a = 10;
        int b = 20;
        int c = 45;

        String result = (a > b) ? "A is greater than B " : (b > c) ? "B is grater than c" : " C is greatest";
        System.out.println(result);

        int Score = 85;
        String Grade = (Score >= 90) ? "A" : (Score >= 80) ? "B" : (Score >= 70) ? "C" : "No grade";
        System.out.println(Grade);


       // Triangle Classifier ( If)

// Write a program that classifies a triangle based on its side lengths.

// Given three input values representing the lengths of the sides, determine

// if the triangle is equilateral (all sides are equal),

// isosceles (exactly two sides are equal), or

// scalene (no sides are equal).

// Use an if-else statement to classify the triangle.

// side1, side2, side3 ->

        int Side1=20;
        int Side2=30;
        int Side3=20;

        if  (Side1== Side2 && Side2== Side3 )
        { System.out.println("It is a Equilateral Triangle");}
        else if (Side1== Side2 || Side1==Side3 || Side2== Side3  )
        { System.out.println("It is a Isosceles Triangle");}
        else
        { System.out.println("It is a Scalene Triangle");}


/*✅ FizzBuzz Test:

Write a program that prints numbers from 1 to 100.
 However, for multiples of 3, print "Fizz" instead of the number,
  and for multiples of 5, print "Buzz."
  For numbers that are multiples of both 3 and 5, print "FizzBuzz."
 */


        for (int i=1;i<=100;i++) {
            if (i % 3 == 0 && i % 5 == 0)
            {System.out.println("FizzBuzz");
                        continue ;}
            else if (i % 3 == 0)
            {System.out.println("Fizz");
            continue;}
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            continue;}

            System.out.println(i);
        }

       // Leap Year Program - Find 2024

int year=1900;
        boolean isLeap = false;

        if (year%4==0)
        {
        if (year %100 !=0 || year %400 ==0  ){
            isLeap = true;
        }}

        if(isLeap)

        {System.out.printf("%d is a leap Year",year);}
        else
            {System.out.printf("%d is a not leap Year",year);}




            }
}

