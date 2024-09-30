package Sept.ex_27092024;

public class Lab025_For_Loop {

    public  static void main(String[] args) {
        /*For Loop
        Syntax (initialization,condition,Update)
         */

        for (int j=1; j<=10; j++)
        {
            System.out.println(j);
        }

        System.out.println("---------------");
        for (int Dhivya=1; Dhivya<=10; Dhivya++)
        {
            System.out.println(Dhivya);
        }
        System.out.println("---------------");
        for ( char A ='A'; A<='Z';A++)
        {
            System.out.println(A);
        }

        System.out.println("---------------");

        /* Intialization outside of for loop is possible*/

        int i=10;
        for (;i>=0;i--) {
            System.out.println(i);
        }

        System.out.println("---------------");
        System.out.println("Start");
        for(i=0;i<10;i++) {
            System.out.println("Dhivya");
        }
        System.out.println("End");
    }
}
