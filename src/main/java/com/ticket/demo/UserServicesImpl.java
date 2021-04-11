package com.ticket.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userServices")
public class UserServicesImpl implements UserServices {
	
	
	@Autowired
	UserDao userDao;

	@Override
	public void create(User user) {
		userDao.create(user);
		
	}

	@Override
	public void update(User user) {
		
		userDao.update(user);
	}

	@Override
	public void delete(User user) {
		userDao.delete(user);
		
	}

	@Override
	public void deleteAll() {
		userDao.deleteAll();
		
	}

	@Override
	public User find(User user) {
		
		return userDao.find(user);
	}

	@Override
	public List<User> findAll() {
		
		return userDao.findAll();
	}

}
