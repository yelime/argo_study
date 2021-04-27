import java.util.Scanner;

public class bj_10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] indexC = new int[26];
        for (int i = 0; i < 26; i++) {
            indexC[i] = -1;
        }
        String tmp = sc.nextLine();

        sc.close();

        int count = 0;
        for (int i = 0; i < tmp.length(); i++) {
            int idx = tmp.charAt(i) - 'a';
            if (indexC[idx] == -1) {
                indexC[idx] = i;
                count++;
            }
            if (count == 26) {
                break;
            }
        }
        for (int i = 0; i < 25; i++) {
            System.out.print(indexC[i] + " ");
        }
        System.out.println(indexC[25]);

    }
}
