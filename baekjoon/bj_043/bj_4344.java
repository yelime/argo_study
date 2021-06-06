package bj_043;
import java.util.Scanner;

public class bj_4344 {
// public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt();
        for(int i = 0; i<C;i++){
            int[] score = new int[101];
            int tmp = 0;
            int N = sc.nextInt();
            int sum = 0;
            for(int j=0;j<N;j++){
                tmp = sc.nextInt();
                score[tmp]++;
                sum += tmp;
            }
            sum /= N;
            tmp = 0;
            for(int j=sum+1;j<101;j++){
                tmp+= score[j];
            }
            double answer = (double)tmp*100/N;
            System.out.printf("%.3f",answer);
            System.out.println("%");
        }
        sc.close();
 
    }
}