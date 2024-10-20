//package Oct.ex11092024_Encapsulation.Superkeyword;

import java.lang.classfile.Superclass;

public class Lab046 {

    //Super keyword in Java is a reference variable that allows
    // subclass (child class to reference the parent class)

    //User of Super with variable, with methods,with constructor
}


public  void main (String[] args)
{

    car c= new car();
}


class car extends vehicle{
 private int maxspeed =280;

 void display (){
     System.out.println("Child");
 }

 car(){
super(10);//calling parent constructor//constructor chaining
System.out.println("This is DC Car");
     System.out.println(this.maxspeed);//my variable
     System.out.println(super.maxspeed);// parent variable
     System.out.println(this.maxspeed);//my variable
     this.display();//child /my method
     super.display();// parent method
 }

}



    class vehicle
    {
        int maxspeed=100;

        vehicle() {
            System.out.println("This is a DC Vehicle");
        }
            vehicle( int a){
                System.out.println("This is a PC Vehicle");

            }


            void message () {
                System.out.println("Hello Vehicle");
            }
                void message ( int a)
            {
                    System.out.println("Hello Vehicle");
                }

        void display (){
            System.out.println("Parent");
        }

            }
