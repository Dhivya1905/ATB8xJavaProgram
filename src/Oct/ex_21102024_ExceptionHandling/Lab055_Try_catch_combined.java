package Oct.ex_21102024_ExceptionHandling;

public class Lab055_Try_catch_combined {


        //multiple try and catch

        public static void main(String[] args) {
            int a = 10;
            int b =10;

            String s1= null;
            try {
               int c = a / b;
                String result=s1.trim();
                System.out.println(c);
                System.out.println(result);
            } catch (ArithmeticException| NullPointerException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("End");

    }
}
