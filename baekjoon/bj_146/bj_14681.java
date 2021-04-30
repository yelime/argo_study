import java.util.Scanner;

public class bj_14681 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        sc.close();

        int result = 1;
        if (X * Y < 0) {
            result++;
        }
        if (Y < 0) {
            result += 2;
        }
        System.out.println(result);

    }
}
