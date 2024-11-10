package Nov.Task_NOV;

import java.util.HashMap;
import java.util.Map;

public class Frequency_of_Element {

    public  static void main (String[] args){

        Integer[] numbers = {2, 2, 3, 4, 5, 5, 5, 3, 2, 4};

        Map <Integer,Integer> frequencyElement= new HashMap();

        for(Integer number: numbers)
        {
            frequencyElement.put(number,frequencyElement.getOrDefault(number,0)+1);

        }

       // Print the map

        for (Map.Entry<Integer,Integer> entry : frequencyElement.entrySet())

        {

         System.out.println("Number : " + entry.getKey() +"==>> " + "Frequncy: "  + entry.getValue());

        }

    }
}
