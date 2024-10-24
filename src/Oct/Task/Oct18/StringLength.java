package Oct.Task.Oct18;

public class StringLength {

//Calculate the length of the String - without using the length() function.
// String name =”Pramod”; →  6 , CharArray, for loop
//
 public void main (String[] args) {
     String name = "pramod";
     int count = 0;
       for(char ch :name.toCharArray())
        {
            count++;
        }

        System.out.println("Total Characters: " + count);

     /*for (int i = 1; i <= name.length(); i++) {
         count++;
     }
     System.out.println("Total Characters: " + count);*/
 }
}
