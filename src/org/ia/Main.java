package org.ia;

import org.ia.entities.Enemy;
import org.ia.entities.Player;

public class Main {

    public static void main(String[] args) {

        Player player = new Player(15,20,12,13,17 );
        System.out.println(player);

        Enemy enemy = new Enemy(10,10,10,10,10);
        System.out.println(enemy);

    }
}
