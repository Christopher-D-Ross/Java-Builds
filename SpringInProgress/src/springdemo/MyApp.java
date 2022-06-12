package springdemo;

public class MyApp {

    public static void main(String[] args) {

        //Coding to the interface and not the implementation is considered good practice.

        //create the object
        Coach coach = new BaseballCoach();

        Coach trackCoach = new TrackCoach();

        //use the object
        System.out.println(coach.getDailyWorkout());
        System.out.println();
        System.out.println(trackCoach.getDailyWorkout());
    }
}
