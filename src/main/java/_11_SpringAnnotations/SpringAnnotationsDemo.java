package _11_SpringAnnotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAnnotationsDemo {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("annotations_appContext11.xml");
        BaseBallCoach baseBallCoach=context.getBean("baseBallCoach",BaseBallCoach.class);

        System.out.println(baseBallCoach.getDailyWork());
        System.out.println(baseBallCoach.getDailyFortune());
    }
}
