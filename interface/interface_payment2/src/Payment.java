import java.util.ArrayList;

public interface Payment {
    float tax = 0.05F;
    boolean validatePayment(double amount);
    double calculateTotalAmount(double amount);
    void processPayment(double amount);
}

class CreditCard implements Payment {
    double fee = 100;
    boolean isValid;

    public boolean validatePayment(double amount) {
        if (amount < 100 || amount > 10000) {
            isValid = false;
            System.out.println("Payment not validated.");
        } else {
            isValid = true;
            System.out.println("Payment validated.");
        }
        return isValid;
    }

    public double calculateTotalAmount(double amount) {
        return amount + (amount * tax) + fee;
    }

    public void processPayment(double amount) {
        if (validatePayment(amount)) {
            double totalAmount = calculateTotalAmount(amount);
            System.out.println("Processing credit card payment of Rs " + totalAmount);
            TransactionHistory.logTransaction("Credit Card", amount, totalAmount, fee);
        }
    }
}

class DebitCard implements Payment {
    double fee = 200;
    boolean isValid;

    public boolean validatePayment(double amount) {
        if (amount < 100 || amount > 10000) {
            isValid = false;
            System.out.println("Payment not validated.");
        } else {
            isValid = true;
            System.out.println("Payment validated.");
        }
        return isValid;
    }

    public double calculateTotalAmount(double amount) {
        return amount + (amount * tax) + fee;
    }

    public void processPayment(double amount) {
        if (validatePayment(amount)) {
            double totalAmount = calculateTotalAmount(amount);
            System.out.println("Processing debit card payment of Rs " + totalAmount);
            TransactionHistory.logTransaction("Debit Card", amount, totalAmount, fee);
        }
    }
}

class Paypal implements Payment {
    double fee = 300;
    boolean isValid;

    public boolean validatePayment(double amount) {
        if (amount < 100 || amount > 10000) {
            isValid = false;
            System.out.println("Payment not validated.");
        } else {
            isValid = true;
            System.out.println("Payment validated.");
        }
        return isValid;
    }

    public double calculateTotalAmount(double amount) {
        return amount + (amount * tax) + fee;
    }

    public void processPayment(double amount) {
        if (validatePayment(amount)) {
            double totalAmount = calculateTotalAmount(amount);
            System.out.println("Processing PayPal payment of Rs " + totalAmount);
            TransactionHistory.logTransaction("PayPal", amount, totalAmount, fee);
        }
    }
}

class TransactionHistory {
    private static ArrayList<String> transactions = new ArrayList<String>();

    public static void logTransaction(String paymentMethod, double amount, double totalAmount, double fee) {
        transactions.add( paymentMethod + " Transaction: Amount = Rs " + amount + ", Total Amount = Rs " + totalAmount + ", Fee = Rs " + fee);
        System.out.println( paymentMethod + " Transaction: Amount = Rs " + amount + ", Total Amount = Rs " + totalAmount + ", Fee = Rs " + fee);
    }
    public static void displayHistory() {
        System.out.println("\nTransaction History:");
        for (String i : transactions) {
            System.out.println(i);
        }
    }
}

class Main {
    public static void main(String[] args) {
        Payment c1 = new CreditCard();
        Payment d1 = new DebitCard();
        Payment p1 = new Paypal();

        c1.processPayment(5000);
        d1.processPayment(3000);
        p1.processPayment(7000);

        TransactionHistory.displayHistory();
    }
}
