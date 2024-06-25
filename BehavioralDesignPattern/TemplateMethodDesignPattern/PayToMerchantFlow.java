package BehavioralDesignPattern.TemplateMethodDesignPattern;

public class PayToMerchantFlow extends PaymentFlow {

    @Override
    public void calculateFees() {
        System.out.println("Calculating fees for merchant payment...");
    }

    @Override
    public void creditAmount() {
        System.out.println("Crediting amount to merchant's account...");
    }

    @Override
    public void debitAmount() {
        System.out.println("Debiting amount from customer's account...");
    }

    @Override
    public void validateRequest() {
        System.out.println("Validating merchant payment request...");
    }
}
