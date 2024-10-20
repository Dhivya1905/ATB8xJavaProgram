package Oct.Task.Oct14;

public abstract  class Book {

/*Book class which has an abstract method getDetails(),name, author, price.
PrintMyBook class that inherits from the Book class.
abstract
Book myBook = new PrintMyBook("Harry Potter", "J.k. Rowling", "120");
// Output
"Harry Potter, J.k. Rowling, 100"*/

   String Name;
   String Author;
   int Price;

    public Book(String name, String author, int price) {
        Name = name;
        Author = author;
        Price = price;
    }

    abstract void getDetails();
    }


