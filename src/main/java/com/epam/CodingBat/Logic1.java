package com.epam.CodingBat;

/**
 * Created by User on 26.11.2017.
 */
public class Logic1 {

    public boolean cigarParty(int cigars, boolean isWeekend) {
        if (isWeekend == true) {
            if (cigars >= 40)
                return true;
            else return false;
        } else if (Math.abs(50 - cigars) <= 10)
            return true;
        else return false;
    }

    public int dateFashion(int you, int date) {
        if ((you >= 8 || date >= 8) && you > 2 && date > 2) {
            return 2;
        } else if (you <= 2 || date <= 2)
            return 0;
        else return 1;
    }

    public boolean squirrelPlay(int temp, boolean isSummer) {
        if (isSummer)
            if (temp >= 60 && temp <= 100)
                return true;
            else return false;
        else if (temp >= 60 && temp <= 90)
            return true;
        else return false;
    }

    public int caughtSpeeding(int speed, boolean isBirthday) {
        int x = 0;
        if (isBirthday)
            x += 5;
        if (speed <= 60 + x)
            return 0;
        else if (speed <= 80 + x)
            return 1;
        else return 2;
    }

    public int sortaSum(int a, int b) {
        if (a + b >= 10 && a + b <= 19)
            return 20;
        else return a + b;
    }

    public String alarmClock(int day, boolean vacation) {
        if (vacation)
            if (day >= 1 && day <= 5)
                return "10:00";
            else return "off";
        else if (day >= 1 && day <= 5)
            return "7:00";
        else return "10:00";
    }

    public boolean love6(int a, int b) {
        if (a == 6 || b == 6 || a + b == 6 || Math.abs(a - b) == 6)
            return true;
        else return false;
    }

    public boolean in1To10(int n, boolean outsideMode) {
        if (outsideMode)
            if (n >= 10 || n <= 1)
                return true;
            else return false;
        else if (n >= 1 && n <= 10)
            return true;
        else return false;
    }

    public boolean specialEleven(int n) {
        if (n % 11 == 0 || n % 11 == 1)
            return true;
        else return false;
    }

    public boolean more20(int n) {
        if (n % 20 == 1 || n % 20 == 2)
            return true;
        else return false;
    }

    public boolean old35(int n) {
        if (n % 15 == 0)
            return false;
        else if (n % 3 == 0 || n % 5 == 0)
            return true;
        else return false;
    }

    public boolean less20(int n) {
        return (n % 20 == 19 || n % 20 == 18);
    }

    public boolean nearTen(int num) {
        int of10 = num % 10;
        return (of10 == 1 || of10 == 2 || of10 == 8 || of10 == 9);
    }

    public int teenSum(int a, int b) {
        if (a >= 13 && a <= 19 || b >= 13 && b <= 19)
            return 19;
        else return a + b;
    }

    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if (isAsleep)
            return false;
        else if (isMorning)
            if (isMom)
                return true;
            else return false;
        else return true;
    }

    public int teaParty(int tea, int candy) {
        if (tea < 5 || candy < 5)
            return 0;
        else if (tea >= candy * 2 || candy >= tea * 2)
            return 2;
        else return 1;
    }

    public String fizzString(String str) {
        String first = str.substring(0, 1);
        String last = str.substring(str.length() - 1, str.length());
        if (first.equals("f") && last.equals("b"))
            return "FizzBuzz";
        else if (last.equals("b"))
            return "Buzz";
        else if (first.equals("f")) return "Fizz";
        else return str;
    }

    public String fizzString2(int n) {
        if (n % 15 == 0)
            return "FizzBuzz!";
        else if (n % 3 == 0)
            return "Fizz!";
        else if (n % 5 == 0)
            return "Buzz!";
        else return n + "!";
    }

    public boolean twoAsOne(int a, int b, int c) {
        return (a + b == c || a + c == b || b + c == a);
    }

    public boolean inOrder(int a, int b, int c, boolean bOk) {
        if (bOk)
            return (c > b);
        else return (b > a && c > b);
    }

    public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        if (equalOk)
            return (c >= b && b >= a);
        else return (c > b && b > a);
    }

    public boolean lastDigit(int a, int b, int c) {
        return (a % 10 == b % 10 || b % 10 == c % 10 || a % 10 == c % 10);
    }

    public boolean lessBy10(int a, int b, int c) {
        return (Math.abs(a - b) >= 10 || Math.abs(a - c) >= 10 || Math.abs(c - b) >= 10);
    }

    public int withoutDoubles(int die1, int die2, boolean noDoubles) {
        if (!noDoubles)
            return die1 + die2;
        else if (die1 == die2)
            if (die1 == 6)
                return 7;
            else return die1 + die2 + 1;
        else return die1 + die2;
    }

    public int maxMod5(int a, int b) {
        if (a == b)
            return 0;
        else if (a % 5 == b % 5)
            if (a < b)
                return a;
            else return b;
        else if (a > b)
            return a;
        else return b;
    }

    public int redTicket(int a, int b, int c) {
        if (a == b && b == c && a == 2)
            return 10;
        else if (a == b && b == c)
            return 5;
        else if (a != b && a != c)
            return 1;
        else return 0;
    }

    public int greenTicket(int a, int b, int c) {
        if (a == b && b == c && a == c)
            return 20;
        else if (a == b || b == c || a == c)
            return 10;
        else return 0;
    }

    public int blueTicket(int a, int b, int c) {
        if (a + b == 10 || a + c == 10 || b + c == 10)
            return 10;
        else if (a - c == 10 || b - c == 10)
            return 5;
        else return 0;
    }

    public boolean shareDigit(int a, int b) {
        int afirst = a / 10;
        int alast = a % 10;
        int bfirst = b / 10;
        int blast = b % 10;
        if (afirst == bfirst || afirst == blast || alast == bfirst || alast == blast)
            return true;
        else return false;
    }

    public int sumLimit(int a, int b) {
        if (String.valueOf( a + b).length() == String.valueOf(a).length())
            return a + b;
        else return a;
    }

    public static void main(String[] args) {
        Logic1 logic1 = new Logic1();
        System.out.println(logic1.fizzString("fojb"));
    }
}
