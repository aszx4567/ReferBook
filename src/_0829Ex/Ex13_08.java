package _0829Ex;

import java.awt.*;
import javax.swing.*;

public class Ex13_08 {
	static class MyGUI extends JFrame {
		MyGUI() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("������Ʈ ���� 2");

			this.setLayout(new FlowLayout());

			ImageIcon img1 = new ImageIcon("image/java1.png");
			ImageIcon img2 = new ImageIcon("image/java2.png");
			ImageIcon img3 = new ImageIcon("image/exit.png");

			JButton btn1 = new JButton("��ư1" ,img1);
			this.add(btn1);

			JLabel lbl1 = new JLabel("���̺�1�Դϴ�.");
			JLabel lbl2 = new JLabel(img2);
			this.add(lbl1);
			this.add(lbl2);

			JCheckBox chk1 = new JCheckBox("C++");
			JCheckBox chk2 = new JCheckBox("Java",true);
			JCheckBox chk3 = new JCheckBox("C#");
			this.add(chk1);
			this.add(chk2);
			this.add(chk3);

			JRadioButton rdo1 = new JRadioButton("��");
			JRadioButton rdo2 = new JRadioButton("���");
			JRadioButton rdo3 = new JRadioButton("��ġ");
			this.add(rdo1);
			this.add(rdo2);
			rdo3.setFont(new Font("�ü�ü",Font.BOLD, 20));
			this.add(rdo3);

			ButtonGroup grp = new ButtonGroup();
			grp.add(rdo1);
			grp.add(rdo2);
			grp.add(rdo3);
			
			JLabel lbl3 = new JLabel(img3);
			this.add(lbl3);

			setSize(200, 300);
			setVisible(true);
		}
	}

	public static void main(String[] args) {
		new MyGUI();
	}
}
