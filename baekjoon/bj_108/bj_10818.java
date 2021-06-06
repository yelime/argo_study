package bj_108;

import java.util.Scanner;

public class bj_10818 {
// public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Max = -1000000;
        int Min = 1000000;
        int tmp = 0;
        for(int i = 0; i<N;i++){
            tmp = sc.nextInt();
            Max = Max<tmp?tmp:Max;
            Min = Min>tmp?tmp:Min;
        }
        sc.close();
        System.out.println(Min+" "+Max);
    }
}