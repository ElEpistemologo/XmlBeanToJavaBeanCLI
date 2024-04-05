import api.test.TestClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Beans2 {
    @Bean
    public TestClass testClass() {
        TestClass testClass = new TestClass();
        return testClass;
    }
}
