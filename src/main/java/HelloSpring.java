import decoupled.MessageRenderer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {
    private static ApplicationContext context = new ClassPathXmlApplicationContext("spring/app-context.xml");

    public static void main(String... args) {

        MessageRenderer renderer = context.getBean("renderer", MessageRenderer.class);
        renderer.render();

    }
}
