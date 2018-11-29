package org.ia.menu;

public class TestMenu {

    private Menu menu;

    public void start() {

        menu = new Menu();
        menu.add("option 1", () -> System.out.println("you chose option 1"));
        menu.add("option 2", () -> System.out.println("you chose option 2"));
        menu.add("option 3", () -> System.out.println("you chose option 3"));

        while(true) {

            menu.show();
            menu.execute(menu.choice());
        }



    }

    public static void main(String[] args) {

        new TestMenu().start();

    }
}
