package springIdol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by toumi on 17/09/14.
 */
public class mainOne {

    public static void main (String args[]) throws PerformanceException {
        ApplicationContext context = new ClassPathXmlApplicationContext("springIdol.xml");
        Performer dude = (Performer) context.getBean("juggler");
        dude.perform();

        Performer dude2 = (Performer) context.getBean("poetic");
        dude2.perform();
    }


}
