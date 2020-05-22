package good_restaurant;

import good_restaurant.models.Food;
import good_restaurant.models.base_food.None;
import good_restaurant.models.base_food.Noodle;
import good_restaurant.models.base_food.Rice;
import good_restaurant.models.toppings.HamTopping;
import good_restaurant.models.toppings.PorkTopping;
import good_restaurant.models.toppings.SalmonTopping;
import good_restaurant.models.toppings.SausageTopping;

import java.util.Scanner;

public class Main {
    static Scanner console = new Scanner(System.in);

    public static String askForBaseFood() {
        String command;

        System.out.println("Choose Your Preferred Base Food");
        System.out.println("1)Rice");
        System.out.println("2)Noodle");
        System.out.println("3)None");

        command = console.nextLine();

        return  command;
    }

    public static String askForTopping() {
        String command;

        System.out.println("Choose Your Preferred Topping");
        System.out.println("1)Ham");
        System.out.println("2)Sausage");
        System.out.println("3)Salmon");
        System.out.println("4)Pork");
        System.out.println("or Type \"done\" if you have finished adding topping");

        command = console.nextLine();

        return command;
    }

    public static Food getBaseFood(String food) {
        switch (food.toLowerCase()) {
            case "rice":
                return new Rice();
            case "noodle":
                return new Noodle();
            case "none":
                return new None();
            default:
                throw new Error("invalid requested food");
        }
    }

    public static Food addTopping(Food baseFood, String topping) {
        switch (topping.toLowerCase()) {
            case "ham": {
                return new HamTopping(baseFood);
            }
            case "pork": {
                return new PorkTopping(baseFood);
            }
            case "salmon": {
                return new SalmonTopping(baseFood);
            }
            case "sausage": {
                return new SausageTopping(baseFood);
            }
            default:
                return  baseFood;
        }
    }

    public static void main(String[] args) {
        Food order;
        String preferredTopping;

        String preferredBaseFood = askForBaseFood();
        order = getBaseFood(preferredBaseFood);
        System.out.println(order);
        System.out.println("");

        do {
            preferredTopping = askForTopping();
            order = addTopping(order, preferredTopping);

            System.out.println(order);
            System.out.println("");
        } while (!preferredTopping.equals("done"));

        double orderPrice = order.getPrice();
        System.out.println("TotalPrice: " + orderPrice);
    }
}
