package com.cat.sanmina.util;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ch.ethz.ssh2.Connection;
import ch.ethz.ssh2.Session;
import ch.ethz.ssh2.StreamGobbler;

public class ConnectLinuxUtil {
	
	private static Logger logger = LoggerFactory.getLogger(ConnectLinuxUtil.class);
	
	//获取远程电脑链接的方法
    public static Connection getOpenedConnection(String host, String username,  
    	      
            String password, int port) throws IOException {  
          
                if (logger.isInfoEnabled()) {   
          
                    logger.info("connecting to " + host + " with user " + username  
          
                    + " and pwd " + password);  
          
                }  
          
                Connection conn = new Connection(host, port);  
          
                conn.connect(); // make sure the connection is opened  
          
                boolean isAuthenticated = conn.authenticateWithPassword(username,  
          
                password);  
          
                if (isAuthenticated == false)  
          
                    throw new IOException("Authentication failed.");  
          
                return conn;  
          
            }  
    
    
    /**
     * 通过shell命令获取计算机状态
     * @param host
     * @param username
     * @param password
     * @param cmd
     * @param port
     * @return
     * @throws IOException
     */
    public static String execShellScript(String host, String username,  
            String password,  
  
            String cmd, int port) throws IOException {  
  
        if (logger.isInfoEnabled()) {  
  
            logger.info("running SSH cmd [" + cmd + "]");  
  
        }  
  
        Connection conn = null;  
  
        Session sess = null;  
  
        InputStream stdout = null;  
  
        BufferedReader br = null;  
  
        StringBuffer buffer = new StringBuffer();  
        try {  
  
            conn = getOpenedConnection(host, username, password, port);  
  
            //System.out.println(conn);
            
            sess = conn.openSession();  
  
            sess.execCommand(cmd);  
  
            stdout = new StreamGobbler(sess.getStdout());  
  
            br = new BufferedReader(new InputStreamReader(stdout));  
  
            while (true) {  
  
                String line = br.readLine();  
  
                if (line == null)  
                    break;  
                  
                buffer.append(line);  
                buffer.append(System.getProperty("line.separator"));// 换行  
  
                if (logger.isInfoEnabled()) {  
                   // logger.info(line);  
                }  
  
            }  
  
        }catch(Exception e){
        	logger.info(e.getMessage());
        }finally {  
  
            sess.close();  
  
            conn.close();  
            
            br.close();
            
            stdout.close();
  
        }  
  
        return buffer.toString();  
  
    }  
    
    
    /**
     * 通过shell命令获取计算机状态
     * @param host
     * @param username
     * @param password
     * @param cmd
     * @param port
     * @return
     * @throws IOException
     */
    public static BufferedReader execShellScriptGetBuffer(String host, String username,  
            String password,  
  
            String cmd, int port) throws IOException {  
  
        if (logger.isInfoEnabled()) {  
  
            logger.info("running SSH cmd [" + cmd + "]");  
  
        }  
  
        Connection conn = null;  
  
        Session sess = null;  
  
        InputStream stdout = null;  
  
        BufferedReader br = null;  
  
     //   StringBuffer buffer = new StringBuffer();  
        try {  
  
            conn = getOpenedConnection(host, username, password, port);  
  
            System.out.println(conn);
            
            sess = conn.openSession();  
  
            sess.execCommand(cmd);  
  
            stdout = new StreamGobbler(sess.getStdout());  
  
            br = new BufferedReader(new InputStreamReader(stdout));  
  
         /*while (true) {  
  
                String line = br.readLine();  
  
                if (line == null)  
                    break;  
                  
                buffer.append(line);  
                buffer.append(System.getProperty("line.separator"));// 换行  
  
                if (logger.isInfoEnabled()) {  
                   // logger.info(line);  
                }  
  
            }  
                  
                buffer.append(line);  
                buffer.append(System.getProperty("line.separator"));// 换行  
  
                if (logger.isInfoEnabled()) {  
                   // logger.info(line);  
                }  
  
            }  */
  
        }catch(Exception e){
        	logger.info(e.getMessage());
        }finally {  
  
            sess.close();  
  
            conn.close();  
            
           // br.close();
            
           // stdout.close();
  
        }  
  
        return br;
  
    }  
    
    
    
}
