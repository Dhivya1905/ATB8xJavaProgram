package Sept.ex_30092024;

public class Lab036_FunctionTypes {
    /* Types of Function
    1) without parameter and without return type
    2) without parameter and with return type
    3) with parameter and without return type
    4) with parameter and with return type`
    */

    // without parameter and without return type

    public static void FunctionType1()
    {
        System.out.println("This is the Without parameter and without return type Function ");
    }

    // without parameter and  return type

    public static int  FunctionType2()
    {
      System.out.println("This is the Without parameter and with return type Function ") ;
      return 85;
    }

    public static void  FunctionType3(String Name,int age)
    {
        System.out.println("This is the With parameter and without return type Function ") ;
        System.out.println(Name);
        System.out.println(age);
    }

    public static int  FunctionType4(int a,int b )
    {
        System.out.println("This is the With parameter and without return type Function ") ;

        return(a+b);

    }

        public static void main(String[]  args){

            FunctionType1();
            int Result2=FunctionType2();
            System.out.println("Returned from FunctionType2: " + Result2);
            FunctionType3("Dhivya",32);
            int Result3=FunctionType4(5,8);
            System.out.println("SUM: " + Result3);


    }

}


