/** programmers 문제풀이
 * 
 * ==========================================
 * 크레인 인형뽑기 게임
 * 
 * 문제 설명
 * "N x N" 인 정사각 격자에 숫자가 채워져있다.
 * 빈 곳은 0 채워져 있으면 자연수가 들어있다.
 * 이는 2차원 배열 board로 전달되고,
 * 
 * 크레인의 작동 위치는 1차원 배열 moves로 전달된다.
 * 크레인은 가장 위의 숫자를 가져와 바구니에 담는데,
 * 바구니에는 순서대로 쌓이고 바로 앞의 숫자와 같으면 사라진다.
 * 만약 크레인의 위치에 숫자가 전부 0일 경우 아무런 변화는 없다.
 * 
 * 이 규칙을 가지고 진행할때 사라진 인형의 갯수를 반환해보자.
 * 
 * 제한사항
 * board 배열은 2차원 배열로 크기는 "5 x 5" 이상 "30 x 30" 이하입니다.
 * board의 각 칸에는 0 이상 100 이하인 정수가 담겨있습니다.
 *  0은 빈 칸을 나타냅니다.
 *  1 ~ 100의 각 숫자는 각기 다른 인형의 모양을 의미하며 같은 숫자는 같은 모양의 인형을 나타냅니다.
 * moves 배열의 크기는 1 이상 1,000 이하입니다.
 * moves 배열 각 원소들의 값은 1 이상이며 board 배열의 가로 크기 이하인 자연수입니다.
 * 
 * 입출력 예
 *     board	        moves	        result
 * [
 *  [0,0,0,0,0],
 *  [0,0,1,0,3],
 *  [0,2,5,0,1],  [1,5,3,5,1,2,1,4]	    4
 *  [4,2,4,4,2],
 *  [3,5,1,3,1]
 * ]	
 * ===================================
 * 
 * 이 문제는 스택을 이용하면 쉽게 풀리는 문제이지만
 * moves 배열의 크기는 1~1000까지 적은 수로 제한되어 있으므로
 * 1차원배열을 moves의 크기만큼 만들어서 이를 스택처럼 사용하려 한다.
 * 
 * 
 */



class study2 {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        //스택처럼 사용하기 위한 1차원 배열과 위치를 알려준 idx
        int[] stack = new int[moves.length+1];
        int idx = 0;

        for(int i =0;i<moves.length;i++){
            int x = moves[i]-1;
            for(int j=0;j<board.length;j++){
                if(board[j][x]!= 0){
                    //처음은 무조건 들어간다. 
                    if(idx==0){
                        stack[idx++]=board[j][x];
                    }
                    //처음이 아니면 바로 전에 들어간 값을 확인한다.
                    else if(board[j][x]==stack[idx-1]){
                        idx--;
                        answer++;
                    }else {
                        stack[idx++]=board[j][x];
                    }
                    //뽑은 인형은 격자에서 없애야 하므로 0으로 해준다.
                    board[j][x] = 0;
                    
                    break;
                }
            }
        }
        //쌍으로 없어지므로 마지막에 2배를 해준다.
        answer=answer*2;
        return answer;
    }
}

/**
 * 실행 결과 4번 케이스의 경우 시간이 엄청 오래 걸렸는데 이는
 * 격자의 크기가 크기에 비해 숫자가 적었을 경우이지 않을까 싶다.
 * 테스트 1 〉	통과 (0.03ms, 52.8MB)
 * 테스트 2 〉	통과 (0.02ms, 52.5MB)
 * 테스트 3 〉	통과 (0.03ms, 52.3MB)
 * 테스트 4 〉	통과 (0.49ms, 52.5MB)
 * 테스트 5 〉	통과 (0.03ms, 52.2MB)
 * 테스트 6 〉	통과 (0.03ms, 52.8MB)
 * 테스트 7 〉	통과 (0.04ms, 51.9MB)
 * 테스트 8 〉	통과 (0.13ms, 52.8MB)
 * 테스트 9 〉	통과 (0.11ms, 52.8MB)
 * 테스트 10 〉	통과 (0.15ms, 53MB)
 * 테스트 11 〉	통과 (0.30ms, 53.2MB)
 * 
 */