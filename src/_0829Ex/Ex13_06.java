package _0829Ex;

import java.awt.*;
import javax.swing.*;

public class Ex13_06 {
	static class MyGUI extends JFrame {
		MyGUI() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("레이아웃이 없는 창 연습");

			this.setLayout(null);

			JButton btn1 = new JButton("버튼1");
			btn1.setBounds(30, 30, 70, 60);
			this.add(btn1);

			JButton btn2 = new JButton("버튼2");
			btn2.setBounds(214, 0, 70, 60);
			this.add(btn2);

			JButton btn3 = new JButton("버튼3");
			btn3.setBounds(180, 210, 70, 60);
			this.add(btn3);

			setSize(300, 300);
			setVisible(true);
		}
	}

	public static void main(String[] args) {
		new MyGUI();
	}
}

