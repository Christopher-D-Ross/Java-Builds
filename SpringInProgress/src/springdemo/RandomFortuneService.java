package springdemo;

import java.util.ArrayList;

public class RandomFortuneService implements FortuneService {

    ArrayList<String> fortunes = new ArrayList<>();

    public RandomFortuneService() {
        fortunes.add("You will fly.");
        fortunes.add("You will run at speeds close to the speed of light.");
        fortunes.add("Your strength will multiply by ten.");
        fortunes.add("You will gain teleportation abilities.");
        fortunes.add("You will manipulate the earths elements.");
    }

    public int getRandomNumber() {
        return (int) (Math.random() * 5);
    }

    @Override
    public String getFortune() {
        return fortunes.get(getRandomNumber());
    }
}
