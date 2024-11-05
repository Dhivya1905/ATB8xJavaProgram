package Oct.ex_30102024_CollectionFramework;

import java.util.Stack;

public class Stack1 {
    public static void main(String [] args){
//Last in first out (LIFO)

        Stack s= new Stack();

        s.add("Python");
        s.add("Java");
        s.add("C Sharp");

        System.out.println(s);
        System.out.println(s.pop());// remove the last element
        System.out.println(s.peek());// display the last element
        System.out.println(s);
        System.out.println(s.size());
        System.out.println(s.isEmpty());
        System.out.println(s.add("php"));
        System.out.println(s);
        s.add(1,"C++");
        System.out.println(s);
        s.remove(2);
        System.out.println(s);






    }
}
