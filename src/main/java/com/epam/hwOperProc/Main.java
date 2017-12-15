package com.epam.hwOperProc;


import java.util.Arrays;

public class Main {
    public static final double E = 0.001;

    public void Task2(int n) {
        double[] array = new double[n];
        for (int i = 0; i < n; i++) {
            array[i] = 1 / ((i + 1) * (i + 1));
        }
        int result = array.length;
        for (int i = 0; i < n; i++) {
            if ((array[i] < Main.E) && (i < result)) {
                result = i;
            }
        }
        System.out.println("Min number of element: (x % 7 = 4) is " + result);
        System.out.println(Arrays.toString(array));
    }

    public static double functionF(int x) {
        return Math.tan(2 * x) - 3;
    }

    public void Task3(int a, int b, int h) {
        int x = a;
        while (x <= b) {
            System.out.print(functionF(x) + ", ");
            x += h;
        }

    }

    public static int[] makeArray(int n) {
        int[] array = new int[2 * n];
        for (int i = 0; i < n * 2; i++) {
            array[i] = 3 * 11 - 8;
        }
        return array;
    }

    public int Task4(int[] array) {
        int max = -1000;
        int[] sumarray = new int[array.length / 2];
        for (int i = 0; i < array.length / 2; i++) {
            sumarray[i] = array[i] + array[array.length - i - 1];
            if (sumarray[i] > max) {
                max = sumarray[i];
            }
        }
        return max;
    }

    public void Task5(int n) {
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i == j) || (i + j == n - 1)) {
                    matrix[i][j] = 1;
                } else {
                    matrix[i][j] = 0;
                }
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void Task6() {
        NodePad nodePad = new NodePad();
        nodePad.addNewWriting(4);
        nodePad.addNewWriting(7);
        nodePad.addNewWriting(13);
        nodePad.addNewWriting(20);
        nodePad.addNewWriting(15);
        nodePad.showNodePad();
        nodePad.deleteWriting(1);
        nodePad.editWriting(2, 14);
        nodePad.showNodePad();
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.Task2(10);
        main.Task3(0, 10, 1);
        System.out.println(main.Task4(makeArray(5)));
        main.Task5(7);
        main.Task6();
    }
}

