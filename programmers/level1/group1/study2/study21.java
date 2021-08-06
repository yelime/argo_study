/** programmers 문제풀이
 * 
 * ==========================================
 * 문자열 다루기 기본
 * 
 * 문제 설명
 * 문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, 
 * solution을 완성하세요. 예를 들어 s가 "a234"이면 False를 리턴하고 "1234"
 * 라면 True를 리턴하면 됩니다.
 * 
 * 제한 사항
 * s는 길이 1 이상, 길이 8 이하인 문자열입니다.
 * 
 * 입출력 예
 * s	    return
 * "a234"	false
 * "1234"	true
 * ===================================
 * 
 * 문자열을 다루는 문제로 패턴은 없고, 길이와 숫자라는 조건만 맞으면 통과시키는
 * 문제이다. 이를 위해서 바꾸기전의 문자열의 길이로 4 or 6을 만족하는지 파악한 후
 * 숫자외의 것을 지운뒤 길이가 같다면 숫자로만 있던 것이고, 다르다면 예외가 존재
 * 했다는 것이므로 false를 반환하면 된다.
 * 
 */

class study21 {
    public boolean solution(String s) {
        int len = s.length();
        if(len!=4 && len !=6){
            return false;
        }
        s=s.replaceAll("[^0-9]","");
        if(s.length()==len){
            return true;
        }
        return false;
    }
}
/**
 * 실행 결과
 * 테스트 1 〉	통과 (0.10ms, 52.3MB)
 * 테스트 2 〉	통과 (0.03ms, 52.2MB)
 * 테스트 3 〉	통과 (0.09ms, 52.8MB)
 * 테스트 4 〉	통과 (0.09ms, 52.2MB)
 * 테스트 5 〉	통과 (0.01ms, 53.2MB)
 * 테스트 6 〉	통과 (0.02ms, 52.3MB)
 * 테스트 7 〉	통과 (0.02ms, 52.7MB)
 * 테스트 8 〉	통과 (0.08ms, 51.9MB)
 * 테스트 9 〉	통과 (0.12ms, 52.5MB)
 * 테스트 10 〉	통과 (0.07ms, 52.3MB)
 * 테스트 11 〉	통과 (0.10ms, 51.9MB)
 * 테스트 12 〉	통과 (0.02ms, 52.3MB)
 * 테스트 13 〉	통과 (0.02ms, 53.1MB)
 * 테스트 14 〉	통과 (0.06ms, 52.7MB)
 * 테스트 15 〉	통과 (0.09ms, 52.4MB)
 * 테스트 16 〉	통과 (0.07ms, 53.4MB)
 */