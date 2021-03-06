/** programmers 문제풀이
 * 
 * ==========================================
 * 124 나라의 숫자
 * 문제 설명
 * 124 나라가 있습니다. 124 나라에서는 10진법이 아닌 다음과 같은 자신들만의 규칙으로 
 * 수를 표현합니다.
 * 
 * 124 나라에는 자연수만 존재합니다.
 * 124 나라에는 모든 수를 표현할 때 1, 2, 4만 사용합니다.
 * 예를 들어서 124 나라에서 사용하는 숫자는 다음과 같이 변환됩니다.
 * 
 * 10진법	124 나라	10진법	 124 나라
 * 1	    1	        6	    14
 * 2	    2	        7	    21
 * 3	    4	        8	    22
 * 4	    11	        9	    24
 * 5	    12	        10	    41
 * 자연수 n이 매개변수로 주어질 때, n을 124 나라에서 사용하는 숫자로 바꾼 값을 
 * return 하도록 solution 함수를 완성해 주세요.
 * 
 * 제한사항
 * n은 500,000,000이하의 자연수 입니다.
 * 
 * 입출력 예
 * n	result
 * 1	1
 * 2	2
 * 3	4
 * 4	11
 * ===================================
 * 
 * 이 문제는 3진법이라 생각할 수 있지만 0이 없다는 사실을 잊으면 안된다.
 * 3의 경우 3진법으로 10 이지만 여기서는 4 가 정답이다. 그래서 모든 자리수가 
 * 0이 될 수 없다는 사실을 이용해서 3의 거듭제곱을 나누어 나머지를 전 거듭제곱
 * 으로 나눈 몫이 124 나라의 수가 됨을 이용해서 해결했다.
 * 
 */


public class study45 {
    public String solution(int n) {
        StringBuffer buf = new StringBuffer();
        //======================
        int three = 1;
        while(n>0){
            three *=3;
            int tmp = n%three;
            if(tmp == 0){
                buf.append('4');
                n-=three;
                continue;
            }
            three /=3;
            int m = tmp/three;
            if(m==1){
                buf.append('1');
                
            }else{
                buf.append('2');
            }
            n-=tmp;
            three *=3;
        }
        //=================
        /** 위의 부분을 이 부분으로 바꿀 수도 있다.
         * 
        char[] c = {'4','1','2'};
        while(n>0){
            buf.append(c[n%3]);
            n= (n-1)/3;
        }
         */
        String answer = buf.reverse().toString();
        return answer;
    }
}

/**
 * 실행 결과
 * 정확성  테스트
 * 테스트 1 〉	통과 (0.08ms, 52.5MB)
 * 테스트 2 〉	통과 (0.05ms, 52.9MB)
 * 테스트 3 〉	통과 (0.08ms, 52.6MB)
 * 테스트 4 〉	통과 (0.07ms, 53MB)
 * 테스트 5 〉	통과 (0.08ms, 51.9MB)
 * 테스트 6 〉	통과 (0.07ms, 53MB)
 * 테스트 7 〉	통과 (0.09ms, 52.9MB)
 * 테스트 8 〉	통과 (0.08ms, 52.4MB)
 * 테스트 9 〉	통과 (0.08ms, 52.6MB)
 * 테스트 10 〉	통과 (0.08ms, 51.9MB)
 * 테스트 11 〉	통과 (0.07ms, 52.8MB)
 * 테스트 12 〉	통과 (0.09ms, 52.6MB)
 * 테스트 13 〉	통과 (0.07ms, 52.6MB)
 * 테스트 14 〉	통과 (0.08ms, 52.4MB)
 * 
 * 효율성  테스트
 * 테스트 1 〉	통과 (0.09ms, 52.8MB)
 * 테스트 2 〉	통과 (0.08ms, 52MB)
 * 테스트 3 〉	통과 (0.08ms, 53.6MB)
 * 테스트 4 〉	통과 (0.07ms, 52.1MB)
 * 테스트 5 〉	통과 (0.08ms, 52.7MB)
 * 테스트 6 〉	통과 (0.06ms, 52.6MB)
 */