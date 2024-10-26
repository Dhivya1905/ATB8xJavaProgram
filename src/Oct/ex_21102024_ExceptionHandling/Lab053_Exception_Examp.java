package Oct.ex_21102024_ExceptionHandling;

public class Lab053_Exception_Examp {

    // Exception is a event  that occurs during the execution of a program
    // that disrupt normal flow of instruction -can be handled

   // 2 type of exception
    //checked exception -- JVM knows it during (compile time Exception)
    //Unchecked exception -- JVM does not knows it ( run time exceptions)


    //Error disrupt normal flow - can't be handled

    public static void main(String[] args ){
        int a=10;
        int b=0;
        int c =a/b; //ArithmeticException //unchecked
        System.out.println(c);

       // FileInputStream ip= new FileInputStream(c/a.txt); checked exception

    }
}
