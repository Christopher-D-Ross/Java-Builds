package CosmicBeing.Pluto;

import CosmicBeing.CosmicBeing;
import CosmicBeing.HostileTakeover;
import CosmicBeing.CoExist;

import java.util.ArrayList;

public class Plutonian extends CosmicBeing implements HostileTakeover, CoExist {

    private final String name;
    private boolean isFriendly;

    public Plutonian(String name, boolean isFriendly) {
        super("Plutonaian", new ArrayList<>(), new ArrayList<>());
        this.name = name;
        this.isFriendly = isFriendly;
        energyResources.add("Water");
        energyResources.add("Ice");
        abilities.add("High tolerance in extremely cold environments.");

    }

    @Override
    public <T extends CosmicBeing> boolean canProvideBeneficialResources(T cosmicBeing) {
        return false;
    }

    @Override
    public String greet() {
        return "Welcome to the Frozen Outer Rim, and that which lies beyond the Kieper Belt.";
    }

    @Override
    public <T extends CosmicBeing> boolean readyToTakeoverYourPlanet(T cosmicBeing) {
        return false;
    }

    @Override
    public boolean isFriendly() {
        return false;
    }

    @Override
    public <T extends CosmicBeing> void potentialTakeoverOutcome(T cosmicBeing) {

    }
}
