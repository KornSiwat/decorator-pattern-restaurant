package bad_restaurant.models.base_food;

import bad_restaurant.models.Food;

public class Noodle implements Food {
    private static double price = 10;

    @Override
    public double getPrice() {
        return Noodle.price;
    }

    @Override
    public String toString() {
        return "Noodle: " + Noodle.price;
    }
}
