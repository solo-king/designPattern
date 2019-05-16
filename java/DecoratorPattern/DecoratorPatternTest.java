import baseClass.Drink;
import decorateObject.Caramel;
import decorateObject.Ice;
import decorateObject.Mocha;
import entityObject.Coffee;
import entityObject.Tee;

/**
 * 功能描述:
 *     1.用于测试装饰者模式,下面以蜜雪冰城的
 *     2.只实现计算不同配料的饮料价格
 *                                              Drink(饮料)
 *                                                      
 *                              /                                   \
 *        所有饮料实体:     (Coffee)咖啡 (Tee)茶                    Ingredient
 *                                                                   |
 *                                                所有可以放的配料:(Ice)冰  (Caramel)焦糖   (Mocha)摩卡
 */

public class DecoratorPatternTest{

    static void printDrinkInfo(Drink drink){
        
        System.out.println(drink.description()+":"+drink.cost()+"元");
    }

    public static void main(String[] args){
        /** 即饮料本体*/
        Coffee coffee = new Coffee();
        Tee tee = new Tee();
                
        /**生产一杯 焦糖咖啡*/
        Drink caramelCoffe = new Caramel(coffee);
        printDrinkInfo(caramelCoffe);
        /**生产一杯 冰茶*/
        Drink iceTee = new Ice(tee);
        printDrinkInfo(iceTee);
        /**生产一杯 摩卡咖啡*/
        Drink mochaCoffee = new Mocha(coffee);
        printDrinkInfo(mochaCoffee);
    }

}