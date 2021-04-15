/** programmers 문제풀이
 * 
 * ==========================================
 * K번째수
 * 
 * 문제 설명
 * 배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수를 구하려고
 * 합니다.
 * 예를 들어 array가 [1, 5, 2, 6, 3, 7, 4], i=2, j=5, k=3 이라면
 *  array의 2번째부터 5번째까지 자르면 [5, 2, 6, 3]입니다.
 *  1에서 나온 배열을 정렬하면 [2, 3, 5, 6]입니다.
 *  2에서 나온 배열의 3번째 숫자는 5입니다.
 * 배열 array, [i, j, k]를 원소로 가진 2차원 배열 commands가 매개변수로 주어질 때, 
 * commands의 모든 원소에 대해 앞서 설명한 연산을 적용했을 때 나온 결과를 배열에 담아 
 * return 하도록 solution 함수를 작성해주세요.
 * 
 * 제한사항
 *  array의 길이는 1 이상 100 이하입니다.
 *  array의 각 원소는 1 이상 100 이하입니다.
 *  commands의 길이는 1 이상 50 이하입니다.
 *  commands의 각 원소는 길이가 3입니다.
 * 
 * 입출력 예
 * array	                        commands	                return
 * [1, 5, 2, 6, 3, 7, 4]	[[2, 5, 3], [4, 4, 1], [1, 7, 3]]	[5, 6, 3]
 * ===================================
 * 
 * 이 문제는 정렬을 해서 풀어야하지만 주의할건 커멘드마다 정렬의 범위가 다르다는 것이다.
 * 즉, array를 정렬을 하고 commands를 받을 경우 오답이 나온다.
 * 
 * 그래서 범위로 자른 후, 정렬을 하는 것도 방법이지만 우리가 얻어야하는 건 정렬된 배열이 아니라
 * 범위내에서 정렬이 됬다는 가정하에 K번째의 번호를 찾는 것이다.
 * 
 * 이는 다르게 받아들이면 앞에서든 뒤에서든 K번째까지만 정렬이 되면 답을 찾을 수 있다는 것이다.
 * 그래서 전체 정렬할시 시간복잡도가 높지만 K번째까지라면 selection정렬이 효율적이라 판단하여
 * 적용해 봤다.
 * 
 * commands의 범위를 기준으로 중앙보다 k가 작을 경우 작은 순으로, k가 클 경우는 큰 순으로 정렬을
 * 진행하다 k번째에서 정렬을 그만 두는 방식을 사용했다.
 * 이 방식은 최악의 경우는 commands가 1,100,50 일 경우가 최악의 경우지만, 양끝에 가까울수록
 * 빠른 결과를 받을 수 있을 것이라 예상된다.
 */


class study7 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
        answer = new int[commands.length];
        
        for(int i=0;i<answer.length;i++){
            answer[i] = fc1(array,commands[i]);
        }
        
        return answer;
    }
    //k번째 값을 반환 하는 함수
    public static int fc1(int[] array,int[] command){
        //array에서 직접 구할 수 있지만 보기도 복잡하고 귀찮아서 임의의 범위 배열을 만들어준다.
        //단, 길이가 1즉 바로 답이 나올 경우 그냥 반환한다.
        int len = command[1]-command[0]+1;
        if(len==1){
            return array[command[0]-1];
        }
        int[] tmp = new int[len];
        for(int i=0;i<len;i++){
            tmp[i] = array[command[0]+i-1];
        }
        //정렬을 하는 부분
        int idx=0;
        //최대값이 가까우면 최대값부터 정렬을 시작
        if(command[2]>len/2){
            for(int i=0;i<len-command[2]+1;i++){
                int max=0;
                for(int j=0;j<tmp.length-i;j++){
                    if(max<tmp[j]){
                        idx=j;
                        max = tmp[j];
                    }    
                }
                tmp[idx] = tmp[tmp.length-1-i];
                tmp[tmp.length-1-i] = max;
                idx = 0;
            }
        }
        //최소값이 가까우면 최소값부터 정렬을 시작
        else {
            for(int i=0;i<len-command[2]+1;i++){
                int min = 101;
                for(int j=i;j<tmp.length;j++){
                    if(min>tmp[j]){
                        idx=j;
                        min = tmp[j];
                    }
                }
                tmp[idx] = tmp[i];
                tmp[i] = min;
                idx=0;
            }
        }
        return tmp[command[2]-1];
    }
}
/**
 * 실행 결과
 * 테스트 1 〉	통과 (0.03ms, 52.4MB)
 * 테스트 2 〉	통과 (0.02ms, 52.8MB)
 * 테스트 3 〉	통과 (0.02ms, 52.7MB)
 * 테스트 4 〉	통과 (0.02ms, 52.6MB)
 * 테스트 5 〉	통과 (0.02ms, 51.9MB)
 * 테스트 6 〉	통과 (0.03ms, 52.5MB)
 * 테스트 7 〉	통과 (0.02ms, 53.1MB)
 */