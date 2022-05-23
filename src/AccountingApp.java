public class AccountingApp {

    public static void main(String[] args) {
        double valueOfSupply = 10000.0;
        double vatRate = 0.1;
        double expenseRate = 0.3;
        double dividend1 = valueOfSupply * 0.5;
        double dividend2 = valueOfSupply * 0.3;
        double dividend3 = valueOfSupply * 0.2;
        System.out.println("Value of Supply : "+ valueOfSupply);
        System.out.println("VAT : "+(valueOfSupply * vatRate));
        System.out.println("Total : "+ valueOfSupply + (valueOfSupply * vatRate));
        System.out.println("Expense : "+(valueOfSupply * expenseRate));
        System.out.println("Dividend1 : "+dividend1);
        System.out.println("Dividend2 : "+dividend2);
        System.out.println("Dividend3 : "+dividend3);


    }
}
