package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
    public static void main(String[] args) {

        //load the Spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        //retrieve bean from spring container
        Coach coach = context.getBean("myCoach", Coach.class);

        Coach trainingCoach = context.getBean("weightCoach", Coach.class);

        //call methods on the bean
        System.out.println(coach.getDailyWorkout());

        System.out.println();

        System.out.println(trainingCoach.getDailyWorkout());

        System.out.println();

        System.out.println(coach.getDailyFortune());
        //close the context
        //this is performed as a "clean-up"
        context.close();
    }
}
