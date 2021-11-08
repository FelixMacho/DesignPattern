package Example6;

public class Pizzeria {
    public static void main(String[] args) {
        Pizza pizza1 = new Crunchy();
        System.out.println(pizza1);
        pizza1 = new Salami(pizza1);
        System.out.println(pizza1);
        pizza1 = new Chili(pizza1);
        System.out.println(pizza1);
        pizza1 = new Salami(pizza1);
        System.out.println(pizza1);
        System.out.println("----------------------");
        Pizza pizza2 = new Chili(new Salami(new Salami(new Crunchy())));
        System.out.println(pizza2);
        System.out.println("----------------------");
        Pizza pizza3 = new Chili(new Cheese(new Cheese(new Sicilian())));
        System.out.println(pizza3);
    }
}
