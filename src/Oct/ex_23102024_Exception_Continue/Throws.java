package Oct.ex_23102024_Exception_Continue;

import java.io.FileInputStream;
import java.io.FileNotFoundException;



public class Throws {

    public static void main(String[] args) throws FileNotFoundException,Exception {

        extracted();
    }

    public static void extracted ()throws FileNotFoundException,Exception {
        FileInputStream openFile = new FileInputStream("C:a.txt");
    }


}
