import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringApp {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        Transport car = context.getBean(Car.class);
        Transport bus = context.getBean(Bus.class);
        Transport pickup = context.getBean(Pickup.class);

        System.out.println(car.getClass() + " готов к работе");
        System.out.println(bus.getClass() + " готов к работе");
        System.out.println(pickup.getClass() + " готов к работе");

        Driver driver1 = context.getBean("driver1", Driver.class);
        Driver driver2 = context.getBean("driver2", Driver.class);
        Driver driver3 = context.getBean("driver3", Driver.class);

        System.out.println(driver1);
        System.out.println(driver2);
        System.out.println(driver3);

    }
}
