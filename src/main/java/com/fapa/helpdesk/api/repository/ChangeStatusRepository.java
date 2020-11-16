package com.fapa.helpdesk.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.fapa.helpdesk.api.entity.ChangeStatus;


public interface ChangeStatusRepository extends MongoRepository<ChangeStatus, String>{
	Iterable<ChangeStatus> findByTicketIdOrderByDateChangeStatus(String ticketId);
}
