import java.util.Scanner;

public class BJ_2884 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minute = sc.nextInt();

        if(minute >= 45){
            minute = minute - 45;
            System.out.print(hour+"\t");
            System.out.print(minute);
        }
        else {
            if (hour > 0) {
                minute = minute + 60 - 45;
                hour--;
            } else {
                minute = minute + 60 - 45;
                hour = hour + 24 - 1;
            }
            System.out.print(hour+"\t");
            System.out.print(minute);
        }
    }
}
