package ru.job4j.condition;

public class Max {

    public static int max(int left, int right) {
        int result = left > right ? left : right;
        return result;
    }

    public static int max(int first, int second, int thrid) {
        return max(first, max(second, thrid));
    }

    public static int max(int first, int second, int thrid, int four) {
        return max(first, max(second, thrid, four));
    }

    public static void main(String[] args) {
        System.out.println(Max.max(8, 8));
    }

}
