package good_restaurant.models.toppings;

import good_restaurant.models.Food;

public class SalmonTopping implements Food {
    private static double price = 50;
    private Food baseFood;

    public SalmonTopping(Food baseFood) {
        this.baseFood = baseFood;
    }

    @Override
    public double getPrice() {
        return baseFood.getPrice() + SalmonTopping.price;
    }

    @Override
    public String toString() {
        return baseFood.toString() + "\n" + "Salmon: " + SalmonTopping.price;
    }
}
