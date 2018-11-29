package org.ia.entities;

public class Enemy extends Entity{

    public Enemy(int hp, int energy, int defense, int strength, int experience) {
        super(hp, energy, defense, strength, experience);
    }

    @Override
    public String toString() {
        return "Your current stats are: "+getStrength()+" Stregth, "+getDefense()+
                " Defense, "+getEnergy()+" Energy, "+getHp()+" Health";
    }
}
