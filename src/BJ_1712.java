import java.util.Scanner;

public class BJ_1712 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b = sc.nextInt();
        long c = sc.nextInt();

        if (b >= c) {
            System.out.println(-1);
            return;
        }
        else {
            long n = a / (c - b) + 1;
            System.out.println(n);
        }
    }
}
