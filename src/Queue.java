public class Queue {
    public static void main(String[] args) {
        java.util.Queue<String> queue = new java.util.LinkedList<String>();

        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");

        System.out.println(queue);

        System.out.println(queue.peek());

        queue.poll();
        queue.poll();

        System.out.println(queue.peek());

        // Why queues?
        // 1. Keyboard buffer (typing)
        // 2. Printer queue
        // 3. Used in LinkedList, PriorityQueues, Breadth-First Search
    }
}
