class Cal{
    int v1, v2 = 0;
    Cal(){
        System.out.println("parent");
    }

    public int sum(){
        return this.v1 + this.v2;
    }

}

class Cal2 extends Cal {

    Cal2(){
        System.out.println("child");
    }

    public int minus(){
        return this.v1 - this.v2;
    }

}


public class InheritanceApp {

    public static void main(String[] args) {
        Cal c = new Cal();
        Cal2 c2 = new Cal2();
        System.out.println(c2.sum());
        System.out.println(c2.minus());
    }
}
