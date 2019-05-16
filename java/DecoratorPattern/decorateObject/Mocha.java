package decorateObject;


import baseClass.Drink;
import baseClass.Ingredient;

/**描述摩卡配料 */
public class Mocha extends Ingredient {

    /**单位:元 */
    private static double MY_COST = 5;
    private static String DESC = "摩卡 ";
    
    public Mocha(Drink drink){

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