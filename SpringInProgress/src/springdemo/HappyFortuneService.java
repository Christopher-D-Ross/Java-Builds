package springdemo;

public class HappyFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "You'll learn something new today.";
    }
}
