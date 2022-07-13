package model.services;

import java.util.Calendar;
import java.util.Date;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {

	private OnlinePaymentService onlinePaymentService;

	public ContractService(OnlinePaymentService onlinePaymentService) {
		super();
		this.onlinePaymentService = onlinePaymentService;
	}
	
	public void processContract(Contract contract, Integer months) {
		double valueInstallment = contract.getTotalValue() / months;
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(contract.getDate());
		
		for(int i = 1; i <= months; i ++) {
			double valueInterest = onlinePaymentService.interest(valueInstallment, i);
			double valuePaymentFee = onlinePaymentService.paymentFee(valueInterest);
			
			cal.add(Calendar.MONTH, 1);	
			Date dateInterest = cal.getTime();
			
			contract.addInstallment(new Installment(dateInterest, valuePaymentFee));
			
		}
	}
}
