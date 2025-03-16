import CosmicBeing.CosmicBeing;
import CosmicBeing.Earth.Human;
import CosmicBeing.Mercury.Mercurian;
import CosmicBeing.Pluto.Plutonian;
import CosmicBeing.Saturn.Saturnian;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class HumanTest {

    private static Human human;
    private static Mercurian mercurian;
    private static Plutonian plutonian;
    private static Saturnian saturnian;

    @BeforeEach
    public void createTheBeings() {
        human = new Human("Somba", true);
        mercurian = new Mercurian("Drydon", false);
        plutonian = new Plutonian("Icen", false);
        saturnian = new Saturnian("Luci", true);
    }

    @Test
    void doesTheHumanHaveAName() {
        assertEquals("Somba", human.getName());
    }

    @Test
    void areYouFriendly() {
        assertTrue(human.isFriendly());
        assertFalse(mercurian.isFriendly());
        assertFalse(plutonian.isFriendly());
        assertFalse(saturnian.isFriendly());
    }

    @Test
    void areHumansReadyToTakeOverYourPlanet() {
        assertTrue(human.readyToTakeoverYourPlanet(mercurian));
        assertFalse(human.readyToTakeoverYourPlanet(plutonian));
        assertFalse( human.readyToTakeoverYourPlanet(saturnian));
    }

}
