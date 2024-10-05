package Sept.task;

import java.util.Scanner;

public class Task_25sep_Factorial {

    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number for Factorial");
       int num=sc.nextInt();
       long fact=1;

        for(int i=1;i<=num;i++)
        {

          fact *=i;

        }
System.out.printf("The Factorial of number %d!" + " is " +fact ,num);

    }
}
