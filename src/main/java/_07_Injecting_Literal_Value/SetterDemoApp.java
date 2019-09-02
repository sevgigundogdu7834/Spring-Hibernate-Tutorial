package _07_Injecting_Literal_Value;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("springContext_7.xml");

        CricketCoach cricketCoach=context.getBean("cricketCoach",CricketCoach.class);

        System.out.println(cricketCoach.getEmailAdress());
        System.out.println(cricketCoach.getTeam());

        System.out.println("-------------");

        System.out.println(cricketCoach.getDailyWork());
        System.out.println(cricketCoach.getDailyFortune());
    }
}
