import java.util.ArrayList;

class Dice{
    String name;
    int planeNum;
    int resultNum;

    enum STATUS{
        ALIVE, DEAD
    }

    Dice(String name, int planeNum){
        this.name = name;
        this.planeNum = planeNum;
    }

    int roll(){
        return resultNum = (int) (Math.random() * planeNum) + 1;
    }

    STATUS isAlive() {
        if(this.resultNum % 2 == 0)
            return STATUS.ALIVE;
        else
            return STATUS.DEAD;
    }

    public String toString(){
        return "Dice [name = " + name + ", planeNum = " + planeNum + ", resultNum = " + resultNum +"]";
    }

}

public class CloudStudying_26 {

    public static void main(String[] args) {
        Dice d10 = new Dice("호랑이", 10);
        Dice[] dices = new Dice[12];
        dices[0] = new Dice("쥐", 2);
        dices[1] = new Dice("소", 3);
        dices[2] = new Dice("호랑이", 4);
        dices[3] = new Dice("토끼", 5);
        dices[4] = new Dice("용", 6);
        dices[5] = new Dice("뱀", 7);
        dices[6] = new Dice("말", 8);
        dices[7] = new Dice("양", 9);
        dices[8] = new Dice("원숭이", 10);
        dices[9] = new Dice("닭", 11);
        dices[10] = new Dice("개", 12);
        dices[11] = new Dice("돼지", 13);

        ArrayList<Dice> survivors = new ArrayList<>();
        for(Dice d : dices){
            d.roll();
            if(d.isAlive() == Dice.STATUS.ALIVE) {
                survivors.add(d);
                System.out.println(d.toString());
            }
        }

        System.out.println("================");

        while(survivors.size() != 0) {
            for (int i = 0; i < survivors.size(); i++) {
                Dice d = survivors.get(i);
                d.roll();
                if (d.isAlive() == Dice.STATUS.DEAD) {
                    survivors.remove(d);
                    i--;
                    if(survivors.size() == 0)
                        break;
                }
                else
                    System.out.println(d.toString());
            }
            System.out.println("=====================");
        }

//        System.out.println(d10.roll());
//        System.out.println(d10.isAlive());
    }
}
