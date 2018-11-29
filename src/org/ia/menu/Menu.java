package org.ia.menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {


    List<Selectable> menuOptions = new ArrayList<>();
    List<String> textOptions = new ArrayList<>();



    public void run() {

    }

    public void show() {


    }
    public int choice() {
        System.out.println("Make a choice");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();

    }

    public void add(String name, Selectable selectable) {
        textOptions.add(name);
        menuOptions.add(selectable);


    }

    public void execute(int choice) {

        menuOptions.get(choice-1).execute();

    }


}
