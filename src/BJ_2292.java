import java.util.Scanner;

public class BJ_2292 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n == 1){
            System.out.println(1);
        }

        else{
            int i = 0;
            int f = 2 + 6*((i*(i+1))/2);
            while (f <= n){
                i++;
                f = 2 + 6*((i*(i+1))/2);
            }
            System.out.println(i+1);
        }
    }
}
