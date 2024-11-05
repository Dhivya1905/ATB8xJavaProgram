package Oct.ex_30102024_CollectionFramework;

import java.util.List;
import java.util.ArrayList;

public class Lab062_Example {

    public void main(String[] args){
Students s1= new Students(1,"Amit");
        Students s2= new Students(2,"Arul");
        Students s3= new Students(3,"Diya");

        List <Students>  MyStudents = new ArrayList<>();
         MyStudents.add(s1);
        MyStudents.add(s2);
        MyStudents.add(s3);
        System.out.println(MyStudents);


    }

    class Students{

        int RollNumber;
        String Name;

        public Students(int rollNumber, String name) {
            RollNumber = rollNumber;
            Name = name;
        }

        public int getRollNumber() {
            return RollNumber;
        }

        public void setRollNumber(int rollNumber) {
            RollNumber = rollNumber;
        }

        public String getName() {
            return Name;
        }

        public void setName(String name) {
            Name = name;
        }

        @Override
        public String toString() {
            return "Students{" +
                    "RollNumber=" + RollNumber +
                    ", Name='" + Name + '\'' +
                    '}';
        }
    }
}
