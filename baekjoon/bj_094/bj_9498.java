import java.util.Scanner;

public class bj_9498 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int test=sc.nextInt();
		sc.close();
		if(test>=90)
			System.out.println("A");
		else if(test>=80)
			System.out.println("B");
		else if(test>=70)
			System.out.println("C");
		else if(test>=60)
			System.out.println("D");
		else
			System.out.println("F");
	}

}
