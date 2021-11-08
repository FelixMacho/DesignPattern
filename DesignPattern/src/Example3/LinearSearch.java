package Example3;

public class LinearSearch implements FindMinimum {

    @Override
    public double minimum(double[] array) {
        double min = array[0];
        for (double d : array) {
            if (d < min) {
                min = d;
            }
        }
        return min;
    }
}
