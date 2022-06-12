package springdemo;

public class WiseCoach implements Coach {

    private FortuneService fortuneService;

    public WiseCoach() {}

    public WiseCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Exercise your Brain";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
