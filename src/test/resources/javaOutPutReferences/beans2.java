import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationTest {

    @Bean
    TestClass testClass() {
        TestClass testClass = new TestClass();
        return testClass;
    }

}