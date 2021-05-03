/** programmers 문제풀이
 * 
 * ==========================================
 * 문자열 내림차순으로 배치하기
 * 
 * 문제 설명
 * 문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함
 * 수, solution을 완성해주세요.
 * s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.
 * 
 * 제한 사항
 * str은 길이 1 이상인 문자열입니다.
 * 
 * 입출력 예
 * s	        return
 * "Zbcdefg"	"gfedcbZ"
 * ===================================
 * 
 * 문자열을 문자열 배열로 만들어서 정렬하는 방식이 있지만 불필요한 자원 낭비가 예상되어
 * char[]로 만들어 준다음 정렬 후 뒤집어 준 후 합쳐주었다. String 배열은 sort에 
 * reverse가 있지만 char[]은 reverse가 없어서 StringBuffer에서 reverse를 적용했다.
 * 
 */

import java.util.*;

public class study34 {
    public String solution(String s) {
        char[] tmp = s.toCharArray();
        Arrays.sort(tmp);
        String answer = new StringBuffer().append(tmp).reverse().toString();
        return answer;
    }
}

/**
 * 실행 결과
 * 테스트 1 〉	통과 (0.49ms, 52.8MB)
 * 테스트 2 〉	통과 (0.50ms, 52MB)
 * 테스트 3 〉	통과 (0.38ms, 52.9MB)
 * 테스트 4 〉	통과 (0.91ms, 52MB)
 * 테스트 5 〉	통과 (0.73ms, 52.1MB)
 * 테스트 6 〉	통과 (0.60ms, 52.8MB)
 * 테스트 7 〉	통과 (0.71ms, 52.6MB)
 * 테스트 8 〉	통과 (0.67ms, 52.8MB)
 * 테스트 9 〉	통과 (0.55ms, 53.9MB)
 * 테스트 10 〉	통과 (0.61ms, 52.2MB)
 * 테스트 11 〉	통과 (0.54ms, 52.1MB)
 * 테스트 12 〉	통과 (0.52ms, 51.9MB)
 * 테스트 13 〉	통과 (0.53ms, 52.7MB)
 * 테스트 14 〉	통과 (0.55ms, 53.1MB)
 * 테스트 15 〉	통과 (0.55ms, 52.9MB)
 * 테스트 16 〉	통과 (0.50ms, 51.8MB)
 */