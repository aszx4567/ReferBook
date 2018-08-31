package _0829Ex;

import java.awt.*;
import javax.swing.*;

public class Ex13_02 {
	static class MyGUI extends JFrame {
		MyGUI() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("FlowLayout ����");

			this.setLayout(new BorderLayout(10,10));  //���̾ƿ��� ����

			JButton btn1 = new JButton("��ư1");  //btn1�� jbutton���� ������
			//this.add(new JButton("��ư1"));   //�����ӿ��ٰ� ��ư�� �߰���
			this.add(btn1, BorderLayout.NORTH);  //Border �϶� ���⼳���ϱ�

			JButton btn2 = new JButton("��ư2");
			//this.add(btn2);
			this.add(btn2, BorderLayout.WEST);

			JButton btn3 = new JButton("��ư3");
			//this.add(btn3);
			this.add(btn3, BorderLayout.CENTER);

			JButton btn4 = new JButton("��ư4");
			//this.add(btn4);
			this.add(btn4, BorderLayout.EAST);

			JButton btn5 = new JButton("��ư5");
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
