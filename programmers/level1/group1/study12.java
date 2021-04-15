/** programmers 문제풀이
 * 
 * ==========================================
 * 나누어 떨어지는 숫자 배열
 * 
 * 문제 설명
 * array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
 * divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.
 * 
 * 제한사항
 * arr은 자연수를 담은 배열입니다.
 * 정수 i, j에 대해 i ≠ j 이면 arr[i] ≠ arr[j] 입니다.
 * divisor는 자연수입니다.
 * array는 길이 1 이상인 배열입니다.
 * 
 * 입출력 예
 * arr	            divisor	    return
 * [5, 9, 7, 10]	5	        [5, 10]
 * [2, 36, 1, 3]	1	        [1, 2, 3, 36]
 * [3,2,6]	        10	        [-1]
 * ===================================
 * 
 * 나누어 떨어지는 수의 갯수를 구하는 것이면 정렬이 필요없으나 나누어 떨어지는 숫자의 배열을
 * 구하여 정렬해야 하기 때문에 정렬과정이 필요하고 이 정렬은 모든 배열을 정렬해야하기 때문에
 * 패키지를 사용하게 했다.
 * 패키지를 사용하는 김에 ArrayList를 사용하여 정답 배열을 만들었다.

 */

import java.util.*;

public class study12 {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        //나눠떨어지는 값이 있는지 체크 list.size()==0을 이용해서 할 수도 있지만
        //정렬을 해야하는걸 알기 전이라 list가 없을 때 사용
        boolean check = false;
        for(int i = 0; i<arr.length;i++){
            if(arr[i]%divisor==0){
                check = true;
                list.add(arr[i]);
            }
        }
        //list.size() == 0 대처 가능
        if(!check){
            int[] tmp = {-1};
            return tmp;
        }
        
        int[] answer = new int[list.size()];
        int idx=0;
        for(int i:list){
            answer[idx++] = i;
        }
        Arrays.sort(answer);
        
        return answer;
    }
}

/**
 * 실행 결과 6번의 경우 arr을 정렬하고 진행했을 때 10배 정도 차이난 것을 보아
 * 6번 테스트는 쓰이지 않는 값이 많은 것으로 보인다.
 * 테스트 1 〉	통과 (0.46ms, 53MB)
 * 테스트 2 〉	통과 (0.42ms, 52.2MB)
 * 테스트 3 〉	통과 (0.46ms, 53.1MB)
 * 테스트 4 〉	통과 (0.34ms, 53.4MB)
 * 테스트 5 〉	통과 (0.51ms, 56.1MB)
 * 테스트 6 〉	통과 (2.23ms, 55.9MB)
 * 테스트 7 〉	통과 (0.12ms, 52.3MB)
 * 테스트 8 〉	통과 (0.02ms, 52.5MB)
 * 테스트 9 〉	통과 (3.94ms, 52.1MB)
 * 테스트 10 〉	통과 (0.71ms, 52.3MB)
 * 테스트 11 〉	통과 (0.50ms, 54MB)
 * 테스트 12 〉	통과 (0.49ms, 53.5MB)
 * 테스트 13 〉	통과 (0.18ms, 53.1MB)
 * 테스트 14 〉	통과 (0.70ms, 52.4MB)
 * 테스트 15 〉	통과 (0.66ms, 53.6MB)
 * 테스트 16 〉	통과 (0.47ms, 55.4MB)
 * 
 */