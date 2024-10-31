package Oct.Task.Oct25;

import java.util.Scanner;

public class Pyramid {
    //  ✅ Pyramid pattern in Java
    //1* //1
    //3  //2
    //5  //3
    //7  //4
    //9  //5

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Pyramid num: ");
        int pyr = sc.nextInt();
      for(int i=1;i<=pyr;i++) //rows
      {
          for(int k=1;k<=pyr-i;k++) //Spaces
          {
              System.out.print(" ");
          }
          for(int j=1;j<=i;j++) //Columns
          {
              System.out.print("* ");
          }
          System.out.println(); //nextline
      }



    }

}



