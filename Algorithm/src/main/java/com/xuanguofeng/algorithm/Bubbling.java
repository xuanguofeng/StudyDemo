package com.xuanguofeng.algorithm;

/**
 * 冒泡
 */
public class Bubbling {

    public static void main(String[] args) {
        int[] numbers = {3, 9, 6, 2};
        int temp = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {//内层循环一次冒泡出一个比较小的数上来
                if (numbers[j] > numbers[j + 1]) {//如果第一个数字比第二个大则交换位置
                    temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("第" + i + "个数字是：" + numbers[i]);
        }
    }
}
