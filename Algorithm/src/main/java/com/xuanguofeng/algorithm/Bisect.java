package com.xuanguofeng.algorithm;

/**
 * 二分
 */
public class Bisect {

    public static void main(String[] args) {

        int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 55, 66, 77, 88, 99, 100, 101, 102, 103, 105, 110};
        System.out.println("结果--》" + rank(14, values) + "");
    }


    private static int rank(int key, int[] values) {
        int index = 0;
        int length = values.length - 1;

        while (index <= length) {
            int center = (length - index) / 2;
            if (key < values[center]) {
                length = center - 1;
            } else if (key > values[center]) {
                length = center + 1;
            } else {
                return center;
            }

        }
        return -1;
    }
}
