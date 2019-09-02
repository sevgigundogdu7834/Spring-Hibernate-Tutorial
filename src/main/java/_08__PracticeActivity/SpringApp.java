package _08__PracticeActivity;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("springContext_practice.xml");
        BaseBallCoach baseBallCoach=context.getBean("baseBallCoach",BaseBallCoach.class);

        System.out.println(baseBallCoach.getFortuneService().getFortune());

    }
}
