import java.util.Scanner;

public class bj_1003 {
    public static void main(String[] args) {
        int[] OC, ZC;
        ZC = new int[41];
        OC = new int[41];
        ZC[0] = 1;
        OC[0] = 0;
        ZC[1] = 0;
        OC[1] = 1;
        for (int i = 2; i < OC.length; i++) {
            ZC[i] = ZC[i - 1] + ZC[i - 2];
            OC[i] = OC[i - 1] + OC[i - 2];
        }

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int IV = sc.nextInt();
            System.out.println(ZC[IV] + " " + OC[IV]);
        }
        sc.close();
    }

}
