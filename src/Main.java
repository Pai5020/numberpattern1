import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i, j, N;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of rows : ");
        N = sc.nextInt();

        for (i = 1; i < N; i++) {
            for (j = 1; j < i; j++) {

                    System.out.print(i + "*");

            }
            System.out.print(i);
            System.out.println();
        }
        for (i = N - 1; i >= 1; i--) {
            for (j = 1; j < i; j++) {
                    System.out.print(i+"*");
            }
            System.out.print(i);
            System.out.println();
        }
    }
}