package entityObject;

import baseClass.Drink;

/**描述冰配料 */
public class Coffee extends Drink {

    /**单位:元 */
    private static double MY_COST = 6;
    private static String DESC = "咖啡 ";
    
    @Override
    public String description(){

        return DESC;
    }

    @Override
    public double cost(){
        
        return MY_COST;
    }

}