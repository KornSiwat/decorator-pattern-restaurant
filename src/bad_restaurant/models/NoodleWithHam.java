package bad_restaurant.models;

import bad_restaurant.models.base_food.Noodle;

public class NoodleWithHam extends Noodle {

    @Override
    public double getPrice() {
        return super.getPrice() + 17;
    }
}
