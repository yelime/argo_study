import java.util.Scanner;

public class bj_2750 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        boolean[] c = new boolean[2001];
        int N = sc.nextInt();
        for(int i=0;i<N;i++){
            int tmp = sc.nextInt() + 1000;
            c[tmp] = true;
        }
        sc.close();
        
        for(int i=0;i<c.length;i++){
            if(c[i]){
                int result = i-1000;
                System.out.println(result);
            }
        }
    }
    
}
