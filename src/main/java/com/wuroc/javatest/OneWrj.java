package com.wuroc.javatest;

/**
 * @ClassName OneWrj
 * @Description TODO
 * @Author XiaoShuMu
 * @Version 1.0
 * @Create 2021-09-11 15:21
 * @Blog https://www.cnblogs.com/WLCYSYS/
 **/
public class OneWrj {

    public int minimumSwitchingTimes(int[][] source, int[][] target) {
        int n = source.length;
        int m = source[0].length;

        int[] res = new int[(int) 1e4 + 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                res[source[i][j]]++;
                res[target[i][j]]--;
            }
        }
        int count = 0;
        for (int x : res) {
            if (x < 0) {
                count += -x;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 6}};
        int[][] b = {{6, 2, 3}, {7, 5, 6}};
        OneWrj oneWrj = new OneWrj();
        System.out.println(oneWrj.minimumSwitchingTimes(a, b));
        System.out.println(3&1);
    }
}
