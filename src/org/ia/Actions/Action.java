package org.ia.Actions;

public abstract class Action implements Doable{
    int magnitude, delay, cooldown;

    @Override
    public void execute(Action action) {

    }
}
