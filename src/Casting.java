public class Casting {

    public static void main(String args[]){
        double a = 1.1;
        int b = (int)a;
        System.out.println(b);

        String f = Integer.toString(12);
        System.out.println(f.getClass());

        String g = Double.toString((3.14));
        System.out.println(g.getClass());

        Integer v = 10;
        Integer i = 11;
        System.out.println(v+i);


        int q = 10;
        int p = 11;
        Integer k = q;
        Integer l = p;
        System.out.println(k+l); // 오토 언박싱이 적용된 부분

        Integer ia = 13;
        Long la = (long)13;
        long lb = 13;

    }
}
