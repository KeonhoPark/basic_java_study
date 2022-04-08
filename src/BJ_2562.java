import java.util.Arrays;
import java.util.Scanner;

public class BJ_2562 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int[] array = new int[9];
        int index = 0;
        int max = -99;

        for(int i = 0; i < array.length; i++){
            array[i] = sc.nextInt();
        }

        for(int i = 0; i < array.length; i++){
            if(max < array[i]) {
                max = array[i];
                index = i + 1;
            }
        }

        System.out.println(max);
        System.out.println(index);


    }
}
