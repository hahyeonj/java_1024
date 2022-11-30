package day26;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Ex01_ClientMain {

	public static void main(String[] args) {
		Socket socket = null;
		try {
			socket = new Socket();
			socket.connect(new InetSocketAddress(5001));
			System.out.println("[연결 완료]");
			//Output 스트림 연결
			OutputStream os = socket.getOutputStream();
			//보내려는 문자열을 byte 배열로 변환
			String str = "안녕하세요.";
			byte [] bytes = str.getBytes("UTF-8");
			//전송
			os.write(bytes);
			os.flush();
			//Output 스트림 객체 닫음
			//서버에서 문자열을 입력받아
			InputStream is = socket.getInputStream();
			int readCount = is.read(bytes);
			str = new String(bytes, 0, readCount, "UTF-8");
			System.out.println(str);
			//콘솔에 출력
			os.close();
			is.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
