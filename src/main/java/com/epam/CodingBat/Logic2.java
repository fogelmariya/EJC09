package com.epam.CodingBat;

/**
 * Created by User on 28.11.2017.
 */
public class Logic2 {

    public boolean makeBricks(int small, int big, int goal) {
        boolean flag = false;
        for (int i = 0; i <= big; i++) {
            if (goal - i * 5 >= 0)
                if (goal - i * 5 <= small)
                    flag = true;
        }
        return flag;
    }

    public int loneSum(int a, int b, int c) {
        int sum = 0;
        if (a == b) {
            if (b == c) {
                return sum;
            }
            return c;
        }
        if (b == c)
            return a;
        if (a == c)
            return b;
        return a + b + c;
    }

    public int luckySum(int a, int b, int c) {
        if (a == 13)
            return 0;
        if (b == 13)
            return a;
        if (c == 13)
            return a + b;
        return a + b + c;
    }

    public int fixTeen(int n) {
        if (n == 13 || n == 14 || n == 17 || n == 18 || n == 19)
            return 0;
        return n;
    }

    public int noTeenSum(int a, int b, int c) {
        int sum = 0;
        sum += fixTeen(a) + fixTeen(b) + fixTeen(c);
        return sum;
    }

    public int round10(int n) {
        if (n % 10 < 5)
            return n - n % 10;
        return n + 10 - n % 10;
    }

    public int roundSum(int a, int b, int c) {
        return round10(a) + round10(b) + round10(c);
    }

    public boolean closeFar(int a, int b, int c) {
        boolean flag;
        if ((Math.abs(b - a) <= 1)) {
            if ((Math.abs(b - c) <= 1) || (Math.abs(c - a) <= 1))
                flag = false;
            else flag = true;
        } else if ((Math.abs(b - c) <= 1)) {
            if ((Math.abs(c - a) <= 1))
                flag = false;
            else flag = true;
        } else if ((Math.abs(c - a) <= 1))
            flag = true;
        else flag = false;

        return flag;
    }

    public int blackjack(int a, int b) {
        if (a > 21) {
            if (b > 21)
                return 0;
            return b;
        } else if (a > b)
            return a;
        else if (b < 21)
            return b;
        else return a;
    }

    public boolean evenlySpaced(int a, int b, int c) {
        if (Math.abs(a - b) == Math.abs(c - b) || Math.abs(a - b) == Math.abs(c - a) || Math.abs(c - b) == Math.abs(c - a)
                && (a != b) && (b != c)&& (c != b))
            return true;
        else return false;
    }

    public int makeChocolate(int small, int big, int goal) {
        int flag = -1;
        for (int i = 0; i <= big; i++) {
            if (goal - i * 5 >= 0)
                if (goal - i * 5 <= small)
                    flag = goal - i * 5;
        }
        return flag;
    }
}
