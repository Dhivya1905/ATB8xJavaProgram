package Oct.ex_18102024_Strings;

import java.util.Locale;

public class StringFunctions {

    public static void main(String[] args){

        String str=" Hello World ";

        //length of String
        System.out.println( "Length: " + str.length());

        //Substring

        System.out.println( "SubString: " + str.substring(0,6));
        System.out.println( "Trim: '" + str.trim()+"'");
        System.out.println( "Uppercase : " + str.toUpperCase());
        System.out.println( "Lowercase : " + str.toLowerCase());
        System.out.println( "charater position : " + str.charAt(11));
        System.out.println(  str.contains("W"));
        System.out.println(  str.isEmpty());
        System.out.println(  str.equals("Hello"));

        String Name="Dhivya";
        String Name2="Dhiva";
        String Name3=" \u2003\u2003D h i v y a\u2003\u2003   ";
        System.out.println(  Name.compareTo(Name2));

        System.out.println(  "'"+Name3.trim()+"'");//will not remove special unicode spaces
        System.out.println(  "'"+Name3.strip()+"'");//will  remove special unicode spaces








    }
}



