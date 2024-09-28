package Sept.ex_16092024;

public class Lab0018_LogicalOperator {

    public static void main(String[] args){
        //Logical operator !,&,||

        boolean a=true;
        boolean b= false;
        boolean c=a & b;
        boolean d=a || b;
        System.out.println(c);
        System.out.println(d);
        System.out.println(!true);
        System.out.println(!a);
        System.out.println(!(10>20));
        System.out.println(!!!!(30>90));
        // & gate
        System.out.println(true&true);
        System.out.println(true&false);
        System.out.println(false&true);
        System.out.println(false&false);
        //or gate
        System.out.println(true||true);
        System.out.println(true||false);
        System.out.println(false&true);
        System.out.println(false||false);

        //interview Question
        int ab=12;
        boolean Res=!(ab>10||ab<5);

        short s=10;
        char c1='A';//65
        char c2='B';//66
        int ss =s+c1;
        System.out.println(ss);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c1+c2);
        System.out.println('A'==65);



    }
}
