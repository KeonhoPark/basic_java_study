import java.util.Scanner;

public class BJ_3052 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] inputs = new int[10];
        boolean[] answers = new boolean[42];
        int count = 0;

        for(int i = 0; i < inputs.length; i++){
            inputs[i] = sc.nextInt();
        }
        for(int i = 0; i < inputs.length; i++){
            answers[inputs[i] % 42] = true;
        }

        for(int i = 0; i < answers.length; i++){
            if(answers[i] == true)
                count++;
        }
        System.out.println(count);
    }
}
