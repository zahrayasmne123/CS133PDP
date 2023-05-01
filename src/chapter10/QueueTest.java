package chapter10;

public class QueueTest {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        System.out.println(queue);
        System.out.println(queue.deqeueue());

        System.out.println(queue.isEmpty());
        System.out.println(queue.getSize());
    }
}
