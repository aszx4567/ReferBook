package _0829Ex;

import java.awt.*;
import javax.swing.*;

public class Ex13_04 {
	static class MyGUI extends JFrame {
		MyGUI() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("GridLayout 연습");

			this.setLayout(new GridLayout(3, 3,  20, 20));

			JButton[] btn = new JButton[9];

			for (int i = 0; i < 9; i++) {
				btn[i] = new JButton("버튼" + (i + 1));
				this.add(btn[i]);
			}

			setSize(311, 311);
			setVisible(true);
		}
	}

	public static void main(String[] args) {
		new MyGUI();
	}
}