import java.util.Scanner;

public class BJ_1110 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tenth = n / 10;
        int oneth = n % 10;
        int sum = 0;
        int oldNum = n;
        int newNum = -1;
        int count = 0;

        //if(n > 9){
            while (newNum != n) {
                sum = tenth + oneth;
                newNum = (oldNum % 10) * 10 + (sum % 10);
                oldNum = newNum;
                tenth = oldNum / 10;
                oneth = oldNum % 10;
                count++;
            }
            System.out.println(count);

    }
}
