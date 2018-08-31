package _0829Ex;

import java.io.FileWriter;
import java.util.Scanner;

public class Ex10_14 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		FileWriter fw = new FileWriter("C:/javadata/data4.txt");
		String str;

		while (!(str = sc.nextLine()).equals(""))  //행이 비어있지않으면 11행처리, 엔터를 누르면 입력종료
			fw.write(str + "\r\n");  //\r = 커서를 맨 앞으로 \n = 줄 넘기기 =엔터

		fw.close();
	}
}