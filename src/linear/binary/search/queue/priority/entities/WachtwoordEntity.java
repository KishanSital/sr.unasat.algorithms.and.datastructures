package linear.binary.search.queue.priority.entities;

public class WachtwoordEntity {
     private long priority;
    private String wachtwoord;

    public WachtwoordEntity(long priority, String wachtwoord) {
        this.priority = priority;
        this.wachtwoord = wachtwoord;
    }

    public WachtwoordEntity(String wachtwoord) {
        this.wachtwoord = wachtwoord;
    }

    public long getPriority() {
        return priority;
    }

    public void setPriority(long priority) {
        this.priority = priority;
    }

    public String getWachtwoord() {
        return wachtwoord;
    }

    public void setWachtwoord(String wachtwoord) {
        this.wachtwoord = wachtwoord;
    }

    @Override
    public String toString() {
        return "WachtwoordEntity{" +
                "priority=" + priority +
                ", wachtwoord='" + wachtwoord + '\'' +
                '}';
    }
}
