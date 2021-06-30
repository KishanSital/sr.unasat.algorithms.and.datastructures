package queue.priority.services;

public interface PriorityQueue {

    void insert(Wachtwoord wachtwoord);

    Wachtwoord remove();

    int size();

    boolean isFull();

    boolean isEmpty();

    Wachtwoord peekFront();
}
