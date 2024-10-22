package Oct.ex_16102024_Static_and_Enum.Static;

public class Lab049_IIb_SIB {

    //IIB-Instance Initialisation Block
    //SIB -Static Initialisation Block

public static void main(String[] args){
 A a =new A();
    A a1 =new A();
    A a2 =new A();
    A a3;
}
}


    class A{

        {
            System.out.println("IIB");
        }


      static  {
            System.out.println("SIB");//it will be load during the class loading
        }
    }

