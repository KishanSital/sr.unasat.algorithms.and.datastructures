package linear.binary.search.queue.priority.app;


import linear.binary.search.queue.priority.datastructures.PriorityQueueImpl;
import linear.binary.search.queue.priority.entities.WachtwoordEntity;
import linear.binary.search.queue.priority.serviceImpl.WachtwoordImpl;
import linear.binary.search.queue.priority.services.PriorityQueue;
import linear.binary.search.queue.priority.services.WachtwoordService;

public class App {
    public static void main(String[] args) {

        PriorityQueue priorityQueueImpl = new PriorityQueueImpl(3);
        priorityQueueImpl.insert(new WachtwoordImpl(new WachtwoordEntity(1,
                "eerste")));
        priorityQueueImpl.insert(new WachtwoordImpl(new WachtwoordEntity(2,
                "tweede")));
        priorityQueueImpl.insert(new WachtwoordImpl(new WachtwoordEntity(3,
                "derde")));

        WachtwoordEntity[] wachtwoordenLijst = {new WachtwoordEntity("eerste"),
                new WachtwoordEntity("tweede"),
                new WachtwoordEntity("derde")};

        WachtwoordService wachtwoordService = new WachtwoordService(priorityQueueImpl);
        if (wachtwoordService.loginUser(wachtwoordenLijst)) {
            System.out.println("U bent succesvol ingelogged");
        } else {
            System.out.println("Een van uw wachtwoorden is incorrect");
        }
    }
}
