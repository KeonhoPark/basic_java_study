import java.util.Scanner;

public class BJ_10871 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] numbers = new int[n];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = sc.nextInt();
        }
        for(int j = 0; j < numbers.length; j++){
            if(numbers[j] < x)
                System.out.print(numbers[j]+"\t");
        }
    }
}
