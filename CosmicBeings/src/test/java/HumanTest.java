import CosmicBeing.Earth.Human;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HumanTest {

    Human human;

    @BeforeEach
    public void createAHuman() {
        human = new Human("Somba", true);
    }

    @Test
    void doesTheHumanHaveAName() {
        assertEquals("Somba", human.getName());
    }

    @Test
    void areYouFriendly() {
        assertTrue(human.isFriendly());
    }

}
