package bj_025;

import java.util.Scanner;

public class bj_2562 {
// public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int Max = 0;
        int idx = -1;
        int tmp = 0;
        for(int i=0;i<9;i++){
            tmp = sc.nextInt();
            if(tmp>Max){
                Max = tmp;
                idx = i+1;
            }
        }
        sc.close();
        System.out.println(Max);
        System.out.println(idx);
    }
}