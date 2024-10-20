package Oct.Task.Oct11;

public class APIAutomation {

    public  static void main (String[] args){

        BaseTestAPI t1=  new TestCaseAPI(); //Dynamic Dispatching
        t1.performGet();
        t1.performGet("Dhivya");
        t1.performPost();
        t1.performPatch();
        t1.performPut();
        t1.performDelete();
    }
}
