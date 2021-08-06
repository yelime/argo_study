/** programmers 문제풀이
 * 
 * ==========================================
 * 음양 더하기
 * 
 * 문제 설명
 * 어떤 정수들이 있습니다. 이 정수들의 절댓값을 차례대로 담은 정수 배열 absolutes와 이 
 * 정수들의 부호를 차례대로 담은 불리언 배열 signs가 매개변수로 주어집니다. 실제 정수들의 
 * 합을 구하여 return 하도록 solution 함수를 완성해주세요.
 * 
 * 제한사항
 * absolutes의 길이는 1 이상 1,000 이하입니다.
 * absolutes의 모든 수는 각각 1 이상 1,000 이하입니다.
 * signs의 길이는 absolutes의 길이와 같습니다.
 * signs[i] 가 참이면 absolutes[i] 의 실제 정수가 양수임을, 그렇지 않으면 음수임을 
 * 의미합니다.
 * 
 * 입출력 예
 * absolutes	signs	            result
 * [4,7,12]	    [true,false,true]	9
 * [1,2,3]	    [false,false,true]	0
 * ===================================
 * 
 * 자연수를 받고 부호를 부울로 받아서 모든 것을 더하기만 하면 되는 문제이므로 차례대로
 * 합하면 되는 문제이다.
 * 
 */

public class study17 {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for(int i=0;i<signs.length;i++){
            if(signs[i]){
                answer += absolutes[i];
                continue;
            }
            answer -= absolutes[i];
        }
        return answer;
    }
}

/**
 * 실행 결과
 * 테스트 1 〉	통과 (0.05ms, 52.4MB)
 * 테스트 2 〉	통과 (0.06ms, 52.6MB)
 * 테스트 3 〉	통과 (0.05ms, 52.4MB)
 * 테스트 4 〉	통과 (0.06ms, 51.6MB)
 * 테스트 5 〉	통과 (0.05ms, 52.1MB)
 * 테스트 6 〉	통과 (0.07ms, 52.7MB)
 * 테스트 7 〉	통과 (0.05ms, 53.1MB)
 * 테스트 8 〉	통과 (0.06ms, 52.5MB)
 * 테스트 9 〉	통과 (0.06ms, 52.2MB)
 */