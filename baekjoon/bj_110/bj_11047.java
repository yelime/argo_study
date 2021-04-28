import java.util.Scanner;

public class bj_11047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] V = new int[N];

        for (int i = 0; i < N; i++) {
            V[i] = sc.nextInt();
        }
        sc.close();

        int result = 0;
        for (int i = N-1; i >= 0; i--) {
            result += K / V[i];
            K %= V[i];
        }
        System.out.println(result);
    }
}