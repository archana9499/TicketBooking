package com.ticket.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;


@Repository
@Qualifier("userDao")
public class UserDaoImpl implements UserDao {

	@Autowired
	MongoTemplate mongoTemplate;
	final String COLLECTION="userInfo";
	
	@Override
	public void create(User user) {
		mongoTemplate.insert(user);
		
	}

	@Override
	public void update(User user) {
		mongoTemplate.save(user);
		
	}

	@Override
	public void delete(User user) {
		mongoTemplate.remove(user);
		
	}

	@Override
	public void deleteAll() {
		mongoTemplate.remove(new Query(),COLLECTION);
		
	}

	@Override
	public User find(User user) {
		Query query = new Query(Criteria.where("emailId").is(user.getEmailId()));
		return mongoTemplate.findOne(query,User.class,COLLECTION);
	}

	@Override
	public List<User> findAll() {
		
		return(List<User>)mongoTemplate.findAll(User.class);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
