public class BJ_4673 {

    public static int d(int n){
        int sum = n;

        while(n != 0){
            sum = sum + (n % 10);
            n = n / 10;
        }

        return sum;
    }

    public static void main(String[] args){

        boolean[] answers = new boolean[10001];

        for(int i = 1; i <= 10000; i++){
            if(d(i) <= 10000){
                answers[d(i)] = true;
            }
        }

        for(int j = 1; j < answers.length; j++){
            if(answers[j] == false){
                System.out.println(j);
            }
        }

    }
}
