package linear.binary.search.queue.circular.app;

import linear.binary.search.queue.circular.datastructures.CircularQueue;

public class App {
    public static void main(String[] args) {
        CircularQueue circularQueue = new CircularQueue(5);
        circularQueue.enQueue(1);
        circularQueue.enQueue(1);
        circularQueue.enQueue(1);
        circularQueue.enQueue(1);
        circularQueue.enQueue(1);

        circularQueue.display();
    }
}
