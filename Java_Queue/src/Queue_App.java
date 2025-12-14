public class Queue_App {
    public static void main(String[] args) {
        My_Queue queue = new My_Queue(5);
        queue.qAdd(1);
        queue.qAdd(2);
        queue.qAdd(3);
        queue.qAdd(4);
        queue.qAdd(5);

        System.out.print("The Queue contains: ");
        queue.qPrint();

        System.out.println("Removed element: " + queue.qPool());

        System.out.print("The new Queue contains: ");
        queue.qPrint();

        System.out.println("The first element is: " + queue.qPeek());
        System.out.println("The size of the Queue is: " + queue.qSize());
        System.out.println("Is the Queue empty: " + queue.qIsEmpty());
        queue.qPool();
        queue.qPool();
        queue.qPool();
        queue.qPool();
        System.out.println("Is the Queue empty: " + queue.qIsEmpty());
    }
}
