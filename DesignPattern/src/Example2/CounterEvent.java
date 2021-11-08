package Example2;

import java.time.LocalDateTime;

public class CounterEvent {
    private final int oldVal;
    private final int newVal;
    private final Counter source;
    private final LocalDateTime timestamp;

    public CounterEvent(int oldVal, int newVal, Counter source, LocalDateTime timestamp) {
        this.oldVal = oldVal;
        this.newVal = newVal;
        this.source = source;
        this.timestamp = timestamp;
    }

    public int getOldVal() {
        return oldVal;
    }

    public int getNewVal() {
        return newVal;
    }

    public Counter getSource() {
        return source;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return "CounterEvent{" +
                "oldVal=" + oldVal +
                ", newVal=" + newVal +
                ", source=" + source +
                ", timestamp=" + timestamp +
                '}';
    }
}
