/** programmers 문제풀이
 * 
 * ==========================================
 * 문제 설명
 * 문자열 s는 한 개 이상의 단어로 구성되어 있습니다. 각 단어는 하나 이상의 
 * 공백문자로 구분되어 있습니다. 각 단어의 짝수번째 알파벳은 대문자로, 홀수번
 * 째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.
 * 
 * 제한 사항
 * 문자열 전체의 짝/홀수 인덱스가 아니라, 단어(공백을 기준)별로 짝/홀수 인덱
 * 스를 판단해야합니다.
 * 첫 번째 글자는 0번째 인덱스로 보아 짝수번째 알파벳으로 처리해야 합니다.
 * 입출력 예
 * s	                return
 * "try hello world"	"TrY HeLlO WoRlD"
 * ===================================
 * 
 * 단어의 인덱스가 짝수일때 대문자로 해줄 때, 공백이 있으면 인덱스가 초기화 되
 * 는 것을 유의해야한다. 이를 알려줄 부울 변수 하나를 만들어 두는 방법을 사용
 * 하였다.
 * 
 */


public class study41 {
    public String solution(String s) {
        StringBuffer buf = new StringBuffer();
        char[] c = s.toCharArray();
        boolean L = true;
        
        for(char tmp : c){
            if(tmp == ' '){
                L=true;
                buf.append(tmp);
                continue;
            }
            if(L){
                buf.append(Character.toUpperCase(tmp));
                L=false;
                continue;
            }
            L= true;
            buf.append(Character.toLowerCase(tmp));
            
        }
        
        return buf.toString();
    }
}
/**
 * 실행 결과
 * 테스트 1 〉	통과 (0.17ms, 51.5MB)
 * 테스트 2 〉	통과 (0.10ms, 52.1MB)
 * 테스트 3 〉	통과 (0.10ms, 52MB)
 * 테스트 4 〉	통과 (0.15ms, 52.9MB)
 * 테스트 5 〉	통과 (0.12ms, 52.3MB)
 * 테스트 6 〉	통과 (0.13ms, 52.1MB)
 * 테스트 7 〉	통과 (0.10ms, 51.9MB)
 * 테스트 8 〉	통과 (0.17ms, 52MB)
 * 테스트 9 〉	통과 (0.13ms, 51.8MB)
 * 테스트 10 〉	통과 (0.19ms, 52.2MB)
 * 테스트 11 〉	통과 (0.15ms, 53.1MB)
 * 테스트 12 〉	통과 (0.18ms, 52.1MB)
 * 테스트 13 〉	통과 (0.13ms, 55.1MB)
 * 테스트 14 〉	통과 (0.11ms, 52.3MB)
 * 테스트 15 〉	통과 (0.13ms, 52.1MB)
 * 테스트 16 〉	통과 (0.18ms, 52MB)
 */