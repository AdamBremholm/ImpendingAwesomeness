package org.ia.entities;

import java.util.ArrayList;
import java.util.List;

public class Player extends Entity{

    private ArrayList<Item> items = new ArrayList<Item>();


    public Player(int hp, int energy, int defense, int strength, int experience, List<Action> moveList) {
        super(hp, energy, defense, strength, experience, moveList);
    }

    @Override
    public String toString() {
        return "Your current stats are: "+getStrength()+" Stregth, "+getDefense()+" Defense";
    }
}
