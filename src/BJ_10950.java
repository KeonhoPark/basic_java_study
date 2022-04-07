import java.util.Scanner;

public class BJ_10950 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int iter = sc.nextInt();
        int[] answers = new int[iter];

        for(int i = 0; i < iter; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            answers[i] = a + b;
        }
        for(int j = 0; j < answers.length; j++)
            System.out.println(answers[j]);
    }
}
