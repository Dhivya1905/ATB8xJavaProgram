package Oct.Task.Oct28;

public class List_ArrayList_LinkedList_Stack_Vector {

    // List is an interface that represents ordered collection(sequence), which allows duplicates of elements
    //Common Implementation : ArrayList, LinkedList ,stack ,vector
    //Key methods: add(), remove(),size(),get()
    //usage: provide common operations for different implementation

    //ArrayList
    //Implementation: Resizeable array implementation of the List interface
    //performance -Fast random access because its backed up by an array
    //Inserting or deleting elements is slower as it require the shifting elements
    //Non Synchronized not thread safe
    //usecase : when you need fast random access to elements and don't need thread safety


    //LinkedList
    //Implementation: Doubly Linked list  implementation of the List and deque interface
    //performance -Fast Insertions and deletions as its easier to reassign pointers.
    //Slower random access compared to ArrayList
    //Non Synchronized not thread safe
    //usecase : when you need fast Insertion and deletions operation

    //Stack
    //Implementation: Sub class of vector that implements the LIFO(last in first out) stack of objects
    // Synchronized - thread safe, which means slower due to overhead
    //Usecase : when you need  LIFO(last in first out) access to  elements with thread safe


    //Vector
    //Implementation: Synchronised resizeable array implementation of List objects
    // Synchronized - thread safe, which means slower due to overhead
    //Usecase : when you need thread safe resizeable array


   // Key difference

    //Synchronisation (thread safe)- stack & vector
    //Non Synchronization (not thread safe)-ArrayList & Linked List
    //Array List is better for fast random access ,
    // Linked List-Fast Insertion and deletion
    // Stack and vector for Thread safe operations









}
