package com.gl.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.gl.entity.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Integer> {
	

	@Query(value = "SELECT * FROM ticket_details where title like %:searchString% or description like %:searchString%", nativeQuery = true)
	List<Ticket> searchTicket(@Param("searchString") String searchString);

}
