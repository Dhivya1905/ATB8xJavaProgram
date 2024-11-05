package Oct.ex_28102024_CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab060 {

    public static void main(String[] args)

    {
        List<String> StudentNames= new ArrayList();
        StudentNames.add("Pramod");
        StudentNames.add("Dhivya");
        StudentNames.add("Pradeep");
        //Names.add(123);
        System.out.println(StudentNames);

        System.out.println("======================================");
        for (String str:StudentNames )
        {
            System.out.println(str);

        }
        System.out.println("======================================");
        for (int i=0;i<StudentNames.size();i++ )
        {
            System.out.println(StudentNames.get(i));

        }

        System.out.println("======================================");

        Iterator<String> iterator=StudentNames.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
