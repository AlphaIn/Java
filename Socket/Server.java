package java.Socket

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Server {
	
	public static void main(String[] args) throws Exception {
		ServerSocket ss = new ServerSocket(80000);
		System.out.println("服务在8000端口上已启动");
		
		System.out.println("暂停，等待客户端发起连接");
		Socket s = ss.accept();
		System.out.println("客户端已连接");
		
		InputStream in = s.getInputStream();
		OutputStream out = s.getOutputStream();
		/*
		 *通信协议：
		 *   *)通信流程
		 *   *)数据格式
		 *
		 *   从客户端接收"hello"
		 *   向客户端发送"world"
		 */
		 for (int i = 0 ; i < 5; i ++) {
			 char c = (char) in.read();
			 System.out.print(c);
		 }
		 out.write("world".getBytes());
		 out.flush();
		 
		 s.close();//断开连接
		 ss.close();//停止服务，释放端口
	}
}
