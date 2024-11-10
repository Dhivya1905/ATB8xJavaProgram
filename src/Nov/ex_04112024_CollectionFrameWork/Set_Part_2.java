package Nov.ex_04112024_CollectionFrameWork;

import java.util.HashSet;

public class Set_Part_2 {
    public static void main (String[] args)
    {
        HashSet set= new HashSet();//order not maintained
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
System.out.println("Set Elements: " + set);
        System.out.println(set.contains("Banana"));
    }

}
