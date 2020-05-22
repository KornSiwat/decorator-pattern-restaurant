package good_restaurant.models.toppings;

import good_restaurant.models.Food;

public class PorkTopping implements Food {
    private static double price = 20;
    private Food baseFood;

    public PorkTopping(Food baseFood) {
        this.baseFood = baseFood;
    }

    @Override
    public double getPrice() {
        return baseFood.getPrice() + PorkTopping.price;
    }

    @Override
    public String toString() {
        return baseFood.toString() + "\n" + "Pork: " + PorkTopping.price;
    }
}
