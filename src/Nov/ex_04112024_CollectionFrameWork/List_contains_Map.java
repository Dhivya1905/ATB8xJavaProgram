package Nov.ex_04112024_CollectionFrameWork;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class List_contains_Map {

    public static void main(String [] args){

        Map<String,String> Student1= new HashMap<>();
        Student1.put("Name" ,"Dhivya");
        Student1.put("Rollnumber" ,"1");
        Student1.put("PhoneNum" ,"987544664");

        Map<String,String> Student2= new HashMap<>();
        Student2.put("Name" ,"Pradeep");
        Student2.put("Rollnumber" ,"2");
        Student2.put("PhoneNum" ,"897534664");

        List Student=new ArrayList();
        Student.add(Student1);
        Student.add(Student2);

        System.out.println(Student);

    }
}
