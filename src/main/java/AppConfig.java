import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Transport car() {
        return new Car("BMW-car");
    }

    @Bean
    public Transport bus() {
        return new Bus("BMW-bus");
    }

    @Bean
    public Transport pickup() {
        return new Pickup("BMW-pickup");
    }

    @Bean(name = "driver1")
    public Driver driver1() {
        return new Driver("Ivan1", car());
    }

    @Bean(name = "driver2")
    public Driver driver2() {
        return new Driver("Ivan2", bus());
    }

    @Bean(name = "driver3")
    public Driver driver3() {
        return new Driver("Ivan3", pickup());
    }
}
