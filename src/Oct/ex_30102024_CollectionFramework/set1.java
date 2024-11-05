package Oct.ex_30102024_CollectionFramework;

import java.util.*;

public class set1 {
    //Set - not all duplicates
    public static void main(String[] args)

    {
        Set hs= new HashSet<>();// Hashset  mechanism to  store the Elements and order is not maintained
        Set lhs= new LinkedHashSet(); // LinkedHashSet is a mechanism to  store the Elements and order  not maintained
        Set Ts= new TreeSet(); // Black and red Tree  mechanism to  store the Elements and Sorted automatically, null is not allowed

       /* hs.add("Pramod");
        hs.add("Pramod");
        hs.add("pramod");
        System.out.println(hs); //No Duplicates//

        */

        hs.add("Apple");
        hs.add("Banana");
        hs.add("Cucumber");
        System.out.println(hs);//



        lhs.add("Apple");
        lhs.add("Banana");
        lhs.add("Cucumber");
        System.out.println(lhs);//




        Ts.add("Apple");
        Ts.add("Banana");
        Ts.add("Cucumber");
        Ts.add("Anjir");
        System.out.println(Ts);//

        for (Object o:Ts)
        {System.out.println(o);}

        System.out.println("------------------------");//

        Iterator it= Ts.iterator();

        while (it.hasNext())
        {

            System.out.println(it.next());
            }
        }
    }




