import java.util.Scanner;

public class bj_2292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int tmp = 0;
        if (N == 1) {
            System.out.println(1);
        } else {
            for (int i = 0; i < 18257; i++) {
                tmp += i + 1;
                if (N <= 6 * tmp + 1) {
                    System.out.println(i + 2);
                    break;
                }
            }
        }
    }
}
