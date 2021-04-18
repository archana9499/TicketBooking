package com.ticket.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionRequest {

	private Vbook order;
    private BPayment payment;
    
    
	public Vbook getOrder() {
		return order;
	}
	public void setOrder(Vbook order) {
		this.order = order;
	}
	public BPayment getPayment() {
		return payment;
	}
	public void setPayment(BPayment payment) {
		this.payment = payment;
	}
    
    
}
