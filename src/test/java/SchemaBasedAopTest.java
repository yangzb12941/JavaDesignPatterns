import ProxyPattern.DynamicProxy.SpringJDKProxy.SchemaBasedAop.SchemaBasedAopTarget;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class SchemaBasedAopTest {

    @Test
    public void schemaBasedAopTest() throws IOException {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:SchemaBasedAopTest.xml");
        SchemaBasedAopTarget schemaBasedAopTarget = ac.getBean("schemaBasedAopTarget", SchemaBasedAopTarget.class);
        schemaBasedAopTarget.aopMethodBefore();
        schemaBasedAopTarget.aopMethodAfter();
    }
}
