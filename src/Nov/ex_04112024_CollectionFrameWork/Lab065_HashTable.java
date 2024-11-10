package Nov.ex_04112024_CollectionFrameWork;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Lab065_HashTable {

    public static void main(String[] args)
    {

        //hAsh table Similar to HAshMap,Key difference is Synchronization and not having  null key and  values

        //iterator in Hash table


        Hashtable<Integer,String> ht1=new Hashtable();

        ht1.put(1,"One");
        ht1.put(2,"Two");
        ht1.put(3,"Three");
        System.out.println(ht1);

        System.out.println("----------------");
            Enumeration<Integer> en =ht1.keys();


            while(en.hasMoreElements())
            {
              System.out.println(ht1.get(en.nextElement()));

            }


    }
}
