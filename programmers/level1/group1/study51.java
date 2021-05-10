/** programmers 문제풀이
 * 
 * ==========================================
 * 핸드폰 번호 가리기
 * 
 * 문제 설명
 * 프로그래머스 모바일은 개인정보 보호를 위해 고지서를 보낼 때 고객들의 
 * 전화번호의 일부를 가립니다.
 * 전화번호가 문자열 phone_number로 주어졌을 때, 전화번호의 뒷 4자리를 
 * 제외한 나머지 숫자를 전부 *으로 가린 문자열을 리턴하는 함수, 
 * solution을 완성해주세요.
 * 
 * 제한 조건
 * s는 길이 4 이상, 20이하인 문자열입니다.
 * 
 * 입출력 예
 * phone_number	return
 * "01033334444"	"*******4444"
 * "027778888"	"*****8888"
 * ===================================
 * 
 */


public class study51 {
    public String solution(String phone_number) {
        StringBuffer buf = new StringBuffer();
        char[] ch = phone_number.toCharArray();
        int idx= 0;
        int stop = ch.length-4;
        for(char c:ch){
            if(idx<stop){
                idx++;
                buf.append('*');
            }
            else {
                buf.append(c);
            }
        }
        String answer = buf.toString();
        return answer;
    }
}
/**
 * 실행 결과
 * 테스트 1 〉	통과 (0.08ms, 53.8MB)
 * 테스트 2 〉	통과 (0.08ms, 51.4MB)
 * 테스트 3 〉	통과 (0.07ms, 52.6MB)
 * 테스트 4 〉	통과 (0.08ms, 52.1MB)
 * 테스트 5 〉	통과 (0.11ms, 52.7MB)
 * 테스트 6 〉	통과 (0.08ms, 52.2MB)
 * 테스트 7 〉	통과 (0.09ms, 52.2MB)
 * 테스트 8 〉	통과 (0.07ms, 53.1MB)
 * 테스트 9 〉	통과 (0.08ms, 53.2MB)
 * 테스트 10 〉	통과 (0.08ms, 51.6MB)
 * 테스트 11 〉	통과 (0.07ms, 52.5MB)
 * 테스트 12 〉	통과 (0.07ms, 52.4MB)
 * 테스트 13 〉	통과 (0.07ms, 52.1MB)
 */