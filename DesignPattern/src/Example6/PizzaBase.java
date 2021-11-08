package Example6;

public class PizzaBase implements Pizza{

    private int price;
    private boolean hot;
    private boolean vegetarian;

    protected PizzaBase() {
        this(0, false, true);
    }

    public PizzaBase(int price, boolean hot, boolean vegetarian) {
        this.price = price;
        this.hot = hot;
        this.vegetarian = vegetarian;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean isHot() {
        return hot;
    }

    @Override
    public void setHot(boolean hot) {
        this.hot = hot;
    }

    @Override
    public boolean isVegetarian() {
        return vegetarian;
    }

    @Override
    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    @Override
    public String toString() {
        return "Pizza{" + "price=" + price + ", hot=" + hot + ", vegitarian=" + vegetarian + '}';
    }
}
