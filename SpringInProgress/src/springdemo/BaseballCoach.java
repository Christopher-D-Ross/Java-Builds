package springdemo;

public class BaseballCoach implements Coach {

    //define a private field for the dependency
    private FortuneService fortuneService;

    //no arg-constructor for BaseballCoach in MyApp.java
    public BaseballCoach() {

    }

    //define a constructor
    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Lift weights and swing for the cosmos.";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune(); //Consider this helping out the coach by making use of a helper class.
    }
}
