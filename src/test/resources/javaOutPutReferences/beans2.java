import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import api.test.TestClass;

@Configuration
public class ConfigurationTest {

    @Bean
    TestClass testClass() {
        TestClass testClass = new TestClass();
        return testClass;
    }

}