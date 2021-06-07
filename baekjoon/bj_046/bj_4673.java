public class bj_4673 {
    // public class Main{
    public static void main(String[] args){
        boolean[] check = new boolean[10001];
        for(int i=1;i<10001;i++){
            if(!check[i]){
                System.out.println(i);
            }
            int tmp = fn(i);
            if(tmp>10000){
                continue;
            }
            check[tmp] = true;
        }
    }
    public static int fn(int n){
        int answer=n;
        while(n>0){
            answer+=n%10;
            n/= 10;
        }
        return answer;
    }

}