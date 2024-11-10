package Nov.Task_NOV;

import java.util.HashMap;
import java.util.Map;

public class Duplicate_Element_Array_HashMap {


    //Duplicate Elements of an Array
    //int[] numbers = {1, 2, 3, 4, 5, 1, 2};  o/p →  1,2

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 1, 2};

        Map<Integer, Integer> FreqElem = new HashMap<>();

        StringBuilder output= new StringBuilder();

        for (Integer number : numbers) {

            FreqElem.put(number, FreqElem.getOrDefault(number, 0) + 1);

        }
        for (Map.Entry<Integer, Integer> entry : FreqElem.entrySet()) {

            if (entry.getValue() >= 2) {
                output.append(entry.getKey()).append(",");
            }

        }
            //Removing trailing comma at end

            if(output.length()>0)
            {
                output.setLength(output.length()-1);
            }

            System.out.println(output);
        }

    }



