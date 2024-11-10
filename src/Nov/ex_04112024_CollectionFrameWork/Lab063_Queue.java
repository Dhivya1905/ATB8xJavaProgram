package Nov.ex_04112024_CollectionFrameWork;

import java.util.PriorityQueue;

public class Lab063_Queue {
    public static void main(String[] args)
    {
        //Queue

        PriorityQueue PQ= new PriorityQueue();
        PQ.offer(1);
        PQ.offer(2);
        PQ.offer(3);
        PQ.offer(4);
        PQ.offer(5);
System.out.println(PQ);
        System.out.println(PQ.peek());
        System.out.println(PQ.poll());
        System.out.println(PQ);
    }
}
