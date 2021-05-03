/** programmers 문제풀이
 * 
 * ==========================================
 * 행렬의 덧셈
 * 
 * 문제 설명
 * 행렬의 덧셈은 행과 열의 크기가 같은 두 행렬의 같은 행, 같은 열의 값을 서로 더한 
 * 결과가 됩니다. 2개의 행렬 arr1과 arr2를 입력받아, 행렬 덧셈의 결과를 반환하는 
 * 함수, solution을 완성해주세요.
 * 
 * 제한 조건
 * 행렬 arr1, arr2의 행과 열의 길이는 500을 넘지 않습니다.
 * 
 * 입출력 예
 * arr1	            arr2	        return
 * [[1,2],[2,3]]	[[3,4],[5,6]]	[[4,6],[7,9]]
 * [[1],[2]]	    [[3],[4]]       [[4],[6]]
 * ===================================
 * 
 * 행렬의 길이는 500을 넘지 않으나 행렬을 효율적으로 더하는 방법을 몰라서 
 * 모든 배열의 값을 반복문으로 더했다.
 */
public class study27 {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int len1 = arr1.length;
        int len2 = arr1[0].length;
        for(int i = 0;i<len1;i++){
            for(int j=0; j<len2;j++){
                arr1[i][j] += arr2[i][j];
            }
        }
        return arr1;
    }
}
/**
 * 실행 결과
 * 테스트 1 〉	통과 (0.01ms, 52.3MB)
 * 테스트 2 〉	통과 (0.04ms, 52.7MB)
 * 테스트 3 〉	통과 (0.09ms, 53.4MB)
 * 테스트 4 〉	통과 (0.06ms, 53.3MB)
 * 테스트 5 〉	통과 (0.02ms, 52.1MB)
 * 테스트 6 〉	통과 (0.05ms, 52.8MB)
 * 테스트 7 〉	통과 (0.02ms, 52.3MB)
 * 테스트 8 〉	통과 (0.05ms, 52.6MB)
 * 테스트 9 〉	통과 (0.33ms, 58.3MB)
 * 테스트 10 〉	통과 (0.25ms, 55.6MB)
 * 테스트 11 〉	통과 (0.17ms, 53.2MB)
 * 테스트 12 〉	통과 (0.20ms, 56.8MB)
 * 테스트 13 〉	통과 (0.16ms, 57.1MB)
 * 테스트 14 〉	통과 (0.21ms, 57.2MB)
 * 테스트 15 〉	통과 (0.24ms, 53.6MB)
 * 테스트 16 〉	통과 (0.24ms, 57.1MB)
 * 테스트 17 〉	통과 (5.73ms, 103MB)
 */