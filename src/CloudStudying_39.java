import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class Deck{
    private List<Card> deck;

    Deck(){
        this.deck = generateDeck();
    }

    private List<Card> generateDeck() {
        LinkedList<Card> deck = new LinkedList<Card>();
        for(Card.Pattern p : Card.Pattern.values()){
            for(int i = 1; i < 14; i++){
                deck.add(new Card(p, i));
            }
        }
        return deck;
    }

    public Card pick(){
        int randomIndex = (int) Math.random() * deck.size();
        Card chosenCard = this.deck.remove(randomIndex);
        return chosenCard;
    }
}

class Card{
    private Pattern pattern;
    private String denomination;
    private int point;

    Card(Pattern pattern, int index){
        this.pattern = pattern;
        this.denomination = getDenomination(index);
        this.point = getPoint(index);
    }

    private int getPoint(int index){
        switch (index){
            case 1:
                return 1;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                return index;
            case 11:
            case 12:
            case 13:
                return 10;
            default:
                return 0;
        }
    }

    private String getDenomination(int index){
        switch (index){
            case 1:
                return "A";
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                return ""+index;
            case  11:
                return "J";
            case  12:
                return "Q";
            case  13:
                return "K";
            default:
                return "Wrong denomination card";
        }
    }

    @Override
    public String toString(){
        return "Card [pattern = "+this.pattern+" denomination = "+this.denomination+" point = "+this.point+"]";
    }

    public int getPoint(){
        return this.point;
    }

    enum Pattern{
        DIAMOND, CLOVER, HEART, SPADE;
    }

}

class Rule{

    public static int getScore(List<Card> deck){
        int score = 0;
        for(Card c : deck){
            score += c.getPoint();
        }
        return score;
    }

    public static boolean isOver21(Player gamer){
        int score = getScore(gamer.getDeck());
        if(score > 21) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void judge(Player dealer, Player gamer){
        int dealerScore = getScore(dealer.getDeck());
        int gamerScore = getScore(gamer.getDeck());
        int dealerDifference = 21 - dealerScore;
        int gamerDifference = 21 - gamerScore;

        if(dealerDifference > gamerDifference) {
            System.out.println("게이머 스코어 : "+gamerScore+" 딜러 스코어 : "+dealerScore+" 게이머 승리!!");
            return;
        }
        else if(dealerDifference < gamerDifference) {
            System.out.println("게이머 스코어 : "+gamerScore+" 딜러 스코어 : "+dealerScore+" 딜러 승리!!");
            return;
        }
        else{
            System.out.println("게이머 스코어 : "+gamerScore+" 딜러 스코어 : "+dealerScore+" 무승부!!");
            return;
        }
    }
}

class Player{
    enum Status{
        STAY, HIT
    }

    private List<Card> deck;
    private Status status;

    Player(){
        this.deck = new LinkedList<Card>();
        this.status = Status.HIT;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public List<Card> getDeck() {
        return deck;
    }

    public void hitCard(Deck deck) {
        setStatus(Status.HIT);
        this.deck.add(deck.pick());
    }

    public void stay(){
        setStatus(Status.STAY);
    }

    public void showCards(){
        List<Card> deck = getDeck();
        for(Card c : deck) {
            System.out.println(c.toString());
        }
    }

    public boolean isStay(){
        if(getStatus() == Status.STAY)
            return true;
        else
            return false;
    }
}

public class CloudStudying_39 {

    public static void game_init(Player gamer, Player dealer, Deck deck) {
        System.out.println("게이머가 두장의 카드를 받습니다.");
        gamer.hitCard(deck);
        gamer.hitCard(deck);
        System.out.println("딜러가 두장의 카드를 받습니다.");
        dealer.hitCard(deck);
        dealer.hitCard(deck);
    }

    public static void playing(Scanner input, Deck deck, Player dealer, Player gamer) {
        System.out.println("카드를 뽑겠습니까? (o, x)");
        String answer = input.nextLine();

        if (answer.equals("o")) {
            gamer.hitCard(deck);
        } else
            gamer.stay();

        if (Rule.getScore(dealer.getDeck()) < 17)
            dealer.hitCard(deck);
        else
            dealer.stay();

        System.out.println("게이머의 카드는 다음과 같습니다.");
        gamer.showCards();
    }

    public static void main(String[] args) {

        System.out.println("==== 블랙잭 ====");

        Player gamer = new Player();
        Player dealer = new Player();
        Deck deck = new Deck();
        Scanner input = new Scanner(System.in);

        game_init(gamer, dealer, deck);
        while (!(gamer.isStay() && dealer.isStay())) {
            playing(input, deck, dealer, gamer);
            if(Rule.isOver21(gamer)) {
                System.out.println("게이머 스코어 21점 초과, 딜러 승리!!");
                return;
            }
        }
        Rule.judge(dealer, gamer);
    }
}
