package _0829Ex;

import java.io.FileWriter;
import java.util.Scanner;

public class Ex10_14 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		FileWriter fw = new FileWriter("C:/javadata/data4.txt");
		String str;

		while (!(str = sc.nextLine()).equals(""))  //���� ������������� 11��ó��, ���͸� ������ �Է�����
			fw.write(str + "\r\n");  //\r = Ŀ���� �� ������ \n = �� �ѱ�� =����

		fw.close();
	}
}