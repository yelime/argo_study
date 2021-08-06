/** programmers 문제풀이
 * 
 * ==========================================
 * 직사각형 별찍기
 * 
 * 문제 설명
 * 이 문제에는 표준 입력으로 두 개의 정수 n과 m이 주어집니다.
 * 별(*) 문자를 이용해 가로의 길이가 n, 세로의 길이가 m인 직사각형 형태를 출력해보세요.
 * 
 * 제한 조건
 * n과 m은 각각 1000 이하인 자연수입니다.
 * 
 * 예시
 * 입력
 * 
 * 5 3
 * 
 * 출력
 * 
 * *****
 * *****
 * *****
 * ===================================
 * 
 * 가장 간단한 입출력 문제이다.
 */
import java.util.Scanner;

public class study20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        String star="";
        for(int j =0;j<a;j++){
            star+="*";
        }
        for(int i = 0;i<b;i++){
            System.out.println(star);
        }
    }
}

/**
 * 실행 결과
 * 테스트 1 〉	통과 (305.92ms, 48.7MB)
 * 테스트 2 〉	통과 (276.47ms, 48.6MB)
 * 테스트 3 〉	통과 (270.13ms, 49.1MB)
 * 테스트 4 〉	통과 (285.60ms, 49.2MB)
 * 테스트 5 〉	통과 (264.09ms, 48.7MB)
 * 테스트 6 〉	통과 (309.05ms, 50.2MB)
 * 테스트 7 〉	통과 (280.75ms, 48.8MB)
 * 테스트 8 〉	통과 (290.51ms, 49.1MB)
 * 테스트 9 〉	통과 (313.76ms, 49.1MB)
 * 테스트 10 〉	통과 (287.21ms, 50MB)
 * 테스트 11 〉	통과 (268.40ms, 49.3MB)
 */