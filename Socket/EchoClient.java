package java.Socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class EchoClient {
	public static void main(String[] args) throws Exception {
		//建立连接
		Socket s = new Socket("127.0.0.1",8000);
		
		BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream(),"UTF-8"));
		
		PrintWriter out = new PrintWriter(new OutputStreamWriter(s.getOutputStream(),"UTF-8"));
		
		while(true) {
			System.out.println("输入：");
			String str = new Scanner(System.in).nextLine();
			out.println(str);
			out.flush();
			String echo = in.readLine();
			System.out.println("回声："+echo);
		}
				 
	}
}
