package CosmicBeing;

import lombok.Data;

import java.util.List;

@Data
public abstract class CosmicBeing {

    private String typeOfBeing;

    public List<String> energyResources;

    public List<String> abilities;

    public CosmicBeing(String typeOfBeing, List<String> energyResources, List<String> abilities) {
        this.typeOfBeing = typeOfBeing;
        this.energyResources = energyResources;
        this.abilities = abilities;
    }

    public abstract String greet();


}
