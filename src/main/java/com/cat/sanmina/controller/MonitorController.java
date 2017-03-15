package com.cat.sanmina.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cat.sanmina.dto.ResultMessage;
import com.cat.sanmina.model.Monitor;
import com.cat.sanmina.service.MonitorService;

@RestController
public class MonitorController {

	@Autowired
	private MonitorService monitorService;
	
	
	@RequestMapping(value = "/monitors",
			method = RequestMethod.GET,
			produces = {"application/json;charset=utf-8"})
	public ResultMessage<List<Monitor>> findAll(){
		//获取所有活跃的monitor
		List<Monitor> list = monitorService.findAllOfActive();
		//封装请求信息
		return new ResultMessage<List<Monitor>>(true, list, list.size());
	}
	
}
