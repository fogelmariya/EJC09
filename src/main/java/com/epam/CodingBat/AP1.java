package com.epam.CodingBat;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 10.12.2017.
 */
public class AP1 {
    public boolean scoresIncreasing(int[] scores) {
        for (int i = 0; i < scores.length - 1; i++) {
            if (scores[i + 1] < scores[i])
                return false;
        }
        return true;
    }

    public boolean scores100(int[] scores) {
        for (int i = 0; i < scores.length - 1; i++) {
            if (scores[i] == scores[i + 1] && scores[i] == 100)
                return true;
        }
        return false;
    }

    public boolean scoresClump(int[] scores) {
        for (int i = 0; i < scores.length - 2; i++) {
            if (Math.abs(scores[i] - scores[i + 1]) <= 2 && Math.abs(scores[i + 2] - scores[i + 1]) <= 2 &&
                    Math.abs(scores[i + 2] - scores[i]) <= 2)
                return true;
        }
        return false;
    }

    public int scoresAverage(int[] scores) {
        int average1 = 0;
        int average2 = 0;
        for (int i = 0; i < scores.length; i++) {
            if (i < scores.length / 2)
                average1 += scores[i];
            else average2 += scores[i];
        }
        return Math.max(average1, average2) * 2 / scores.length;
    }

    public int wordsCount(String[] words, int len) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() == len)
                count++;
        }
        return count;
    }

    public String[] wordsFront(String[] words, int n) {
        String[] answer = new String[n];
        for (int i = 0; i < n; i++) {
            answer[i] = words[i];
        }
        return answer;
    }

    public List wordsWithoutList(String[] words, int len) {
        List list = new ArrayList();
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() != len)
                list.add(words[i]);
        }
        return list;
    }

    public boolean hasOne(int n) {
        if (n / 1000 == 1)
            return true;
        if (n / 100 % 10 == 1)
            return true;
        if (n / 100 == 1)
            return true;
        if (n % 10 == 1)
            return true;
        if (n / 10 % 10 == 1)
            return true;
        return false;
    }

    public boolean dividesSelf(int n) {
        if ((n % 10 == 0) || n % (n % 10) != 0)
            return false;
        if (n > 10 && n < 100)
            if (n % (n / 10) != 0)
                return false;
        if (n > 100 && n < 1000)
            if (n % (n / 100) != 0)
                return false;
        if (n % (n / 10 % 10) != 0)
            return false;
        return true;
    }

    public int[] copyEvens(int[] nums, int count) {
        int[] answer = new int[count];
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (k < count && nums[i] % 2 == 0) {
                answer[k] = nums[i];
                k++;
            }
        }
        return answer;
    }

    public int[] copyEndy(int[] nums, int count) {
        int[] answer = new int[count];
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (k < count && (nums[i] >= 0 && nums[i] <= 10 || nums[i] >= 90 && nums[i] <= 100)) {
                answer[k] = nums[i];
                k++;
            }
        }
        return answer;
    }

    public int matchUp(String[] a, String[] b) {
        int answer = 0;
        for (int i = 0; i < Math.min(a.length, b.length); i++) {
            if (a[i].length() != 0 && b[i].length() != 0 && a[i].substring(0, 1).equals(b[i].substring(0, 1)) && b[i].length() != 0)
                answer++;
        }
        return answer;
    }

    public int scoreUp(String[] key, String[] answers) {
        int answer = 0;
        for (int i = 0; i < Math.min(key.length, answers.length); i++) {
            if (key[i].equals(answers[i]))
                answer += 4;
            else if (!answers[i].equals("?"))
                answer--;
        }
        return answer;
    }

    public String[] wordsWithout(String[] words, String target) {
        List answer = new ArrayList();
        for (int i = 0; i < words.length; i++) {
            if (!words[i].equals(target))
                answer.add(words[i]);
        }
        String[] ansswer = new String[answer.size()];
        for (int i = 0; i < ansswer.length; i++) {
            ansswer[i] = (String) answer.get(i);
        }
        return ansswer;
    }

    public int scoresSpecial(int[] a, int[] b) {
        int max1 = 0;
        int max2 = 0;
        for (int i = 0; i < Math.max(a.length, b.length); i++) {
            if (i < a.length)
                if (a[i] % 10 == 0)
                    max1 = Math.max(max1, a[i]);
            if (i < b.length)
                if (b[i] % 10 == 0)
                    max2 = Math.max(max2, b[i]);
        }
        return max1 + max2;
    }

    public int sumHeights2(int[] heights, int start, int end) {
        int sum = 0;
        for (int i = start; i < end; i++) {
            if (heights[i] >= heights[i + 1])
                sum += 2 * Math.abs(heights[i] - heights[i + 1]);
            else
                sum += Math.abs(heights[i] - heights[i + 1]);
        }
        return sum;
    }

    public int bigHeights(int[] heights, int start, int end) {
        int answer = 0;
        for (int i = start; i < end; i++) {
            if (Math.abs(heights[i] - heights[i + 1]) >= 5)
                answer++;
        }
        return answer;
    }

    public int userCompare(String aName, int aId, String bName, int bId) {
        if (aName.compareTo(bName) > 0)
            return 1;
        else if (aName.compareTo(bName) < 0)
            return -1;
        else if (aId > bId)
            return -1;
        else if (aId < bId)
            return 1;
        else return 0;
    }

    public String[] mergeTwo(String[] a, String[] b, int n) {
        String[] answer = new String[n];
        int k = 0;
        int l = 0;
        for (int i = 0; i < n; i++) {
            if (a[k].compareTo(b[l]) < 0) {
                answer[i] = a[k];
                k++;
            } else if (a[k].compareTo(b[l]) > 0) {
                answer[i] = b[l];
                l++;
            } else {
                answer[i] = a[k];
                l++;
                k++;
            }
        }
        return answer;
    }

    public int commonTwo(String[] a, String[] b) {
        int answer = 0;
        int k = 0;
        int l = 0;
        if(a[0].equals(b[0])) {
            answer++;
            k++;
            l++;
        } else if(a[0].compareTo(b[0]) < 0) {
            k++;
        } else {
            l++;
        }
       while (k < a.length && l < b.length) {
           if(k > 0 && a[k-1].equals(a[k])) {
               k++;
           }else
           if (a[k].compareTo(b[l]) < 0) {
                   k++;
           } else if (a[k].compareTo(b[l]) > 0) {
                   l++;
           } else if (a[k].equals(b[l])) {
               answer++;
                   k++;
                   l++;
           }
       }
           return answer;
    }


    public static void main(String[] args) {
        AP1 ap1 = new AP1();
        System.out.println(ap1.scoresAverage(new int[]{5, 4}));
    }

}
