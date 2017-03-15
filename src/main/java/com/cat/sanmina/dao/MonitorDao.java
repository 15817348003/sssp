package com.cat.sanmina.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cat.sanmina.model.Monitor;



public interface MonitorDao extends JpaRepository<Monitor, Integer> {
	
	@Query(value = "select * from spc_monitor where monitor_status='1' " ,nativeQuery=true)
	public List<Monitor> findByOfActive();
    
}