package Sept.task;

public class Task_23Sep_meter_kilometer_celcius_Farenhiet {
    public static void main(String[] args)
    {

    /*Write a program that converts between different units (e.g., kilometers to miles, Celsius to Fahrenheit) based on user selection using a switch statement.
Input. -
choice - 1 - km → m, km → 1km
choice - 2 - f → c, f → c
         */

    int val=20;
    int  choice=2;

        switch (choice) {
        case 1 -> System.out.println(val * 1000 + "m");
        case 2 -> System.out.println((val * 1.8) + 32 + "F");
    }
}
}
