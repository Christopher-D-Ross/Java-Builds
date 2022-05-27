package CosmicBeing.Mercury;

import CosmicBeing.CosmicBeing;
import CosmicBeing.HostileTakeover;
import CosmicBeing.CoExist;

import java.util.ArrayList;

public class Mercurian extends CosmicBeing implements HostileTakeover, CoExist {

    private final String name;
    private boolean isFriendly;

    public Mercurian(String name, boolean isFriendly) {
        super("Mercurian", new ArrayList<>(), new ArrayList<>());
        this.name = name;
        this.isFriendly = isFriendly;
        energyResources.add("Spice");
        abilities.add("High tolerance in extremely hot environments");
    }

    public String getName() {
        return name;
    }

    @Override
    public String greet() {
        return "Blows sand and dirt into the air and nods head.";
    }

    @Override
    public <T extends CosmicBeing> boolean canProvideBeneficialResources() {
        return false;
    }

    @Override
    public <T extends CosmicBeing> boolean readyToTakeoverYourPlanet(T cosmicBeing) {
        return false;
    }

    @Override
    public boolean isFriendly() {
        return isFriendly;
    }

    @Override
    public <T extends CosmicBeing> void potentialTakeoverOutcome(T cosmicBeing) {

    }
}
