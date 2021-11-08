package Example4;

import java.util.LinkedList;
import java.util.List;

public class ListUser<T> extends MyList<T> {
    private final List<T> l = new LinkedList<>();

    @Override
    public int len() {
        return l.size();
    }

    @Override
    public T at(int i) {
        return l.get(i);
    }

    @Override
    public T delHead() {
        return l.remove(0);
    }

    @Override
    public boolean addTail(T e) {
        return l.add(e);
    }

    @Override
    public String toString() {
        return l.toString();
    }
}
