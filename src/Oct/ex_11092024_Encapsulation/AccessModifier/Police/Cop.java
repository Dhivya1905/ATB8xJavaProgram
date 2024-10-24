package Oct.ex_11092024_Encapsulation.AccessModifier.Police;

public class Cop {

    private int gun;
    private String idCard;

    public Cop(int gun) {
        this.gun = gun;
    }

    //private - with in the class
    // protected -with in package
    // public everywhere
    protected void CanIShoot()
    {System.out.println("Yes,You can");}
}
