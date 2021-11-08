package Example3;

public class SortArray implements FindMinimum {
    @Override
    public double minimum(double[] array) {
        double [] copy = java.util.Arrays.copyOf(array, array.length);
        java.util.Arrays.sort(copy);
        return copy[0];
    }
}
