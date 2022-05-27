import CosmicBeing.Mercury.Mercurian;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MercurianTest {

    Mercurian mercurian;

    @BeforeEach
    void createMercurian() {
        mercurian = new Mercurian("Sandu", false);
    }

    @Test
    void doesTheMercurianHaveAName() {
        assertEquals(mercurian.getName(), "Sandu");
    }

    @Test
    void greetingShouldNotBeWithHeld() {
        assertNotNull(mercurian.greet());
    }

    @Test
    void areYouFriendly() {
        assertFalse(mercurian.isFriendly());
    }
}
