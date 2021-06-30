package queue.priority.serviceImpl;

import queue.priority.entities.WachtwoordEntity;
import queue.priority.services.Wachtwoord;

public class WachtwoordImpl implements Wachtwoord {

    private WachtwoordEntity wachtwoordEntity;

    public WachtwoordImpl(WachtwoordEntity wachtwoordEntity) {
        this.wachtwoordEntity = wachtwoordEntity;
    }


    @Override
    public boolean execute(WachtwoordEntity wachtwoord) {
        return wachtwoordEntity.getWachtwoord().equals(this.wachtwoordEntity.getWachtwoord());
    }

    @Override
    public long getPriority() {
        return wachtwoordEntity.getPriority();
    }

}
