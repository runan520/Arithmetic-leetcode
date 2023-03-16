import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

/**
 * @ClassName RandomWord
 * @Description TODO
 * @Author XiaoShuMu
 * @Version 1.0
 * @Create 2021-10-27 15:24
 * @Blog https://www.cnblogs.com/WLCYSYS/
 **/
public class RandomWord {
    public static void main(String[] args) {
        String champion = "";
        double count = 1.0;
        while (!StdIn.isEmpty()) {
            String s = StdIn.readString();
            if (StdRandom.bernoulli(1 / count)) {
                champion = s;
            }
            count++;
        }
        StdOut.println(champion);
    }

}

