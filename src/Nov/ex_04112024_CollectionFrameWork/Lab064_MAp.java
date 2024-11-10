package Nov.ex_04112024_CollectionFrameWork;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Lab064_MAp {


   // Map-Key /value pair
    //Key is always unique(cannot contain duplicate key)
    //each key map to at most 1 value
    //some implementation allow null key and null value that is Hash map, LinkedHashMap
    //and some not  ie TreeMap
    //Tree Map & Linked hashMap - have predictable order
    //hash map -does not have order
    //There are 2 interface for implementing in Java.
   // Map and sorted MAp

   // Map interface has the following concrete subclasses
    //HashMap
    //LinkedHashMap
    //TreeMap
    // Hash Table (Legacy Classes)

    public static  void main (String[] args) {
        Map M1 = new HashMap();
        Map M2 = new LinkedHashMap();
        Map M3 = new TreeMap();

        M1.put("name", "Dhivya");
        M1.put("rollno", "1");
        M1.put("phonenum", "98754223456");
        System.out.println(M1);


        M2.put("name", "Dhivya");
        M2.put("rollno", "1");
        M2.put("phonenum", "98754223456");
        System.out.println(M2);


        M3.put("name", "Dhivya");
        M3.put("rollno", "1");
        M3.put("phonenum", "98754223456");
        System.out.println(M3);


        Map<String, Integer> map = new HashMap<>();

        map.put("ID1", 1);
        map.put("ID2", 2);
        map.put("ID3", 3);
        map.put("ID4", null);
        map.put("ID5", null);
        map.put("null", null);
        map.put("null", 101);
        System.out.println(map);//one null key allowed
        System.out.println(map.size());
        System.out.println(map.containsKey("ID1"));
        System.out.println(map.containsValue(3));
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.get("ID1"));


        //iterator in MAp
        System.out.println("------------------Itertor----------------");
        for (Map.Entry<String, Integer> item : map.entrySet()) {
            System.out.println(item.getKey() + "->" + item.getValue());
        }


    }

}
