package CosmicBeing.Saturn;

import CosmicBeing.CosmicBeing;
import CosmicBeing.HostileTakeover;
import CosmicBeing.CoExist;

import java.util.ArrayList;

public class Saturnian extends CosmicBeing implements HostileTakeover, CoExist {

    private final String name;
    private boolean isFriendly;

    public Saturnian(String name, boolean isFriendly) {
        super("Saturnian", new ArrayList<>(), new ArrayList<>());
        this.name = name;
        this.isFriendly = isFriendly;
    }

    @Override
    public <T extends CosmicBeing> boolean canProvideBeneficialResources(T cosmicBeing) {
        return false;
    }

    @Override
    public String greet() {
        return null;
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
