package com.ticket.demo;

import java.util.List;

public interface VbookService {

	public void create(Vbook vbook);
	
	public List<Vbook> findAll();
	
	public List<Vbook> find(String source,String dest,String name,String trainId,double fare);
	
	
}
