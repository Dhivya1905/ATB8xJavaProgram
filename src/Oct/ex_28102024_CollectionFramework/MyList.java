package Oct.ex_28102024_CollectionFramework;
import java.util.List;

public class MyList {

    public static void main(String[] args){
       // List list= new List(); //not possible
        List list=List.of("banana","apple","grape","orange");
        System.out.println(list);
        System.out.println(list.size());
       // list.add("guava");//UnsupportedOperationException
    }
}