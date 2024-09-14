package Sept.ex_11092024;

public class Lab009_Variable_DataType_Identifier1 {
    public static void main(String[] args) {
        /*DataType 2 types
        1.Primitive type
         a.boolean
         b.Numeric
         */
        //Boolean type
        boolean is_this_my_book =true;

        /* Rules to follow to create Variable Name.
        1) Symbol $,_ are valid
        2) Numbers cannot be started with Variable Name
        3) Space are not allowed
         */

        /* Numeric is divided into two parts
        1.Integral - Integer (whole numbers)
        based on th Size , Min value and Max value
        a) byte --8 bits (-128 to 127)
        b) short -- 2 byte -16 bits --
        c) int --4 byte --32 bits
        d) long--8 byte --64 bits
        e) char (ascii,unicode) -- 2 byte ,16 bits
        2.Floating Point Types -
        a)Float -- 4 byte 32 bits
        b)Double--8 byte 64 bits
         */
/*Non Primitive Data type
User defined Data type  (string)
 */
 byte b= 127;
 short s=128;
 int i=6900;
 long l=4987654321l;
 char c='a';
float FL= 0.01f;
double DO = 0.09d;
String Name="Dhivya";
System.out.println(is_this_my_book);
System.out.println(b);
System.out.println(s);
System.out.println(i);
System.out.println(l);
System.out.println(c);
System.out.println(FL);
System.out.println(DO);
System.out.println(Name);




    }
}