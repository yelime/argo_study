/** baekjoon
 * 
 * ====================================
 * A+B
 * 
 * 문제
 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 * 
 * 입력
 * 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
 * 
 * 출력
 * 첫째 줄에 A+B를 출력한다.
 * 
 * 예제 입력 1
---------------------------
1 2
----------------------------
 * 예제 출력 1
-------------------------
3
--------------------------
 * ===========================================
 * 
 * 단순한 덧셈 문제로 딱히 어려움은 없다.
 * 
 */


import java.util.Scanner;

// public class Main{
public class bj_1000 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, B;
        A = sc.nextInt();
        B = sc.nextInt();
        System.out.println(A + B);
        sc.close();
    }
}
/**
 * 실행 결과 
 * 메모리   | 시간    |   코드 길이
 * 14260KB  | 112ms  |   259B 
 * 
 */