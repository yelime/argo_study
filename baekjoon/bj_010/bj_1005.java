import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class bj_1005 {
    static int[] DC, D, X, Y;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int K = sc.nextInt();

            // int[] DC, D, X, Y;
            D = new int[N];
            DC = new int[N];
            for (int j = 0; j < N; j++) {
                D[j] = sc.nextInt();
                DC[j] = 0;
            }
            X = new int[K];
            Y = new int[K];

            for (int j = 0; j < K; j++) {
                X[j] = sc.nextInt();
                Y[j] = sc.nextInt();
                DC[Y[j] - 1] = -1;
            }
            int W = sc.nextInt();

            if (DC[W - 1] == 0) {
                System.out.println(D[W - 1]);
                continue;
            }
            int result = D[W - 1] + fc(W);
            System.out.println(result);
        }
        sc.close();
    }

    public static int fc(int a) {
        Queue<Integer> q = new LinkedList<>();
        int len = X.length;
        int output = 0;

        for (int i = 0; i < len; i++) {
            if (Y[i] == a) {
                q.add(X[i]);
            }
        }
        if (DC[a - 1] == 0) {
            return D[a - 1];
        }
        while (!q.isEmpty()) {
            int tmp = q.poll() - 1;
            if (DC[tmp] == 0) {
                if (D[tmp] > output) {
                    output = D[tmp];
                }
            } else {
                int tm = fc(tmp + 1);
                D[tmp] = D[tmp] + tm;
                DC[tmp] = 0;
                if (D[tmp] > output) {
                    output = D[tmp];
                }
            }
        }
        return output;

    }
}
