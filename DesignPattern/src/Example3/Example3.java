package Example3;

public class Example3 {
    public static void main(String[] args) {
        MinimumFinder minFinder = new MinimumFinder(new LinearSearch());
        double[] x = {1.0, 2.0, 1.0, 2.0, -1.0, 3.0, 4.0, 5.0, 4.0};

        System.out.println(minFinder.min(x));
        minFinder.other(new SortArray());
        System.out.println(minFinder.min(x));
    }
}
