package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double sumAndDivOnSub(double first, double second) {
        return div(first, second)
                + sub(first, second);
    }

    public static double sumAllOperation(double first, double second) {
        return sum(first, second)
                + multiply(first, second) + div(first, second)
                + sub(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + sumAndDivOnSub(10, 20));
        System.out.println("Результат расчета равен: " + sumAllOperation(10, 20));

        System.out.println(calculate(2, 7));
    }

    public static int calculate(int a, int n) {
        int b = a;
        for (int i = n; i > 1; i--) {
            a *= b;
        }
        /*if (n == 0) {
            return 1;
        }
        return a * calculate(a, n - 1);*/
        return a;
    }

}
