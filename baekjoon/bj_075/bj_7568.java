import java.util.Scanner;

public class bj_7568 {
    static int[][] pp;
    static int N;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        pp = new int[N][3];

        for (int i = 0; i < N; i++) {
            pp[i][0] = sc.nextInt();
            pp[i][1] = sc.nextInt();
            pp[i][2] = 1;
        }
        sc.close();

        for (int i = 0; i < N - 1; i++) {
            fc(i);
        }
        for (int i = 0; i < N - 1; i++) {
            System.out.print(pp[i][2] + " ");
        }
        System.out.println(pp[N - 1][2]);
    }

    public static void fc(int pN) {
        for (int i = pN + 1; i < N; i++) {
            if (pp[pN][0] > pp[i][0] && pp[pN][1] > pp[i][1]) {
                pp[i][2]++;
            } else if (pp[pN][0] < pp[i][0] && pp[pN][1] < pp[i][1]) {
                pp[pN][2]++;
            }
        }

    }

}
