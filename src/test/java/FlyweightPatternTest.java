import FlyweightPattern.FlyweightFactory;
import FlyweightPattern.IFlyweight;

public class FlyweightPatternTest {
    public static void main(String[] args) {
        FlyweightFactory flyweightFactory = new FlyweightFactory();
        IFlyweight flyweight1 = flyweightFactory.getFlyweight("A");
        IFlyweight flyweight2 = flyweightFactory.getFlyweight("B");
        IFlyweight flyweight3 = flyweightFactory.getFlyweight("A");
        flyweight1.print();
        flyweight2.print();
        flyweight3.print();
        System.out.println(flyweightFactory.getFlyweightMapSize());
    }
}
