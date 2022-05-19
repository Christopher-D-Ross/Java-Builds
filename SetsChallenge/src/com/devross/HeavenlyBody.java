package com.devross;

import java.util.HashSet;
import java.util.Set;

public abstract class HeavenlyBody {

    private final Key key;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;

    public enum BodyTypes {
        PLANET,
        MOON,
        STAR,
        DWARF_PLANET,
        COMET,
        ASTEROID
    }

    public HeavenlyBody(String name, double orbitalPeriod, BodyTypes bodyType) {
        this.key = new Key(name, bodyType);
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
    }

    public String getName() {
        return key.getName();
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public Key getKey() {
        return key;
    }

    public BodyTypes getBodyType() {
        return key.getBodyType();
    }

    public boolean addSatellite(HeavenlyBody moon) {
        return this.satellites.add(moon);
    }

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(satellites);
    }

    public static Key makeKey(String name, BodyTypes bodyType) {
        return new Key(name, bodyType);
    }

    // Make sure you are overriding this method here and not overloading it.
    @Override
    public final boolean equals(Object object) {
        //This will check to see if each object points to the same memory location.
        //If both objects point to the same memory location then they are the same object.
        if(this == object) {
            return true;
        }

        //This checks to see if the object passed is of type HeavenlyBody.
        if(object instanceof HeavenlyBody) {
            HeavenlyBody theObject = (HeavenlyBody) object;
            return this.key.equals(theObject.getKey());
        }
        //All that is needed here is to return false because we know that either the name or bodyType is different.
        return false;
    }

    @Override
    public final int hashCode() {
        return this.key.name.hashCode() + 6;
    }

    @Override
    public String toString() {
        return "HeavenlyBody { " +
                "name = '" + key.name + '\'' +
                ", orbitalPeriod = " + orbitalPeriod +
                ", bodyType = " + key.bodyType +
                " }";
    }

    //This Key class provides a way to deal with a combination of name and body type in a single object or as a single object.
    //This Key will be used in a Map which is why the equals and hashCode methods needed to be overridden.
    public static final class Key {
        private String name;
        private BodyTypes bodyType;

        //Even though this a private constructor we'll still be able to access it since it's an Inner Class of HeavenlyBody.
        private Key(String name, BodyTypes bodyType) {
            this.name = name;
            this.bodyType = bodyType;
        }

        public String getName() {
            return name;
        }

        public BodyTypes getBodyType() {
            return bodyType;
        }

        @Override
        public int hashCode() {
            return this.name.hashCode() + 67;
        }

        @Override
        public boolean equals(Object obj) {
            Key key = (Key) obj;
            if(this.name.equals(key.getName())) {
                return (this.bodyType == key.getBodyType());
            }
            return false;
        }

        @Override
        public String toString() {
            return this.name + ": " + this.bodyType;
        }
    }
}
