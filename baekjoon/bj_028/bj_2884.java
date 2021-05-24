import java.util.Scanner;

// public class Main {
public class bj_2884{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int hour =sc.nextInt();
		int min = sc.nextInt();
		sc.close();
		if(min<45) {
			hour = (hour+23)%24;
			min = min+15;
		}
		else {
			min = min-45;	
		}
		System.out.println(hour + " "+min);	
	}

}
