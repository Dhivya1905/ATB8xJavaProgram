package Oct.ex_11092024_Encapsulation.Superkeyword.Examp_2;

public class Baseclass {

    private  String browser; //Encapsulation

    Baseclass(){ // Default constructor

        System.out.println("This is a DC-Base class ");
    }

    Baseclass(String b){//parameter constructor

        System.out.println("This is a PC-Base class ");
    }


    //Getter and Setter
    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser,boolean IsAdmin) {

        if (IsAdmin){
        this.browser = browser;}
        else {System.out.println("Not Allowed ,you are not an Admin");}
    }


    //Method overLoading
    void openbrowser(){

        System.out.println("Open browser");
    }

    void openbrowser(String browserName ){

        System.out.println("Open browser -->>" +  browserName);

    }

    void closebrowser(){

        System.out.println("Close browser");
    }
}


