package Oct.Task.Oct25;

import java.util.Scanner;

public class LeftAngleTriangle {
    public static void main(String[] args) {
        /*    ✅ Left Triangle Star Pattern

         *****
         ****
         ***
         **
         *

         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int Number = sc.nextInt();

        for (int i = Number; i > 0; i--) {
            for (int j = i; j >0; j--) {

                System.out.print("*");
            }

            System.out.println();
        }
    }
}