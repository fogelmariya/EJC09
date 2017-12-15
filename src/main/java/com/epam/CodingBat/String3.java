package com.epam.CodingBat;

/**
 * Created by User on 11.12.2017.
 */
public class String3 {
    public int countYZ(String str) {
        int answer = 0;
        for (int i = 0; i < str.length(); i++) {
            if (i < str.length() - 1)
                if (!Character.isLetter(str.charAt(i + 1)) && (str.substring(i, i + 1).toLowerCase().equals("y")
                        || str.substring(i, i + 1).toLowerCase().equals("z")))
                    answer++;
            if (i == str.length() - 1 && (str.substring(i, i + 1).toLowerCase().equals("y")
                    || str.substring(i, i + 1).toLowerCase().equals("z")))
                answer++;
        }
        return answer;
    }

    public String withoutString(String base, String remove) {
        String answer = "";
        for (int i = 0; i < base.length(); i++) {
            if (i < base.length() - remove.length() + 1)
                if (base.substring(i, i + remove.length()).toLowerCase().equals(remove.toLowerCase()))
                    i += remove.length() - 1;
                else answer += base.substring(i, i + 1);
            else answer += base.substring(i, i + 1);
        }
        return answer;
    }

    public boolean equalIsNot(String str) {
        int countIs = 0;
        int countNot = 0;
        for (int i = 0; i < str.length(); i++) {
            if (i < str.length() - 1)
                if (str.substring(i, i + 2).equals("is"))
                    countIs++;
            if (i < str.length() - 2)
                if (str.substring(i, i + 3).equals("not"))
                    countNot++;
        }
        return countIs == countNot;
    }

    public boolean gHappy(String str) {
        if (str.length() > 1) {
            for (int i = 0; i < str.length(); i++) {
                if (i >= 1 && i < str.length() - 1)
                    if (str.charAt(i) == 'g')
                        if (str.charAt(i - 1) != 'g' && str.charAt(i + 1) != 'g')
                            return false;
                if (str.charAt(0) == 'g' && str.charAt(1) != 'g')
                    return false;
                if (str.charAt(str.length() - 1) == 'g' && str.charAt(str.length() - 2) != 'g')
                    return false;
            }
        } else if (str.length() == 1)
            return false;
        return true;
    }

    public int countTriple(String str) {
        int answer = 0;
        if (str.length() < 3)
            return 0;
        else {
            for (int i = 0; i < str.length() - 3; i++) {
                if (str.charAt(i) == str.charAt(i + 1) && str.charAt(i) == str.charAt(i + 2)) {
                    answer++;
                }
            }
        }
        return answer;
    }

    public int sumDigits(String str) {
        int answer = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i)))
                answer += Integer.parseInt(str.substring(i, i + 1));
        }
        return answer;
    }

    public String sameEnds(String string) {
        int start = (int) Math.ceil((double) string.length() / 2);
        int end = string.length() / 2;

        System.out.println(start + " " + end);
        for (int i = 0; i < string.length() / 2; i++) {
            if (string.substring(0, end).equals(string.substring(start))) {
                return string.substring(0, end);
            } else {
                start++;
                end--;
            }
        }

        return "";
    }

    public String mirrorEnds(String string) {
        String answer = "";
        int count = 1;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == string.charAt(string.length() - i - 1)) {
                while (i < string.length() && string.charAt(i) == string.charAt(string.length() - i - 1)) {
                    i++;
                    count++;
                }
                answer += string.substring(0, count - 1);
                i = string.length();
            }
        }
        return answer;
    }

    public int maxBlock(String str) {
        int answer = 0;
        int max = 1;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                answer += 2;
                i++;
                while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                    answer++;
                    i++;
                }
                max = Math.max(max, answer);
                answer = 0;
            }
        }
        if (str.length() == 0)
            return 0;
        else
            return max;
    }

    public int sumNumbers(String str) {
        int answer = 0;
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                while (i < str.length() && Character.isDigit(str.charAt(i))) {
                    count++;
                    i++;
                }
                answer += Integer.parseInt(str.substring(i - count, i));
            }
        }
        return answer;
    }

    public String notReplace(String str) {
        String answer = "";
        if (str.length() >= 2) {
            for (int i = 0; i < str.length(); i++) {
                if (i < str.length() - 1) {
                    if (str.substring(i, i + 2).equals("is") &&
                            (i == 0 || !Character.isLetter(str.charAt(i - 1)))
                            && (i == str.length() - 2 ||!Character.isLetter(str.charAt(i + 2)))) {
                        answer += "is not";
                        i++;
                    } else answer += str.substring(i, i + 1);
                } else answer += str.substring(i, i + 1);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String3 string3 = new String3();
        string3.sameEnds("abXab");
    }
}
