package Sept.task;

import java.util.Scanner;

public class Task_25Sep_PrintTable10 {

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num=sc.nextInt();


        for (int i=1;i<=10;i++)
        {

            System.out.printf("%d" + "*" + i +"=" +  num * i + "%n",num);
        }
    }
}
