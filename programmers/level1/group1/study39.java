/** programmers 문제풀이
 * 
 * ==========================================
 * 콜라츠 추측
 * 
 * 문제 설명
 * 1937년 Collatz란 사람에 의해 제기된 이 추측은, 주어진 수가 1이 될때까지 다음 
 * 작업을 반복하면, 모든 수를 1로 만들 수 있다는 추측입니다. 작업은 다음과 같습니
 * 다.
 * 
 *  1-1. 입력된 수가 짝수라면 2로 나눕니다. 
 *  1-2. 입력된 수가 홀수라면 3을 곱하고 1을 더합니다.
 *  2. 결과로 나온 수에 같은 작업을 1이 될 때까지 반복합니다.
 * 
 * 예를 들어, 입력된 수가 6이라면 6→3→10→5→16→8→4→2→1 이 되어 총 8번 만에 1이 
 * 됩니다. 위 작업을 몇 번이나 반복해야하는지 반환하는 함수, solution을 완성해 
 * 주세요. 단, 작업을 500번을 반복해도 1이 되지 않는다면 –1을 반환해 주세요.
 * 
 * 제한 사항
 * 입력된 수, num은 1 이상 8000000 미만인 정수입니다.
 * 
 * 입출력 예
 * n	    result
 * 6	    8
 * 16	    4
 * 626331	-1
 * ===================================
 * 
 * 이 문제는 오버플로우가 발생한다.num은 int 범위 내지만 홀 수의 경우 3배가 아
 * 니라 10배 이상이 될 수 있어서 곱할 곳은 long으로 범위를 바꿔주어야 한다.
 * 그 후 1이 될때까지 반복을 돌리면 된다.
 * 
 */

public class study39 {
    public int solution(int num) {
        int answer = 0;
        long n = num;
        while(n!=1){
            if(answer==500){
                return -1;
            }
            answer++;
            n = (n%2 == 0) ? n/2: n*3+1;
        }
        return answer;
    }
}

/**
 * 실행 결과
 * 테스트 1 〉	통과 (0.03ms, 52.3MB)
 * 테스트 2 〉	통과 (0.03ms, 52.6MB)
 * 테스트 3 〉	통과 (0.03ms, 51.8MB)
 * 테스트 4 〉	통과 (0.03ms, 52.3MB)
 * 테스트 5 〉	통과 (0.10ms, 51.8MB)
 * 테스트 6 〉	통과 (0.03ms, 51.9MB)
 * 테스트 7 〉	통과 (0.06ms, 52.8MB)
 * 테스트 8 〉	통과 (0.03ms, 53.1MB)
 * 테스트 9 〉	통과 (0.04ms, 52.4MB)
 * 테스트 10 〉	통과 (0.05ms, 52.5MB)
 * 테스트 11 〉	통과 (0.06ms, 52.2MB)
 * 테스트 12 〉	통과 (0.04ms, 52.4MB)
 * 테스트 13 〉	통과 (0.02ms, 52MB)
 * 테스트 14 〉	통과 (0.03ms, 51.9MB)
 * 테스트 15 〉	통과 (0.04ms, 51.7MB)
 * 테스트 16 〉	통과 (0.02ms, 52.9MB)
 */