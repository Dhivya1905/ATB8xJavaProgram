package Oct.ex_18102024_Strings;

public class stringBuilder_stringBuffer {


    //generally string is immutable in nature
    //String Builder and String Buffer is used to make the string mutable

    public static void main(String[] args) {

        String S1="Dhivya";
        System.out.println(S1.concat("Pradeep"));
        // when we appending a string to another string, it is creating a new string ,so it is immutable
        System.out.println(S1);



        StringBuffer A1 = new StringBuffer("Dhivya");
        A1.append("Pradeep");
        //using string Buffer we have append the string , now it is not creating new string ,string is changed,so it is mutable.
        System.out.println(A1);

        // String Buffer and string builder both are able to create  mutable string.
        //String buffer is thread safe and slow  performance  ,while string builder is  not thread safe and fast


        StringBuilder A2 = new StringBuilder("Hello");
        A2.append(" World");

        System.out.println(A2);


    }
}