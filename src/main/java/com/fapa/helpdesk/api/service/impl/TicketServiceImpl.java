package com.fapa.helpdesk.api.service.impl;

import java.awt.print.Pageable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.fapa.helpdesk.api.entity.ChangeStatus;
import com.fapa.helpdesk.api.entity.Ticket;
import com.fapa.helpdesk.api.repository.ChangeStatusRepository;
import com.fapa.helpdesk.api.repository.TicketRepository;
import com.fapa.helpdesk.api.service.TicketService;

@Service
public class TicketServiceImpl implements TicketService{

	@Autowired
	private TicketRepository ticketRepository;
	
	@Autowired
	private ChangeStatusRepository changeStatusRepository;
	
	@Override
	public Ticket createOrUpdate(Ticket ticket) {
		return this.ticketRepository.save(ticket);
	}

	@Override
	public Ticket findById(String id) {
		
		return this.ticketRepository.findOne(id);
	}

	@Override
	public void delete(String id) {
		this.ticketRepository.delete(id);	
	}

	@Override
	public Page<Ticket> listTicket(int page, int count) {
		Pageable pages = (Pageable) new PageRequest(page, count);
		
		return this.changeStatusRepository.findAll(pages);
		
	}

	@Override
	public ChangeStatus createChangeStatus(ChangeStatus changeStatus) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<ChangeStatus> listChangeStatus(String ticketId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Ticket> findByCurrentUser(int page, int count, String userId) {
		// 
		return null;
	}

	@Override
	public Page<Ticket> findByParameters(int page, int count, String status, String priority) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Ticket> findByParametersAndCurrentUser(int page, int count, String status, String priority,
			String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Ticket> findByNumber(int page, int count, Integer number) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Ticket> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Ticket> findByParameterAndAssignedUser(int page, int count, String title, String status,
			String priority, String assignedUser) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
