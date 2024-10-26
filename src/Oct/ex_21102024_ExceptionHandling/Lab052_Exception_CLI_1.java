package Oct.ex_21102024_ExceptionHandling;

public class Lab052_Exception_CLI_1 {

    public static void main(String[] args)
    {
        System.out.println("Start of the program");
        String input=args[0];//ArrayIndexOutOfBoundsException// null --Lab53_Exception_3
        int a=Integer.parseInt(input);//NumberFormatException//Dhivya--Lab53_Exception_2
        int b=100;
        int result= b/a;  //ArithmeticException//0---Lab53_Exception_4
        System.out.println(result);
        System.out.println("End  of the program");
    }
}
