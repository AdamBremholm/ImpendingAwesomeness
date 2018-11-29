package org.ia.Items;

import org.ia.Actions.Action;
import org.ia.Actions.Doable;

public class Consumable extends Item implements Doable {
    int charges;
    Action action;

    @Override
    public void execute(Action action) {

    }
}
