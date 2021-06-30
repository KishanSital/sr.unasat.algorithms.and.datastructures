package linear.binary.search.queue.circular.datastructures;

public class CircularQueue {
    int size; // Size of Circular Queue
    int firstElement, lastElement;
    int numbers[];

    public CircularQueue(int size) {
        this.size = size;
        numbers = new int[size];
        firstElement = -1;
        lastElement = -1;
    }

    // Check if the queue is full
   public boolean isFull() {
        if (firstElement == 0 && lastElement == size - 1) {
            return true;
        }
        if (firstElement == lastElement + 1) {
            return true;
        }
        return false;
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        if (firstElement == -1)
            return true;
        else
            return false;
    }

    // Adding an element
    public void enQueue(int element) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            if (firstElement == -1)
                firstElement = 0;
            lastElement = (lastElement + 1) % size;
            numbers[lastElement] = element;
            System.out.println("Inserted " + element);
        }
    }

    // Removing an element
    public int deQueue() {
        int element;
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return (-1);
        } else {
            element = numbers[firstElement];
            if (firstElement == lastElement) {
                firstElement = -1;
                lastElement = -1;
            } /* Q has only one element, so we reset the queue after deleting it. */ else {
                firstElement = (firstElement + 1) % size;
            }
            return (element);
        }
    }

    public void display() {
        /* Function to display status of Circular Queue */
        int i;
        if (isEmpty()) {
            System.out.println("Empty Queue");
        } else {
            System.out.println("First element -> " + firstElement);
            System.out.println("Items -> ");
            for (i = firstElement; i != lastElement; i = (i + 1) % size)
                System.out.print(numbers[i] + " ");
            System.out.println(numbers[i]);
            System.out.println("Last element -> " + lastElement);
        }
    }
}
