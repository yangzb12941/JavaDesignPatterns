package DecoratorPattern;

/**
 * 装饰者和被装饰者之间必须是一样的类型,也就是要有共同的超类。
 * 在这里应用继承并不是实现方法的复制,而是实现类型的匹配。
 * 因为装饰者和被装饰者是同一个类型,因此装饰者可以取代被装饰者,
 * 这样就使被装饰者拥有了装饰者独有的行为。根据装饰者模式的理念,
 * 我们可以在任何时候,实现新的装饰者增加新的行为。如果是用继承,
 * 每当需要增加新的行为时,就要修改原程序了。
 */

public class CoffeeBar {
    public static void main(String[] args) {
        Drink order;
        order = new Decaf();
        System.out.println("order1 price:" + order.cost());
        System.out.println("order1 desc:" + order.getDescription());
        System.out.println("****************");
        order = new LongBlack();
        order = new Milk(order);
        order = new Chocolate(order);
        order = new Chocolate(order);
        System.out.println("order2 price:" + order.cost());
        System.out.println("order2 desc:" + order.getDescription());
    }
}
