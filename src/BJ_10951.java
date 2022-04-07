import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BJ_10951 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> answers = new ArrayList<Integer>();

        int a = 0;
        int b = 0;

        while (sc.hasNextInt()) {
            a = sc.nextInt();
            b = sc.nextInt();
            System.out.println(a + b);
            answers.add(a + b);
        }
       for(int i = 0; i < answers.size(); i++)
            System.out.println(answers.get(i));
    }
}
