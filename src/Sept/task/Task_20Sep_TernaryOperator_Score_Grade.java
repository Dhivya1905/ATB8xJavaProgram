package Sept.task;

public class Task_20Sep_TernaryOperator_Score_Grade {


   /* ✅ Ternary Operators to handle multiple conditions.

// Input → int score = 85

// String grade →

//  score >= 90 → A
//  score >= 80 → B
//  score >= 70 → C
            */
    public static void main(String[] args) {
        int Score = 85;
        String Grade = (Score >= 90) ? "A" : (Score >= 80) ? "B" : (Score >= 70) ? "C" : "No grade";
        System.out.println(Grade);


    }
}
