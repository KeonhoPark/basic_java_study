class Cal{
    int v1, v2 = 0;
    Cal(int v1, int v2){
        this.v1 = v1;
        this.v2 = v2;
    }

    public int sum(){
        return this.v1 + this.v2;
    }

}

class Cal2 extends Cal {

    Cal2(int v1, int v2){
        super(v1, v2);
    }

    public int minus(){
        return this.v1 - this.v2;
    }

}


public class InheritanceApp {

    public static void main(String[] args) {
        Cal c = new Cal(1, 2);
        Cal2 c2 = new Cal2(3, 5);
        System.out.println(c2.sum());
        System.out.println(c2.minus());
    }
}
