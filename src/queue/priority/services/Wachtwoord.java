package queue.priority.services;

import queue.priority.entities.WachtwoordEntity;

public interface Wachtwoord {
    boolean execute(WachtwoordEntity wachtwoord);

    long getPriority();
}
