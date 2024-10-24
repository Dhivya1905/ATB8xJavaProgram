package Oct.ex_11092024_Encapsulation;

public class VMOLogin {

    private String UserName;
     private String Password;

    public VMOLogin(String UserName, String Password) {
        this.UserName = UserName;
        this.Password = Password;
    }

   public String getPassword() {
        return Password;
    }

    public void setPassword(String Password,boolean IsAdmin) {
        if(IsAdmin)
        {
        this.Password = Password;}

        else{

            System.out.println("Not Allowed");
        }
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }
}
