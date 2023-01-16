import Drink.DrinkFactory;
import Drink.DrinkType;

public class Main {
    public static void main(String[] args) {
        System.out.println(DrinkFactory.create(DrinkType.COKE));
        System.out.println(DrinkFactory.create(DrinkType.FANTA));
        System.out.println(DrinkFactory.create(DrinkType.FANTA));
    }
}