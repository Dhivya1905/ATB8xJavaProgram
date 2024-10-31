package Oct.ex_25102024_Array;

import java.util.Scanner;

public class Lab057_RightAngleTriangle {

//*
//**
//***
//****
//*****



    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num= sc.nextInt();

        for(int i=0;i<=num;i++){
            for(int j=0;j<i;j++) {
                System.out.print("*");
            }
            System.out.println( );
        }


    }

}
