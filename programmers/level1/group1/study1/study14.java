/** programmers 문제풀이
 * 
 * ==========================================
 * 문자열 내 마음대로 정렬
 * 
 * 문제 설명
 * 문자열로 구성된 리스트 strings와, 정수 n이 주어졌을 때, 각 문자열의 인덱스 n번째 글자를 기준으로 오름차순 정렬하려 합니다. 예를 들어 strings가 ["sun", "bed", "car"]이고 n이 1이면 각 단어의 인덱스 1의 문자 "u", "e", "a"로 strings를 정렬합니다.
 * 
 * 제한 조건
 * strings는 길이 1 이상, 50이하인 배열입니다.
 * strings의 원소는 소문자 알파벳으로 이루어져 있습니다.
 * strings의 원소는 길이 1 이상, 100이하인 문자열입니다.
 * 모든 strings의 원소의 길이는 n보다 큽니다.
 * 인덱스 1의 문자가 같은 문자열이 여럿 일 경우, 사전순으로 앞선 문자열이 앞쪽에 위치합니다.
 * 
 * 입출력 예
 * strings	                n	return
 * ["sun", "bed", "car"]	1	["car", "bed", "sun"]
 * ["abce", "abcd", "cdx"]	2	["abcd", "abce", "cdx"]
 * ===================================
 * 
 * 정렬을 하는데 그냥 정렬이 아니라 위치값을 기준으로 우선 정렬하고 같을 경우 서전순으로
 * 정렬해야 한다.
 * 
 * 이는 Collections를 활용해서 새로운 정렬 방식을 만드는 것이 가장 좋을 것이라 생각하였다.
 */

import java.util.*;

public class study14 {
    public String[] solution(String[] strings, int n) {
        ArrayList<String> dic = new ArrayList<String>();
        //collections를 사용하기 위해 strings를 list의 형식으로 바꿔준다.
        for(int i=0;i<strings.length;i++){
            dic.add(strings[i]);
        }
        //나만의 정렬 규칙만들기
        // n번째 글자로 정렬 수
        // 같을 경우는 사전 순으로 정렬
        //지금은 규칙이 한개이지만 1개 그 이상의 경우 이 방법이 더 좋다고 생각한다.
        Collections.sort(dic, new Comparator<String>(){
            @Override
            public int compare(String s1,String s2){
                if(s1.charAt(n)<s2.charAt(n)){
                    return -1;
                } else if(s1.charAt(n)>s2.charAt(n)){
                    return 1;
                } else {
                    return s1.compareTo(s2);
                }
            }
        });
        
        String[] answer = new String[strings.length];
        int i =0;
        for(String s : dic){
            answer[i++] = s;
        }
        return answer;
    }
}

/**
 * 실행 결과
 * 테스트 1 〉	통과 (0.52ms, 52.1MB)
 * 테스트 2 〉	통과 (0.53ms, 52.7MB)
 * 테스트 3 〉	통과 (0.51ms, 53.2MB)
 * 테스트 4 〉	통과 (0.48ms, 53MB)
 * 테스트 5 〉	통과 (0.52ms, 52.5MB)
 * 테스트 6 〉	통과 (0.53ms, 52.4MB)
 * 테스트 7 〉	통과 (0.38ms, 52.2MB)
 * 테스트 8 〉	통과 (0.53ms, 53MB)
 * 테스트 9 〉	통과 (0.51ms, 52.8MB)
 * 테스트 10 〉	통과 (0.63ms, 51.9MB)
 * 테스트 11 〉	통과 (0.49ms, 52.9MB)
 * 테스트 12 〉	통과 (0.66ms, 54MB)
 */