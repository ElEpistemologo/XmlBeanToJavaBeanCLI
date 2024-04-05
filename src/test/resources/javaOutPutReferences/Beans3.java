import com.myproject.repositories.MyRepository;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Beans3 {
    @Bean
    public MyRepository myOtherSingleton() {
        MyRepository myOtherSingleton = new MyRepository();
        return myOtherSingleton;
    }

    @Bean
    public VirtualThread myVirtualThread() {
        VirtualThread myVirtualThread = new VirtualThread();
        return myVirtualThread;
    }

    @Bean
    public AtomicBoolean myAtomicBoolean() {
        AtomicBoolean myAtomicBoolean = new AtomicBoolean();
        return myAtomicBoolean;
    }

    @Bean
    public CompletableFuture myCompletableFuture() {
        CompletableFuture myCompletableFuture = new CompletableFuture();
        return myCompletableFuture;
    }
}
