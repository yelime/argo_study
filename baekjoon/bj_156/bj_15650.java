import java.util.Scanner;

public class bj_15650 {
    static boolean[] C;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.close();

        C = new boolean[N];
        fc(0, M, N, "", 0);
    }

    public static void fc(int de, int MD, int MN, String result, int idx) {
        if (de == MD - 1) {
            for (int i = idx; i < MN; i++) {
                if (!C[i])
                    System.out.println(result + (i + 1));
            }
            return;
        }

        for (int i = idx; i < MN; i++) {
            if (!C[i]) {
                C[i] = true;
                String Nresult = result + (i + 1) + " ";
                fc(de + 1, MD, MN, Nresult, i);
                C[i] = false;
            }

        }

    }
}
