package Week4Tasks;
interface Payment {
    void pay(double amount);
    void refund(double amount);
}

class CreditCardPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
    }

    public void refund(double amount) {
        System.out.println("Refunded " + amount + " to Credit Card.");
    }
}

class UPIPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI.");
    }

    public void refund(double amount) {
        System.out.println("Refunded " + amount + " via UPI.");
    }
}

public class PaymentDemo {
    public static void main(String[] args) {
        Payment creditCard = new CreditCardPayment();
        Payment upi = new UPIPayment();

        creditCard.pay(1000);
        creditCard.refund(500);

        upi.pay(750);
        upi.refund(250);
    }
}

