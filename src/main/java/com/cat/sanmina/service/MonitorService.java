package com.cat.sanmina.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cat.sanmina.dao.MonitorDao;
import com.cat.sanmina.model.Monitor;


@Service
@Transactional
public class MonitorService {
    @Autowired
    private MonitorDao monitorDao;
    
    
    public Monitor getOneMonitor(Integer monitorKey){
        return monitorDao.findOne(monitorKey);
    }
    public List<Monitor> findAll(){
    	return monitorDao.findAll();
    }
    public List<Monitor> findAllOfActive(){
    	return monitorDao.findByOfActive();
    }
}
