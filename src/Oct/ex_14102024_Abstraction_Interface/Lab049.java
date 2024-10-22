package Oct.ex_14102024_Abstraction_Interface;

//import java.lang.classfile.Interfaces;

public class Lab049 {

    public  void main(String[] args){

P p= new P();
p.f1();

    }

    class P implements I{
@Override
       public void f1(){
            System.out.println("p");
        }

    }
    interface I{
        void f1();
    }
}
