package Oct.ex11092024_Encapsulation;

public class Examp_1 {

    public void main (String[] args) {

        /*VMOLogin vmologin = new VMOLogin("Dhivya", "12345678");
        System.out.println(vmologin.Password);
        vmologin.Password = "2347690";
        System.out.println(vmologin.Password);*/


        VMOLogin vmologin1 = new VMOLogin("Admin", "123456789");
        System.out.println(vmologin1.getPassword());

        boolean IsAdmin=false;
        vmologin1.setPassword("23790765",IsAdmin);
        System.out.println(vmologin1.getPassword());


    }

}
