/** programmers 문제풀이
 * 
 * ==========================================
 * x만큼 간격이 있는 n개의 숫자
 * 
 * 문제 설명
 * 함수 solution은 정수 x와 자연수 n을 입력 받아, x부터 시작해 x씩 증가하는 
 * 숫자를 n개 지니는 리스트를 리턴해야 합니다. 다음 제한 조건을 보고, 조건을 
 * 만족하는 함수, solution을 완성해주세요.
 * 
 * 제한 조건
 * x는 -10000000 이상, 10000000 이하인 정수입니다.
 * n은 1000 이하인 자연수입니다.
 * 
 * 입출력 예
 * x	n	answer
 * 2	5	[2,4,6,8,10]
 * 4	3	[4,8,12]
 * -4	2	[-4, -8]
 */

public class study40 {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long tmp=0;
        for(int i=0;i<n;i++){
            tmp +=x;
            answer[i] = tmp;
        }
        return answer;
    }
}

/**
 * 실행 결과
 * 테스트 1 〉	통과 (0.02ms, 52.8MB)
 * 테스트 2 〉	통과 (0.04ms, 52.7MB)
 * 테스트 3 〉	통과 (0.03ms, 52.6MB)
 * 테스트 4 〉	통과 (0.05ms, 54.2MB)
 * 테스트 5 〉	통과 (0.41ms, 52.6MB)
 * 테스트 6 〉	통과 (0.02ms, 52.2MB)
 * 테스트 7 〉	통과 (0.05ms, 52.6MB)
 * 테스트 8 〉	통과 (0.03ms, 53.1MB)
 * 테스트 9 〉	통과 (0.06ms, 52.2MB)
 * 테스트 10 〉	통과 (0.02ms, 53.2MB)
 * 테스트 11 〉	통과 (0.03ms, 53.2MB)
 * 테스트 12 〉	통과 (0.06ms, 51.6MB)
 * 테스트 13 〉	통과 (0.05ms, 52.6MB)
 * 테스트 14 〉	통과 (0.05ms, 52.4MB)
 */