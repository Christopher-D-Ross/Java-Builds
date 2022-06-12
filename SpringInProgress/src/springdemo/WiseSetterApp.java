package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class WiseSetterApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach wiseCoach = context.getBean("wiseCoach", Coach.class);

        System.out.println(wiseCoach.getDailyWorkout());

        System.out.println();

        System.out.println(wiseCoach.getDailyFortune());

        System.out.println();

        System.out.println(wiseCoach.getDailyFortune());

        System.out.println();

        System.out.println(wiseCoach.getDailyFortune());

        System.out.println();

        System.out.println(wiseCoach.getDailyFortune());

        System.out.println();

        System.out.println(wiseCoach.getDailyFortune());

        System.out.println();

        System.out.println(wiseCoach.getDailyFortune());

        context.close();

    }
}
