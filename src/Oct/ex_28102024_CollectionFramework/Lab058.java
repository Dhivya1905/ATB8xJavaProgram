package Oct.ex_28102024_CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab058 {

    public static void main(String[] args )

    {

        List Marks=new ArrayList();
        Marks.add(67);
        Marks.add(54);
        Marks.add(93);
        Marks.add(85);
        Marks.add(62);
        System.out.println(Marks);
        Collections.sort(Marks,Collections.reverseOrder());
        System.out.println(Marks);
    }
}
