package CosmicBeing;

public interface HostileTakeover {

    <T extends CosmicBeing> boolean readyToTakeoverYourPlanet(T cosmicBeing);
    boolean isFriendly();
    <T extends CosmicBeing> void potentialTakeoverOutcome(T cosmicBeing);

}
