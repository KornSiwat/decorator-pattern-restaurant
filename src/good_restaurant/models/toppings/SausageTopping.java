package good_restaurant.models.toppings;

import good_restaurant.models.Food;

public class SausageTopping implements Food {
    private static double price = 15;
    private Food baseFood;

    public SausageTopping(Food baseFood) {
        this.baseFood = baseFood;
    }

    @Override
    public double getPrice() {
        return baseFood.getPrice() + SausageTopping.price;
    }

    @Override
    public String toString() {
        return baseFood.toString() + "\n" + "Sausage: " + SausageTopping.price;
    }
}
