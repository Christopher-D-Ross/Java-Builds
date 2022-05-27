package CosmicBeing.Earth;

import CosmicBeing.CosmicBeing;
import CosmicBeing.HostileTakeover;
import CosmicBeing.CoExist;

import java.util.ArrayList;

public class Human extends CosmicBeing implements HostileTakeover, CoExist {

    private final String name;
    private boolean isFriendly;

    public Human(String name, boolean isFriendly) {
        super("Human", new ArrayList<>(), new ArrayList<>());
        this.name = name;
        this.isFriendly = isFriendly;
        energyResources.add("Water");
        energyResources.add("Plants");
        energyResources.add("Other Earth inhabiting animals");
        abilities.add("Intelligence");
        abilities.add("Great strength where gravity is less than 9.8m/s^2");
    }

    public String getName() {
        return name;
    }

    public void showEnergyResources() {
        System.out.print("Resources: ");
        for(String resource : energyResources) {
            System.out.print(resource + " ");
        }
    }

    @Override
    public String greet() {
        return "Hello";
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

    @Override
    public <T extends CosmicBeing> boolean canProvideBeneficialResources() {
        return false;
    }
}
