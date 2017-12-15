package com.epam.CodingBat;


public class WarmUp2 {
    public String stringTimes(String str, int n) {
        String answer = "";
        for (int i = 0; i < n; i++) {
            answer += str;
        }
        return answer;
    }

    public String frontTimes(String str, int n) {
        String answer = "";
        String beginning = "";
        if (str.length() <= 3) {
            for (int i = 0; i < n; i++) {
                answer += str;
            }
        } else {
            beginning = str.substring(0, 3);
            for (int i = 0; i < n; i++) {
                answer += beginning;
            }
        }
        return answer;
    }

    int countXX(String str) {
        int answer = 0;
        int index;
        while (str.contains("xx")) {
            index = str.indexOf("xx");
            str = str.substring(index + 1);
            answer++;
        }
        return answer;
    }

    boolean doubleX(String str) {
        int index;
        String tmp;
        if (str.contains("x")) {
            index = str.indexOf("x");
            str = str.substring(index + 1);
            System.out.println(str);
            if (str.contains("x")) {
                if (str.indexOf("x") == 0)
                    return true;
                else return false;
            } else return false;
        } else return false;
    }

    public String stringSplosion(String str) {
        int n = str.length();
        String answer = "";
        for (int i = 0; i < n; i++) {
            answer += str.substring(0, i);
        }
        return answer;
    }

    public int last2(String str) {
        int answer = 0;
        if (str.length() < 2)
            return 0;
        else {
            String last = str.substring(str.length() - 2);
            for (int i = 0; i < str.length() - 4; i++) {
                if (str.substring(i, i + 2).equals(last))
                    answer++;
            }
        }
        return answer;
    }

    public int arrayCount9(int[] nums) {
        int answer = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 9)
                answer++;
        }
        return answer;
    }

    public boolean arrayFront9(int[] nums) {
        int param;
        boolean flag = false;
        if (nums.length < 4)
            param = nums.length;
        else param = 4;
        for (int i = 0; i < param; i++) {
            if (nums[i] == 9)
                flag = true;
        }
        return flag;
    }

    public boolean array123(int[] nums) {
        boolean answer = false;
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3) {
                answer = true;
            }
        }
        return answer;
    }

    public int stringMatch(String a, String b) {
        int length = Math.min(a.length(), b.length());
        int answer = 0;
        for (int i = 0; i < length - 1; i++) {
            String Sub1 = a.substring(i, i + 2);
            String Sub2 = b.substring(i, i + 2);
            if (Sub1.equals(Sub2)) {
                answer++;
            }
        }
        return answer;
    }

    public String stringX(String str) {
        String tmp = "";
        int index;
        for (int i = 0; i < str.length(); i++) {
            if ((i == 0 || i == str.length()))
                tmp += str.substring(i, i + 1);
            else if (!(str.substring(i, i + 1).equals("x")))
                tmp += str.substring(i, i + 1);
        }
        return tmp;
    }

    public String altPairs(String str) {
        String anwser = "";
        for (int i = 0; i < str.length(); i++) {
            if (i % 4 == 0 || i % 4 == 1)
                anwser += str.substring(i, i + 1);
        }
        return anwser;
    }

    public String stringYak(String str) {
        String answerr = "";

        for (int i = 0; i < str.length(); i++) {
            if (i + 2 < str.length() && str.substring(i, i + 1).equals("y") && str.substring(i + 2, i + 3).equals("k")) {
                i = i + 2;
            } else {
                answerr += str.substring(i, i + 1);
            }
        }

        return answerr;
    }

    public int array667(int[] nums) {
        int answer = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 6 && (nums[i + 1] == 6 || nums[i + 1] == 7))
                answer ++;
        }
        return answer;
    }

    public boolean noTriples(int[] nums) {
        boolean answer = true;
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == nums [i + 1] && nums [i + 1] == nums[i + 2])
                answer = false;
        }
        return answer;
    }

    public boolean has271(int[] nums) {
        boolean answer = false;
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == nums [i + 1] - 5 && (Math.abs(nums[i] - nums[i + 2]) <= 2))
                answer = true;
        }
        return answer;
    }


    public static void main(String[] args) {
        WarmUp2 warmUp2 = new WarmUp2();
        System.out.println(warmUp2.stringYak("pakyak"));
    }
}
