package com.epam.CodingBat;


public class String1 {
    public String helloName(String name) {
        return "Hello " + name + "!";
    }

    public String makeAbba(String a, String b) {
        return a + b + b + a;
    }

    public String makeTags(String tag, String word) {
        return "<" + tag + ">" + word + "</" + tag + ">";
    }

    public String makeOutWord(String out, String word) {
        return out.substring(0, out.length() / 2) + word + out.substring(out.length() / 2, out.length());
    }

    public String extraEnd(String str) {
        return str.substring(str.length() - 2, str.length()) + str.substring(str.length() - 2, str.length()) + str.substring(str.length() - 2, str.length());
    }

    public String firstTwo(String str) {
        if (str.length() < 2)
            return str;
        else return str.substring(0, 2);
    }

    public String firstHalf(String str) {
        return str.substring(0, str.length() / 2);
    }

    public String withoutEnd(String str) {
        return str.substring(1, str.length() - 1);
    }

    public String comboString(String a, String b) {
        if (a.length() > b.length())
            return b + a + b;
        else return a + b + a;
    }

    public String nonStart(String a, String b) {
        return a.substring(1) + b.substring(1);
    }

    public String left2(String str) {
        return str.substring(2) + str.substring(0, 2);
    }

    public String right2(String str) {
        return str.substring(str.length() - 2) + str.substring(0, str.length() - 2);
    }

    public String theEnd(String str, boolean front) {
        if (front)
            return str.substring(0, 1);
        else return str.substring(str.length() - 1, str.length());
    }

    public String withouEnd2(String str) {
        if (str.length() > 0) {
            if (str.length() > 1)
                return str.substring(1, str.length() - 1);
            else return "";
        } else return str;
    }

    public String middleTwo(String str) {
        return str.substring(str.length() / 2 - 1, str.length() / 2 + 1);
    }

    public boolean endsLy(String str) {
        if (str.length() > 1)
            return str.substring(str.length() - 2, str.length()).equals("ly");
        else return false;
    }

    public String nTwice(String str, int n) {
        return str.substring(0, n) + str.substring(str.length() - n, str.length());
    }

    public String twoChar(String str, int index) {
        if (index + 2 > str.length() || index < 0)
            return str.substring(0, 2);
        else return str.substring(index, index + 2);
    }

    public String middleThree(String str) {
        return str.substring(str.length() / 2 - 1, str.length() / 2 + 2);
    }

    public boolean hasBad(String str) {
        if (str.length() > 3)
            return (str.substring(0, 3).equals("bad") || str.substring(1, 4).equals("bad"));
        else if (str.length() > 2)
            return (str.substring(0, 3).equals("bad"));
        else return false;
    }

    public String atFirst(String str) {
        if (str.length() > 1)
            return str.substring(0, 2);
        else if (str.length() == 1)
            return str + "@";
        else return "@@";
    }

    public String lastChars(String a, String b) {
        String answer = "";
        if (a.length() > 0)
            answer += a.charAt(0);
        else answer += "@";
        if (b.length() > 0)
            answer += b.charAt(b.length() - 1);
        else answer += "@";
        return answer;
    }

    public String conCat(String a, String b) {
        if (a.length() > 0) {
            if (b.length() > 0) {
                if (a.charAt(a.length() - 1) == b.charAt(0))
                    return a + b.substring(1);
                else return a + b;
            } else return a + b;
        } else return a + b;
    }

    public String lastTwo(String str) {
        if (str.length() > 2)
            return str.substring(0, str.length() - 2) + str.charAt(str.length() - 1) + str.charAt(str.length() - 2);
        else if (str.length() == 2)
            return "" + str.charAt(str.length() - 1) + str.charAt(str.length() - 2);
        else return str;
    }

    public String seeColor(String str) {
        if (str.length() > 2) {
            if (str.length() > 3) {
                if (str.substring(0, 3).equals("red"))
                    return "red";
                else if (str.substring(0, 4).equals("blue"))
                    return "blue";
                else return "";
            }
            if (str.substring(0, 3).equals("red"))
                return "red";
            else return "";
        } else return "";
    }

    public boolean frontAgain(String str) {
        if (str.length() > 1)
            return str.substring(0, 2).equals(str.substring(str.length() - 2, str.length()));
        else return false;
    }

    public String minCat(String a, String b) {
        int length = Math.min(a.length(), b.length());
        return a.substring(a.length() - length) + b.substring(b.length() - length, b.length());
    }

    public String extraFront(String str) {
        if (str.length() > 1)
            return str.substring(0, 2) + str.substring(0, 2) + str.substring(0, 2);
        else return str + str + str;
    }

    public String without2(String str) {
        if (str.length() > 1)
            if (str.substring(0, 2).equals(str.substring(str.length() - 2, str.length())))
                return str.substring(2);
            else return str;
        else return str;
    }

    public String deFront(String str) {
        String answer = "";
        if (str.charAt(0) == 'a')
            answer += "a";
        if (str.charAt(1) == 'b')
            answer += "b";
        if (str.length() > 1)
            answer += str.substring(2);
        return answer;
    }

    public String startWord(String str, String word) {
        if (str.length() > word.length())
            if (str.substring(1, word.length()).equals(word.substring(1, word.length())))
                return str.substring(0, word.length());
            else return "";
        else return "";
    }

    public String withoutX(String str) {
        String answer = "";
        if (str.length() > 0) {
            if (str.charAt(0) != 'x')
                answer += str;
            else answer = str.substring(1);
            if (str.charAt(str.length() - 1) == 'x')
                answer = answer.substring(0, answer.length() - 1);
        }
        return answer;
    }

    public String withoutX2(String str) {
        String answer = "";
        if (str.length() > 0) {
            if (str.length() > 1) {
                if (str.charAt(0) != 'x')
                    answer += str.charAt(0);
                if (str.charAt(1) != 'x')
                    answer += str.substring(1);
                else answer += str.substring(2);
            }
            else if (str.charAt(0) != 'x')
                answer += str;
        }
        return answer;
    }


}
