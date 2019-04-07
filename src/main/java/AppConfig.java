import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "comp", initMethod = "turnOn", destroyMethod = "turnOff")
    Computer computer(){
        return new Computer("comp");
    }

    @Bean(name = "comp2", initMethod = "turnOn", destroyMethod = "turnOff")
    Computer computer2(){
        return new Computer("comp2");
    }
}