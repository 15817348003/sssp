package com.cat.sanmina.util;


import java.io.BufferedReader;
import java.io.IOException;

import org.junit.Test;
import org.junit.runner.Computer;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import com.cat.sanmina.dto.ComputerMessage;
import com.cat.sanmina.dto.ResultMessage;
import com.cat.sanmina.entity.system.CPUEntity;
import com.cat.sanmina.entity.system.MemEntity;

@RunWith(JUnit4.class)
public class ConnectLinuxUtilTest {

	
	@Test
	public void execShellScriptTest() throws Exception{
		String cmd = "cat /proc/meminfo";  
        
        try {  
            String info = ConnectLinuxUtil.execShellScript("127.0.0.1", "cat",  
                    "1234",cmd,22);  
              
            System.out.println("info is:"+info);  
        } catch (IOException e) {  
            e.printStackTrace();  
		}
	}

	@Test
	public void cpuTest() {
	
		try {
			 CPUEntity cpu = SystemMessageUtil.getCPUMessage(new ComputerMessage("127.0.0.1", 22,"cat",  
	                    "1234"));
			 System.out.println(cpu.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void memTest() {
	
		try {
			 MemEntity mem = SystemMessageUtil.getMemEntity(new ComputerMessage("127.0.0.1", 22,"cat",  
	                    "1234"));
			 System.out.println(mem.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@Test
	public void GETmemTest() {
	
		try {
			 MemEntity mem = SystemMessageUtil.getMemEntity(new ComputerMessage("127.0.0.1", 22,"cat",  
	                    "1234"));
			 System.out.println(mem.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
