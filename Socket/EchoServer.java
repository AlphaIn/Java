package Java.Socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class EchoServer {
	
	//启动服务器的方法
	public void launch() {
		//启动服务线程
		new Thread() {
			@Override
			public void run() {
				try {
					ServerSocket ss = new ServerSocket(8000);
					System.out.println("服务已经在8000端口上启动");
					while(true) {
						Socket s = ss.accept();
						//连接通道s，交给通信线程去执行通信
						CommunicationThread t = new CommunicationThread(s);
						t.start();
					}
				} catch (Exception e ) {
					System.out.println("无法在8000端口上启动服务，或者服务已停止");
				}
			}
		}.start();
	}
	
	class CommunicationThread extends Thread {
		Socket s;
		public CommunicationThread(Socket s) {
			this.s = s;
		}
		@Override
		public void run() {
			/*
			 * 通信协议：流程和数据格式
			 * UTF-8编码的字符串，每一行字符串，以换行符结尾
			 * 处理编码、使用编码的转换流
			 *     InputStreamReader,OutputStreamWriter
			 * 处理换行符
			 *     BufferedReader,readLine()
			 *     PrintWriter,println()
			 * BR--ISR--网络输入流
			 * PW--OSW--网络输出流
			 */
			 try {
				 BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream(),"UTF-8"));
				 PrintWriter out = new PrintWriter(new OutputStreamWriter(s.getOutputStream(),"UTF-8"));
				 
				 String line;
				 while ((line = in.readLine()) != null) {
					 out.println(line);
					 out.flush();
				 }
				 //断开
			 } catch (Exception e) {
				 //断开
			 }
			 //处理断开
			 System.out.println("客户端已断开连接");
		}
	}
}
