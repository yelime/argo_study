/** programmers 문제풀이
 * 
 * ==========================================
 * 소수 찾기
 * 문제 설명
 * 한자리 숫자가 적힌 종이 조각이 흩어져있습니다. 흩어진 종이 조각을 붙여 소수를 몇 개 만들 수 있는지 알아내려 합니다.
 * 
 * 각 종이 조각에 적힌 숫자가 적힌 문자열 numbers가 주어졌을 때, 종이 조각으로 만들 수 있는 소수가 몇 개인지 return 하도록 solution 함수를 완성해주세요.
 * 
 * 제한사항
 * numbers는 길이 1 이상 7 이하인 문자열입니다.
 * numbers는 0~9까지 숫자만으로 이루어져 있습니다.
 * "013"은 0, 1, 3 숫자가 적힌 종이 조각이 흩어져있다는 의미입니다.
 * 
 * 입출력 예
 * numbers	return
 * "17"	3
 * "011"	2
 * ===================================
 * 
 * 
 */

import java.util.*;

public class study49 {
    public static Map<Integer, Boolean> hashMap = new HashMap();
    public static boolean[] check;
    public static char[] c;
    public int solution(String numbers) {
        int answer = 0;
        hashMap.put(1,false);
        hashMap.put(0,false);
        c = numbers.toCharArray();
        check = new boolean[c.length];
        
        for(int i = 1;i<=c.length;i++){
            fc1(0,i,"");
        }
        
        for(Integer i : hashMap.keySet()){
            if(hashMap.get(i)){
                answer++;
            }
        }
        return answer;
    }
    
    public void fc1(int count, int max,String str){
        if(count == max){
            int num = Integer.parseInt(str);
            fc2(num);
            return;
        }
        for(int i=0;i<c.length;i++){
            if(check[i]){
                continue;
            }
            check[i] = true;
            fc1(count+1,max,str+c[i]);
            check[i] = false;
        }
    }
    public void fc2(int num){
        if(hashMap.get(num)!=null){
            return;
        }
        if(num == 2 || num == 3){
            hashMap.put(num,true);
            return;
        }
        int tmp = (int)Math.sqrt(num);
        for(int i = 2;i<=tmp; i++){
            if(num%i==0){
                hashMap.put(num,false);
                return;
            }
        }
        hashMap.put(num,true);
    }
}

/**
 * 실행 결과
 * 테스트 1 〉	통과 (13.29ms, 53.2MB)
 * 테스트 2 〉	통과 (28.41ms, 54MB)
 * 테스트 3 〉	통과 (12.77ms, 53.1MB)
 * 테스트 4 〉	통과 (23.21ms, 52.7MB)
 * 테스트 5 〉	통과 (35.45ms, 56.7MB)
 * 테스트 6 〉	통과 (14.01ms, 52.7MB)
 * 테스트 7 〉	통과 (17.84ms, 53.3MB)
 * 테스트 8 〉	통과 (46.55ms, 59.3MB)
 * 테스트 9 〉	통과 (15.07ms, 53.9MB)
 * 테스트 10 〉	통과 (23.45ms, 52.8MB)
 * 테스트 11 〉	통과 (24.91ms, 53.4MB)
 * 테스트 12 〉	통과 (15.28ms, 53.4MB)
 */