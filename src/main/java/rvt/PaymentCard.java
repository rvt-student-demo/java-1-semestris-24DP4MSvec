package rvt;

public class PaymentCard {
    private double balance;

    public PaymentCard(double openingBalance) {
        
        this.balance = openingBalance;
    }
    public String toString() {
        return "The card has a balance of " +  this.balance + " euros";
    }

    public void eatAffordably() {
    balance -= 2.60;
}

public void eatHeartily() {
    balance -= 4.60;
}

}