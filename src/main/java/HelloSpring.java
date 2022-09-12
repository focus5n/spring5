import decoupled.MessageRenderer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {
    public static void main(String... args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring/app-context.xml");

        MessageRenderer renderer = context.getBean("renderer", MessageRenderer.class);
        renderer.render();

    }
}
