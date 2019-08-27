package _06_InjectionTypes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("appContext6.xml");
        BaseBallCoach baseBallCoach=(BaseBallCoach) context.getBean("baseBallCoach",Coach.class);
        System.out.println(baseBallCoach.getDailyFortune());
        System.out.println(baseBallCoach.getDailyWork());

    }
}
