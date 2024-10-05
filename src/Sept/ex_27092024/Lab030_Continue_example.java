package Sept.ex_27092024;

public class Lab030_Continue_example {

    //print number 1 to 20 but skip 16
    public static void main(String[] args){
        for(int i=1;i<=20;i++)
        {if (i==16)
        {continue;}
            System.out.println(i);
        }

    }
}
