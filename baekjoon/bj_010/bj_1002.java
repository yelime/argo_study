/** baekjoon
 * 
 * ====================================
 * 터렛
 * 
 * 문제
 * 조규현과 백승환은 터렛에 근무하는 직원이다. 하지만 워낙 존재감이 없어서 인구수는 차지하지 않는다. 다음은 조규현과 백승환의 사진이다.
 * 이석원은 조규현과 백승환에게 상대편 마린(류재명)의 위치를 계산하라는 명령을 내렸다. 조규현과 백승환은 각각 자신의 터렛 위치에서 현재 
 * 적까지의 거리를 계산했다.
 * 조규현의 좌표 (x1, y1)와 백승환의 좌표 (x2, y2)가 주어지고, 조규현이 계산한 류재명과의 거리 r1과 백승환이 계산한 류재명과의 거리 
 * r2가 주어졌을 때, 류재명이 있을 수 있는 좌표의 수를 출력하는 프로그램을 작성하시오.
 * 
 * 입력
 * 첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 다음과 같이 이루어져 있다.
 * 한 줄에 x1, y1, r1, x2, y2, r2가 주어진다. x1, y1, x2, y2는 -10,000보다 크거나 같고, 10,000보다 작거나 같은 정수이고, 
 * r1, r2는 10,000보다 작거나 같은 자연수이다.
 * 
 * 출력
 * 각 테스트 케이스마다 류재명이 있을 수 있는 위치의 수를 출력한다. 만약 류재명이 있을 수 있는 위치의 개수가 무한대일 경우에는 -1을 
 * 출력한다.
 * 
 * 예제 입력 1
----------------------------
3
0 0 13 40 0 37
0 0 3 0 7 4
1 1 1 1 1 5
---------------------------------
 * 예제 출력 1
--------------------
2
1
0
------------------------
 * ===========================================
 * 
 * 이 문제는 두 원의 관계를 안다면 풀 수 있는 문제이다. 관계는 크게 4가지로 부분이 겹치거나 접하거나 상관없거나 완전히 일치하는 경우
 * 이렇게 4가지 중 어느 것인지 알면 풀 수 있는 문제이다.
 * 
 */
import java.util.Scanner;

public class bj_1002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int Ax, Ay, Ar, Bx, By, Br;
            Ax = sc.nextInt();
            Ay = sc.nextInt();
            Ar = sc.nextInt();
            Bx = sc.nextInt();
            By = sc.nextInt();
            Br = sc.nextInt();

            int ABx = Ax - Bx;
            int ABy = Ay - By;

            int Radd = Ar + Br;
            int Rsub = Ar - Br;
            Radd = Radd * Radd;
            Rsub = Rsub * Rsub;
            int ABd = ABx * ABx + ABy * ABy;
            //부분이 겹친다.
            if (ABd < Radd && ABd > Rsub) {
                System.out.println("2");
            }
            //접한다. 
            else if (ABd == Radd || (ABd == Rsub && ABd != 0)) {
                System.out.println("1");
            } 
            //상관없다.
            else if (ABd < Rsub || ABd > Radd) {
                System.out.println("0");
            }
            // 두 점이 같은 위치일경우 길이에 따라 상관없음과 완전 일치를 구분할 수 있다. 
            else if (ABd == 0) {
                if (Ar == Br) {
                    System.out.println("-1");
                } else {
                    System.out.println("0");
                }
            }
        }
        sc.close();
    }

}

/**
 * 실행 결과
 * 메모리   시간    코드 길이
 * 14444kb  164ms   1186b
 */