package ru.job4j.condition;

public class Game {

    public static void menu(String name) {
        if ("super mario".equals(name)) {
            System.out.println("Start - super mario");
        }
        if ("tanks".equals(name)) {
            System.out.println("Start - tanks");
        }
        if ("tetris".equals(name)) {
            System.out.println("Start - tetris");
        }
    }

    public static void maxValue(int x, int y, int z) {

        if (x > y && x > z) {
            System.out.println(x);
        } else if (y > z) {
            System.out.println(y);
        } else if (x == y && x == z) {
            System.out.println("Всё значения равны!!");
        } else {
            System.out.println(z);
        }

    }

    public static void main(String[] args) {
        Game.maxValue(11, 11, 11);
    }

}
