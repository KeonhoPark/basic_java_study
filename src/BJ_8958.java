import java.util.Scanner;

public class BJ_8958 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum, count = 0;
        String[] answers = new String[n];
        for(int i = 0; i < answers.length; i++){
            answers[i] = sc.next();
        }

        for(int i = 0; i < answers.length; i++){
            sum = 0;
            count = 0;
            for(int j = 0; j < answers[i].length(); j++){
                if(answers[i].charAt(j) == 'O'){
                    count++;
                    sum = sum + count;
                }
                else{
                    count = 0;
                }
            }
            System.out.println(sum);
        }
    }
}
