/** programmers 문제풀이
 * 
 * ==========================================
 * 완주하지 못한 선수
 * 
 * 문제 설명
 * 수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고
 * 는 모든 선수가 마라톤을 완주하였습니다.
 * 마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이
 * 름이 담긴 배열 completion이 주어질 때, 완주하지 못한 선수의 이름을 return
 * 하도록 solution 함수를 작성해주세요.
 * 
 * 제한사항
 * 마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다.
 * completion의 길이는 participant의 길이보다 1 작습니다.
 * 참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
 * 참가자 중에는 동명이인이 있을 수 있습니다.
 * 
 * 입출력 예
 * participant	                    completion	            return
 * ["leo", "kiki", "eden"]	        ["eden", "kiki"]	    "leo"
 * ["marina", "josipa", "nikola",   ["josipa", "filipa",    "vinko"
 *  "vinko", "filipa"]	            "marina", "nikola"]	    
 * ["mislav", "stanko",             ["stanko", "ana",       "mislav"
 * "mislav", "ana"]	                "mislav"]	
 * ===================================
 * 
 * 이 문제는 정답을 맞추는 것도 문제지만 효율성 테스트도 있기때문에 반복작업을 최대한
 * 줄이는 방향으로 가는게 효율적이라 생각한다. 만약 이름이 정렬이 된 상태라면 하나하나
 * 비교하는게 효율적일 수 있으나 이름이 정렬되기 전이므로 비 효율적이다. 
 * 예를 들어 participant의 값과 
 * completion의 값을 하나하나 비교하는 방식도 정답은 나오지만 시간 초과가 걸린다.
 * 
 * 그렇기 때문에 완주하지 못한 선수는 오직 한명인 점과 이름이 20자 이하인 것을 이용하여
 * participant의 각 자리수 값을 더하고 completion의 각 자리수를 빼는 방식으로
 * 모든 이름은 단 한번씩만 읽어들이는 방식을 적용해 보았다.
 */

class study3 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        //이름이 20자 이하이므로 20자까지만 받을 배열을 만들었다.
        int[] result=new int[20];
        
        //참가자가 한명 많으므로 따로 한번 작업을 해주었다.
        for(int j=0;j<participant[completion.length].length();j++){
            result[j]+=participant[completion.length].charAt(j);
        }
        //참가자의 이름은 더하고 완주자의 이름은 빼냈다.
        for(int i=0;i<completion.length;i++){
            for(int j=0;j<participant[i].length();j++){
                result[j]+=participant[i].charAt(j);
            }
            for(int j=0;j<completion[i].length();j++){
                result[j]-=completion[i].charAt(j);
            }
        }
        //완주하지 못한 한명을 찾는 방식
        char tmp;
        for(int i =0;i<20;i++){
            //만약 이름이 2글자면 result의 3번째이후는 다 0이므로 반복문을 돌릴 필요가 없다.
            if(result[i] == 0){
                break;
            }
            tmp = (char)result[i];
            answer +=tmp;
        }
        
        return answer;
    }
}


/**
 * 실행 결과
 * 정확성 테스트
 * 테스트 1 〉	통과 (13.07ms, 52.8MB)
 * 테스트 2 〉	통과 (13.41ms, 53MB)
 * 테스트 3 〉	통과 (17.80ms, 54.9MB)
 * 테스트 4 〉	통과 (15.81ms, 54.3MB)
 * 테스트 5 〉	통과 (19.61ms, 54.1MB)
 * 효율성  테스트
 * 테스트 1 〉	통과 (60.48ms, 81.6MB)
 * 테스트 2 〉	통과 (47.07ms, 88.1MB)
 * 테스트 3 〉	통과 (42.66ms, 95.5MB)
 * 테스트 4 〉	통과 (96.72ms, 96.5MB)
 * 테스트 5 〉	통과 (50.76ms, 95.9MB)
 */