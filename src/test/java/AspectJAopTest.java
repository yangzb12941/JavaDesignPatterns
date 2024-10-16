import ProxyPattern.DynamicProxy.SpringJDKProxy.AspectJAop.AspectJAopTarget;
import ProxyPattern.DynamicProxy.SpringJDKProxy.utils.TestResourceUtils;
import org.junit.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class AspectJAopTest {
    //没有切面效果
    @Test
    public void aspectJAopTest_1() throws IOException {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        new XmlBeanDefinitionReader(beanFactory).loadBeanDefinitions(
                TestResourceUtils.qualifiedResource(AspectJAopTest.class, "1.xml"));

        beanFactory.preInstantiateSingletons();
        AspectJAopTarget aspectJAopTarget = (AspectJAopTarget)beanFactory.getBean("aspectJAopTarget");

        aspectJAopTarget.aopMethodBefore();
        aspectJAopTarget.aopMethodAfter();
    }

    //有切面效果
    @Test
    public void aspectJAopTest_2() throws IOException {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:AspectJAopTest-1.xml");
        AspectJAopTarget aspectJAopTarget = ac.getBean("aspectJAopTarget", AspectJAopTarget.class);
        aspectJAopTarget.aopMethodBefore();
        aspectJAopTarget.aopMethodAfter();
    }
}
