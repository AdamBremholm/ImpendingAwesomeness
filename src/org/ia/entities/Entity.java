package org.ia.entities;

import java.util.List;

public class Entity {
    private int hp;
    private int energy;
    private int defense;
    private int strength;
    private int experience;
    List <Action> moveList = new List<Action>();

    public Entity(int hp, int energy, int defense, int strength, int experience, List<Action> moveList) {
        this.hp = hp;
        this.energy = energy;
        this.defense = defense;
        this.strength = strength;
        this.experience = experience;
        this.moveList = moveList;
    }

    public List<Action> getMoveList() {
        return moveList;
    }

    public void setMoveList(List<Action> moveList) {
        this.moveList = moveList;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

}

    public void makeAction(action){

    }
}

