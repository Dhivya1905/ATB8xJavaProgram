package Sept.ex_18092024;

public class Lab019_TypeCasting {
    public static void main(String[] args){
        //Type Casting
        //Widening -Implicit ,Explicit -Lossless
        //Narrowing-Implicit ,Explicit (with datatype) Data loss


        //Widening
        byte b=10;
        int a=b; //implicit
        //int a=int (b); //Explicit

        int Val=300;
        //byte res= val;//Invalid Implicit casting JVM
        byte res= (byte) Val ;//Explicit casting JVM-Loss of data
        System.out.println(res);

        long phone_no=8489895030l;
        short s1=(short) phone_no;
        System.out.println(s1);


    }
}
