package linear.binary.search.queue.standard.datastructures;

public class StandardQueue {

    private final int zero = 0;

    private int[] numbers;
    private int firstElement;
    private int lastElement;
    private int capacity;
    private int currentSize;

    public StandardQueue(int size) {
        numbers = new int[size];
        capacity = size;
        firstElement = 0;
        lastElement = -1;
        currentSize = 0;
    }


    //remove the firstElement element
    public int poll() {
        // check first if queue has values
        if (isEmpty()) {
            System.out.println("There are no elements in the queue to remove");
            return -1;
        } else {
            System.out.println("Removing " + numbers[firstElement]);
            currentSize--;
            return firstElement = (firstElement + 1) % capacity;
        }
    }

    // add an item to the queue
    public boolean add(int item) {
        // check first if queue is full
        if (isFull()) {
            System.out.println("Queue is full, item can't be added");
            return false;
        }

        System.out.println("Inserting " + item);

        lastElement = (lastElement + 1) % capacity;
        numbers[lastElement] = item;
        currentSize++;
        return true;
    }


    // check first element in queue
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty, could'nt execute this function");
            System.exit(0);
        }
        return numbers[firstElement];
    }

    // get size of queue
    public int size() {
        return currentSize;
    }

    // check if queue is empty
    public Boolean isEmpty() {
        return (size() == zero);
    }

    //check if the queue is full
    public Boolean isFull() {
        return (size() == capacity);
    }
}
