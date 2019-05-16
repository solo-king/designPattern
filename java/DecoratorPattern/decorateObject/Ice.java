package decorateObject;

import baseClass.Drink;
import baseClass.Ingredient;

/**描述冰配料 */
public class Ice extends Ingredient {

    /**单位:元 */
    private static double MY_COST = 0.2;
    private static String DESC = "冰 ";
    
    public Ice(Drink drink){

        super(drink);
    }

    @Override
    public String description(){

        return DESC + mDrink.description();
    }

    @Override
    public double cost(){
        
        return MY_COST+mDrink.cost();
    }

}