package Products.Coffee;

import Ingridients.CoffeeBeans;
import Ingridients.Milk;
import Ingridients.Water;

/**
 * Created by User on 03.03.2016.
 */
public class MilkCoffee extends AbstractCoffee {
    private Milk milk;

    public MilkCoffee(CoffeeBeans coffeeBeans, Water water, Milk milk) {
        super(coffeeBeans, water);
        this.milk=milk;
    }
}
