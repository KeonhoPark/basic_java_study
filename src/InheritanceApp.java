class Cal{
    public int sum(int v1, int v2){
        return v1 + v2;
    }
}

class Cal2 extends Cal{
    public int minus(int v1, int v2){
        return v1 - v2;
    }
}

public class InheritanceApp {

    public static void main(String[] args) {
        Cal2 c2 = new Cal2();
        System.out.println(c2.sum(1,2));
        System.out.println(c2.minus(1,2));
    }
}
