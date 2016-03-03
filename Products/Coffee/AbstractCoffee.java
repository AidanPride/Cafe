package Products.Coffee;

import Ingridients.CoffeeBeans;
import Ingridients.Milk;
import Ingridients.Water;

/**
 * Created by User on 03.03.2016.
 */
public abstract class AbstractCoffee implements Price.IPrice{
    private Water water;
    private CoffeeBeans coffeeBeans;
    private int price;

    public AbstractCoffee(CoffeeBeans coffeeBeans, Water water) {
        this.coffeeBeans = coffeeBeans;
        this.water = water;
        setPrice();
    }

    public int setPrice() {
        return price;
            }

}
