class Member{
    private String name;
    private boolean isMale;
    private double score;

    public Member(String name, boolean isMale) {
        this.name = name;
        this.isMale = isMale;
        setScore(Math.random() * 5);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getIsMale() {
        return isMale;
    }

    public void setIsMale(boolean isMale) {
        this.isMale = isMale;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String toString(){
        return String.format("%s(%s: %.1f)", getName(), getIsMale(), getScore());
    }
}

public class CloudStudying_34 {

    public static void match(Member[] members){
        for(int i = 0; i < members.length; i++){
            for(int j = i + 1; j < members.length; j++){
                if(members[i].getIsMale() != members[j].getIsMale() && Math.abs(members[i].getScore() - members[j].getScore()) < 0.8)
                    System.out.println(members[i].toString()+"--"+members[j].toString());
            }
        }
    }

    public static void main(String[] args) {
        Member[] members = new Member[10];
        members[0] = new Member("m1",true);
        members[1] = new Member("m2",true);
        members[2] = new Member("m3",true);
        members[3] = new Member("m4",false);
        members[4] = new Member("m5",true);
        members[5] = new Member("m6",true);
        members[6] = new Member("m7",false);
        members[7] = new Member("m8",false);
        members[8] = new Member("m9",true);
        members[9] = new Member("m10",false);

        for(int i = 0; i < members.length; i++){
            System.out.println(members[i].toString());
        }
        System.out.println("======");

        match(members);





    }

}
