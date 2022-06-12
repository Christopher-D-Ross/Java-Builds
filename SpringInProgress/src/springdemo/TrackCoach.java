package springdemo;

public class TrackCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Run a few miles.";
    }

    @Override
    public String getDailyFortune() {
        return "The closest you'll get to being Flash awaits.";
    }

}
