package com.epam.CodingBat;

import com.epam.hwOperProc.Main;

/**
 * Created by User on 26.11.2017.
 */
public class WarmUp1 {

    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (weekday == false && vacation == false) {
            return true;
        } else if (weekday == true && vacation == false) {
            return false;
        } else if (weekday == false && vacation == true) {
            return true;
        } else return true;
    }

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile == true && bSmile == true) {
            return true;
        } else if (aSmile == false && bSmile == false) {
            return true;
        } else return false;
    }

    public int sumDouble(int a, int b) {
        if (a == b) {
            return 2 * (a + b);
        } else return a + b;
    }

    public int diff21(int n) {
        if (n <= 21) {
            return 21 - n;
        } else return n - 21;
    }

    public boolean parrotTrouble(boolean talking, int hour) {
        if (talking == true && (hour < 7 || (hour > 20))) {
            return true;
        } else return false;
    }

    public boolean makes10(int a, int b) {
        if (a == 10 || b == 10 || a + b == 10) {
            return true;
        } else return false;
    }

    public boolean nearHundred(int n) {
        if (Math.abs(100 - n) <= 10 || Math.abs(200 - n) <= 10) {
            return true;
        } else return false;
    }

    public boolean posNeg(int a, int b, boolean negative) {
        if (negative == true) {
            if (a < 0 && b < 0) {
                return true;
            } else return false;
        } else if (a * b < 0) {
            return true;
        } else return false;
    }

    public String notString(String str) {
        if (str.length() < 3) {
            return "not " + str;
        } else if (str.subSequence(0, 3).equals("not")) {
            return str;
        } else return "not " + str;
    }

    public String missingChar(String str, int n) {
        if (n > 0)
            return str.substring(0, n) + str.substring(n + 1, str.length());
        else return str.substring(1);
    }

    public String frontBack(String str) {
        if (str.length() < 2)
            return str;
        else {
            CharSequence first = str.substring(0, 1);
            CharSequence last = str.substring(str.length() - 1);
            return last + str.substring(1, str.length() - 1) + first;
        }
    }

    public String front3(String str) {
        if (str.length() >= 3) {
            return str.substring(0, 3) + str.substring(0, 3) + str.substring(0, 3);
        } else return str + str + str;
    }

    public String backAround(String str) {
        String last = str.substring(str.length() - 1);
        return last + str + last;
    }

    public boolean or35(int n) {
        if (n % 3 == 0 || n % 5 == 0)
            return true;
        else return false;
    }

    public String front22(String str) {
        if (str.length() >= 2) {
            return str.substring(0, 2) + str + str.substring(0, 2);
        } else return str + str + str;
    }

    public boolean startHi(String str) {
        if (str.length() < 2)
            return false;
        else if (str.subSequence(0, 2).equals("hi"))
            return true;
        else return false;
    }

    public boolean icyHot(int temp1, int temp2) {
        if ((temp1 < 0 && temp2 > 100) || (temp2 < 0 && temp1 > 100))
            return true;
        else return false;
    }

    public boolean in1020(int a, int b) {
        if ((a > 10 && a < 20) || (b > 10 && b < 20))
            return true;
        else return false;
    }

    public boolean hasTeen(int a, int b, int c) {
        if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19))
            return true;
        else return false;
    }

    public boolean loneTeen(int a, int b) {
        if ((a >= 13 && a <= 19) && (b >= 13 && b <= 19))
            return false;
        else if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19))
            return true;
        else return false;
    }

    public String delDel(String str) {
        if (str.length() < 4)
            return str;
        else if (str.substring(1, 4).endsWith("del"))
            return str.substring(0, 1) + str.substring(4);
        else return str;
    }

    public boolean mixStart(String str) {
        if (str.length() < 3)
            return false;
        else if (str.substring(1, 3).equals("ix"))
            return true;
        else return false;
    }

    public String startOz(String str) {
        String answer = "";
        if (str.length() > 0)
            if (str.substring(0, 1).equals("o"))
                answer += "o";
        if (str.length() > 1)
            if (str.substring(1, 2).equals("z"))
                answer += "z";
        return answer;
    }

    public int intMax(int a, int b, int c) {
        int max = a;
        if (b > max)
            max = b;
        if (c > max)
            max = c;
        return max;
    }

    public int close10(int a, int b) {
        int a10 = Math.abs(10 - a);
        int b10 = Math.abs(10 - b);
        if (a10 > b10)
            return b;
        else if (b10 > a10)
            return a;
        else return 0;
    }

    public boolean in3050(int a, int b) {
        if ((a >= 30 && a <= 40 && b >= 30 && b <= 40) || (a >= 40 && a <= 50 && b >= 40 && b <= 50))
            return true;
        else return false;
    }

    public int max1020(int a, int b) {
        if (a >= 10 && a <= 20) {
            if (b >= 10 && b <= 20) {
                if (a > b)
                    return a;
                else return b;
            } else return a;
        } else if (b >= 10 && b <= 20) {
            return b;
        } else return 0;
    }

    public boolean stringE(String str) {
        if (str.contains("e")) {
            str = str.substring(str.indexOf("e") + 1, str.length());
            if (str.contains("e")) {
                str = str.substring(str.indexOf("e") + 1, str.length());
                if (str.contains("e")) {
                    str = str.substring(str.indexOf("e") + 1, str.length());
                    if (str.contains("e"))
                        return false;
                    else return true;
                } else return true;
            } else return true;
        } else return false;
    }

    public boolean lastDigit(int a, int b) {
        if (a % 10 == b % 10)
            return true;
        else return false;
    }

    public String endUp(String str) {
        if (str.length() <= 3)
            return str.toUpperCase();
        else return str.substring(0, str.length() - 3) + str.substring(str.length() - 3, str.length()).toUpperCase();
    }

    public String everyNth(String str, int n) {
        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            if (i % n == 0)
                answer += str.substring(i, i + 1);
        }
        return answer;
    }


    public static void main(String[] args) {
        WarmUp1 warmUp1 = new WarmUp1();
        // System.out.println(warmUp1.frontBack("abcdef"));
        System.out.println(warmUp1.stringE("Heellee"));
    }
}
