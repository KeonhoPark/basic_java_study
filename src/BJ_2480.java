import java.util.Scanner;

public class BJ_2480 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int diceA = sc.nextInt();
        int diceB = sc.nextInt();
        int diceC = sc.nextInt();
        int price = 0;

        if(diceA == diceB && diceA == diceC){
            price = 10000 + (diceA * 1000);
        }
        else if(diceA == diceB){
            price = 1000 + (diceA * 100);
        }
        else if(diceA == diceC){
            price = 1000 + (diceA * 100);
        }
        else if(diceB == diceC){
            price = 1000 + (diceB * 100);
        }
        else{
            int max = 0;
            if(diceA > diceB && diceA > diceC){
                max = diceA;
                price = max * 100;
            }
            else if(diceB > diceA && diceB > diceC){
                max = diceB;
                price = max * 100;
            }
            else if(diceC > diceA && diceC > diceB){
                max = diceC;
                price = max * 100;
            }
        }
        System.out.println(price);

    }
}
