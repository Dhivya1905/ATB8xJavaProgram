package Nov.Task_NOV;

import com.sun.jdi.Value;

import javax.swing.text.html.HTMLDocument;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Iterate_Map {

    public static void main(String[] args){

        Map<Integer,String> map =new HashMap<>();
        map.put(1,"one");
        map.put(2,"Two");
        map.put(3,"Three");
        map.put(4,"Four");

        //Iterate in map can be done in four ways

        //first way - iterate over key value pair using entryset
        System.out.println("============1 st way iterate over key value pair  using  entryset==========");

        for (Map.Entry<Integer,String> entry: map.entrySet())
        {
            System.out.println("Key is : " +entry.getKey() +" " + "Value is : " + entry.getValue());
        }


        //second way - iterate over keys using keyset
        System.out.println("============2 nd way iterate over keys using  keyset==========");

        for( Integer key: map.keySet())
        {

            System.out.println("Key is : " +key +" " + "Value is : " + map.get(key));
        }


        //Third way - iterate over  values ,
        //It is useful only we care about values and not keys
        System.out.println("============ 3 rd way iterate over values ==========");

        for(String value: map.values())
        {
            System.out.println("Value is : " + value);
        }

        //Fourth way - to iterate over map using iterator
        System.out.println("============ 4 th way iterate over map using iterator ==========");

        Iterator<Map.Entry<Integer,String>> iterator =  map.entrySet().iterator();

        while(iterator.hasNext())
        {
            Map.Entry<Integer,String> entry=iterator.next();
            System.out.println("Key is : " + entry.getKey() +" "+  "Value is : " + entry.getValue());
        }


    }
}
