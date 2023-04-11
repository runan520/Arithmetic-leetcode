package edu.algs4.cs.princeton;



/**
 * @ClassName ThreeSum
 * @Description TODO
 * @Author XiaoShuMu
 * @Version 1.0
 * @Create 2022-02-25 16:38
 * @Blog https://www.cnblogs.com/WLCYSYS/
 **/
public class ThreeSum {

    private static int count(int[] a) {
        int N = a.length;
        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                for (int k = j + 1; k < N; k++) {
                    if (a[i] + a[j] + a[k] == 0) {
                        count++;

                    }

                }

            }
        }
        return count;
    }
}
