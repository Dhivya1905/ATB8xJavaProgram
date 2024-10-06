package Oct.ex_04102024_Constructor;

public class Dog {

    String Name;
    String Breed;
    int Age;
    String Color;
    int Legs;

    //Default constructor
    Dog(){
        System.out.println("Iam a DC");
    }

    Dog(String Breed,String Name,String Color,int Age){
        System.out.println("This is a parametrized constructor");
        System.out.println("Iam a Sniffer");
        this.Breed=Breed;
        this.Name=Name;
        this.Color=Color;
        this.Age=Age;
    }

    void walk(){}

    public static void main(String[] args){

        Dog GS= new Dog("GS","AA","Brown",2);
        System.out.println(GS.Breed);
        System.out.println(GS.Name);
        System.out.println(GS.Color);
        System.out.println(GS.Age);
       // Dog bd= new Dog("BD");


    }
}
