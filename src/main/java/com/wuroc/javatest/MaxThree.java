package com.wuroc.javatest;

/**
 * @ClassName MaxThree
 * @Description TODO
 * @Author XiaoShuMu
 * @Version 1.0
 * @Create 2021-09-13 09:30
 * @Blog https://www.cnblogs.com/WLCYSYS/
 **/

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class MaxThree {
    public static void main(String[] args) {
        new MaxThree();
    }

    public int sum(int[] ps, int l, int r) {
        r = Math.min(ps.length - 1, r);
        if (l > r) {
            return 0;
        }
        int ans = ps[r];
        if (l > 0) {
            ans -= ps[l - 1];
        }
        return ans;
    }

    int[] ps(List<Integer> group) {
        int m = group.size();
        int[] ps = new int[m];
        for (int i = 0; i < m; i++) {
            ps[i] = group.get(i);
            if (i > 0) {
                ps[i] += ps[i - 1];
            }
        }
        return ps;
    }

    public int maxmiumScore(int[] cards, int cnt) {
        int n = cards.length;
        List<Integer>[] group = new List[2];
        for (int i = 0; i < 2; i++) {
            group[i] = new ArrayList(n);
        }
        for (int x : cards) {
            group[x & 1].add(x);
        }
        for (int i = 0; i < 2; i++) {
            group[i].sort(Comparator.comparingInt(x -> x));
        }
        int[][] ps = new int[][]{ps(group[0]), ps(group[1])};
        int best = 0;
        for (int i = 0; i <= group[1].size() && i <= cnt; i += 2) {
            if (ps[0].length - (cnt - i) < 0) {
                continue;
            }
            int sum = sum(ps[0], ps[0].length - (cnt - i), ps[0].length - 1)
                    + sum(ps[1], ps[1].length - i, ps[1].length - 1);
            best = Math.max(best, sum);
        }
        return best;
    }



}
