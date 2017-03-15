package com.cat.sanmina.dto;

/**
 * 要访问的计算机实体
 * @author cat
 *
 */
public class ComputerMessage {

	//远程计算机的ip地址
	private String post;
	
	//ssh服务的端口
	private int port;
	
	//远程计算机的用户名
	private String username;
	
	//远程计算机的用户密码
	private String password;
	

	public ComputerMessage() {
	}
	

	public ComputerMessage(String post, int port, String username, String password) {
		this.post = post;
		this.port = port;
		this.username = username;
		this.password = password;
	}


	public String getPost() {
		return post;
	}

	public int getPort() {
		return port;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
