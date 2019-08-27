package _02_IOC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp2 {

    public static void main(String[] args) {

        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("appContext.xml");
        BaseBallCoach baseBallCoach=(BaseBallCoach) applicationContext.getBean("myCoach",Coach.class);

        System.out.println(baseBallCoach.getDailyWork());


    }
}
