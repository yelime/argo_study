import java.util.Scanner;

public class bj_8958 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < T; i++) {
            String tmp = sc.nextLine();
            int len = tmp.length();
            int pass = 0;
            int result = 0;
            for (int j = 0; j < len; j++) {
                if (tmp.charAt(j) == 'O') {
                    pass++;
                    result += pass;
                } else {
                    pass = 0;
                }
            }
            System.out.println(result);
        }
        sc.close();
    }
}
