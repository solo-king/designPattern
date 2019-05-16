package baseClass;

/**所有饮料的父类必须为抽象类*/
abstract public class Drink{

    /**用于返回物品的描述 */
    abstract public String description();
    /**用于计算价格 */
    abstract public double cost();

}