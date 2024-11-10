package Nov.ex_04112024_Generics;

public class Generic_Ex2 {

    public  static void main (String[] args)

    {
        PrintTS("ABC",123,'C');
    }

    public static <T1,T2,T3> void PrintTS(T1 a,T2 b,T3 c)
    {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
