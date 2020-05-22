package good_restaurant.models.toppings;

import good_restaurant.models.Food;

public class HamTopping implements Food {
    private static double price = 17;
    private Food baseFood;

    public HamTopping(Food baseFood) {
        this.baseFood = baseFood;
    }

    @Override
    public double getPrice() {
        return baseFood.getPrice() + HamTopping.price;
    }

    @Override
    public String toString() {
        return baseFood.toString() + "\n" + "Ham: " + HamTopping.price;
    }
}
