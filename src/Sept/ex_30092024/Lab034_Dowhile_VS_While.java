package Sept.ex_30092024;

public class Lab034_Dowhile_VS_While {
    public static void main(String[] args)
    {
        //Do while

        int i=0;
        do {
            System.out.println("print " + i);
            i++;
        }
        while (i<0);

        // while loop same condition--Not printing anything

        int j=0;
        while(j<0)
        {System.out.println("print " + j);
            j++;}
    }
}
