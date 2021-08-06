/** programmers 문제풀이
 * 
 * ==========================================
 * 최대공약수와 최소공배수
 * 문제 설명
 * 
 * 두 수를 입력받아 두 수의 최대공약수와 최소공배수를 반환하는 함수, solution을 완성해 보세요. 
 * 배열의 맨 앞에 최대공약수, 그다음 최소공배수를 넣어 반환하면 됩니다. 예를 들어 두 수 3, 12의 
 * 최대공약수는 3, 최소공배수는 12이므로 solution(3, 12)는 [3, 12]를 반환해야 합니다.
 * 
 * 제한 조건
 * 두 수는 1이상 1000000이하의 자연수입니다.
 * 
 * 입출력 예
 * n	m	return
 * 3	12	[3, 12]
 * 2	5	[1, 10]
 * ===================================
 * 
 * 
 */

class Solution {
    public int[] solution(int n, int m) {
        int max = 1;
        int min = 1;
        
        int big, small;
        
        if(n>m){
            big = n;
            small = m;
        }
        else {
            small = n;
            big = m;
        }
        int[] answer={small,big};
        if(big%small==0){
            return answer;
        }
        
        int tmp =0;
        while (small !=0){
            tmp = big%small;
            big = small;
            small = tmp;
        }
        max = big;
        min = n*m;
        answer[0] = max;
        answer[1] = min/max;
        
        return answer;
    }
}