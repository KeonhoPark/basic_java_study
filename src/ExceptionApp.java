public class ExceptionApp {

    public static void main(String[] args) {
        System.out.println(1);
        int[] scores = {10, 20, 30};

        System.out.println(2);
        try {
            System.out.println(scores[3]);
            System.out.println(3/0);
            System.out.println(3);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("배열 인덱스 초과");
        }catch (ArithmeticException e){
            System.out.println("0으로 나눌수 없습니다.");
        }
        System.out.println(4);
    }
}
