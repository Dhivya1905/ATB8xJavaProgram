package Oct.ex11092024_Encapsulation.Superkeyword.Examp_2;

public class TestCase extends Baseclass {


    TestCase() {
        super();//DC of parent
        this.setBrowser("edge",true);
    }

    @Override
    public void setBrowser(String browser, boolean IsAdmin) {
        super.setBrowser(browser, IsAdmin);
    }
}


