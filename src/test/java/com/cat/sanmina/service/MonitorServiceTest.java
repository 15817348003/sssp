package com.cat.sanmina.service;
import java.util.List;

import javax.annotation.Resource;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ImportResource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cat.sanmina.dao.MonitorDao;
import com.cat.sanmina.model.Monitor;

/**
 * 配置spring和junit整合，junit启动时加载springIOC容器
 * spring-test-，junit
 */
@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring的配置文件
@ContextConfiguration({"classpath:spring/applicationContext.xml"})
public class MonitorServiceTest {

	
	@Autowired
	private MonitorService monitorService;
	
	@Autowired
	private MonitorDao monitorDao;
	
	@Test
	public void findAllTest(){
		List<Monitor> list = monitorService.findAllOfActive();
		for(Monitor m : list){
			System.out.println("name : " + m.getMonitorShortName());
		}
	}
}
