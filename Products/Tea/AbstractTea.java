package Products.Tea;

import Ingridients.TeaPackadge;
import Ingridients.Water;

/**
 * Created by User on 03.03.2016.
 */
public abstract class AbstractTea implements Price.IPrice{
    private int price;
    private Water water;
    private TeaPackadge teaPackadge;

    public AbstractTea(TeaPackadge teaPackadge, Water water) {
        this.teaPackadge = teaPackadge;
        this.water = water;
        setPrice();
    }

    @Override
    public int setPrice() {
   return price;
    }
}
