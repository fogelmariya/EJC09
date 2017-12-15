package com.epam.CodingBat;


public class Array1 {
    public boolean firstLast6(int[] nums) {
        if (nums[0] == 6 || nums[nums.length - 1] == 6)
            return true;
        else return false;
    }

    public boolean sameFirstLast(int[] nums) {
        return (nums.length > 1 && nums[0] == nums[nums.length - 1]);
    }

    public int[] makePi() {
        return new int[]{3, 1, 4};
    }

    public boolean commonEnd(int[] a, int[] b) {
        return (a[0] == b[0] || a[a.length - 1] == b[b.length - 1]);
    }

    public int sum3(int[] nums) {
        return nums[0] + nums[1] + nums[2];
    }

    public int[] rotateLeft3(int[] nums) {
        return new int[]{nums[1], nums[2], nums[0]};
    }

    public int[] reverse3(int[] nums) {
        return new int[]{nums[2], nums[1], nums[0]};
    }

    public int[] maxEnd3(int[] nums) {
        return new int[]{Math.max(nums[0], nums[2]), Math.max(nums[0], nums[2]), Math.max(nums[0], nums[2])};
    }

    public int sum2(int[] nums) {
        if (nums.length == 0)
            return 0;
        else if (nums.length == 1)
            return nums[0];
        else return nums[0] + nums[1];
    }

    public int[] middleWay(int[] a, int[] b) {
        return new int[]{a[1], b[1]};
    }

    public int[] makeEnds(int[] nums) {
        return new int[]{nums[0], nums[nums.length - 1]};
    }

    public boolean has23(int[] nums) {
        return (nums[0] == 2 || nums[0] == 3 || nums[1] == 2 || nums[1] == 3);
    }

    public boolean no23(int[] nums) {
        return (nums[0] != 2 && nums[0] != 3 && nums[1] != 2 && nums[1] != 3);
    }

    public int[] makeLast(int[] nums) {
        int[] answer = new int[nums.length * 2];
        for (int i = 0; i < answer.length; i++) {
            if (i < nums.length)
                answer[i] = 0;
            else answer[i] = nums[i - nums.length];
        }
        return answer;
    }

    public boolean double23(int[] nums) {
        if (nums.length == 0 || nums.length == 1)
            return false;
        else if ((nums[0] == nums[1] && (nums[0] == 2 || nums[0] == 3)))
            return true;
        else return false;
    }

    public int[] fix23(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 3)
                nums[i + 1] = 0;
        }
        return nums;
    }

    public int start1(int[] a, int[] b) {
        int answer = 0;
        if (a.length > 0)
            if (a[0] == 1)
                answer++;
        if (b.length > 0)
            if (b[0] == 1)
                answer++;
        return answer;
    }

    public int[] biggerTwo(int[] a, int[] b) {
        if (a[0] + a[1] >= b[0] + b[1])
            return a;
        else return b;
    }

    public int[] makeMiddle(int[] nums) {
        int[] answer = new int[2];
        answer[0] = nums[nums.length / 2 - 1];
        answer[1] = nums[nums.length / 2];
        return answer;
    }

    public int[] plusTwo(int[] a, int[] b) {
        return new int[]{a[0], a[1], b[0], b[1]};
    }

    public int[] swapEnds(int[] nums) {
        int[] answer = new int[nums.length];
        answer[0] = nums[nums.length - 1];
        answer[answer.length - 1] = nums[0];
        for (int i = 1; i < nums.length - 1; i++) {
            answer[i] = nums[i];
        }
        return answer;
    }

    public int[] midThree(int[] nums) {
        int[] answer = new int[3];
        answer[0] = nums[(nums.length - 3) / 2];
        answer[1] = nums[(nums.length - 3) / 2 + 1];
        answer[2] = nums[(nums.length - 3) / 2 + 2];
        return answer;
    }

    public int maxTriple(int[] nums) {
        return Math.max(Math.max(nums[0], nums[nums.length]), nums[nums.length / 2]);
    }

    public int[] frontPiece(int[] nums) {
        if (nums.length == 1)
            return new int[]{nums[0]};
        if (nums.length == 0)
            return new int[]{};
        else return new int[]{nums[0], nums[1]};
    }

    public boolean unlucky1(int[] nums) {
        if (nums.length > 2) {
            return ((nums[0] == 1 && nums[1] == 3) || (nums[1] == 1 && nums[2] == 3) ||
                    (nums[nums.length - 2] == 1 && nums[nums.length - 1] == 3));
        } else if (nums.length == 1 || nums.length == 0)
            return false;
        else return (nums[0] == 1 && nums[1] == 3);
    }

    public int[] make2(int[] a, int[] b) {
        int[] answer = new int[2];
        if (a.length > 0) {
            answer[0] = a[0];
            if (a.length > 1)
                answer[1] = a[1];
            else answer[1] = b[0];
        } else {
            answer[0] = b[0];
            answer[1] = b[1];
        }
        return answer;
    }

    public int[] front11(int[] a, int[] b) {
        int[] answer = new int[2];
        if (a.length > 0)
            if (b.length > 0)
                return new int[]{a[0], b [0]};
        else return new int[]{a[0]};
        else if (b.length > 0)
            return new int[]{b[0]};
        else return new int[]{};
    }

}
