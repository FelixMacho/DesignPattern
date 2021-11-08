package Example2;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

public class Counter {
    private final Set<CounterListener> counterSet;
    private int curValue;

    public Counter() {
        counterSet = new HashSet<>();
        curValue = 0;
    }

    public void addCounterListener(CounterListener c) {
        counterSet.add(c);
    }

    public void removeCounterListener(CounterListener c) {
        counterSet.remove(c);
    }

    private void notifyAll(CounterEvent e) {
        counterSet.stream().forEach((o) -> {
            o.counterChanged(e);
        });
    }

    public void incValue() {
        int oldV = curValue;
        curValue++;
        CounterEvent e = new CounterEvent(oldV, curValue, this, LocalDateTime.now());
        this.notifyAll(e);
    }

    public int getValue() {
        return curValue;
    }
}
