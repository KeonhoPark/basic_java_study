public class EqualsApp {

    public static void main(String args[]){


        int n1 = 10;
        int n2 = 10;

        String s1 = "hello";
        String s2 = "hello";

        String s3 = new String("java");
        String s4 = new String("java");
        //System.out.println(n1 == n2);

        System.out.println(s1 == s2);
        System.out.println(s3.equals(s4));


    }

}
