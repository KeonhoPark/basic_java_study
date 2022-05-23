public class AccountingArrayApp {

    public static void main(String[] args) {
        double valueOfSupply = 10000.0;
        double vatRate = 0.1;
        double expenseRate = 0.3;
        double expense = valueOfSupply * expenseRate;
        double total = valueOfSupply + (valueOfSupply * vatRate);
        double vat = valueOfSupply * vatRate;
        double income = valueOfSupply - expense;


        System.out.println("Value of Supply : "+ valueOfSupply);
        System.out.println("VAT : "+ vat);
        System.out.println("Total : "+ total);
        System.out.println("Expense : "+expense);
        System.out.println("Income : "+income);

        double[] dividendRates = new double[3];
        dividendRates[0] = 0.5;
        dividendRates[1] = 0.3;
        dividendRates[2] = 0.2;

        int i = 0;
        while (i < 3){
            System.out.println("dividend : "+income * dividendRates[i]);
            i++;
        }


    }
}
