import java.util.Scanner;

public class BJ_1546 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        double[] scores = new double[num];
        double[] new_scores = new double[num];
        double max = -99;
        double sum = 0;
        double new_avg = 0;

        for(int i = 0; i < scores.length; i++) {
            scores[i] = sc.nextInt();
        }

        for(int j = 0; j < scores.length; j++){
            if(max < scores[j])
                max = scores[j];
        }

        for (int k = 0; k < scores.length; k++){
            new_scores[k] = (scores[k] * 100) / max;
            sum = sum + new_scores[k];
        }

        new_avg = sum / num;
        System.out.println(new_avg);
    }
}
