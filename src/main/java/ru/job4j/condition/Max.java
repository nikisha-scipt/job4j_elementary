package ru.job4j.condition;

public class Max {

    public static int max(int left, int right) {
        int result = left > right ? left : right;
        return result;
    }

    public static int max(int first, int second, int thrid) {
        return first > second  && first > thrid ? first : Math.max(second, thrid);
    }

    public static int max(int first, int second, int thrid, int four) {
        int res = max(first, second, thrid);
        return Math.max(res, four);
    }

    public static void main(String[] args) {
        System.out.println(Max.max(8, 8));
    }

}
