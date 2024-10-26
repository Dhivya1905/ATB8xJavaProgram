package Oct.ex_21102024_WrapperClass;

public class Wrapperclass {

    public void main(String[] args) {

//why wrapper class
        //for converting primitive data type in to the objects

        int a1 = 10; //AutoBoxing int ->> Interger ,so that we can use some functions
        Integer a2 = a1;
        System.out.println(a2);
        System.out.println(Integer.bitCount(a2));
        System.out.println(Integer.valueOf(a2));
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        Integer b=20;
        int b1=b; //unboxing
        System.out.println(b1);


    }
}
