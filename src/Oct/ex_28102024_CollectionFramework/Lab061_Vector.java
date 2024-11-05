package Oct.ex_28102024_CollectionFramework;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Lab061_Vector {

    public static void main(String[] args) {



        List StudentNames1 = new ArrayList(4);
        StudentNames1.add("Pramod");
        StudentNames1.add("Dhivya");
        StudentNames1.add("Pradeep");
        StudentNames1.add("Shali");
        StudentNames1.add("Vignesh");
        //Names.add(123);
        System.out.println(StudentNames1);
        System.out.println("-------------------");

        //vector is same as array list ,the difference is, it is  thread safe, which is slow ,one by one usage
        //vector will be used in web Automation

        Vector v=new Vector();
        v.add("Pramod");
        v.add("Dhivya");
        v.add("Pradeep");
        v.add("Shali");
        System.out.println(v);
        System.out.println(v.size());
        System.out.println(v.isEmpty());
        System.out.println(v.contains("Pramod"));


    }
}