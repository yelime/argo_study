/** programmers 문제풀이
 * 
 * ==========================================
 * 두 개 뽑아서 더하기
 * 
 * 문제 설명
 * 정수 배열 numbers가 주어집니다. numbers에서 서로 다른 인덱스에 있는 두 
 * 개의 수를 뽑아 더해서 만들 수 있는 모든 수를 배열에 오름차순으로 담아 
 * return 하도록 solution 함수를 완성해주세요.
 * 
 * 제한사항
 * numbers의 길이는 2 이상 100 이하입니다.
 *   numbers의 모든 수는 0 이상 100 이하입니다.
 * 
 * 입출력 예
 *  numbers	    result
 * [2,1,3,4,1]	[2,3,4,5,6,7]
 * [5,0,2,7]	[2,5,7,9,12]
 * ===================================
 * 
 * 제가 문제에서 주의깊게 본 부분은 결과는 오름차순과
 * 제한 사항으로 길이는 2~100이고, 모든 수는 0~100까지라는 것이다.
 * 
 * 이는 result값은 0~200뿐이라는 것이다.
 * 그래서 bool배열을 이용하여 0~200에서 결과로 나온 걸 체크하고
 * 이를 오름차순 배열로 만들어서 반환하려한다.
 */

class study1 {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        
        boolean[] check = new boolean[201];
        //모든 값을 더해보는 경우
        for(int i =0; i<numbers.length;i++){
            for(int j =i+1;j<numbers.length;j++){
                int tmp = numbers[i]+numbers[j];
                check[tmp] = true;
            }
        }
        //answer의 크기를 구한다.
        int count = 0;
        for(int i = 0;i<201;i++){
            if(check[i]){
                count++;
            }
        }
        //본격적으로 answer을 만드는 부분
        answer = new int[count];
        int N = 0;
        for(int i=0;i<201;i++){
            if(check[i]){
                answer[N++] = i;
            }
        }
        
        return answer;
    }
}

/*
 * 실행 결과 7,8,9의 경우 nubers의 크기가 큰지 시간이 오래걸렸으나 무사 통과
 * 테스트 1 〉	통과 (0.02ms, 53MB)
 * 테스트 2 〉	통과 (0.04ms, 52.4MB)
 * 테스트 3 〉	통과 (0.03ms, 52.4MB)
 * 테스트 4 〉	통과 (0.03ms, 52.6MB)
 * 테스트 5 〉	통과 (0.03ms, 53.2MB)
 * 테스트 6 〉	통과 (0.03ms, 52.2MB)
 * 테스트 7 〉	통과 (0.16ms, 53.3MB)
 * 테스트 8 〉	통과 (0.19ms, 52.8MB)
 * 테스트 9 〉	통과 (0.18ms, 52.6MB)
 * 
*/