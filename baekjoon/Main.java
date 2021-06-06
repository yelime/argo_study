import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int sum = C-B;
        if(sum<=0){
            System.out.println("-1");
            return;
        }
        int count = A/sum+1;
        System.out.println(count);
        sc.close();
    }
}