package Example6;

public abstract class Topping implements Pizza {
    protected Pizza below;

    protected Topping(Pizza below) {
        this.below = below;
    }

    @Override
    public boolean isVegetarian() {
        return below.isVegetarian();
    }

    @Override
    public boolean isHot() {
        return below.isHot();
    }

    @Override
    public int getPrice() {
        return below.getPrice();
    }

    @Override
    public void setPrice(int price) {
        below.setPrice(price);
    }

    @Override
    public void setHot(boolean hot) {
        below.setHot(hot);
    }

    @Override
    public void setVegetarian(boolean vegetarian) {
        below.setVegetarian(vegetarian);
    }

    @Override
    public String toString() {
        return below.toString();
    }
}
