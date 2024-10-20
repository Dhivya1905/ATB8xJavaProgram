package Oct.Task.Oct14;

public class PrintMyBook extends Book{



    public PrintMyBook(String Name, String Author, int Price) {
        super(Name, Author, Price);
    }

    @Override
    void getDetails() {
        System.out.println(Name + "," + Author +","  + Price);


    }
}
