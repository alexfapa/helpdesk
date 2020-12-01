package com.fapa.helpdesk.api.service;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import com.fapa.helpdesk.api.entity.ChangeStatus;
import com.fapa.helpdesk.api.entity.Ticket;

@Component
public interface TicketService {
	//criação ou atualização de novo chamado, onde caso o chamado exista ele irá ser atualizado
	Ticket createOrUpdate(Ticket tic); 
	
	//busca chamado pelo Id
	Ticket findById(String id);
	
	//métdod apagar chamado
	void delete(String id);
	
	//listagem dos chamados criados
	Page<Ticket> listTicket(int page, int count);
	
	//setar status do chamado
	ChangeStatus createChangeStatus(ChangeStatus changeStatus);
	
	//listagem dos status de um determinado chamado
	Iterable<ChangeStatus> listChangeStatus(String ticketId);
	
	//listagem dos chamados do usuário corrente
	Page<Ticket> findByCurrentUser(int page, int count, String userId);
	
	//listagem de chamados por parâmetros no caso por status ou por prioridade
	Page<Ticket> findByParameters(int page, int count, String status, String priority);
	
	//listagem de chamados por parâmetros no caso por status ou por prioridade levando em consideração o usuário corrente
	Page<Ticket> findByParametersAndCurrentUser(int page, int count, String status, String priority, String userId);	
	
	//listagem de chamados pelo número do chamado
	Page<Ticket> findByNumber(int page, int count, Integer number);
	
	//resumo de todos os chamados
	Iterable<Ticket> findAll();
	
	//listagem de chamados somente do usuário logado
	Page<Ticket> findByParameterAndAssignedUser(int page, int count, String title, String status, String priority, String assignedUser);
}
