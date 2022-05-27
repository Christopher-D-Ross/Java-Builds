import CosmicBeing.Earth.Human;

/**
 * Create methods specific to this class
 * that make it possible for cosmic beings to
 * only be able to do certain things when in this class.
 * Share resources, attack or do damage to another cosmic being.
 */
public class Interact {

    public static void main(String[] args) {

        Human somba = new Human("Somba", false);
        somba.showEnergyResources();
    }
}
