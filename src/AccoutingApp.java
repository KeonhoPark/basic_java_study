public class AccoutingApp {

    public static double valueOfSupply = 10000;
    public static double vatRate = 0.1;

    public static double getVAT(double valueOfSupply, double vatRate){
        double vat = valueOfSupply * vatRate;
        return vat;
    }

    public static double getTotal(double valueOfSupply){
        double total = valueOfSupply + getVAT(valueOfSupply, vatRate);
        return total;
    }

    public static void main(String[] args){
        System.out.println("VAT : "+getVAT(valueOfSupply, vatRate));
        System.out.println("Total cost : "+getTotal(valueOfSupply));

    }
}
