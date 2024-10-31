package Oct.ex_23102024_Exception_Continue;

public class finally_throwable {

    public static void main(String[] args){
        int a=0;
        try {
            int c=1000/a;
            System.out.println(c);
        } catch (Throwable e) {
            System.out.println(e.getMessage());
        } finally {

            System.out.println("This is done!");
        }

        System.out.println("End");
    }
}
