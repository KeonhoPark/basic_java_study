public class AccountingApp {

    public static void main(String[] args) {
        double valueOfSupply = 10000.0;
        double vatRate = 0.1;
        double expenseRate = 0.3;
        double expense = valueOfSupply * expenseRate;
        double total = valueOfSupply + (valueOfSupply * vatRate);
        double vat = valueOfSupply * vatRate;
        double income = valueOfSupply - expense;

        double dividend1 = valueOfSupply * 0.5;
        double dividend2 = valueOfSupply * 0.3;
        double dividend3 = valueOfSupply * 0.2;

        if(income < 10000.0){
            dividend1 = income * 1.0;
            dividend2 = income * 0;
            dividend3 = income * 0;
        }
        else{
            dividend1 = income * 0.5;
            dividend2 = income * 0.3;
            dividend3 = income * 0.2;
        }
        System.out.println("Value of Supply : "+ valueOfSupply);
        System.out.println("VAT : "+ vat);
        System.out.println("Total : "+ total);
        System.out.println("Expense : "+expense);
        System.out.println("Income : "+income);
        System.out.println("Dividend1 : "+dividend1);
        System.out.println("Dividend2 : "+dividend2);
        System.out.println("Dividend3 : "+dividend3);


    }
}
