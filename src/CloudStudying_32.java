class Developer{
    private String name;
    private int career;

    public Developer(String name, int career){
        this.name = name;
        this.career = career;
    }

    public String level(){
        String level;
        if(this.career >= 0 && this.career < 3)
            level = "초급";
        else if(this.career >= 3 && this.career < 7)
            level = "중급";
        else
            level = "고급";
        return level;
    }

    public int salary(){
        int salary = 0;
        if(level().equals("초급")){
            salary = 2800 + (100 * this.career);
        }
        else if(level().equals("중급")){
            salary = 3500 + (100 * this.career);
        }
        else{
            salary = 4500 + (100 * this.career);
        }
        return salary;
    }
}

public class CloudStudying_32 {

    public static void main(String[] args){
        Developer tom = new Developer("Tom", 2);
        Developer john = new Developer("John",5);
        Developer sally = new Developer("Sally",9);

        System.out.println(tom.salary());
        System.out.println(john.salary());
        System.out.println(sally.salary());

    }
}
