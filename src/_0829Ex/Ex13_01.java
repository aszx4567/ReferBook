package _0829Ex;

import javax.swing.*;

public class Ex13_01 {
	static class MyGUI extends JFrame {
		MyGUI() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //x��ư�� �����ϱ�
			setTitle("GUI ����");  

			// �� �κп� ��ư, ���̺�, üũ�ڽ� ���� �ڵ���

			setSize(500, 500);    //ũ�����ϱ�
			setVisible(true);        //���̰��Ѵ�. �� ���� �غ�ܰ���
		} //constructor1
	}

	public static void main(String[] args) {
		new MyGUI();
	}
}
