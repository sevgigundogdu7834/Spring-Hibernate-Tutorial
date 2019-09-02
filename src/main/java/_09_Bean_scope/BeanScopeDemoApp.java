package _09_Bean_scope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

    public static void main(String[] args) {

        // load the Spring Configuration file

        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beanScope_appContext9.xml");

        // retrieve bean from Spring Container

        Coach theCoach= context.getBean("baseBallCoach",Coach.class);
        Coach myCoach= context.getBean("baseBallCoach",Coach.class);

        // check if they are the same
        System.out.println((theCoach == myCoach) ? "Same Object " : "Different Object");

           // another check

          boolean checkObject= (theCoach == myCoach);

        System.out.println(checkObject);
        System.out.println(theCoach);
        System.out.println(myCoach);

    }
}
