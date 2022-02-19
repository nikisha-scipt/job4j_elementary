package ru.job4j.loop;

public class Slash {

    public static void draw(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                boolean left = i == j;
                boolean right = j == size - 1 - i;
                if (left) {
                    System.out.print("X");
                } else if (right) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Draw by 3");
        draw(3);
        System.out.println("Draw by 5");
        draw(5);
    }

}
