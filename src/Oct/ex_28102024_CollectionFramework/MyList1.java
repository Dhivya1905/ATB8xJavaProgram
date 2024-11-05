package Oct.ex_28102024_CollectionFramework;
import java.util.ArrayList;
import java.util.List;

import static javax.swing.text.StyleConstants.Size;

public class MyList1 {
    public static void main(String[] args) {
        List MyList2 = new ArrayList();
        MyList2.add("1");
        MyList2.add("2");
        MyList2.add("3");
        MyList2.add("3");
        System.out.println(MyList2);
        System.out.println(MyList2.size());
        System.out.println(MyList2.contains("1"));
        System.out.println(MyList2.isEmpty());
        System.out.println(MyList2.indexOf("3"));
        System.out.println(MyList2.lastIndexOf("3"));
        System.out.println("---------------default for loop ");
        for (int i = 0; i < MyList2.size(); i++) {
            System.out.println(MyList2.get(i));
        }
        System.out.println("--------------- for each loop ");

        for (Object o:MyList2) //for each loop  can be used with object and collection framework
        {
            System.out.println(o);
        }
    }
}