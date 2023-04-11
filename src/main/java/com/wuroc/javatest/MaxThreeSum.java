package com.wuroc.javatest;

//import edu.princeton.cs.algs4.In;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @ClassName MaxThreeSum
 * @Description TODO
 * @Author XiaoShuMu
 * @Version 1.0
 * @Create 2021-09-13 15:13
 * @Blog https://www.cnblogs.com/WLCYSYS/
 **/


public class MaxThreeSum {
    public int maxmiumScore(int[] cards, int cnt) {
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();

        for (int card : cards) {
            if (card % 2 == 0) {
                //偶数
                even.add(card);
            } else {
                //奇数
                odd.add(card);
            }
        }

        //倒排
        Collections.sort(odd, (x, y) -> -Integer.compare(x, y));
        Collections.sort(even, (x, y) -> -Integer.compare(x, y));
//        Collections.sort(even,(x,y) -> Integer.compare(y,x));
        System.out.println(odd);
        System.out.println(even);
//        Collections.sort(odd, (x, y) -> Integer.compare(y, x));
//        Collections.sort(even, (x, y) -> Integer.compare(x, y));

        //处理偶数累加，需要几个偶数直接根据索引来判断需要几个偶数相加
        for (int i = 1; i < even.size(); i++) {
            even.set(i, even.get(i) + even.get(i - 1));
        }

        //每次需要奇数的和
        int t = 0;
        //返回的结果
        int ret = 0;

        for (int i = 0; i < odd.size(); i++) {
            t += odd.get(i);
            //奇数+奇数=偶数
            if (i % 2 == 0) {
                continue;
            }

            //剩余的偶数的数,i肯定是奇数，当两个是奇数才能是偶数
            int j = cnt - i - 1;
            //cnt是大于1的奇数j才不是零，如果等于零，证明是不需要偶数在参加里面
            if (j == 0) {
                ret = Math.max(ret, t);
                //如果是
            } else if (j <= even.size() && j > 0) {
                //进行比较
                ret = Math.max(ret, t + even.get(j - 1));
            }
        }
        if (cnt <= even.size()) {
            ret = Math.max(ret, even.get(cnt - 1));
        }
        return ret;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 8, 9, 4, 6, 5, 3, 7};
        MaxThreeSum maxThreeSum = new MaxThreeSum();
        MaxThree maxThree = new MaxThree();
        System.out.println(maxThreeSum.maxmiumScore(array, 8));
//        System.out.println(maxThree.maxmiumScore(array, 3));
    }
}

