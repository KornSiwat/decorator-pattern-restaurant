package good_restaurant.models.base_food;

import good_restaurant.models.Food;

public class None implements Food {
    private static double price = 0;

    @Override
    public double getPrice() {
        return None.price;
    }

    @Override
    public String toString() {
        return "No Base Food: " + None.price;
    }
}
