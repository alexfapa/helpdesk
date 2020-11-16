package com.fapa.helpdesk.api.service.impl;

import java.awt.print.Pageable;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.fapa.helpdesk.api.entity.User;
import com.fapa.helpdesk.api.repository.UserRepository;
import com.fapa.helpdesk.api.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	
	
	public User findByEmail(String email) {
		return this.userRepository.findByEmail(email);
	}

	@Override
	public User createOrUpdate(User user) {
		return this.userRepository.save(user);
	}

	@Override
	public User findById(String id) {
		return this.userRepository.findOne(id);
	}

	@Override
	public void delete(String id) {
		this.userRepository.delete(id);
		
	}

	@Override
	public Page<User> findAll(int page, int count) {
		PageRequest pages = new PageRequest(page, count);
		return this.userRepository.findAll(pages);
		
	}
	
}
