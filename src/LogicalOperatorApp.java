public class LogicalOperatorApp {

    public static void main(String[] args){

        String id = "egoing";
        String inputId = args[0];

        String password1 = "1111";
        String password2 = "2222";
        String inputPassword = "eeee";

        boolean isRightPass = inputPassword.equals(password1) || inputPassword.equals(password2);


        System.out.println("Hi");

        if (id.equals(inputId) && isRightPass)
            System.out.println("master");
        else if (id.equals(inputId) == true && isRightPass == false)
            System.out.println("Wrong password");
        else
            System.out.println("Who are you?");
    }
}
