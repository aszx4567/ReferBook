package _0829Ex;

import java.io.*;

	public class Ex10_09 {
		public static void main(String[] args) throws Exception {      //FileinputStream예외처리 위해 throws Exception추가
		FileInputStream fis = new FileInputStream("c:/javadata/a.txt");
		int ch;
	
		while ((ch = fis.read()) != -1)     
			//문자 하나를 read()로 읽어온다.
			//파일내용이 끝날경우 오류 : -1을 반환 ->내용끝날때까지 반복
			System.out.print((char) ch);
	
		fis.close();  //파일 닫기
	
	}

}
