package _0829Ex;

import java.io.*;

	public class Ex10_09 {
		public static void main(String[] args) throws Exception {      //FileinputStream����ó�� ���� throws Exception�߰�
		FileInputStream fis = new FileInputStream("c:/javadata/a.txt");
		int ch;
	
		while ((ch = fis.read()) != -1)     
			//���� �ϳ��� read()�� �о�´�.
			//���ϳ����� ������� ���� : -1�� ��ȯ ->���볡�������� �ݺ�
			System.out.print((char) ch);
	
		fis.close();  //���� �ݱ�
	
	}

}
