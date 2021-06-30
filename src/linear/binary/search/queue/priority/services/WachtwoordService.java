package linear.binary.search.queue.priority.services;

import linear.binary.search.queue.priority.datastructures.PriorityQueueImpl;
import linear.binary.search.queue.priority.entities.WachtwoordEntity;

public class WachtwoordService {
    private PriorityQueue priorityQueue;

    public WachtwoordService(PriorityQueue priorityQueue) {
        this.priorityQueue = priorityQueue;
    }

    public boolean loginUser(WachtwoordEntity[] wachtwoordenLijst) {
        if (priorityQueue.isEmpty()) {
            return false;
        }
        for (int index = 0; index < wachtwoordenLijst.length; index++) {

            if (priorityQueue.peekFront() != null && priorityQueue.peekFront().execute(wachtwoordenLijst[index])) {
                priorityQueue.remove();
                continue;
            } else {
                return false;
            }
        }
        return true;
    }

}
