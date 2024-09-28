package Sept.ex_16092024;

public class Lab015_Operators {

    public static void main(String[] args){
int a=45;
        int b=20;
//= Assignment operator
// Arithmetic operator +,-,*,?,%  also known
// as binary operator which require two operands to perform the operation.
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
 // unary operator
        int c=+65;  // unary operator
        int d=-1;  // unary operator
        System.out.println(c);
        System.out.println(d);
        d=d+1;
        System.out.println(d);
// Concatenation operator

        String FirstName= "Dhivya";
        String LastName= "R";
        int e=10;
        int f=20;
        System.out.println(FirstName +' ' +LastName);
        System.out.println(FirstName +LastName+e+f);//if first  is String then it will do concatenation for all the operator
        System.out.println(e+f+FirstName +LastName);//if first  is int, then it will do mathematics after that  concatenation for all the operator
        System.out.println(e+f+FirstName +LastName+e+f);


    }
}
