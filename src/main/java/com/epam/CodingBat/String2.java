package com.epam.CodingBat;

/**
 * Created by User on 06.12.2017.
 */
public class String2 {
    public String doubleChar(String str) {
        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            answer += str.substring(i, i + 1) + str.substring(i, i + 1);
        }
        return answer;
    }

    public int countHi(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).equals("hi"))
                count++;
        }
        return count;
    }

    public boolean catDog(String str) {
        int countcat = 0;
        int countdag = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 3).equals("cat"))
                countcat++;
            if (str.substring(i, i + 3).equals("dog"))
                countdag++;
        }
        return (countcat == countdag);
    }

    public int countCode(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 3; i++) {
            if (str.substring(i, i + 2).equals("co") && str.substring(i + 3, i + 4).equals("e"))
                count++;
        }
        return count;
    }

    public boolean endOther(String a, String b) {
        int length = Math.min(a.length(), b.length());
        if (length == a.length()) {
            if (b.substring(b.length() - length, b.length()).toLowerCase().equals(a.toLowerCase()))
                return true;
            else return false;
        } else if (a.substring(a.length() - length, a.length()).toLowerCase().equals(b.toLowerCase()))
            return true;
        else return false;
    }

    public boolean xyzThere(String str) {
        boolean flag1 = false;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 3).equals("xyz")) {
                if (i > 0) {
                    if (!str.substring(i - 1, i).equals("."))
                        flag1 = true;
                } else flag1 = true;
            }
        }
        return flag1;
    }

    public boolean bobThere(String str) {
        boolean answer = false;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 1).equals("b") && str.substring(i + 2, i + 3).equals("b"))
                answer = true;
        }
        return answer;
    }

    public boolean xyBalance(String str) {
        if (str.length() > 0) {
            for (int i = 0; i < str.length(); i++) {
                if (str.contains("x")) {
                    if (str.substring(str.lastIndexOf("x"), str.length()).contains("y"))
                        return true;
                } else return true;
            }
            return false;
        } else return true;
    }

    public String mixString(String a, String b) {
        String answer = "";
        String max;
        String min;
        if (a.length() > b.length()) {
            max = a;
            min = b;
        } else {
            max = b;
            min = a;
        }
        {
            for (int i = 0; i < max.length(); i++) {
                if (i < min.length()) {
                    answer += a.substring(i, i + 1);
                    answer += b.substring(i, i + 1);
                } else answer += max.substring(i, i + 1);
            }
        }
        return answer;
    }

    public String repeatEnd(String str, int n) {
        String answer = "";
        for (int i = 0; i < n; i++) {
            answer += str.substring(str.length() - n, str.length());
        }
        return answer;
    }

    public String repeatFront(String str, int n) {
        String answer = "";
        for (int i = 0; i < n; i++) {
            answer += str.substring(0, n - i);
        }
        return answer;
    }

    public String repeatSeparator(String word, String sep, int count) {
        String answer = "";
        for (int i = 0; i < count; i++) {
            if (i != count - 1)
                answer += word + sep;
            else answer += word;
        }
        return answer;
    }

    public boolean prefixAgain(String str, int n) {
        return (str.substring(n).contains(str.substring(0, n)));
    }

    public boolean xyzMiddle(String str) {
        boolean answer = false;
        if (str.contains("xyz")) {
            for (int i = 0; i < str.length(); i++) {
                if (str.substring(i, i + 3).equals("xyz"))
                    if (Math.abs(-2 * i + str.length() - 3) <= 1)
                        answer = true;
            }
        }
        return answer;
    }

    public String getSandwich(String str) {
        if (str.contains("bread")) {
            if (str.indexOf("bread") != str.lastIndexOf("bread"))
                return str.substring(str.indexOf("bread") + 5, str.lastIndexOf("bread"));
            else return "";
        } else return "";
    }

    public boolean sameStarChar(String str) {
        for (int i = 1; i < str.length() - 1; i++) {
            if (str.substring(i, i + 1).equals("*"))
                if (!str.substring(i - 1, i).equals(str.substring(i + 1, i + 2)))
                    return false;
        }
        return true;
    }

    public String oneTwo(String str) {
        String answer = "";
        for (int i = 0; i < str.length() - str.length() % 3; i++) {
            if (i % 3 == 0) {
                answer += str.substring(i + 1, i + 3) + str.substring(i, i + 1);
                i += 2;
            }
        }
        return answer;
    }

    public String zipZap(String str) {
        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            if (i < str.length() - 2) {
                if (str.substring(i, i + 1).equals("z") && str.substring(i + 2, i + 3).equals("p")) {
                    answer += "zp";
                    i += 2;
                } else answer += str.substring(i, i + 1);
            } else answer += str.substring(i, i + 1);
        }
        return answer;
    }

    public String starOut(String str) {
        if (str.length() < 1)
            return "";

        if (str.length() == 1) {
            if (str.charAt(0) == '*')
                return "";
            else
                return str;
        }

        char[] arr = new char[str.length()];
        int count = 0;


        if (str.charAt(0) != '*' && str.charAt(1) != '*') {
            arr[count] = str.charAt(0);
            count++;
        }

        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i - 1) != '*' && str.charAt(i) != '*' &&
                    str.charAt(i + 1) != '*') {
                arr[count] = str.charAt(i);
                count++;
            }
        }

        if (str.charAt(str.length() - 1) != '*' &&
                str.charAt(str.length() - 2) != '*') {
            arr[count] = str.charAt(str.length() - 1);
            count++;
        }

        return new String(arr, 0, count);
    }

    public String plusOut(String str, String word) {
        String answer = "";
        int length = word.length();
        for (int i = 0; i < str.length(); i++) {
            if (i <= str.length() - length) {
                if (str.substring(i, i + length).equals(word)) {
                    answer += word;
                    i += length - 1;
                } else answer += "+";
            } else answer += "+";
        }
        return answer;
    }

    public String wordEnds(String str, String word) {
        String answer = "";
        for (int i = 0; i < str.length() - word.length() + 1; i++) {
            if (str.substring(i, i + word.length()).equals(word)) {
                if (i >= 1) {
                    answer += str.substring(i -1, i);
                }
                if (i <= str.length() - word.length() - 1)
                    answer += str.substring(i + word.length(), i + word.length() + 1);
            }
        }
        return answer;
    }

}
