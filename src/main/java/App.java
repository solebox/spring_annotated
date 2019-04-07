import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App {

    public static void main(String[] args){
        System.out.println("starting");
        AbstractApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);

        Computer computer = appContext.getBean("comp", Computer.class);
        computer.turnOff();
        computer = appContext.getBean("comp2", Computer.class);
        computer.turnOff();

    }
}
