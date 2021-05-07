/** programmers 문제풀이
 * 
 * ==========================================
 * 자연수 뒤집어 배열로 만들기
 * 문제 설명
 * 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세
 * 요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
 * 
 * 제한 조건
 * n은 10,000,000,000이하인 자연수입니다.
 * 
 * 입출력 예
 * n	return
 * 12345	[5,4,3,2,1]
 * ===================================
 * 
 * 10으로 나눈 나머지의 배열을 만들어 반환하면 된다.
 * 
 */

import java.util.*;

public class study44 {
    public int[] solution(long n) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        while(n>0){
            long tmp = n%10;
            n /= 10;
            result.add((int)tmp);
        }
        
        int[] answer = new int[result.size()];
        int idx = 0;
        for(int num : result){
            answer[idx++] = num;
        }
        return answer;
    }
}
/**
 * 실행 결과
 * 테스트 1 〉	통과 (0.05ms, 52.2MB)
 * 테스트 2 〉	통과 (0.04ms, 53.1MB)
 * 테스트 3 〉	통과 (0.17ms, 52.3MB)
 * 테스트 4 〉	통과 (0.06ms, 52.8MB)
 * 테스트 5 〉	통과 (0.04ms, 52.5MB)
 * 테스트 6 〉	통과 (0.09ms, 52.1MB)
 * 테스트 7 〉	통과 (0.05ms, 52.8MB)
 * 테스트 8 〉	통과 (0.04ms, 52.4MB)
 * 테스트 9 〉	통과 (0.04ms, 52.8MB)
 * 테스트 10 〉	통과 (0.03ms, 53.1MB)
 * 테스트 11 〉	통과 (0.04ms, 53.1MB)
 * 테스트 12 〉	통과 (0.04ms, 52.6MB)
 * 테스트 13 〉	통과 (0.04ms, 53MB)
 */