package bj_015;

import java.util.Scanner;

public class bj_1546 {
// public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;
        int M = 0;
        int tmp = 0;
        for(int i = 0;i<N;i++){
            tmp = sc.nextInt();
            sum += tmp;
            M = M<tmp?tmp:M;
        }
        double avg = (double)(sum*100)/(M*N);
        System.out.println(avg);
    }
}