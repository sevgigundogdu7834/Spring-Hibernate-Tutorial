package _05.DI_SetterInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

    public static void main(String[] args) {

        //load the Spring configuration file
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("appContext.xml");

        // retrieve bean from spring container
        Coach baseballCoach=context.getBean("baseBallCoach",Coach.class);

        // call methods on the bean

        System.out.println(baseballCoach.getDailyWork());
        System.out.println(baseballCoach.getDailyFortune());


    }
}
