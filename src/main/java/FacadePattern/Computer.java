package FacadePattern;

/**
 * 外观模式其实很简单，就是把复杂的操作用统一的接口去提供操作。
 * 对外降低内部流程的复杂性
 * 优点
 * - 松散耦合
 * 　　使得客户端和子系统之间解耦，让子系统内部的模块功能更容易扩展和维护；
 *
 * - 简单易用
 * 　  客户端根本不需要知道子系统内部的实现，或者根本不需要知道子系统内部的构成，它只需要跟Facade类交互即可。
 *
 * - 更好的划分访问层次
 *    有些方法是对系统外的，有些方法是系统内部相互交互的使用的。子系统把那些暴露给外部的功能集中到门面中，这样就可以实现客户端的使用，很好的隐藏了子系统内部的细节。
 */
public class Computer {
    private CPU cpu;
    private Memory memory;
    private Disk disk;

    public Computer() {
        cpu = new CPU();
        memory = new Memory();
        disk = new Disk();
    }

    public void start() {
        System.out.println("Computer start begin");
        cpu.start();
        disk.start();
        memory.start();
        System.out.println("Computer start end");
    }

    public void shutDown() {
        System.out.println("Computer shutDown begin");
        cpu.shutDown();
        disk.shutDown();
        memory.shutDown();
        System.out.println("Computer shutDown end...");
    }
}
