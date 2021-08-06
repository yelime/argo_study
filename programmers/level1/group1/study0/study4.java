/** programmers 문제풀이
 * 
 * ==========================================
 * 신규 아이디 추천
 * 
 * 문제 설명
 * 신규 유저가 아이디를 입력하면 아래와 같은 규칙을 거치게 된다.
 * 1단계 new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
 * 2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
 * 3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
 * 4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
 * 5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
 * 6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
 *      만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
 * 7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
 * 
 * 이 때 입력으로 들어온 new_id가 7개의 처리 과정을 거친 후의 추천 아이디를 return하도록 완성해 주세요.
 * 
 * 제한사항
 * new_id는 길이 1 이상 1,000 이하인 문자열입니다.
 * new_id는 알파벳 대문자, 알파벳 소문자, 숫자, 특수문자로 구성되어 있습니다.
 * new_id에 나타날 수 있는 특수문자는 -_.~!@#$%^&*()=+[{]}:?,<>/ 로 한정됩니다.
 * 
 * 입출력 예
 * no	    new_id	                    result
 * 예1	"...!@BaT#*..y.abcdefghijklm"	"bat.y.abcdefghi"
 * 예2	"z-+.^."	                    "z--"
 * 예3	"=.="	                        "aaa"
 * 예4	"123_.def"	                    "123_.def"
 * 예5	"abcdefghijklmn.p"	            "abcdefghijklmn"
 * ===================================
 * 
 * 이 문제는 규칙을 순서대로 따르기만 해도 통과가 되는 문제이므로 규칙을 코드화만 진행해봤다.
 */
class Solution {
    public String solution(String new_id) {
        String answer = "";
        //1단계
        new_id = new_id.toLowerCase();
        //2단계
        int idx=-1;
        for(int i =0;i<new_id.length();i++){
            char tmp = new_id.charAt(i);
            if((tmp<='z'&&tmp>='a')||(tmp<='9'&&tmp>='0')||tmp=='-'||tmp=='_'||tmp=='.'){
                continue;
            }
            
            new_id=new_id.substring(0,i)+new_id.substring(i+1);
            i--;
        }
        //3,4단계
        for(int i=0;i<new_id.length();i++){
            
            char tmp = new_id.charAt(i);
            if(idx!= -1){
                if(tmp=='.'){
                    continue;
                }
                else if(idx==0){
                    new_id=new_id.substring(i);
                    i=-1;
                }
                else if(i==idx+1){
                }
                else{
                    new_id=new_id.substring(0,idx+1)+new_id.substring(i);
                    i=idx;
                }
                idx=-1;
                continue;
            }
            if(tmp=='.'){
                if(idx==-1){
                    idx=i;
                    continue;
                }
            }
        }
        if(idx!=-1){
            new_id=new_id.substring(0,idx);
        }
        //5단계
        if(new_id.length()==0){
            new_id="aaa";
            answer = new_id;
            return answer;
        }
        //6단계
        if(new_id.length()>=15){
            if(new_id.charAt(14)=='.'){
                new_id=new_id.substring(0,14);
            }   
            else {
                new_id=new_id.substring(0,15);
            }
            answer = new_id;
            return answer;
        }
        //7단계
        if(new_id.length()==1){
            new_id+=new_id.charAt(0);
        }
        
        if(new_id.length()==2){
            new_id+=new_id.charAt(1);
        }
        
        answer = new_id;
        return answer;
    }
}

/**
 * 실행 결과 최적화나 단축에 도움보다는 규칙을 따르는 것을 우선으로 해서 시간은 들쑥날쑥하지만
 * 통과는 충분했다.
 * 테스트 1 〉	통과 (0.02ms, 51.7MB)
 * 테스트 2 〉	통과 (0.02ms, 52.4MB)
 * 테스트 3 〉	통과 (13.25ms, 53MB)
 * 테스트 4 〉	통과 (1.63ms, 52.2MB)
 * 테스트 5 〉	통과 (1.74ms, 52.4MB)
 * 테스트 6 〉	통과 (0.04ms, 51.8MB)
 * 테스트 7 〉	통과 (0.03ms, 53MB)
 * 테스트 8 〉	통과 (1.65ms, 52.4MB)
 * 테스트 9 〉	통과 (12.65ms, 53.5MB)
 * 테스트 10 〉	통과 (0.02ms, 52.9MB)
 * 테스트 11 〉	통과 (0.03ms, 53.8MB)
 * 테스트 12 〉	통과 (1.69ms, 52MB)
 * 테스트 13 〉	통과 (25.67ms, 53.5MB)
 * 테스트 14 〉	통과 (1.66ms, 52MB)
 * 테스트 15 〉	통과 (1.55ms, 53MB)
 * 테스트 16 〉	통과 (5.81ms, 52.5MB)
 * 테스트 17 〉	통과 (1.72ms, 52.8MB)
 * 테스트 18 〉	통과 (1.92ms, 53MB)
 * 테스트 19 〉	통과 (2.40ms, 52.9MB)
 * 테스트 20 〉	통과 (3.76ms, 53.2MB)
 * 테스트 21 〉	통과 (3.37ms, 54.4MB)
 * 테스트 22 〉	통과 (3.48ms, 53.6MB)
 * 테스트 23 〉	통과 (0.20ms, 52MB)
 * 테스트 24 〉	통과 (0.32ms, 54.8MB)
 * 테스트 25 〉	통과 (2.26ms, 52.6MB)
 * 테스트 26 〉	통과 (0.25ms, 52.3MB)
 */

