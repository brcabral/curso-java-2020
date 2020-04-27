package model.services;

import java.util.Calendar;
import java.util.Date;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {
	private OnlinePaymentService onlinePaymentService;

	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}

	public void processContract(Contract contract, Integer months) {
		Double installmentValue = contract.getTotalValue() / months;

		for (int i = 1; i <= months; i++) {
			Date dueDate = addMonths(contract.getDate(), i);
			Double amount = onlinePaymentService.interest(installmentValue, i);
			amount = onlinePaymentService.paymentFee(amount);

			contract.addInstallment(new Installment(dueDate, amount));
		}
	}

	private Date addMonths(Date date, int n) {
		Calendar calendarDate = Calendar.getInstance();
		calendarDate.setTime(date);
		calendarDate.add(Calendar.MONTH, n);
		return calendarDate.getTime();
	}
}
