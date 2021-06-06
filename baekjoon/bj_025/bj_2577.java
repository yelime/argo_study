package bj_025;

import java.util.Scanner;

public class bj_2577 {
// public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int tmp = sc.nextInt();
        num *= tmp;
        tmp = sc.nextInt();
        num *= tmp;
        
        int[] N = new int[10];
        while(num>0){
            tmp = num%10;
            N[tmp]++;
            num /= 10;
        }
        for(int i=0;i<10;i++){
            System.out.println(N[i]);
        }
    }
}