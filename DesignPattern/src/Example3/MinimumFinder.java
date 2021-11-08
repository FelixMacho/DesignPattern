package Example3;

public class MinimumFinder {
    private FindMinimum findMinimum;
    public MinimumFinder(FindMinimum strategy) {
        this.findMinimum = strategy;
    }

    public double min(double[] array) {
        return findMinimum.minimum(array);
    }

    public void other(FindMinimum change) {
        this.findMinimum = change;
    }
}
