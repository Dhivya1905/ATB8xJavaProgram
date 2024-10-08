package Oct;

public class Person {

    /*Create a Person Class with 10 A, 5 Behavr( All types of Methods) and use the DC and PC to set the values
    , Create 5 Objects.
     */

    String Name;
    int Age;
    String Address;
    long phoneNumber;
    char Gender;
    String BloodGroup;
    String Occupation;
    Boolean IsMarried;
    String DOB;
    String Qualification;

    void walk(){}
    void Sleep(){}
    void work(){}
    void eat(){}
    void dressUp(){}

    //Default Constructor//
    Person() {
        System.out.println("Hello");
    }

    //Param Constructor//
        Person(String Name, int Age, String Address, long phoneNumber, char Gender,
               String BloodGroup, String Occupation, Boolean IsMarried,
               String DOB, String Qualification)
        {
            this.Name=Name;
            this.Age=Age;
            this.phoneNumber=phoneNumber;
            this.Address=Address;
            this.Gender=Gender;
            this.BloodGroup=BloodGroup;
            this.Occupation=Occupation;
            this.IsMarried=IsMarried;
            this.DOB=DOB;
            this.Qualification=Qualification;

        }

        //NRNA//
        public static void FunctionType1(){
        System.out.println("This is NRNA function");
        }
//RTNA//
    public static String FunctionType2(){
        System.out.println("This is RTNA function");
        return "Name";
    }

    //NRWP//
    public static void FunctionType3(String Name, int Age)
    {
        System.out.println("This is NRWP function");
        System.out.println(Name);
        System.out.println(Age);
    }
    //RTWP//

    public static int FunctionType4(String Name, int Age)
    {
        System.out.println("This is NRWP function");
        return 0000;

    }



    public  static void main(String[] args)
    {


         Person Amar = new Person("Amar",24,"Chennai",8765457864l,
                 'M',"O+","Agriculture",true,"19-05-1995","B.E");
        System.out.println("********************Person1***********************");
         System.out.println(Amar.Name);
        System.out.println(Amar.Age);
        System.out.println(Amar.Address);
        System.out.println(Amar.phoneNumber);
        System.out.println(Amar.Gender);
        System.out.println(Amar.BloodGroup);
        System.out.println(Amar.Occupation);
        System.out.println(Amar.DOB);
        System.out.println(Amar.Qualification);

        Person Bindhu = new Person("Bindhu",26,"Kolkata",8847535464l,
                'F',"B+","IT",false,"15-09-1995","BTech");
        System.out.println("********************Person2***********************");
        System.out.println(Bindhu.Name);
        System.out.println(Bindhu.Age);
        System.out.println(Bindhu.Address);
        System.out.println(Bindhu.phoneNumber);
        System.out.println(Bindhu.Gender);
        System.out.println(Bindhu.BloodGroup);
        System.out.println(Bindhu.Occupation);
        System.out.println(Bindhu.DOB);
        System.out.println(Bindhu.Qualification);

        Person Dilip = new Person("Dilip",28,"Bangalore",9656789964l,
                'M',"A+","Driver",false,"01-05-1994","MTech");
        System.out.println("********************Person3***********************");
        System.out.println(Dilip.Name);
        System.out.println(Dilip.Age);
        System.out.println(Dilip.Address);
        System.out.println(Dilip.phoneNumber);
        System.out.println(Dilip.Gender);
        System.out.println(Dilip.BloodGroup);
        System.out.println(Dilip.Occupation);
        System.out.println(Dilip.DOB);
        System.out.println(Dilip.Qualification);


        Person Sam = new Person("Sam",29,"Coimbatore",964678964l,
                'M',"O+","Lecture",true,"18-12-1994","Phd");
        System.out.println("********************Person4***********************");
        System.out.println(Sam.Name);
        System.out.println(Sam.Age);
        System.out.println(Sam.Address);
        System.out.println(Sam.phoneNumber);
        System.out.println(Sam.Gender);
        System.out.println(Sam.BloodGroup);
        System.out.println(Sam.Occupation);
        System.out.println(Sam.DOB);
        System.out.println(Sam.Qualification);


        Person Vivek = new Person("Vivek",26,"chennai",9657807644l,
                'M',"B+","Doctor",true,"07-11-1994","MD");
        System.out.println("********************Person45***********************");
        System.out.println(Vivek.Name);
        System.out.println(Vivek.Age);
        System.out.println(Vivek.Address);
        System.out.println(Vivek.phoneNumber);
        System.out.println(Vivek.Gender);
        System.out.println(Vivek.BloodGroup);
        System.out.println(Vivek.Occupation);
        System.out.println(Vivek.DOB);
        System.out.println(Vivek.Qualification);




    }




}
