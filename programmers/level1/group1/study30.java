/** programmers 문제풀이
 * 
 * ==========================================
 * 서울에서 김서방 찾기
 * 
 * 문제 설명
 * String형 배열 seoul의 element중 "Kim"의 위치 x를 찾아, "김서방은 x에 있다"는 
 * String을 반환하는 함수, solution을 완성하세요. seoul에 "Kim"은 오직 한 번만 나
 * 타나며 잘못된 값이 입력되는 경우는 없습니다.
 * 
 * 제한 사항
 * seoul은 길이 1 이상, 1000 이하인 배열입니다.
 * seoul의 원소는 길이 1 이상, 20 이하인 문자열입니다.
 * "Kim"은 반드시 seoul 안에 포함되어 있습니다.
 * 
 * 입출력 예
 * seoul	        return
 * ["Jane", "Kim"]	"김서방은 1에 있다"
 * ===================================
 * 이 문제는 "Kim" 문자를 찾는 것이다. 
 * 
 */

public class study30 {
    public String solution(String[] seoul) {
        int idx = -1;
        for(String tmp : seoul){
            idx++;
            if(tmp.equals("Kim")){
                return "김서방은 idx에 있다".replaceAll("idx",String.valueOf(idx));
            }
        }
        return "";
    }
}
/**
 * 실행 결과
 * 테스트 1 〉	통과 (0.31ms, 52.4MB)
 * 테스트 2 〉	통과 (0.32ms, 52.4MB)
 * 테스트 3 〉	통과 (0.31ms, 52.5MB)
 * 테스트 4 〉	통과 (0.31ms, 52.3MB)
 * 테스트 5 〉	통과 (0.28ms, 52.5MB)
 * 테스트 6 〉	통과 (0.28ms, 52MB)
 * 테스트 7 〉	통과 (0.28ms, 52.3MB)
 * 테스트 8 〉	통과 (0.26ms, 51.9MB)
 * 테스트 9 〉	통과 (0.27ms, 52.9MB)
 * 테스트 10 〉	통과 (0.27ms, 52.4MB)
 * 테스트 11 〉	통과 (0.24ms, 52.9MB)
 * 테스트 12 〉	통과 (0.31ms, 53.4MB)
 * 테스트 13 〉	통과 (0.34ms, 52.5MB)
 * 테스트 14 〉	통과 (0.31ms, 53.3MB)
 */
