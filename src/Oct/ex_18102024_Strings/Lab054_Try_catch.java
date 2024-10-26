package Oct.ex_18102024_Strings;

public class Lab054_Try_catch {

    //multiple try and catch

    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int c = 0; //ArithmeticException //unchecked
        String s1= null;
        try {
            c = a / b;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println("Arithmetic Expression");
        }

        try {
            String result=s1.trim();
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Null Pointer Expression");
        }
        System.out.println("End");

    }
}