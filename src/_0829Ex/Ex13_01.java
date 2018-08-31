package _0829Ex;

import javax.swing.*;

public class Ex13_01 {
	static class MyGUI extends JFrame {
		MyGUI() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //x버튼을 종료하기
			setTitle("GUI 연습");  

			// 이 부분에 버튼, 레이블, 체크박스 등을 코딩함

			setSize(500, 500);    //크기정하기
			setVisible(true);        //보이게한다. 그 위는 준비단계임
		} //constructor1
	}

	public static void main(String[] args) {
		new MyGUI();
	}
}
