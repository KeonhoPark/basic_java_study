class Accounting{
    public static double valueOfSupply;
    public static double vatRate = 0.1;

    public static double getVAT(double valueOfSupply, double vatRate){
        double vat = valueOfSupply * vatRate;
        return vat;
    }

    public static double getTotal(double valueOfSupply){
        double total = valueOfSupply + getVAT(valueOfSupply, vatRate);
        return total;
    }
}

public class AccoutingApp {

    public static void main(String[] args){
        Accounting.valueOfSupply = 10000;
        System.out.println("VAT : "+Accounting.getVAT(Accounting.valueOfSupply, Accounting.vatRate));
        System.out.println("Total cost : "+Accounting.getTotal(Accounting.valueOfSupply));

    }
}
