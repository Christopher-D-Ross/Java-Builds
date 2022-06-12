package springdemo;

public class CricketCoach implements Coach {

    //add new fields for emailAddress and team
    //These fields will be used to assign the data once it's injected into the application.
    private String emailAddress = "thecricketcoach@cricket.com";
    private String team = "Mallet Smashers";

    //add getter and setter methods for new fields

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("CricketCoach: inside the setter method - setEmailAddress");
        this.emailAddress = emailAddress;
    }

    public void setTeam(String team) {
        System.out.println("CricketCoach: inside the setter method - setTeam");
        this.team = team;
    }

    //no-arg constructor
    public CricketCoach() {
        System.out.println("CricketCoach: inside no-arg constructor");
    }

    private FortuneService fortuneService;

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("CricketCoach: inside the setter method - setFortuneService");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Hulk the mallet, bowl the ball.";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
