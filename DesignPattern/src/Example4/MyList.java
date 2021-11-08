package Example4;

public abstract class MyList<T> {
    public abstract int len();

    public boolean isEmpty() {
        return len() == 0;
    }

    public T head() {
        return this.at(0);
    }

    public abstract T at(int index);

    public abstract T delHead();

    public abstract boolean addTail(T e);
}
