package linear.binary.search.queue.priority.services;

import linear.binary.search.queue.priority.entities.WachtwoordEntity;

public interface Wachtwoord {
    boolean execute(WachtwoordEntity wachtwoord);

    long getPriority();
}
