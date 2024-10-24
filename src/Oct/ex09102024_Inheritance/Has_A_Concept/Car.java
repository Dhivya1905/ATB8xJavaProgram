package Oct.ex09102024_Inheritance.Has_A_Concept;

public class Car {

    //HAs A Concept- Composition or Agrregation
    //Car has a both engine and Tyre

    void StartCar (){
        new Engine().Start();
        new Tyre().Roll();

    }
}
