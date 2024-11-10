package Nov.ex_04112024_Generics;

public class Generic_ex {

    public static void main(String[] args) {

        temp(12);
        temp(true);
        temp(12.59);
        temp("Dhivya");

    }
        public static <T> void temp(T a)
        {
           System.out.println(a);
        }

}
