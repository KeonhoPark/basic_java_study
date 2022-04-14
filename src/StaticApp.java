class Print{
    public String delimiter = "-";

    public void printA(){
        System.out.println(delimiter);
        System.out.println("A");
        System.out.println("A");
    }

    public void printB(){
        System.out.println(delimiter);
        System.out.println("B");
        System.out.println("B");
    }
}

public class StaticApp {
    public static void main(String[] args){
        Print p1 = new Print();
        p1.delimiter = "*";
        p1.printA();


        Print p2 = new Print();
        p2.printB();

    }
}
