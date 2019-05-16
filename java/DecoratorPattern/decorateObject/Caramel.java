package decorateObject;

import baseClass.Drink;
import baseClass.Ingredient;

/**描述焦糖配料 */
public class Caramel extends Ingredient {

    /**单位:元 */
    private static double MY_COST = 0.5;
    private static String DESC = "焦糖 ";

    public Caramel(Drink drink){

        super(drink);
    }

    @Override
    public String description(){

        return DESC+mDrink.description();
    }

    @Override
    public double cost(){
        
        return MY_COST+mDrink.cost();
    }

}