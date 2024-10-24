package Oct.ex_18102024_Strings;

public class Strings {

    //String is a non primitive Data type
    //Bunch of characters
    //String is a class
    /*String are immutable in nature, once its created value cannot be changed ,
    any modification required need to create a new string instance

    String will be created in 2 ways
    1) =Assignment operator   string name="Dhivya"; will be created in String constant pool in JVM
    2) new operator  string name =new String(pramod); will be created in Heap area in JVM

    when once you create a string literal , JVM search in string constant pool to see the identical string is already exist
    if it is present the reference will point to that  else it will create new string.


     */

    public static void main(String[] args) {
        String name = "Dhivya";  //=Assignment operator

        String s1=new String("pradeep");//new operator

    }

}
