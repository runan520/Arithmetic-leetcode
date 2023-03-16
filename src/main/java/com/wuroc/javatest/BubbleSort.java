package com.wuroc.javatest;

import java.util.Arrays;

/**
 * @ClassName BubbleSort
 * @Description TODO
 * @Author HepengWu
 * @Date 2021/7/12 7:28
 * @Version 1.0
 **/
public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        boolean swaped = true;
        //最后一次没有进过排序的元素的下标
        int indexOfLastUnsortedElement = arr.length - 1;
        //上次发生交换的位置
        int swappedIndex = -1;
        while (swaped) {
            swaped = false;
            for (int i = 0; i < indexOfLastUnsortedElement; i++) {
                if (arr[i] > arr[i + 1]) {
                    //如果左边的数大于右边的数，则交换，保证右边的数字最大
                    swap(arr, i, i + 1);
                    //表示发生交换
                    swaped = true;
                    //更新交换的位置
                    swappedIndex = i;
                }
            }
            //最后一个没有经过排序的元素的下标就是最后一次发生交换的位置
            indexOfLastUnsortedElement = swappedIndex;
        }
    }

    private static void swap(int[] arr, int i, int j) {
        /*int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;*/
//        除了这种先加后减的写法，还有一种先减后加的写法：
        /*arr[i+1] = arr[i+1]+ arr[i];
        arr[i] = arr[i+1] - arr[i];
        arr[i+1] = arr[i+1] - arr[i];*/

        //通过位运算完成数字的交换
        //确实。“相等”的数可以，“相同”的数不行。用“三连异或”方法的前提是，被交换的两个数存储在不同的位置。谢谢专门来提醒我！
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[j] ^ arr[i];
        arr[i] = arr[i] ^ arr[j];

    }

    public void test() {
        int[] arr = new int[]{6, 2, 1, 3, 5, 4};
        bubbleSort(arr);
        // 输出: [1, 2, 3, 4, 5, 6]
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.test();

    }
}
