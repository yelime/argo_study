/** programmers 문제풀이
 * 
 * ==========================================
 * 제일 작은 수 제거하기
 * 문제 설명
 * 정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 
 * 함수, solution을 완성해주세요. 단, 리턴하려는 배열이 빈 배열인 경우
 * 엔 배열에 -1을 채워 리턴하세요. 예를들어 arr이 [4,3,2,1]인 경우는 
 * [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.
 * 
 * 제한 조건
 * arr은 길이 1 이상인 배열입니다.
 * 인덱스 i, j에 대해 i ≠ j이면 arr[i] ≠ arr[j] 입니다.
 * 
 * 입출력 예
 * arr	return
 * [4,3,2,1]	[4,3,2]
 * [10]	[-1]
 * ===================================
 * 
 * 
 */
import java.util.*;

public class study52 {
    public int[] solution(int[] arr) {
        if(arr.length==1){
            int[] tmp = {-1};
            return tmp;
        }
        LinkedList<Integer> list = new LinkedList<>();
        int min = arr[0];
        int idx = 0;
        int midx = 0;
        for(int i : arr){
            if(i<min){
                midx = idx;
                min = i;
            }
            list.add(i);
            idx++;
        }
        list.remove(midx);
        int[] answer = new int[list.size()];
        idx = 0;
        for(int i: list){
            answer[idx++] = i;
        }
        return answer;
    }
}

/**
 * 실행 결과
 * 
 * 테스트 1 〉	통과 (11.92ms, 64.3MB)
 * 테스트 2 〉	통과 (0.76ms, 53.6MB)
 * 테스트 3 〉	통과 (0.92ms, 53.3MB)
 * 테스트 4 〉	통과 (0.45ms, 53.7MB)
 * 테스트 5 〉	통과 (0.36ms, 52.8MB)
 * 테스트 6 〉	통과 (0.88ms, 56.4MB)
 * 테스트 7 〉	통과 (1.14ms, 52.9MB)
 * 테스트 8 〉	통과 (0.17ms, 52.6MB)
 * 테스트 9 〉	통과 (0.36ms, 52.1MB)
 * 테스트 10 〉	통과 (0.26ms, 52.8MB)
 * 테스트 11 〉	통과 (0.32ms, 52MB)
 * 테스트 12 〉	통과 (0.29ms, 52.9MB)
 * 테스트 13 〉	통과 (2.03ms, 52.3MB)
 * 테스트 14 〉	통과 (1.09ms, 53.4MB)
 * 테스트 15 〉	통과 (0.54ms, 51.9MB)
 * 테스트 16 〉	통과 (0.99ms, 53.4MB)
 */
