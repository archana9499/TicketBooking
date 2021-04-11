package com.ticket.demo;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface TrainRepository extends MongoRepository<Train,String> {

	
	
}
