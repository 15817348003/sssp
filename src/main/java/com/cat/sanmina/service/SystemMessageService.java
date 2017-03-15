package com.cat.sanmina.service;

import java.io.IOException;

import javax.sql.ConnectionEventListener;

import org.springframework.stereotype.Service;

import com.cat.sanmina.dto.ComputerMessage;
import com.cat.sanmina.dto.ResultMessage;
import com.cat.sanmina.entity.system.CPUEntity;
import com.cat.sanmina.entity.system.MemEntity;
import com.cat.sanmina.util.ConnectLinuxUtil;
import com.cat.sanmina.util.SystemMessageUtil;

import ch.ethz.ssh2.Connection;
import ch.ethz.ssh2.signature.RSASignature;

/**
 * 获取远程服务器的计算机硬件信息的业务逻辑类
 * @author cat
 *
 */
@Service
public class SystemMessageService {
	
	
	/**
	 * 获取远程服务器内存信息的业务逻辑方法
	 * @param com ：  远程服务器的连接信息
	 * @return
	 */
	public ResultMessage<MemEntity> getMEMMessage(ComputerMessage com){
		Connection con = null;
		if(com.getPort() == 0){
			com.setPort(SystemMessageUtil.COM_PORT);
		}
		try {
			con = ConnectLinuxUtil.getOpenedConnection(com.getPost(), com.getUsername(), com.getPassword(), com.getPort());
			if(con == null){
				return new ResultMessage<MemEntity>(false, "连接服务器失败");
			}
			MemEntity mem = SystemMessageUtil.getMemEntity(com);
			if(mem != null){
				return new ResultMessage<MemEntity>(true, mem);
			}
		} catch (IOException e) {
			return new ResultMessage<MemEntity>(false, "连接远程服务器出现异常");
		}finally{
			con.close();
		}
		return new ResultMessage<MemEntity>(false, "获取内存信息失败");
	}
	
	/**
	 * 获取远程服务器cpu信息的业务逻辑方法
	 * @param com ： 远程服务器的连接信息
	 * @return
	 */
	public ResultMessage<CPUEntity> getCPUMessage(ComputerMessage com){
		Connection con = null;
		if(com.getPort() == 0){
			com.setPort(SystemMessageUtil.COM_PORT);
		}
		try {
			con = ConnectLinuxUtil.getOpenedConnection(com.getPost(), com.getUsername(), com.getPassword(), com.getPort());
			if(con == null){
				return new ResultMessage<CPUEntity>(false, "连接服务器失败");
			}
			CPUEntity cpu = SystemMessageUtil.getCPUMessage(com);
			if(cpu != null){
				return new ResultMessage<CPUEntity>(true, cpu);
			}
		} catch (IOException e) {
			return new ResultMessage<CPUEntity>(false, "连接远程服务器出现异常");
		}finally{
			con.close();
		}
		
		return new ResultMessage<CPUEntity>(false, "获取cpu信息失败");
	}
	
}
