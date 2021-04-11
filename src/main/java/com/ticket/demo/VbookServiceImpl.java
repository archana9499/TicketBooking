package com.ticket.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


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

	
}
