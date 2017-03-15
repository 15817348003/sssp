package com.cat.sanmina.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cat.sanmina.dto.ComputerMessage;
import com.cat.sanmina.dto.ResultMessage;
import com.cat.sanmina.entity.system.CPUEntity;
import com.cat.sanmina.entity.system.MemEntity;
import com.cat.sanmina.service.SystemMessageService;

/**
 * 获取远程服务器的计算机信息的控制器
 * @author cat
 *
 */
@Controller
@RequestMapping("/message")
public class SystemMessageController {

	@Autowired
	private SystemMessageService sysService;
	
	/**
	 * 通过异步获取计算机内存信息
	 * @param post
	 * @param port
	 * @param username
	 * @param password
	 * @return
	 */
	@RequestMapping(value = "/getMem",
			method = RequestMethod.POST,
			produces = {"application/json;charset=utf-8"})
	@ResponseBody
	public ResultMessage<MemEntity> getMemMessage(String post, int port, String username, String password){
		if(post == null || "".equals(post) || username == null || "".equals(username)){
			return new ResultMessage<MemEntity>(false, "IP地址与用户名不能为空");
		}
		return sysService.getMEMMessage(new ComputerMessage(post,port,username,password));
			
	}
	
	@RequestMapping(value = "/getCPU",
			method = RequestMethod.POST,
			produces = {"application/json;charset=utf-8"})
	@ResponseBody
	public ResultMessage<CPUEntity> getCPUMessage(String post, int port, String username, String password){
		if(post == null || "".equals(post) || username == null || "".equals(username)){
			return new ResultMessage<CPUEntity>(false, "IP地址与用户名不能为空");
		}
		return sysService.getCPUMessage(new ComputerMessage(post,port,username,password));
			
	}
	
}
