package Oct.Task.Oct11;

public class TestCaseAPI extends BaseTestAPI {



    TestCaseAPI(){
        super(); // calling parent constructor
        this.setName("Dhivya",true);
        this.setId(2,true);
    }
//Method OverRiding
    @Override
    public void setName(String name, boolean IsAdmin) {
        super.setName(name, IsAdmin);
    }
}
