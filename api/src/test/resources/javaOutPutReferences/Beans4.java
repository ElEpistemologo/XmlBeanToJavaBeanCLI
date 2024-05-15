import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ovh.xmlbeantojavabean.fakes.Alpha;

@Configuration
public class Beans4 {
    @Bean
    public Alpha myAlpha() {
        Alpha myAlpha = new Alpha(123, "it works !", 3.1415926);
        return myAlpha;
    }
}
