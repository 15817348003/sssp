package com.cat.sanmina.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import com.cat.sanmina.dto.ComputerMessage;
import com.cat.sanmina.entity.system.CPUEntity;
import com.cat.sanmina.entity.system.MemEntity;

import ch.ethz.ssh2.Connection;
import ch.ethz.ssh2.Session;
import ch.ethz.ssh2.StreamGobbler;

/**
 * 获取计算机硬件信息的工具类
 * @author cat
 *
 */
public class SystemMessageUtil {
	private static final String CPU_CMD = "lscpu";
	private static final String MEM_CMD = "cat /proc/meminfo";
	public static final int COM_PORT = 22;
	/**
	 * 获取cpu信息的方法
	 * @param com : 远程计算机的ssh服务信息
	 * @return : 返回cpuentity cpu实体类
	 */
	public static CPUEntity getCPUMessage(ComputerMessage com) throws IOException{
		CPUEntity cpu = new CPUEntity();
		
		
        Connection conn = null;  
  
        Session sess = null;  
  
        InputStream stdout = null;  
  
        BufferedReader br = null;  
  
        StringBuffer buffer = new StringBuffer();  
        try {  
  
            conn = ConnectLinuxUtil.getOpenedConnection(com.getPost(), com.getUsername(), com.getPassword(), com.getPort());  
  
            System.out.println(conn);
            
            sess = conn.openSession();  
  
            sess.execCommand(CPU_CMD);  
  
            stdout = new StreamGobbler(sess.getStdout());  
  
            br = new BufferedReader(new InputStreamReader(stdout));  
            
            int i =0 ;
            while (true) {  
  
                String line = br.readLine();  
  
                if (line == null)  
                    break;  
                if (i == 0){
                	cpu.setArchitecture(CommonUtil.GetCPUUsefulMessageForString(line));
                }
                if(i == 3){
                	cpu.setCPUs(Integer.parseInt(CommonUtil.GetCPUUsefulMessageForString(line)));
                }
                if(i == 5){
                	cpu.setThreadPerCore(Integer.parseInt(CommonUtil.GetCPUUsefulMessageForString(line)));
                }
                if(i == 6){
                	cpu.setCorePerSocket(Integer.parseInt(CommonUtil.GetCPUUsefulMessageForString(line)));
                }
                if(i == 7){
                	cpu.setSockets(Integer.parseInt(CommonUtil.GetCPUUsefulMessageForString(line)));
                }
                if(i == 9){
                	cpu.setVendorID(CommonUtil.GetCPUUsefulMessageForString(line));
                }
                if(i == 12){
                	cpu.setModelName(CommonUtil.GetCPUUsefulMessageForString(line));
                }
                  i ++;
            }  
  
        }catch(Exception e){
        	e.printStackTrace();
        }finally {  
  
            sess.close();  
  
            conn.close();  
            
            br.close();
            
            stdout.close();
  
        }  
  
		
		return cpu;
	}
	
	/**
	 * 获取内存信息的方法
	 * @param com : 远程计算机的ssh服务信息
	 * @return : 返回mementity内存实体类
	 */
	public static MemEntity getMemEntity(ComputerMessage com) throws IOException{
		MemEntity mem = new MemEntity();
		  Connection conn = null;  
		  
	        Session sess = null;  
	  
	        InputStream stdout = null;  
	  
	        BufferedReader br = null;  
	  
	        StringBuffer buffer = new StringBuffer();  
	        try {  
	  
	            conn = ConnectLinuxUtil.getOpenedConnection(com.getPost(), com.getUsername(), com.getPassword(), com.getPort());  
	  
	            System.out.println(conn);
	            
	            sess = conn.openSession();  
	  
	            sess.execCommand(MEM_CMD);  
	  
	            stdout = new StreamGobbler(sess.getStdout());  
	  
	            br = new BufferedReader(new InputStreamReader(stdout));  
	            
	            int i =0 ;
	            while (true) {  
	  
	                String line = br.readLine();  
	  
	                if (line == null)  
	                    break;  
	               if(i == 0){
	            	   mem.setMemTotal(Long.parseLong(CommonUtil.GetMEMUsefulMessageForString(line)));
	               }
	               if(i == 1){
	            	   mem.setMenFree(Long.parseLong(CommonUtil.GetMEMUsefulMessageForString(line)));
	               }
	               if(i == 3){
	            	   mem.setBuffers(Long.parseLong(CommonUtil.GetMEMUsefulMessageForString(line)));
	               }
	               if(i == 4){
	            	   mem.setCached(Long.parseLong(CommonUtil.GetMEMUsefulMessageForString(line)));
	               }
	               if(i == 5){
	            	   mem.setSwapCached(Long.parseLong(CommonUtil.GetMEMUsefulMessageForString(line)));
	               }
	               if(i == 6){
	            	   mem.setActive(Long.parseLong(CommonUtil.GetMEMUsefulMessageForString(line)));
	               }
	               if(i > 6){
	            	   break;
	               }
	                  i ++;
	            }  
	  
	        }catch(Exception e){
	        	e.printStackTrace();
	        }finally {  
	  
	            sess.close();  
	  
	            conn.close();  
	            
	            br.close();
	            
	            stdout.close();
	  
	        }  
	  
		return mem;
	}
	
}
