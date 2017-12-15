package com.epam.CodingBat;

/**
 * Created by User on 07.12.2017.
 */
public class Array3 {
    public int maxSpan(int[] nums) {
        int[] span = new int[nums.length];
        int max = 0;
        for (int i = 0; i < nums.length; i++)
            for (int j = i; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    span[i] = j - i + 1;
                }
            }
        for (int i = 0; i < nums.length; i++) {
            if (span[i] > max)
                max = span[i];
        }
        return max;
    }

    public int[] fix34(int[] nums) {
        int i = 0;

        while (i < nums.length && nums[i] != 3)
            i++;

        int j = i + 1;

        while (j < nums.length && nums[j] != 4)
            j++;

        while (i < nums.length) {
            if (nums[i] == 3) {
                int temp = nums[i + 1];
                nums[i + 1] = nums[j];
                nums[j] = temp;

                while (j < nums.length && nums[j] != 4)
                    j++;
            }
            i++;
        }

        return nums;
    }

    public int[] fix45(int[] nums) {
        int i = 0;
        int j = 0;
        int tmp;
        while (nums[i] != 5 && i < nums.length) {
            i++;
        }
        while (j < nums.length) {
            if (nums[j] == 4) {
                tmp = nums[j + 1];
                nums[j + 1] = 5;
                nums[i] = tmp;
                while ((i < nums.length && nums[i] != 5) || i == j + 1)
                    i++;
            }
            j++;
        }
        return nums;
    }

    public boolean canBalance(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        int sum1 = 0;
        int sum = 0;
        for (int k = 0; k < nums.length; k++) {
            sum += nums[k];
        }
        if (sum % 2 == 1)
            return false;
        else {
            while (i < nums.length) {
                sum1 += nums[i];
                if (sum1 == sum / 2)
                    return true;
                i++;
            }
        }
        return false;
    }

    public boolean linearIn(int[] outer, int[] inner) {
        int k = 0;
        for (int i = 0; i < outer.length; i++) {
            if (k < inner.length && outer[i] == inner[k])
                k++;
        }
        return (k == inner.length);
    }

    public int[] squareUp(int n) {
        int[] answer = new int[n * n];
        int k = 1;
        int i = 0;
        while (i < answer.length) {
            for (int j = 0; j < n; j++) {
                if (k < n - j)
                    answer[i + j] = 0;
                else answer[i + j] = n - j;
            }
            i += n;
            k++;
        }
        return answer;
    }

    public int[] seriesUp(int n) {
        int[] answer = new int[n * (n + 1) / 2];
        int k = 1;
        int i = 0;
        while (i < answer.length) {
            for (int j = 0; j < k; j++) {
                answer[i + j] = j;
            }
            i += k;
            k++;
        }
        return answer;
    }

    public int maxMirror(int[] nums) {
        int max = 0;
        int tmp;
        for (int i = 0; i < nums.length; i++) {
            tmp = 0;
            for (int j = nums.length - 1; j > 0 && i + tmp < nums.length; j--) {
                if (nums[i] == nums[j]) {
                    tmp++;
                } else max = Math.max(max, tmp);
            }
        }
        return max;
    }

    public int countClumps(int[] nums) {
        int answer = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == nums[i + 1]) {
                i++;
                answer++;
                while (i < nums.length && nums[i] == nums[i + 1])
                    i++;
            }
        }
        return answer;
    }
}
