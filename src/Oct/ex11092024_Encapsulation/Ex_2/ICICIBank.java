package Oct.ex11092024_Encapsulation.Ex_2;

public class ICICIBank {

    //Encapsulation is  a fundamental concept in OOPS.
    // Bundling of data and methods that operate on  that data within a single unit.
    //Data Members should be private in nature
    // method with getter and setter only,you can access the data members

    private String name;
    private long bal;

    public ICICIBank(String name, long bal) {
        this.name = name;
        this.bal = bal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name,boolean IsAdmin) {

        if(IsAdmin) {
            this.name = name;
        }
        else
        {System.out.println ("Not an Admin");}
    }

    public long getBal() {
        return bal;
    }

    public void setBal(long bal,boolean IsAdmin) {

        if (IsAdmin) {
            this.bal = bal;
        }
        else {
            System.out.println("Not an Admin");
        }
    }
}



