package com.devross;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    private static Map<HeavenlyBody.Key, HeavenlyBody> solarSystem = new HashMap<>();
    private static Set<HeavenlyBody> planets = new HashSet<>();

    public static void main(String[] args) {

        HeavenlyBody mercury = new Planet("Mercury", 88);
        solarSystem.put(mercury.getKey(), mercury);
        planets.add(mercury);

        HeavenlyBody venus = new Planet("Venus", 225);
        solarSystem.put(venus.getKey(), venus);
        planets.add(venus);

        HeavenlyBody earth = new Planet("Earth", 365);
        solarSystem.put(earth.getKey(), earth);
        planets.add(earth);

        HeavenlyBody earthsMoon = new Moon("Moon", 27);
        solarSystem.put(earthsMoon.getKey(), earthsMoon);
        earth.addSatellite(earthsMoon);

        HeavenlyBody mars = new Planet("Mars", 687);
        solarSystem.put(mars.getKey(), mars);
        planets.add(mars);

        HeavenlyBody deimos = new Moon("Deimos", 1.3);
        solarSystem.put(deimos.getKey(), deimos);
        mars.addSatellite(deimos);

        HeavenlyBody phobos = new Moon("Phobos", 0.3);
        solarSystem.put(phobos.getKey(), phobos);
        mars.addSatellite(phobos);

        HeavenlyBody jupiter = new Planet("Jupiter", 4332);
        solarSystem.put(jupiter.getKey(), jupiter);
        planets.add(jupiter);

        HeavenlyBody io = new Moon("IO", 1.8);
        solarSystem.put(io.getKey(), io);
        jupiter.addSatellite(io);

        HeavenlyBody europa = new Moon("Europa", 3.5);
        solarSystem.put(europa.getKey(), europa);
        jupiter.addSatellite(europa);

        HeavenlyBody ganymede = new Moon("Ganymede", 7.1);
        solarSystem.put(ganymede.getKey(), ganymede);
        jupiter.addSatellite(ganymede);

        HeavenlyBody callisto = new Moon("Callisto", 16.7);
        solarSystem.put(callisto.getKey(), callisto);
        jupiter.addSatellite(callisto);

        HeavenlyBody saturn = new Planet("Saturn", 10759);
        solarSystem.put(saturn.getKey(), saturn);
        planets.add(saturn);

        HeavenlyBody uranus = new Planet("Uranus", 30660);
        solarSystem.put(uranus.getKey(), uranus);
        planets.add(uranus);

        HeavenlyBody neptune = new Planet("Neptune", 165);
        solarSystem.put(neptune.getKey(), neptune);
        planets.add(neptune);

        HeavenlyBody pluto = new Planet("Pluto", 248);
        solarSystem.put(pluto.getKey(), pluto);
        planets.add(pluto);

        System.out.println("Planets");
        for (HeavenlyBody planets : planets) {
            System.out.println("\t" + planets.getKey());
        }

        System.out.println("Moons of " + jupiter.getKey());
        for(HeavenlyBody moons : jupiter.getSatellites()) {
            System.out.println("\t" + moons.getKey());
        }

        Set<HeavenlyBody> allMoons = new HashSet<>();
        for(HeavenlyBody planet : planets) {
            allMoons.addAll(planet.getSatellites());
        }
        System.out.println("All moons:");
        for(HeavenlyBody moons : allMoons) {
            System.out.println("\t" + moons.getKey());
        }

        HeavenlyBody newPluto = new DwarfPlanet("Pluto", 842);
        solarSystem.put(newPluto.getKey(), newPluto);
        planets.add(newPluto);

        for(HeavenlyBody planet : planets) {
            System.out.println(planet.getKey() + ": " + planet.getOrbitalPeriod());
        }

        HeavenlyBody earth1 = new Planet("Earth", 365);
        HeavenlyBody earth2 = new Planet("Earth", 365);
        System.out.println(earth1.equals(earth2));
        System.out.println(earth2.equals(earth1));
        System.out.println(pluto.equals(earth1));
        System.out.println(earth1.equals(pluto));


        System.out.println(solarSystem.get(HeavenlyBody.makeKey("Pluto", HeavenlyBody.BodyTypes.PLANET)));
        System.out.println(solarSystem.get(HeavenlyBody.makeKey("Pluto", HeavenlyBody.BodyTypes.DWARF_PLANET)));
    }
}
