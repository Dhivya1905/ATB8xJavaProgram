package Nov.Task_NOV;

import java.util.HashSet;

public class Duplicate_Element_Array_Hashset {

    //Duplicate Elements of an Array
    //int[] numbers = {1, 2, 3, 4, 5, 1, 2};  o/p →  1,2

    public static void main (String[] args)

    {
        int[] numbers = {1, 2, 3, 4, 5, 1, 2};

        HashSet set=new HashSet();
        HashSet duplicates=new HashSet<>();

        for(Integer number:numbers)
        {
            if(!set.add(number)) {
                duplicates.add(number);
            }
        }

        System.out.println("Duplicate numbers is: " + duplicates);






    }
}
