import java.util.Scanner;

public class BJ_1065 {

    public static boolean isHansoo(int n){
        boolean flag = false;
        if(1 <= n && n < 10){
            flag = true;
        }
        else if(10 <= n && n < 100){
            flag = true;
        }
        else{
            int oneth = n % 10;
            n = n / 10;
            int tenth = n % 10;
            int hundreth = n / 10;
            if((hundreth - tenth) == (tenth - oneth) || (oneth - tenth) == (tenth - hundreth))
                flag = true;
        }
        return flag;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for(int i = 1; i <= n; i++){
            if(isHansoo(i) == true)
                count++;
        }
        System.out.println(count);

    }
}
