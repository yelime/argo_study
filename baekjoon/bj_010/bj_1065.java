import java.util.Scanner;

// public class Main{
public class bj_1065{
    static int[] num = new int[45];
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        if(N<100){
            System.out.println(N);
            return;
        }
        int idx = 0;
        for(int i = 1; i<10;i++){
            int tmp;
            if(i%2==1){
                tmp = 1;
            }else {
                tmp = 0;
            }
            
            int one = i*100+(i+tmp)*10/2+tmp;
            if(one>N){
                System.out.println(99+idx);
                return;
            }
            num[idx++] = one;
            for(int j = 1;j<5;j++){
                one+=12;
                if(one>N){
                    System.out.println(99+idx);
                    return;
                }
                num[idx++] = one;
            }
        }
        System.out.println("144");
    }
}