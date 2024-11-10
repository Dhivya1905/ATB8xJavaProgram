package Nov.Task_NOV;

import java.util.ArrayList;
import java.util.List;

public class Reverse_ArrayList {

    //How do you reverse an ArrayList in Java?

    public static void main (String[] args){

        List A= new ArrayList<>();
        A.add(1);
        A.add(2);
        A.add(3);
        A.add(4);
        A.add(5);

        //System.out.println(A);
        //Reverse a Array List

        List ReversedList= new ArrayList<>();


        //using for loop

        for( int i=A.size()-1; i>=0;i--)
        {
            ReversedList.add(A.get(i));

        }
        System.out.print("Reversed List: " + ReversedList );
    }
}


