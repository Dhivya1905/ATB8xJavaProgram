package Sept.task;

public class Task_18sep {

    public static void main (String[] args)

    {
        /*Give some another example of Widening with Implicit and Explicit, Narrowing with implicit and explicit.

int a = 10;
System.out.println(  --a + a --  + a--); System.out.println(a);

int a = 10;
System.out.println(  --a + a++ + a--); System.out.println(a);

int a = 10;
System.out.println(  a-- + a --  + a --); System.out.println(a);
         */



        int a = 10;
        System.out.println(  a++ + ++a  + --a +a--); System.out.println(a);


    }
}
