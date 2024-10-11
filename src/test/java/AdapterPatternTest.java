import AdapterPattern.ClassAdapterPattern.AdapterUSB2VGA;
import AdapterPattern.ClassAdapterPattern.Projector;
import AdapterPattern.VGA;
import org.junit.Test;

public class AdapterPatternTest {
    @Test
    public void test2(){
        //通过适配器创建一个VGA对象，这个适配器实际是使用的是USB的showPPT（）方法
        VGA a=new AdapterUSB2VGA();
        //进行投影
        Projector p1=new Projector();
        p1.projection(a);
    }
}
