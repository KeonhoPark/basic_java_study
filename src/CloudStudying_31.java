class Account{

    private int id;
    private String password;
    private String ownerName;
    private int balance;

    public Account(int id, String password, String ownerName) {
        this.id = id;
        this.password = password;
        this.ownerName = ownerName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void deposit(int money){
        int balance = getBalance();
        balance += money;
        setBalance(balance);
    }

    public void withdraw(int money, String password) {
        if(isCorrectPassword(password)) {
            int balance = getBalance();
            balance -= money;
            setBalance(balance);
            return;
        } else {
            System.out.println("비밀번호 오류");
            return;
        }
    }

    public int checkBalance (String password){
        if(isCorrectPassword(password)){
            return getBalance();
        }
        else
            return -1;
    }


    private boolean isCorrectPassword (String Inputpassword){
        String password = getPassword();
        if (Inputpassword.equals(password))
            return true;
        else
            return false;
        }
    }


    public class CloudStudying_31 {

    public static void main(String[] args) {
        Account account1 = new Account(1, "pass1", "Park");
        account1.deposit(100000);
        System.out.println(account1.checkBalance("pass1"));
        account1.withdraw(20000, "pass1");
        System.out.println(account1.checkBalance("pass1"));
    }
}
