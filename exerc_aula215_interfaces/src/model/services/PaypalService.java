package model.services;

public class PaypalService implements OnlinePaymentService {
	
	//taxa por pagamento
	public double paymentFee(Double amount) {
		return amount + (amount * 0.02);		
	}
	
	//juros
	public double interest(Double amount, Integer months) {
		return amount + ((amount * 0.01) * months);
	}

}
