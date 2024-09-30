package Sept.task;

public class Task_20Sep_TriangleClassifier_IF {
    public static void main(String[] args){

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


    }
}
