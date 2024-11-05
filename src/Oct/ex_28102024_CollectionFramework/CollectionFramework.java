package Oct.ex_28102024_CollectionFramework;

import java.util.ArrayList;

public class CollectionFramework {

    //Collection Framework

   // Focuses on Business Logic rather than Low Level Logics

    /*Array Limitation

    Fixed Size
    Same Data Type
    Insertion/Deletion difficult or heavy
    No built-in Support for Sorting and searching

     */


    /* Single collection is a interface
    collections - class

    List - Collection of items,No Duplicates,with same or different data type

       //Array List ,
       Linked List,
       stack ,
       Vector


     */
    public static void main(String[] args)

    {
       ArrayList StudentList= new ArrayList();
       StudentList.add("Dhivya");
        StudentList.add("Pradeep");
        StudentList.add("Amit");
        StudentList.add("Amit");
        StudentList.add("Anil");
        StudentList.add("1234");
        StudentList.add("null");

        System.out.println(StudentList);
    }



}
