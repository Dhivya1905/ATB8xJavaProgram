package Oct.ex_23102024_Exception_Continue;

public class Custom_Exception {

    public static void main(String[] args ) throws Exception{

Bank sbi =new Bank("INR",100);
        Bank icici =new Bank("INR",200);
        Bank jp_morgan =new Bank("USD",300);
        System.out.println(sbi.add(icici));
        System.out.println(sbi.add(jp_morgan));//not an valid scenario
    }
}
