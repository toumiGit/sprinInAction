package springIdol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by toumi on 17/09/14.
 */
public class mainAOP {

    public static void main (String args[]) throws PerformanceException {
        ApplicationContext context = new ClassPathXmlApplicationContext("springIdolAop.xml");
        Performer dude = (Performer) context.getBean("juggler");
        dude.perform();

        Thinker volunteer = (Thinker ) context.getBean("volunteer");
        volunteer.thinkOfSomething("any thoughts");


    }


}
