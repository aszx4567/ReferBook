package _0829Ex;
//정보등록조회만들기
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Ex0 {
	static class MyGUI extends JFrame{
		MyGUI(){
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("정보등록조회");
			this.setLayout(new FlowLayout());
			
			JMenuBar menubar = new JMenuBar();
			
			
			
			JMenu imp = new JMenu("정보관리");
			JMenuItem writer = new JMenuItem("등록");
			JMenuItem sch = new JMenuItem("조회");
			
			setJMenuBar(menubar);
			menubar.add(imp);
			imp.add(writer);
			imp.addSeparator();
			imp.add(sch);
			
			writer.setToolTipText("정보를 추가할 수 있습니다.");
			sch.setToolTipText("정보를 검색할 수 있습니다.");
			
			setSize(300,300);
			setVisible(true);
			
		}
	}
	public static void main (String[]args){
		new MyGUI();
	}
}
