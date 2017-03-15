package com.cat.sanmina.entity.system;

/**
 * 计算机内存的实体类
 * @author cat
 *
 */
public class MemEntity {
	
	//内存总数
	private long memTotal;
	//空闲内存
	private long menFree;
	//缓冲区大小
	private long buffers;
	//缓存大小
	private long cached;
	//交换空间的缓存大小
	private long swapCached;
	//活动空间
	private long active;
	
	
	public long getActive() {
		return active;
	}

	public void setActive(long active) {
		this.active = active;
	}

	public MemEntity() {
	}
	


	public MemEntity(long memTotal, long menFree, long buffers, long cached, long swapCached, long active) {
		this.memTotal = memTotal;
		this.menFree = menFree;
		this.buffers = buffers;
		this.cached = cached;
		this.swapCached = swapCached;
		this.active = active;
	}

	public long getMemTotal() {
		return memTotal;
	}
	public long getMenFree() {
		return menFree;
	}
	@Override
	public String toString() {
		return "MemEntity [memTotal=" + memTotal + ", menFree=" + menFree + ", buffers=" + buffers + ", cached="
				+ cached + ", swapCached=" + swapCached + ", active=" + active + "]";
	}

	public long getBuffers() {
		return buffers;
	}
	public long getCached() {
		return cached;
	}
	public long getSwapCached() {
		return swapCached;
	}
	public void setMemTotal(long memTotal) {
		this.memTotal = memTotal;
	}
	public void setMenFree(long menFree) {
		this.menFree = menFree;
	}
	public void setBuffers(long buffers) {
		this.buffers = buffers;
	}
	public void setCached(long cached) {
		this.cached = cached;
	}
	public void setSwapCached(long swapCached) {
		this.swapCached = swapCached;
	}
	
	

}
