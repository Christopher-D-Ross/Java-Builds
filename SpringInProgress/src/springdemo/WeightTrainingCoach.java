package springdemo;

public class WeightTrainingCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Chest, biceps, triceps, back, shoulders, abs, forearms and legs. Good diet.";
    }

    @Override
    public String getDailyFortune() {
        return "You'll go beyond your max today.";
    }
}
