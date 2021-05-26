import java.util.Scanner;

// public class Main{
public class bj_10950 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int A,B;
		for(int tc = 1;tc <=T;tc++) {
			A= sc.nextInt();
			B= sc.nextInt();
			System.out.println((A+B));
		}
		sc.close();

	}

}
