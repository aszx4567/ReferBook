package _0829Ex;
//���������ȸ�����
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Ex0 {
	static class MyGUI extends JFrame{
		MyGUI(){
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("���������ȸ");
			this.setLayout(new FlowLayout());
			
			JMenuBar menubar = new JMenuBar();
			
			
			
			JMenu imp = new JMenu("��������");
			JMenuItem writer = new JMenuItem("���");
			JMenuItem sch = new JMenuItem("��ȸ");
			
			setJMenuBar(menubar);
			menubar.add(imp);
			imp.add(writer);
			imp.addSeparator();
			imp.add(sch);
			
			writer.setToolTipText("������ �߰��� �� �ֽ��ϴ�.");
			sch.setToolTipText("������ �˻��� �� �ֽ��ϴ�.");
			
			setSize(300,300);
			setVisible(true);
			
		}
	}
	public static void main (String[]args){
		new MyGUI();
	}
}
