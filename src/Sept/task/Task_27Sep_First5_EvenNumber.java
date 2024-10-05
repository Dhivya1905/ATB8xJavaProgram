package Sept.task;

public class Task_27Sep_First5_EvenNumber {

    public static void main(String[] args){

     //Create a Java program that prints the first 5 even numbers using a do-while loop.

     int i=2;
     int count=1;

     do{

         if(i%2==0)
         {
          System.out.println(i);
          count++;}
         i++;
     }while (count<=5);

    }
}
