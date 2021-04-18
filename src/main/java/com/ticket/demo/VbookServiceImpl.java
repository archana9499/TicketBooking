package com.ticket.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Repository
@Service("VbookService")
public class VbookServiceImpl implements VbookService {

	
	@Autowired
	MongoTemplate mongoTemplate;
	final String COLLECTION="vbookInfo";
	
	@Override
	public void create(Vbook vbook) {
		mongoTemplate.insert(vbook);
		
	}

	@Override
	public List<Vbook> findAll() {
		return mongoTemplate.findAll(Vbook.class);
		
	}

	@Override
	public List<Vbook> find(String source, String dest, String name, String trainId, double fare) {
		
		Query query = new Query(Criteria.where("sourceStation").regex(source,"i").and("destinationStation").regex(dest,"i").and("name").regex(name,"i").and("trainId").regex(trainId,"i").and("fare").is(fare));
		return mongoTemplate.find(query,Vbook.class,COLLECTION);
	}

	
	@Autowired
	private RestTemplate template;
	
	@Override
	public TransactionResponse saveOrder(TransactionRequest request) {
		
		String response = "";
		Vbook order = request.getOrder();

		BPayment payment = request.getPayment();
		payment.setOrderId(order.getId());
		payment.setAmount(order.getFare());
		
		//rest call
		BPayment paymentResponse = template.postForObject("http://PAYMENT-SERVICE/savePayment",payment,BPayment.class);
		
		
		response = paymentResponse.getPaymentStatus().equals("success")?"payment processing successful and order placed":"there is a failure in payment api, order cancelled";
		
		mongoTemplate.save(order);
		return new TransactionResponse(order,paymentResponse.getAmount(),paymentResponse.getTransactionId(),response);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
