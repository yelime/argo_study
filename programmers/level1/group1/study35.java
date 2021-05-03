/** programmers 문제풀이
 * 
 * ==========================================
 * 수박수박수박수박수박수?
 * 
 * 문제 설명
 * 길이가 n이고, "수박수박수박수...."와 같은 패턴을 유지하는 문자열을 
 * 리턴하는 함수, solution을 완성하세요. 예를들어 n이 4이면 "수박수박"
 * 을 리턴하고 3이라면 "수박수"를 리턴하면 됩니다.
 * 
 * 제한 조건
 * n은 길이 10,000이하인 자연수입니다.
 * 
 * 입출력 예
 * n	return
 * 3	"수박수"
 * 4	"수박수박"
 * ===================================
 * 
 * n만큼 수와 박을 돌아가면 되는 문제이다.
 * 길이가 10,000 이하이기 때문에 String으로 "수박수박수박수박....수박"을 만들고 
 * 잘라서 답을 내는거도 하나의 답일 수도 있지만, StringBuffer를 이용해서 문자열을
 * 담고 String으로 반환하는 방식을 사용하였다.
 * 
 */

public class study35 {
    public String solution(int n) {
        StringBuffer buf = new StringBuffer();
        for(int i = 0; i<n/2; i++){
            buf.append("수박");
        }
        if(n%2==1){
            buf.append("수");
        }
        return buf.toString();
    }
}
/**
 * 실행 결과
 * 테스트 1 〉	통과 (0.20ms, 54MB)
 * 테스트 2 〉	통과 (0.53ms, 53.4MB)
 * 테스트 3 〉	통과 (0.39ms, 53.1MB)
 * 테스트 4 〉	통과 (0.58ms, 53.1MB)
 * 테스트 5 〉	통과 (0.36ms, 52.1MB)
 * 테스트 6 〉	통과 (0.10ms, 52.7MB)
 * 테스트 7 〉	통과 (0.10ms, 52.1MB)
 * 테스트 8 〉	통과 (0.10ms, 52.6MB)
 * 테스트 9 〉	통과 (0.16ms, 52.5MB)
 * 테스트 10 〉	통과 (0.11ms, 51.9MB)
 * 테스트 11 〉	통과 (0.10ms, 52.3MB)
 * 테스트 12 〉	통과 (0.11ms, 52MB)
 * 테스트 13 〉	통과 (0.11ms, 51.8MB)
 * 테스트 14 〉	통과 (0.12ms, 52.6MB)
 * 테스트 15 〉	통과 (1.05ms, 52.9MB)
 * 테스트 16 〉	통과 (0.10ms, 53.1MB)
 */