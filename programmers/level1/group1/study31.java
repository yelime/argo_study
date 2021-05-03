/** programmers 문제풀이
 * 
 * ==========================================
 * 시저 암호
 * 문제 설명
 * 어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 
 * 방식을 시저 암호라고 합니다. 예를 들어 "AB"는 1만큼 밀면 "BC"가 되고, 3만큼 
 * 밀면 "DE"가 됩니다. "z"는 1만큼 밀면 "a"가 됩니다. 문자열 s와 거리 n을 입력
 * 받아 s를 n만큼 민 암호문을 만드는 함수, solution을 완성해 보세요.
 * 
 * 제한 조건
 * 공백은 아무리 밀어도 공백입니다.
 * s는 알파벳 소문자, 대문자, 공백으로만 이루어져 있습니다.
 * s의 길이는 8000이하입니다.
 * n은 1 이상, 25이하인 자연수입니다.
 * 
 * 입출력 예
 * s	    n	result
 * "AB"	    1	"BC"
 * "z"	    1	"a"
 * "a B z"	4	"e F d"
 * ===================================
 * 
 * 주어진 string을 n만큼 밀어서 새로운 string을 만드는 문제이다.
 * 이때 string을 charAt으로 한다음 새로운 string을 만들면 풀리지만 시간이 오래
 * 걸린다. 그래서 string을 char[]로 만든 다음 stringbuffer를 이용해서 만들어 
 * 시간을 단축시겼다.
 * 
 */

public class study31 {
    public String solution(String s, int n) {
        char[] word = s.toCharArray();
        int idx = -1;
        for(char t : word){
            idx++;
            if(t == ' '){
                continue;
            } else if(t>='a' && t<='z'){
                t += n;
                if(t>'z'){
                    t-=26;
                }
            } else {
                t += n;
                if(t>'Z'){
                    t-=26;
                }
            }
            word[idx] = t;
            
        }
        return new StringBuffer().append(word).toString();
    }
}

/**
 * 실행 결과 StringBuffer을 사용했을 때와 아닐 때 시간이 100배 차이가 났다.
 * 테스트 1 〉	통과 (0.09ms, 52.5MB)
 * 테스트 2 〉	통과 (0.10ms, 52.4MB)
 * 테스트 3 〉	통과 (0.07ms, 52.1MB)
 * 테스트 4 〉	통과 (0.10ms, 52.3MB)
 * 테스트 5 〉	통과 (0.09ms, 52.2MB)
 * 테스트 6 〉	통과 (0.09ms, 53MB)
 * 테스트 7 〉	통과 (0.09ms, 52.5MB)
 * 테스트 8 〉	통과 (0.09ms, 52.7MB)
 * 테스트 9 〉	통과 (0.08ms, 52.5MB)
 * 테스트 10 〉	통과 (0.09ms, 52.3MB)
 * 테스트 11 〉	통과 (0.07ms, 53.8MB)
 * 테스트 12 〉	통과 (0.10ms, 52.2MB)
 * 테스트 13 〉	통과 (1.31ms, 53.5MB)
 */