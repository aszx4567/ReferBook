package _0829Ex;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex10_15 {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("c:/Windows/win.ini");
		FileOutputStream fos = new FileOutputStream("c:/javadata/data5.txt");
		int ch;

		while ((ch = fis.read()) != -1) //1바이트씩 읽어서 다음내용이 -1 :  내용없음 일때까지 반복
			fos.write((byte) ch);

		System.out.println("복사 완료");
		fis.close();
		fos.close();
	}
}