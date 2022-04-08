import java.util.Scanner;

public class BJ_2577 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int answer = a * b * c;
        int number = 0;
        int[] count = {0,0,0,0,0,0,0,0,0,0};
        for(int i = 0; i < 8; i++){
            number = answer % 10;
            if(number == 0)
                count[0]++;
            else if(number == 1)
                count[1]++;
            else if(number == 2)
                count[2]++;
            else if(number == 3)
                count[3]++;
            else if(number == 4)
                count[4]++;
            else if(number == 5)
                count[5]++;
            else if(number == 6)
                count[6]++;
            else if(number == 7)
                count[7]++;
            else if(number == 8)
                count[8]++;
            else if(number == 9)
                count[9]++;
            answer = answer / 10;
        }
        for(int i=0; i<count.length; i++)
            System.out.println(count[i]);
    }
}
