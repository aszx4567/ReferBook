package _0829Ex;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex10_15 {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("c:/Windows/win.ini");
		FileOutputStream fos = new FileOutputStream("c:/javadata/data5.txt");
		int ch;

		while ((ch = fis.read()) != -1) //1����Ʈ�� �о ���������� -1 :  ������� �϶����� �ݺ�
			fos.write((byte) ch);

		System.out.println("���� �Ϸ�");
		fis.close();
		fos.close();
	}
}