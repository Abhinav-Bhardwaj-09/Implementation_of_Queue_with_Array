package QueueWithArray;

/*
    Created by Abhinav Bhardwaj on IntelliJ IDEA
    on   12-02-2020 ,  Time :-    16 : 24
 
 */
public class Main {
        public static void main(String [] args){
            QueuewithArray obj = new QueuewithArray(10);
            boolean s = obj.isQueueEmpty();
            System.out.println("Queue is Empty :  " + s);
            obj.enqueue(5);
            obj.enqueue(15);
            obj.enqueue(25);
            obj.enqueue(35);

            s = obj.isQueueEmpty();
            System.out.println("Queue is empty : " + s);
            System.out.println();

            s = obj.isQueueFull();
            System.out.println("Queue is full : " + s);

            System.out.println();
            System.out.print("Elements of Queue : ");
            obj.printQueue();

            System.out.println();


            obj.enqueue(45);
            obj.enqueue(55);
            obj.enqueue(65);
            obj.enqueue(75);
            obj.enqueue(85);
            obj.enqueue(95);
            System.out.print("Elements of Queue : ");
            obj.printQueue();

            System.out.println();
            System.out.print("First element of Queue : ");
            obj.peekQueue();
            System.out.println();


    }
}
