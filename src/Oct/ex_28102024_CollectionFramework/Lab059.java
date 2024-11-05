package Oct.ex_28102024_CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class Lab059 {

    public static void main(String[] args){

        //Fix the datatype, if we add integer to List , we cannot add any other Data type
        //collection don't use primitive data type
        List<Integer> List1= new ArrayList();
        List1.add(12);
        List1.add(13);
        List1.add(14);
        System.out.println(List1);
        //List1.add("Sree");
        //System.out.println(List1);


        List<String> Names= new ArrayList();
        Names.add("Pramod");
        Names.add("Dhivya");
        Names.add("Pradeep");
        //Names.add(123);
        System.out.println(Names);


    }
}
