package interfaceRatepolicy;
interface RatePolicy {
 double calculateInterest(double principal, int years);
}
class FixedRatePolicy implements RatePolicy {
 private double rate;

 public FixedRatePolicy(double rate) {
     this.rate = rate;
 }

 
 public double calculateInterest(double principal, int years) {
     return principal * rate * years;
 }
}


class FloatingRatePolicy implements RatePolicy {
 private double baseRate;
 private double marketSpread;

 public FloatingRatePolicy(double baseRate, double marketSpread) {
     this.baseRate = baseRate;
     this.marketSpread = marketSpread;
 }
 public double calculateInterest(double principal, int years) {
     double finalRate = baseRate + marketSpread;
     return principal * finalRate * years;
 }
}

class Prepayment {
 private double amount;
 private String date;
 private double penalty;

 public Prepayment(double amount, String date, double penalty) {
     this.amount = amount;
     this.date = date;
     this.penalty = penalty;
 }

 public double getAmount() { return amount; }
 public String getDate() { return date; }
 public double getPenalty() { return penalty; }

 public static void main(String[] args) {
     FixedRatePolicy f = new FixedRatePolicy(0.07);
     RatePolicy floating = new FloatingRatePolicy(0.06, 0.015);

     System.out.println("Fixed Rate Interest: " + f.calculateInterest(100000, 2));
     System.out.println("Floating Rate Interest: " + floating.calculateInterest(100000, 2));

     Prepayment prep = new Prepayment(20000, "2025-02-15", 500);

     System.out.println("\nPrepayment Details:");
     System.out.println("Amount: " + prep.getAmount());
     System.out.println("Date: " + prep.getDate());
     System.out.println("Penalty: " + prep.getPenalty());
 }
}
