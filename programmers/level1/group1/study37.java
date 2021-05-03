/** programmers 문제풀이
 * 
 * ==========================================
 * [카카오 인턴] 키패드 누르기
 * 문제 설명
 * 스마트폰 전화 키패드의 각 칸에 다음과 같이 숫자들이 적혀 있습니다.
 * 
 * 이 전화 키패드에서 왼손과 오른손의 엄지손가락만을 이용해서 숫자만을 입력하려고 합니다.
 * 맨 처음 왼손 엄지손가락은 * 키패드에 오른손 엄지손가락은 # 키패드 위치에서 시작하며, 
 * 엄지손가락을 사용하는 규칙은 다음과 같습니다.
 * 
 * 1. 엄지손가락은 상하좌우 4가지 방향으로만 이동할 수 있으며 키패드 이동 한 칸은 거리로 1에 
 * 해당합니다.
 * 2. 왼쪽 열의 3개의 숫자 1, 4, 7을 입력할 때는 왼손 엄지손가락을 사용합니다.
 * 3. 오른쪽 열의 3개의 숫자 3, 6, 9를 입력할 때는 오른손 엄지손가락을 사용합니다.
 * 4. 가운데 열의 4개의 숫자 2, 5, 8, 0을 입력할 때는 두 엄지손가락의 현재 키패드의 위치에서 
 * 더 가까운 엄지손가락을 사용합니다.
 *  4-1. 만약 두 엄지손가락의 거리가 같다면, 오른손잡이는 오른손 엄지손가락, 왼손잡이는 왼
 *  손 엄지손가락을 사용합니다.
 * 
 * 순서대로 누를 번호가 담긴 배열 numbers, 왼손잡이인지 오른손잡이인 지를 나타내는 문자열 
 * hand가 매개변수로 주어질 때, 각 번호를 누른 엄지손가락이 왼손인 지 오른손인 지를 나타내는 
 * 연속된 문자열 형태로 return 하도록 solution 함수를 완성해주세요.
 * 
 * [제한사항]
 * numbers 배열의 크기는 1 이상 1,000 이하입니다.
 * numbers 배열 원소의 값은 0 이상 9 이하인 정수입니다.
 * hand는 "left" 또는 "right" 입니다.
 * "left"는 왼손잡이, "right"는 오른손잡이를 의미합니다.
 * 왼손 엄지손가락을 사용한 경우는 L, 오른손 엄지손가락을 사용한 경우는 R을 순서대로 이어붙
 * 여 문자열 형태로 return 해주세요.
 * 
 * 입출력 예
 * numbers	                            hand	    result
 * [1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5]	"right"	    "LRLLLRLLRRL"
 * [7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2]	"left"	    "LRLLRRLLLRR"
 * [1, 2, 3, 4, 5, 6, 7, 8, 9, 0]	    "right"	    "LLRLLRLLRL"
 * ===================================
 * 
 * 이 문제는 현재 두 손가락의 위치와 목표 위치의 거리를 기준으로 손가락의 위치가 바뀌는 데 
 * 중요한 것은 거리가 대각선으로 갈 수 없다는 것이 중요하다. 예를 들어 왼쪽이 1이고 오른쪽
 * 이 0인데 목표가 5일때 거리상으로는 왼쪽이 더 가깝다. 하지만 이는 대각선이 가능할때이고,
 * 상하좌우만 움직이므로 거리는 동일하고 hand 값에 의해 좌우된다.
 * 이 점을 간과하면 12번 테케부터 실패를....
 * 
 * 
 */
public class study37 {
    public String solution(int[] numbers, String hand) {
        boolean right = false;
        StringBuffer result = new StringBuffer();
        int ridx = 12;
        int lidx = 10;
        if(hand.equals("right")){
            right = true;
        }
        for(int tmp : numbers){
            if(tmp == 0){
                tmp = 11;
            }
            if(tmp%3 == 1){
                result.append('L');
                lidx = tmp;
                continue;
            } else if(tmp%3 == 0){
                result.append('R');
                ridx = tmp;
                continue;
            }
            
            int ry = (ridx-1)/3 - (tmp-1)/3;
            int rx = (ridx-1)%3 - (tmp-1)%3;
            int ly = (lidx-1)/3 - (tmp-1)/3;
            int lx = (lidx-1)%3 - (tmp-1)%3;
            
            ry = ry<0?ry*-1: ry;
            rx = rx<0?rx*-1: rx;
            ly = ly<0?ly*-1: ly;
            lx = lx<0?lx*-1: lx;
            
            int rl = ry + rx;
            int ll = ly + lx;
            if(ll==rl){
                if(right){
                    result.append('R');
                    ridx = tmp;
                }
                else {
                    result.append('L');
                    lidx = tmp;
                }
            }
            else if(rl<ll){
                result.append('R');
                ridx = tmp;                
            }
            else {
                result.append('L');
                lidx = tmp;
            }
            
        }
        return result.toString();
    }
}
/**
 * 실행 결과
 * 테스트 1 〉	통과 (0.08ms, 52.9MB)
 * 테스트 2 〉	통과 (0.07ms, 51.8MB)
 * 테스트 3 〉	통과 (0.08ms, 52.1MB)
 * 테스트 4 〉	통과 (0.07ms, 53.7MB)
 * 테스트 5 〉	통과 (0.08ms, 52.3MB)
 * 테스트 6 〉	통과 (0.07ms, 52.8MB)
 * 테스트 7 〉	통과 (0.08ms, 53.1MB)
 * 테스트 8 〉	통과 (0.09ms, 52MB)
 * 테스트 9 〉	통과 (0.09ms, 52.2MB)
 * 테스트 10 〉	통과 (0.08ms, 52.4MB)
 * 테스트 11 〉	통과 (0.10ms, 53.1MB)
 * 테스트 12 〉	통과 (0.09ms, 52.4MB)
 * 테스트 13 〉	통과 (0.11ms, 52.2MB)
 * 테스트 14 〉	통과 (0.12ms, 52.7MB)
 * 테스트 15 〉	통과 (0.22ms, 53.1MB)
 * 테스트 16 〉	통과 (0.21ms, 53MB)
 * 테스트 17 〉	통과 (0.37ms, 52.6MB)
 * 테스트 18 〉	통과 (0.35ms, 53.6MB)
 * 테스트 19 〉	통과 (0.38ms, 52.1MB)
 * 테스트 20 〉	통과 (0.35ms, 51.9MB)
 */