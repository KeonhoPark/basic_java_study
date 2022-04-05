public class IfApp {

    public static void main(String[] args) {

        //System.out.println(args[0]);

        String id = "egoing";
        String inputId = args[0];

        String password = "1111";
        String inputPassword = "1111";

        System.out.println("Hi");

        if (id.equals(inputId) && password.equals(inputPassword))
            System.out.println("master");
        else if (id.equals(inputId) == true && password.equals(inputPassword) == false)
            System.out.println("Wrong password");
        else
            System.out.println("Who are you?");
    }
    }

