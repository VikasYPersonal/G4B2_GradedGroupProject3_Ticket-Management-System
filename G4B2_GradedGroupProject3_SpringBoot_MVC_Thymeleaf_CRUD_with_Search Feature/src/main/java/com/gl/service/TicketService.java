package com.gl.service;

import java.util.List;
import com.gl.entity.Ticket;

public interface TicketService {

	public List<Ticket> findAll();

	public Ticket findById(int theId);

	public void save(Ticket ticket);

	public void deleteById(int theId);

	public List<Ticket> search(String searchString);

}
