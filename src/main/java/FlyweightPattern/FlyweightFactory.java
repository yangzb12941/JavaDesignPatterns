package FlyweightPattern;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private Map<String, IFlyweight> flyweightMap = new HashMap();

    public IFlyweight getFlyweight(String str) {
        IFlyweight flyweight = flyweightMap.get(str);
        if (flyweight == null) {
            flyweight = new Flyweight(str);
            flyweightMap.put(str, flyweight);
        }
        return flyweight;
    }

    public int getFlyweightMapSize() {
        return flyweightMap.size();
    }
}
