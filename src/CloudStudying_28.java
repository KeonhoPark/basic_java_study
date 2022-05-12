class Country{
    public String name;
    public int gold;
    public int silver;
    public int bronze;
    private int total = 0;
    private int score = 0;

    Country(String name, int gold, int silver, int bronze){
        this.name = name;
        this.gold = gold;
        this.silver = silver;
        this.bronze = bronze;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getSilver() {
        return silver;
    }

    public void setSilver(int silver) {
        this.silver = silver;
    }

    public int getBronze() {
        return bronze;
    }

    public void setBronze(int bronze) {
        this.bronze = bronze;
    }

    public int getTotal() {
        this.total = getGold()+getSilver()+getBronze();
        return total;
    }

    public int getScore() {
        this.score = getGold()*100 + getSilver()*10 + getBronze();
        return score;
    }

    public String toString(){
        return getName()+" "+getGold()+" / "+getSilver()+" / "+getBronze()+" Score : "+getScore();
    }

}


public class CloudStudying_28 {
    public static void sort(Country[] countries){
        int max = 0;
        for(int i = 0; i < countries.length; i++){

            for(int j = i + 1; j < countries.length; j++){
                //if(max > countries[])
            }
        }
    }


    public static void main(String[] args) {
        Country[] countries = new Country[10];
        countries[0] = new Country("노르웨이", 10, 9, 8);
        countries[1] = new Country("독일", 9, 5, 4);
        countries[2] = new Country("네덜란드", 6, 5, 2);
        countries[3] = new Country("캐나다", 5, 5, 6);
        countries[4] = new Country("미국", 5, 3, 2);
        countries[5] = new Country("스웨덴", 4, 3, 0);
        countries[6] = new Country("오스트리아", 4, 2, 4);
        countries[7] = new Country("프랑스", 4, 2, 4);
        countries[8] = new Country("대한민국", 3, 2, 2);
        countries[9] = new Country("일본", 2, 5, 3);

        for (int i = 0; i < 20; i++) {
            int randomIndexGold = (int) (Math.random() * 10);
            int gold = countries[randomIndexGold].getGold();
            countries[randomIndexGold].setGold(++gold);
            int randomIndexSilver = (int) (Math.random() * 10);
            int silver = countries[randomIndexSilver].getSilver();
            countries[randomIndexSilver].setGold(++silver);
            int randomIndexBronze = (int) (Math.random() * 10);
            int bronze = countries[randomIndexBronze].getBronze();
            countries[randomIndexBronze].setBronze(++bronze);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(countries[i].toString());
        }

        System.out.println("-----------");


        for(int i = 0; i < countries.length - 1; i++){
            int max = countries[i].getScore();
            Country temp;
            for(int j = i+1; j < countries.length; j++){
                if(countries[j].getScore() > max){
                    temp = countries[i];
                    countries[i] = countries[j];
                    countries[j] = temp;
                }

            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(countries[i].toString());
        }
    }

}
