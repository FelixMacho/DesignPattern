package Example6;

public class Cheese  extends Topping{
    public Cheese (Pizza below) {
        super(below);
        super.setPrice(100 + super.getPrice());
    }
}
