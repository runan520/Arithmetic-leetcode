package com.wuroc.javatest;

import java.util.HashSet;

/**
 * @ClassName Hbqz
 * @Description TODO
 * @Author XiaoShuMu
 * @Version 1.0
 * @Create 2021-09-14 14:40
 * @Blog https://www.cnblogs.com/WLCYSYS/
 **/
public class Hbqz {
    public int flipChess(String[] chessboard) {
        int ans = 0;
        for (int i = 0; i < chessboard.length; i++) {
            for (int j = 0; j < chessboard[i].length(); j++) {
                ans = Math.max(chessIn(i, j, chessboard), ans);
            }
        }
        return ans;
    }

    private int chessIn(int x, int y, String[] chessboard) {
        if (chessboard[x].charAt(y) != '.') return 0;
        // System.out.println("Chess In " + x + "," + y);
        //create board
        int[][] board = new int[chessboard.length][chessboard[0].length()];
        for (int i = 0; i < chessboard.length; i++) {
            for (int j = 0; j < chessboard[i].length(); j++) {
                switch (chessboard[i].charAt(j)) {
                    case '.':
                        board[i][j] = 0;
                        break;
                    case 'X':
                        board[i][j] = 1;
                        break;
                    case 'O':
                        board[i][j] = 2;
                        break;
                }
            }
        }
        //bfs
        board[x][y] = 1;
        HashSet<Integer> que = new HashSet<>();
        que.add(x * 8 + y);
        int ans = 0;
        while (!que.isEmpty()) {
            HashSet<Integer> next = new HashSet<>();
            for (int t : que) {
                int xx = t / 8;
                int yy = t % 8;
                // System.out.println("Search " + xx + "," + yy);
                for (int[] dir : new int[][]{
                        new int[]{-1, -1},
                        new int[]{0, -1},
                        new int[]{1, -1},
                        new int[]{1, 0},
                        new int[]{1, 1},
                        new int[]{0, 1},
                        new int[]{-1, 1},
                        new int[]{-1, 0}
                }) {
                    int dx = dir[0];
                    int dy = dir[1];
                    // System.out.println("Dir " + dx + "," + dy);
                    int xxx = xx;
                    int yyy = yy;
                    while (true) {
                        xxx += dx;
                        yyy += dy;
                        if (xxx < 0 || xxx >= board.length || yyy < 0 || yyy >= board[xxx].length || board[xxx][yyy] == 0) {
                            // System.out.println("touch air " + x + "," + y);
                            break;
                        } else if (board[xxx][yyy] == 1) {
                            // System.out.println("Search " + xxx + "," + yyy);
                            xxx -= dx;
                            yyy -= dy;
                            while (xxx != xx || yyy != yy) {
                                // System.out.println("fill " + xxx + "," + yyy);
                                next.add(xxx * 8 + yyy);
                                xxx -= dx;
                                yyy -= dy;
                            }
                            break;
                        }
                    }
                }
            }
            for (int t : next) {
                int xx = t / 8;
                int yy = t % 8;
                board[xx][yy] = 1;
            }
            ans += next.size();
            // System.out.println(next);
            que = next;
        }
        return ans;
    }
}

