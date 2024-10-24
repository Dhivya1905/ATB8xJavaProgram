package Oct.ex_11092024_Encapsulation.Ex_2;

public class Lab045 {

    public void main (String [] args)

    {
ICICIBank IciciBank=new ICICIBank("Pradeep",100000);
System.out.println(IciciBank.getName());
System.out.println(IciciBank.getBal());

boolean IsAdmin=true;

        IciciBank.setName("Dhivya",false);
        System.out.println(IciciBank.getName());
        IciciBank.setBal(20000,false);
        System.out.println(IciciBank.getBal());

    }
}
