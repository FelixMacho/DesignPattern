package Example6;

public class Salami extends Topping{
    public Salami(Pizza below) {
        super(below);
        super.setVegetarian(false);
        super.setPrice(150 + super.getPrice());
    }
}
