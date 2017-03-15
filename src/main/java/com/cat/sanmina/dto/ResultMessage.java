package com.cat.sanmina.dto;

/**
 * 返回数据的封装类
 * @author cat
 *
 * @param <T>
 */
public class ResultMessage<T> {
	
	//请求到的数据
	private T data;
	
	//是否请求成功
	private boolean success;
	
	//请求成功是数据的条数
	private int count;     
	
	//附加信息
	private String message;
	
	public ResultMessage(boolean success, String message){
		this.success = success;
		this.message = message;
	}
	
	public ResultMessage(boolean success, T data){
		this.success = success;
		this.data = data;
	}


	public ResultMessage(boolean success, T data,int count){
		this.success = success;
		this.data = data;
		this.count = count;
	}
	
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public T getData() {
		return data;
	}

	public boolean isSuccess() {
		return success;
	}

	public String getMessage() {
		return message;
	}

	public void setData(T data) {
		this.data = data;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
