package baseClass;

import baseClass.Drink;

/**所有配料的父类必须为抽象类*/
abstract public class Ingredient extends Drink{
    
    protected Drink mDrink;

    protected Ingredient(Drink drink){
        
        mDrink = drink;
    }
}