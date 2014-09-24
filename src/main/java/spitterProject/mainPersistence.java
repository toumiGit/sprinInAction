package spitterProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class mainPersistence {

    public static void main (String args[] )
    {

        ApplicationContext context = new ClassPathXmlApplicationContext("spitterProject/spitterPersistenceContext.xml");
        SimpleJdbcTemplateSpitterDao simpleJdbcTemplateSpitterDao = (SimpleJdbcTemplateSpitterDao) context.getBean("spitterDao");

        System.out.print(" **" + simpleJdbcTemplateSpitterDao.findAllSpitters());
    }
}
