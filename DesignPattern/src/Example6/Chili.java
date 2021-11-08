package Example6;

public class Chili extends Topping {
    public Chili (Pizza below) {
        super(below);
        super.setHot(true);
    }
}
