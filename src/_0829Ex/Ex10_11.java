package _0829Ex;

import java.io.*;

public class Ex10_11 {
	public static void main(String[] args) throws Exception {
		FileReader fReader = new FileReader("c:/javadata/a.txt");
		BufferedReader bReader = new BufferedReader(fReader);

		String str = null;

		
		while ((str = bReader.readLine()) != null) {     //readLine() �޼ҵ� : �ؽ�Ʈ�� ���� �д´�.
			System.out.println(str);
		}

		bReader.close();
		fReader.close();
	}

}
