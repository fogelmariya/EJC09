package com.epam.CodingBat;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 16.12.2017.
 */
public class Fuctional1 {
    public List<Integer> doubling(List<Integer> nums) {
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < nums.size(); i++) {
            answer.add(nums.get(i) * 2);
        }
        return answer;
    }

    public List<Integer> square(List<Integer> nums) {
        nums.replaceAll(n -> n * n);
        return nums;
    }

    public List<String> addStar(List<String> strings) {
        strings.replaceAll(n -> n + "*");
        return strings;
    }

    public List<String> copies3(List<String> strings) {
        strings.replaceAll(n -> n + n + n);
        return strings;
    }

    public List<String> moreY(List<String> strings) {
        strings.replaceAll(n -> "y" + n + "y");
        return strings;
    }

    public List<Integer> math1(List<Integer> nums) {
        nums.replaceAll(n -> (n + 1) * 10);
        return nums;
    }

    public List<Integer> rightDigit(List<Integer> nums) {
        nums.replaceAll(n -> n % 10);
        return nums;
    }

    public List<String> lower(List<String> strings) {
        strings.replaceAll(n -> n.toLowerCase());
        return strings;
    }

    public List<String> noX(List<String> strings) {
        List<String> answer = new ArrayList<>();
        for (String string : strings) {
            if (string.contains("x")) {
                while (string.contains("x")) {
                    string = string.substring(0, string.indexOf("x")) +
                            string.substring(string.indexOf("x") + 1, string.length());
                }
                answer.add(string);
            } else answer.add(string);
        }
        return answer;
    }

    public List<Integer> noNeg(List<Integer> nums) {
        nums.removeIf(n -> n < 0);
        return nums;
    }

    public List<Integer> no9(List<Integer> nums) {
        nums.removeIf(n -> n % 10 == 9);
        return nums;
    }

    public List<Integer> noTeen(List<Integer> nums) {
        nums.removeIf(n -> n >= 13 && n <= 19);
        return nums;
    }

    public List<String> noLong(List<String> strings) {
        strings.removeIf(n -> n.length() >= 4);
        return strings;
    }

    public List<String> noZ(List<String> strings) {
        strings.removeIf(n -> n.contains("z"));
        return strings;
    }

    public List<String> no34(List<String> strings) {
        strings.removeIf(n -> n.length() == 4 || n.length() == 3);
        return strings;
    }

    public List<String> noYY(List<String> strings) {
        strings.replaceAll(n -> n + "y");
        strings.removeIf(n -> n.contains("yy"));
        return strings;
    }

    public List<Integer> two2(List<Integer> nums) {
        Object object = new Object();
        nums.replaceAll(n -> n * 2);
        nums.removeIf(n -> n % 10 == 2);
        return nums;
    }

    public List<Integer> square56(List<Integer> nums) {
        nums.replaceAll(n -> n * n + 1);
        nums.removeIf(n -> n % 10 == 5 || n % 10 == 6);
        return nums;
    }



}
