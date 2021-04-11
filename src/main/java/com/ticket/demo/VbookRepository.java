package com.ticket.demo;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface VbookRepository extends MongoRepository<Vbook,String> {

}
