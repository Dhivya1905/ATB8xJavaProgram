package Sept.ex_23092024;

public class Lab024_Switch {

    public static void main(String[] args)
    {
       //Switch function support  only byte, short ,long ,int ,char,string ,enum

        int a=10;
        switch (a){

        }
        char ch='A';
        switch (ch){

        }

        long l= 10l;
        switch ((int) l){

        }
        /*boolean not allowed in the Switch statement

        boolean name= true;
        switch (name){

        }*/

        int abc= 011;
        switch (abc) {
            case 001, 002, 003:
                System.out.println("All of this Electronic item");
                break;

            case 004, 005, 006:
                System.out.println("All of this grocery item");
                break;

            default:
                System.out.println("None");
                break;

        }
            int item= 014;
            switch (item) {
                case 011, 012, 013->
                    System.out.println("All of this Electronic item");


                case 014, 015, 016->
                    System.out.println("All of this grocery item");


                default->
                    System.out.println("None");



        }


    }
}
