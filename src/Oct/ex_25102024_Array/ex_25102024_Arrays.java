package Oct.ex_25102024_Array;

public class ex_25102024_Arrays {
public static void main(String[] args){

    //Arrays is list of items
    //homogeneous nature -same data type(int)
    //arrays are objects in java
    //Elements of a array will be stored in a contiguous memory Locations
    //Arrays can be constructed with multiple dimensions 1-D, 2 -D

    //Index  based -0 to n-1

    int[] myarray= {1,2,3,4,5,6};//Fixed array
    System.out.println(myarray.length);
    System.out.println(myarray[0]);
    System.out.println(myarray[1]);
    System.out.println(myarray[2]);
    System.out.println(myarray[3]);
    System.out.println(myarray[4]);
   System.out.println(myarray[5]);
    //System.out.println(myarray[6]); //ArrayIndexOutOfBoundsException


int[] myarray1=new int[5];

    myarray1[0]=11;
    myarray1[1]=12;
    myarray1[2]=13;
    myarray1[3]=14;
    myarray1[4]=15;
    //myarray1[5]=16;

    System.out.println(myarray1[0]);
    System.out.println(myarray1[1]);
    System.out.println(myarray1[4]);
    //System.out.println(myarray1[5]);//ArrayIndexOutOfBoundsException


}
}