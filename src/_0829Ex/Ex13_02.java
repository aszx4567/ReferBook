package _0829Ex;

import java.awt.*;
import javax.swing.*;

public class Ex13_02 {
	static class MyGUI extends JFrame {
		MyGUI() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("FlowLayout 연습");

			this.setLayout(new BorderLayout(10,10));  //레이아웃을 정함

			JButton btn1 = new JButton("버튼1");  //btn1을 jbutton으로 생성함
			//this.add(new JButton("버튼1"));   //프레임에다가 버튼을 추가함
			this.add(btn1, BorderLayout.NORTH);  //Border 일때 방향설정하기

			JButton btn2 = new JButton("버튼2");
			//this.add(btn2);
			this.add(btn2, BorderLayout.WEST);

			JButton btn3 = new JButton("버튼3");
			//this.add(btn3);
			this.add(btn3, BorderLayout.CENTER);

			JButton btn4 = new JButton("버튼4");
			//this.add(btn4);
			this.add(btn4, BorderLayout.EAST);

			JButton btn5 = new JButton("버튼5");
			//this.add(btn5);
			this.add(btn5, BorderLayout.SOUTH);

			setSize(256, 256);
			setVisible(true);
		}
	}

	public static void main(String[] args) {
		new MyGUI();
	}
}
