/* Write a java program to implement a payment gateway with different ways of doing the payment
	1.Through cash
	2.Through card
	3.Through UPI app
    Keep the name of the method as pay. */

package MyProject_Day1;

public class paymentGateway {
	public void pay(double amount) {
		System.out.println("Payment of Rs" + amount + " done using Cash.");
	}
	public void pay(String cardNumber, String cardHolderName, double amount) {
		System.out.println("Payment of Rs" + amount + " done using Card.");
		System.out.println("Card Holder: " + cardHolderName);
		System.out.println("Caed Number: **** **** **** " + cardNumber.substring(cardNumber.length() - 4));
	}
	public void pay(double amount, String upiId) {
		System.out.println("Payment of Rs" + amount + " done using UPI.");
		System.out.println("UPI ID: " + upiId);
	}
public static void main(String args[]) {
	paymentGateway pg = new paymentGateway();
	pg.pay(15000);
	pg.pay("1234567856781234", "Rohit Kumar", 32000.00);
	pg.pay(234.70, "rohit@upi");
	}
}


