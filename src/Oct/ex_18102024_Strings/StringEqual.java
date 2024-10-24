package Oct.ex_18102024_Strings;

public class StringEqual {

    public static void main (String[] args){
         String s1="Hello"; //String constant pool
        String s4="Hello"; //String constant pool

        int i1=100;//primitive int
        int i2=100;
        Integer intergerObject=Integer.valueOf(i2);//Integer Object

        String s2= new String("Hello");
        String s3= new String("Hello");
        String s5= new String("hello");

//        System.out.println(i1==intergerObject);
//        System.out.println(s1==s2);
//        System.out.println(s2==s3);
//        System.out.println(s1==s4);


        //  == operator in string compare the reference Location ,in case of int compare the value
        System.out.println(s1==s2);
        System.out.println(s2==s3);
// then how we compare string value? ,using equal keyword
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s3.equalsIgnoreCase(s5));
    }
}
