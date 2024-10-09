package Oct.ex09102024_Inheritance.Single_Inheritance.Ex3_IS_A;

public class Python extends Programming{

    //IS A relationship - Single level Inheritance

    Python(){
        System.out.println("This is a DC");
    }

    void print(){

        System.out.println(Version);
        System.out.println(Author);
    }
}
