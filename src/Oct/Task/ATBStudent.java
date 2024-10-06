package Oct;

public class ATBStudent {
    int Student_ID;
    String Studentname;
    int Age;
    String Email;
    String Location;
    long PhoneNumber;
    boolean IsFeesPaid;

    void Study(){}
    void Work(){}
    void Sleep(){}

    public static void main(String[] args){

        ATBStudent Amit=new ATBStudent();
        Amit.Student_ID=01;
        Amit.Age=35;
        Amit.Email="amit@gmail.com";
        Amit.Location="Chennai";
        Amit.PhoneNumber=8976545678l;
        Amit.IsFeesPaid  =true;

        ATBStudent Abishek=new ATBStudent();
        Abishek.Student_ID=02;
        Abishek.Age=33;
        Abishek.Email="abishek@gmail.com";
        Abishek.Location="Bangalore";
        Abishek.PhoneNumber=8435678844l;
        Abishek.IsFeesPaid=false;

        ATBStudent Dhivya=new ATBStudent();
        Dhivya.Student_ID=03;
        Dhivya.Age=31;
        Dhivya.Email="dhivya@gmail.com";
        Dhivya.Location="Chennai";
        Dhivya.PhoneNumber=8489797665l;
        Dhivya.IsFeesPaid=true;

        ATBStudent Shali=new ATBStudent();
        Shali.Student_ID=04;
        Shali.Age=33;
        Shali.Email="shali@gmail.com";
        Shali.Location="Vellore";
        Shali.PhoneNumber=884567554l;
        Shali.IsFeesPaid=true;


        ATBStudent Vignesh=new ATBStudent();
        Vignesh.Student_ID=05;
        Vignesh.Age=30;
        Vignesh.Email="vignesh@gmail.com";
        Vignesh.Location="Vellore";
        Vignesh.PhoneNumber=889753357l;
        Vignesh.IsFeesPaid=true;

       }
    }

