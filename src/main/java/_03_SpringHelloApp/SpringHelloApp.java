package _03_SpringHelloApp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {

    public static void main(String[] args) {

        // load the Spring Configuration File
        ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("springAppContext.xml");

        // retrieve bean from Spring Container
        TrackCoach trackCoach=(TrackCoach) applicationContext.getBean("myCoach",Coach.class);

        BaseBallCoach baseBallCoach=(BaseBallCoach) applicationContext.getBean("baseBallCoach",Coach.class);

        // call method on the bean
        System.out.println(trackCoach.getDailyWork());
        System.out.println("  ");
        System.out.println(baseBallCoach.getDailyWork());


        // close the context
        applicationContext.close();


    }
}
