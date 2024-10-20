package Oct.Task.Oct14;

public class Lab047 {
    public static void main(String [] args ){

        Book myBook = new PrintMyBook("Harry Potter", "J.k. Rowling", 120);//Dynamic Dispatch
        myBook.getDetails();
    }
}
