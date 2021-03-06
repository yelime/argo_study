/** programmers 문제풀이
 * 
 * ==========================================
 * 정수 내림차순으로 배치하기
 * 
 * 문제 설명
 * 함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 예를들어 n이 118372면 873211을 리턴하면 됩니다.
 * 
 * 제한 조건
 * n은 1이상 8 000 000 000 이하인 자연수입니다.
 * 
 * 입출력 예
 * n	    return
 * 118372	873211
 * ===================================
 * 
 * 이 문제는 자연수가 80억까지 주어진다는 문제가 있다. 이는 int로 담을 수 없음을 의미하며,
 * 그냥 계산시 문제가 발생한다. 이를 방지하기 위해서 계산은 long으로 하고, 자리값은 int로
 * 저장하여 정렬을 
 * 
 */
import java.util.*;

class study22 {
    public long solution(long n) {
        long answer = 0;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        while(n!=0){
            long tmp =n%10; 
            arr.add((int)tmp);
            n/=10;
        }
        Collections.sort(arr);
        
        long ten=1;
        for(int tmp : arr){
            answer += tmp*ten;
            ten *= 10;
        }
        return answer;
    }
}

/**
 * 실행 결과
 * 테스트 1 〉	통과 (0.28ms, 52.5MB)
 * 테스트 2 〉	통과 (0.28ms, 53MB)
 * 테스트 3 〉	통과 (0.26ms, 52MB)
 * 테스트 4 〉	통과 (0.19ms, 52.1MB)
 * 테스트 5 〉	통과 (0.25ms, 53MB)
 * 테스트 6 〉	통과 (0.25ms, 51.6MB)
 * 테스트 7 〉	통과 (0.27ms, 52.6MB)
 * 테스트 8 〉	통과 (0.33ms, 53MB)
 * 테스트 9 〉	통과 (0.23ms, 52.9MB)
 * 테스트 10 〉	통과 (0.29ms, 53.3MB)
 * 테스트 11 〉	통과 (0.25ms, 52.8MB)
 * 테스트 12 〉	통과 (0.30ms, 52MB)
 * 테스트 13 〉	통과 (0.27ms, 52.6MB)
 * 테스트 14 〉	통과 (0.28ms, 52.4MB)
 * 테스트 15 〉	통과 (0.26ms, 53MB)
 * 테스트 16 〉	통과 (0.26ms, 52.2MB)
 */