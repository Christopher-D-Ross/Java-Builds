package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

//This class was created for a clean slate.
public class SetterDemoApp {

    public static void main(String[] args) {

        //load the Spring configuration file
        ClassPathXmlApplicationContext cricketContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve bean from spring container
        CricketCoach cricketCoach = cricketContext.getBean("myCricketCoach", CricketCoach.class);

        //call methods on the bean
        System.out.println(cricketCoach.getDailyWorkout());

        System.out.println();

        System.out.println(cricketCoach.getDailyFortune());

        System.out.println();
        //call methods to get the literal values that have been set
        System.out.println(cricketCoach.getEmailAddress());

        System.out.println();

        System.out.println(cricketCoach.getTeam());

        //close the context
        cricketContext.close();

    }
}