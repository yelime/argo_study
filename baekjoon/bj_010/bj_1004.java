import java.util.Scanner;

public class bj_1004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        int Sx, Sy, Ex, Ey;
        int N;
        int Nx, Ny, Nr;
        int result;
        for (int i = 0; i < T; i++) {
            Sx = sc.nextInt();
            Sy = sc.nextInt();
            Ex = sc.nextInt();
            Ey = sc.nextInt();
            N = sc.nextInt();
            result = 0;
            for (int j = 0; j < N; j++) {
                Nx = sc.nextInt();
                Ny = sc.nextInt();
                Nr = sc.nextInt();

                int SCx = Nx - Sx;
                int ECx = Nx - Ex;
                int SCy = Ny - Sy;
                int ECy = Ny - Ey;

                SCx = SCx * SCx;
                ECx = ECx * ECx;
                SCy = SCy * SCy;
                ECy = ECy * ECy;

                int SC = SCx + SCy;
                int EC = ECx + ECy;

                Nr = Nr * Nr;
                if ((SC < Nr) && (EC > Nr)) {
                    result++;
                } else if ((SC > Nr) && (EC < Nr)) {
                    result++;
                }
            }
            System.out.println(result);
        }
        sc.close();
    }
}
