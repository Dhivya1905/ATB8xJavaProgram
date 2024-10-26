package Oct.ex_21102024_WrapperClass;

public class Wrapper_Exception {
public void main(String[] args){

    String num  = "10";
    // int value=num; ----we cannot  store int  value in string datatype
    //we need to use wrapper class

Integer value=Integer.valueOf(num);//one way we can do that
    int a1= value;
    System.out.println(value);
    int value1=Integer.parseInt(num); //another way storing string to int datatype.
}

}
