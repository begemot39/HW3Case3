public class CreditPaymentService {
    public double calculate(int loanTerm, double interestRate, int creditAmount) {
        double monthlyInterestRate = interestRate / (100 * 12);
        double scale = Math.pow(10, 6);

        double ratio = (monthlyInterestRate * (Math.pow(monthlyInterestRate + 1, loanTerm))) / (Math.pow(monthlyInterestRate + 1, loanTerm) - 1);
        ratio = (Math.round(ratio * scale) / scale);
        int monthlyPayment = (int) (creditAmount * ratio);
        return monthlyPayment;
    }
}
