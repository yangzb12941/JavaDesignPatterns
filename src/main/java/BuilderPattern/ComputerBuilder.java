package BuilderPattern;

/**
 * 优点
 * 将一个对象分解为各个组件
 * 将对象组件的构造封装起来
 * 可以控制整个对象的生成过程
 *
 * 缺点
 * 对不同类型的对象需要实现不同的具体构造器的类，这可能会大大增加类的数量
 *
 * 生成器模式与工厂模式的不同
 * 生成器模式构建对象的时候，对象通常构建的过程中需要多个步骤，就像我们例子中的先有主机，
 * 再有显示屏，再有鼠标等等，生成器模式的作用就是将这些复杂的构建过程封装起来。
 *
 * 工厂模式构建对象的时候通常就只有一个步骤，调用一个工厂方法就可以生成一个对象。
 */
public abstract class ComputerBuilder {
    protected Computer computer;

    public Computer getComputer() {
        return computer;
    }

    public void buildComputer() {
        computer = new Computer();
        System.out.println("生成了一台电脑！！！");
    }
    public abstract void buildMaster();
    public abstract void buildScreen();
    public abstract void buildKeyboard();
    public abstract void buildMouse();
    public abstract void buildAudio();
}
