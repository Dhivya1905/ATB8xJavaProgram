package Oct.ex_16102024_Static_and_Enum.Static;

public class Lab048_1 {


    public static  void main(String[] args) {

        ATB8x S1 = new ATB8x("Amit");
        ATB8x s2 = new ATB8x("Balu");
        ATB8x s3 = new ATB8x("Dhivya");
        ATB8x.doAssignments();
        S1.readDocuments();

    }
}

class ATB8x {


    {
        System.out.println("IIB");
    }

    static{
        System.out.println("Load the class, I will Execute?");
    }

    private  String name;
    private  long phoneNum;
    static  String CourseName="ATB8X";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ATB8x(String name) {
        this.name = name;
    }
    void readDocuments(){
        System.out.println("Non Static Method ");
    }

    static void doAssignments(){
        System.out.println("Do Assignments");
    }



}





