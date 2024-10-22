package Oct.ex_16102024_Static_and_Enum.Static;

public class Student {


    public static void main (String[] args){

        Student Amit=new Student(24);
        Student Balu=new Student(25);
        System.out.println("Amit age: " +Amit.age);
        System.out.println("Balu age: " + Balu.age);
        System.out.println(Student.SchoolName);
        Student.SchoolName="XYZ";
        System.out.println(Student.SchoolName);
    }

    //Static is a keyword , which is used with the variable,Method,block and class

    static String SchoolName = "ABC";// static variable are the variable created at the time of class loading .
    // -shared among all instances of a class
    //static helps in creating utility, constants and managing shared resources

    int age ; //instance variable are variable  created at  object  Creation.


    public Student(int age) {
        this.age = age;
    }
}


