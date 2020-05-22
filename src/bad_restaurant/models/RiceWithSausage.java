package bad_restaurant.models;

import bad_restaurant.models.base_food.Rice;

public class RiceWithSausage extends Rice {

    @Override
    public double getPrice() {
        return super.getPrice() + 15;
    }
}
