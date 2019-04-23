package Java.Socket

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	
	public static void main (String[] args) throws Exception {
		
		//向服务器发起连接
		Socket s = new Socket("127.0.0.1",8000);
		
		//从socket插头对象，取出双向的流
		InputStream in = s.getInputStream();
		OutputStream out = s.getOutputStream();
		
		//通信
		out.write("hello".getBytes());
		for (int i = 0; i < 5; i++) {
			char c = (char)in.read();
			System.out.print(c);
		}
		s.close();
	}
}
