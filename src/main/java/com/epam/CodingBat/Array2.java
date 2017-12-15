package com.epam.CodingBat;


public class Array2 {
    public int countEvens(int[] nums) {
        int answer = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0)
                answer++;
        }
        return answer;
    }

    public int bigDiff(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (Math.max(max, nums[i]) == nums[i])
                max = nums[i];
            if (Math.min(min, nums[i]) == nums[i])
                min = nums[i];
        }
        return max - min;
    }

    public int centeredAverage(int[] nums) {
        int max = 0;
        int min = 0;
        int sum = 0;
        boolean flagmin = false;
        boolean flagmax = false;
        for (int i = 0; i < nums.length; i++) {
            if (Math.max(nums[max], nums[i]) == nums[i])
                max = i;
            if (Math.min(nums[min], nums[i]) == nums[i])
                min = i;
        }

        for (int i = 0; i < nums.length; i++) {
            if (i != max && i != min)
                sum += nums[i];
        }
        if (max != min)
            return sum / (nums.length - 2);
        else return nums[max];
    }

    public int sum13(int[] nums) {
        int sum = 0;
        if (nums.length > 0) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != 13)
                    sum += nums[i];
                else i += 1;
            }
        }
        return sum;
    }

    public int sum67(int[] nums) {
        int sum = 0;
        if (nums.length > 0) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 6) {
                    while (nums[i] != 7)
                        i++;
                } else
                    sum += nums[i];
            }
        }
        return sum;
    }

    public boolean has22(int[] nums) {
        boolean answer = false;
        for (int i = 0; i < nums.length; i++) {
            if (i < nums.length - 1)
                if (nums[i] == 2 && nums[i + 1] == 2)
                    answer = true;
        }
        return answer;
    }

    public boolean lucky13(int[] nums) {
        boolean answer = true;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1 || nums[i] == 3)
                answer = false;
        }
        return answer;
    }

    public boolean sum28(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2)
                sum += 2;
        }
        return (sum == 8);
    }

    public boolean more14(int[] nums) {
        int sum1 = 0;
        int sum4 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1)
                sum1++;
            if (nums[i] == 4)
                sum4++;
        }
        return (sum1 > sum4);
    }

    public int[] fizzArray(int n) {
        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            answer[i] = i;
        }
        return answer;
    }

    public boolean only14(int[] nums) {
        boolean answer = true;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 4 && nums[i] != 1)
                answer = false;
        }
        return answer;
    }

    public String[] fizzArray2(int n) {
        String[] answer = new String[n];
        for (int i = 0; i < n; i++) {
            answer[i] = String.valueOf(i);
        }
        return answer;
    }

    public boolean no14(int[] nums) {
        boolean answer = true;
        int flag1 = 0;
        int flag4 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1)
                if (flag4 == 0)
                    flag1 = 1;
                else flag1 = 2;
            if (nums[i] == 4)
                if (flag1 == 0)
                    flag4 = 1;
                else flag4 = 2;
        }
        if (flag1 == 2 || flag4 == 2)
            answer = false;
        return answer;
    }

    public boolean isEverywhere(int[] nums, int val) {
        boolean answer = true;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != val && nums[i + 1] != val)
                answer = false;
        }
        return answer;
    }

    public boolean either24(int[] nums) {
        int flag2 = 0;
        int flag4 = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 2)
                flag2 = 1;
            if (nums[i] == 4 && nums[i + 1] == 4)
                flag4 = 1;
        }
        if (flag2 + flag4 == 1)
            return true;
        else return false;
    }

    public int matchUp(int[] nums1, int[] nums2) {
        int answer = 0;
        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] != nums2[i] && Math.abs(nums1[i] - nums2[i]) <= 2)
                answer++;
        }
        return answer;
    }

    public boolean has77(int[] nums) {
        boolean answer = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums.length > 1) {
                if (i < nums.length - 2) {
                    if (nums[i] == 7 && (nums[i + 1] == 7 || nums[i + 2] == 7))
                        answer = true;
                } else if (nums[nums.length - 2] == 7 && nums[nums.length - 1] == 7)
                    answer = true;
            }
        }
        return answer;
    }

    public boolean has12(int[] nums) {
        boolean answer = false;
        int flag = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1)
                flag = 1;
            if (flag == 1 && nums[i] == 2)
                answer = true;
        }
        return answer;
    }

    public boolean modThree(int[] nums) {
        boolean answer = false;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] % 2 == nums[i + 1] % 2 && nums[i] % 2 == nums[i + 2] % 2)
                answer = true;
        }
        return answer;
    }

    public boolean haveThree(int[] nums) {
        boolean answer = true;
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 3)
                count++;
            if (nums[i] == 3 && nums[i + 1] == 3)
                answer = false;
        }
        if (nums[nums.length - 1] == 3)
            count++;
        if (count == 3 && answer == true)
            return true;
        else return false;
    }

    public boolean twoTwo(int[] nums) {
        boolean answer = true;
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] == 2)
                if (nums[i + 1] != 2 && nums[i - 1] != 2)
                    answer = false;
        }
        if (nums.length == 1 && nums[0] == 2)
            answer = false;
        if (nums.length > 1) {
            if (nums[nums.length] == 2 && nums[nums.length - 1] != 2)
                answer = false;
            if (nums[0] == 2 && nums[1] != 2)
                answer = false;
        }
        return answer;
    }

    public boolean sameEnds(int[] nums, int len) {
        if (len == 0)
            return true;
        else {
            for (int i = 0; i < len; i++) {
                if (nums[i] != nums[nums.length - len + i])
                    return false;
            }
        }
        return true;
    }

    public boolean tripleUp(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == nums[i + 1] - 1 && nums[i + 1] == nums[i + 2] - 1)
                return true;
        }
        if (nums.length > 2)
            if (nums[nums.length] == nums[nums.length - 1] + 1 &&
                    nums[nums.length - 1] == nums[nums.length - 2] + 1)
                return true;
        return false;
    }

    public int[] fizzArray3(int start, int end) {
        int[] answer = new int[end - start];
        for (int i = 0; i < end - start; i++) {
            answer[i] = i + start;
        }
        return answer;
    }

    public int[] shiftLeft(int[] nums) {
        int[] answer = new int[nums.length];
        for (int i = 0; i < nums.length - 1; i++) {
            answer[i] = nums[i + 1];
        }
        if (nums.length > 0)
            answer[answer.length - 1] = nums[0];
        return answer;
    }

    public int[] tenRun(int[] nums) {
        int[] answer = new int[nums.length];
        if (nums.length > 0) {
            int tmp = nums[0];
            int flag = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] % 10 == 0) {
                    tmp = nums[i];
                    answer[i] = tmp;
                    flag = 1;
                } else if (flag == 1)
                    answer[i] = tmp;
                else answer[i] = nums[i];
            }
        }
        return answer;
    }

    public int[] pre4(int[] nums) {
        int[] tmp = new int[nums.length];
        int[] answer;
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != 4) {
                tmp[i] = nums[i];
                count++;
            } else i = nums.length - 1;
        }
        answer = new int[count];
        for (int i = 0; i < count; i++) {
            answer[i] = tmp[i];
        }
        return answer;
    }

    public int[] post4(int[] nums) {
        int[] answer;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4) {
                count = i;
            }
        }
        answer = new int[nums.length - count - 1];
        for (int i = 0; i < nums.length - count - 1; i++) {
            answer[i] = nums[i + count + 1];
        }
        return answer;
    }

    public int[] notAlone(int[] nums, int val) {
        int[] answer = new int[nums.length];
        answer[0] = nums[0];
        answer[answer.length - 1] = nums[nums.length - 1];
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] == val && nums[i - 1] != val && nums[i + 1] != val)
                answer[i] = Math.max(nums[i - 1], nums[i + 1]);
            else answer[i] = nums[i];
        }
        return answer;
    }

    public int[] zeroFront(int[] nums) {
        int[] answer = new int[nums.length];
        int k = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] != 0) {
                answer[nums.length - 1 - k] = nums[i];
                k++;
            }
        }
        return answer;
    }

    public int[] withoutTen(int[] nums) {
        int[] answer = new int[nums.length];
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 10) {
                answer[k] = nums[i];
                k++;
            }
        }
        return answer;
    }

    public int[] zeroMax(int[] nums) {
        int max = 0;
        int[] answer = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                for (int j = i; j < nums.length; j++) {
                    if (nums[j] % 2 == 1 && nums[j] > max)
                        max = nums[j];
                }
                answer[i] = max;
                max = 0;
            } else answer[i] = nums[i];
        }
        return answer;
    }

    public int[] evenOdd(int[] nums) {
        int[] answer = new int[nums.length];
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                answer[k] = nums[i];
                k++;
            }
        }
        k = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] % 2 == 1) {
                answer[nums.length - 1 - k] = nums[i];
                k++;
            }
        }
        return answer;
    }

    public String[] fizzBuzz(int start, int end) {
        String[] answer = new String[end - start];
        for (int i = start; i <end ; i++) {
            if (i % 3 == 0)
                if (i % 5 == 0)
                    answer[i - start] = "FizzBuzz";
                else answer[i - start] = "Fizz";
            else if (i % 5 == 0)
                answer[i - start] = "Buzz";
            else answer[i - start] = String.valueOf(i);
        }
        return answer;
    }


    public static void main(String[] args) {
        Array2 array2 = new Array2();
        array2.centeredAverage(new int[]{-10, -4, -2, -4, -2, 0});
    }
}
