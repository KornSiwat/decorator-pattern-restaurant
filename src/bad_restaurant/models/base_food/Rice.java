package bad_restaurant.models.base_food;

import bad_restaurant.models.Food;

public class Rice implements Food {
    private static double price = 5;

    @Override
    public double getPrice() {
        return Rice.price;
    }

    @Override
    public String toString() {
        return "Rice: " + Rice.price;
    }
}
