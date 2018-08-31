package _0829Ex;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public  class problem03 {
	static String[] imgname = {"eclair.jpg", "froyo.jpg","gingerbread.jpg",
			"honeycomb.jpg", "icecream.jpg","jellybean.jpg","kitkat.jpg","lollipop.jpg"
			,"marshmallow.jpg"
			};
	static ImageIcon[] img = new ImageIcon[9];
	static JButton[] btn = new JButton[9];
	static ImageIcon exit_img = new ImageIcon("image/exit.png");
	static ImageIcon turn_img = new ImageIcon("image/aszx.png");
	
	static class MyGUI extends JFrame{
		MyGUI(){
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("������ȯ����[�޴���]");
			 
			this.setLayout(new GridLayout(3,3,0,0));
			//this.setLayout(null);
			
			Container c = this.getContentPane();
			c.setBackground(Color.WHITE);
			
			//JPanel pan1 = new JPanel();
			//pan1.setBounds(0, 0, 145, 300);
			//this.add(pan1);
			//pan1.setLayout(new GridLayout(3,3,0,0));
			
			JMenuBar menubar = new JMenuBar();
			JMenu menu = new JMenu("�޴�");
			JMenuItem close = new JMenuItem("�ݱ�" , exit_img );
			JMenuItem mix = new JMenuItem("����" , turn_img);
			
			menu.setFont(new Font("�ü�ü",Font.BOLD,20));
			close.setFont(new Font("�ü�ü",Font.BOLD,15));
			mix.setFont(new Font("�ü�ü",Font.BOLD,15));
			mix.setForeground(Color.LIGHT_GRAY);
			close.setForeground(Color.DARK_GRAY);
			menu.setForeground(Color.gray);
						
			setJMenuBar(menubar);
			menubar.add(menu);			
			menu.add(mix);
			menu.addSeparator();
			menu.add(close);
           												
			mix.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent arg0){
					getContentPane().removeAll();
					int randNum[] = makeRandom();
					for(int i = 0; i < 9 ; i++){
						img[i] = new ImageIcon("image/android/"+imgname[randNum[i]]);
						btn[i] = new JButton(img[i]);
						btn[i].setBackground(Color.WHITE);
						MyGUI.this.add(btn[i]);									
					}
					validate();
				}
			});
			close.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent arg0){
			    System.exit(0);
				}
			});
			
			mix.setToolTipText("9���� �ȵ���̵� �̹����� �����ϴ�(ó�� �������� �̹����� �����մϴ�)");
			close.setToolTipText("���α׷��� �����մϴ�");	
			
			setSize(300,300);
			setVisible(true);
			
		}
	}
	public static int[] makeRandom(){
		//���� ���� 9���� ���Ѵ�
		int[] rand = { -1, -1, -1,-1,-1,-1,-1,-1,-1};
		int i, k, num;
		char dup1 = 'N';
		for(i = 0; i < 9;){
			num = (int)((Math.random()*9));
	
		for(k=0; k < 9; k++)
			if (rand[k] == num)
				dup1 = 'Y';
		
		if (dup1 == 'N')
			rand[i++] = num;
		else
			dup1 = 'N';
	}
	return rand;

    }
	
	public static void main (String[ ]agrs){
		new MyGUI();
	}
}


