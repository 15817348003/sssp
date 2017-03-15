package com.cat.sanmina.entity.system;

/**
 * cpu的实体类
 * @author cat
 *
 */
public class CPUEntity {
	
	//cpu的架构
	private String architecture; 
	//cpu的总核心数
	private int CPUs;
	//每个cpu核所支持的线程数
	private int threadPerCore;
	//每个cpu的核心数
	private int corePerSocket;
	//机器中cpu的总数
	private int sockets;
	//cpu的厂商Id
	private String vendorID;
	//cpu型号
	private String modelName;
	
	
	
	public CPUEntity() {
	}
	
	public CPUEntity(String architecture, int cPUs, int threadPerCore, int corePerSocket, int sockets, String vendorID,
			String modelName) {
		super();
		this.architecture = architecture;
		CPUs = cPUs;
		this.threadPerCore = threadPerCore;
		this.corePerSocket = corePerSocket;
		this.sockets = sockets;
		this.vendorID = vendorID;
		this.modelName = modelName;
	}

	public String getArchitecture() {
		return architecture;
	}
	public int getCPUs() {
		return CPUs;
	}
	public int getThreadPerCore() {
		return threadPerCore;
	}
	public int getCorePerSocket() {
		return corePerSocket;
	}
	public int getSockets() {
		return sockets;
	}
	public String getVendorID() {
		return vendorID;
	}
	public String getModelName() {
		return modelName;
	}
	public void setArchitecture(String architecture) {
		this.architecture = architecture;
	}
	public void setCPUs(int cPUs) {
		CPUs = cPUs;
	}
	public void setThreadPerCore(int threadPerCore) {
		this.threadPerCore = threadPerCore;
	}
	public void setCorePerSocket(int corePerSocket) {
		this.corePerSocket = corePerSocket;
	}
	public void setSockets(int sockets) {
		this.sockets = sockets;
	}
	public void setVendorID(String vendorID) {
		this.vendorID = vendorID;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	@Override
	public String toString() {
		return "CPUEntity [architecture=" + architecture + ", CPUs=" + CPUs + ", threadPerCore=" + threadPerCore
				+ ", corePerSocket=" + corePerSocket + ", sockets=" + sockets + ", vendorID=" + vendorID
				+ ", modelName=" + modelName + "]";
	}
	
	
}
