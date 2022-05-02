class Cal{
    public int sum(int v1, int v2){
        return v1 + v2;
    }

    //오버로딩(이름이 같은 메소드를 형태를 다르게 정의(파라미터 값을 다르게 하여)
    public int sum(int v1, int v2, int v3){
        return v1 + v2 + v3;
    }
}

class Cal2 extends Cal{
    public int minus(int v1, int v2){
        return v1 - v2;
    }

    //오버라이딩(부모 클래스의 메소드를 자식 클래스에서 재정의)
    public int sum(int v1, int v2){
        System.out.println("Cal2 sum");
        return v1 + v2;
    }

    //오버로딩이자 오버라이딩
    public int sum(int v1, int v2, int v3){
        return v1 + v2 + v3;
    }
}

public class InheritanceApp {

    public static void main(String[] args) {
        Cal2 c2 = new Cal2();
        System.out.println(c2.sum(1,2));
        System.out.println(c2.minus(1,2));
    }
}
