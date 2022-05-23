public class AccountingArrayApp {

    public static double valueOfSupply;
    public static double vatRate;

    public static double getExpense(double valueOfSupply, double expenseRate) {
        return valueOfSupply * expenseRate;
    }

    public static double getVat(double valueOfSupply, double vatRate) {
        return valueOfSupply * vatRate;
    }

    public static double getTotal(double valueOfSupply, double vatRate) {
        return valueOfSupply + getExpense(valueOfSupply, vatRate);
    }

    private static double getIncome(double valueOfSupply, double expense) {
        return valueOfSupply - expense;
    }

    public static void main(String[] args) {
        valueOfSupply = 10000.0;
        vatRate = 0.1;
        double expenseRate = 0.3;

        System.out.println("Value of Supply : "+ valueOfSupply);
        System.out.println("VAT : "+ getVat(valueOfSupply, vatRate));
        System.out.println("Total : "+ getTotal(valueOfSupply, vatRate));
        System.out.println("Expense : "+getExpense(valueOfSupply, vatRate));
        System.out.println("Income : "+getIncome(valueOfSupply, getExpense(valueOfSupply, expenseRate)));

        double[] dividendRates = new double[3];
        dividendRates[0] = 0.5;
        dividendRates[1] = 0.3;
        dividendRates[2] = 0.2;

        int i = 0;
        while (i < 3){
            System.out.println("dividend : "+ getExpense(getIncome(valueOfSupply, getExpense(valueOfSupply, expenseRate)), dividendRates[i]));
            i++;
        }


    }
}
