class AccountingClass {
    public double valueOfSupply;
    public double vatRate;
    double expenseRate = 0.3;

    public double getExpense(double valueOfSupply, double expenseRate) {
        return valueOfSupply * expenseRate;
    }

    public double getVat(double valueOfSupply, double vatRate) {
        return valueOfSupply * vatRate;
    }

    public double getTotal(double valueOfSupply, double vatRate) {
        return valueOfSupply + getExpense(valueOfSupply, vatRate);
    }

    public double getIncome(double valueOfSupply, double expense) {
        return valueOfSupply - expense;
    }

    public void print(){
        System.out.println("Value of Supply : "+ valueOfSupply);
        System.out.println("VAT : "+ getVat(valueOfSupply, vatRate));
        System.out.println("Total : "+ getTotal(valueOfSupply, vatRate));
        System.out.println("Expense : "+getExpense(valueOfSupply, vatRate));
        System.out.println("Income : "+getIncome(valueOfSupply, getExpense(valueOfSupply, expenseRate)));
    }
}



public class AccountingArrayApp {


    public static void main(String[] args) {

        AccountingClass accountingClass = new AccountingClass();

        accountingClass.print();


    }
}
