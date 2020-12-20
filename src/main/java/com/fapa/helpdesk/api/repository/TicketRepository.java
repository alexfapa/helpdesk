package com.fapa.helpdesk.api.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.fapa.helpdesk.api.entity.Ticket;

public interface TicketRepository extends MongoRepository<Ticket, String>{
	
	Page<Ticket> findByUserIdOrderByDataDesc(Pageable pages, String userId);  
	
	Page<Ticket> findByTitleIgnoreCaseContainingAndStatusAndPriorityOrderByDataDesc(
			String title, String status, String priority, Pageable pages);
	
	Page<Ticket> findByTitleIgnoreCaseContainingAndStatusAndPriorityAndUserIdOrderByDataDesc(
			String title, String status, String priority, String userId, Pageable pages);
	
	Page<Ticket> findByTitleIgnoreCaseContainingAndStatusAndPriorityAndAssignedUserIdOrderByDataDesc(
			String title, String status, String priority, String userId, Pageable pages);
	
	Page<Ticket> findByNumber(Integer number, Pageable pages);
}
