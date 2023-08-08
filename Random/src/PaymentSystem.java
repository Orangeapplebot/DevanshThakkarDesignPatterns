public interface PaymentSystem {

    String pay(int amount, int accountNumber);
    String requestPayment(int amount, int accountNumber);

}