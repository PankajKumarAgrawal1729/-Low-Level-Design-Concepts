package BehavioralDesignPattern.TemplateMethodDesignPattern;

public class PayToFriend extends PaymentFlow {

    @Override
    public void calculateFees() {
        System.out.println("Validate Logic for pay to friend");
    }

    @Override
    public void creditAmount() {
        System.out.println("Credit amount to friend's account");
    }

    @Override
    public void debitAmount() {
        System.out.println("Debit amount from user's account");
    }

    @Override
    public void validateRequest() {
        System.out.println("Validate request for pay to friend");
    }
    
}
