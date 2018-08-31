package _0829Ex;

import java.awt.event.*;
import java.io.StringBufferInputStream;

import javax.swing.*;



import java.awt.*;

public class problem02 {
	static String[] imgname = {"eclair.jpg", "froyo.jpg","gingerbread.jpg",
			"honeycomb.jpg", "icecream.jpg","jellybean.jpg","kitkat.jpg","lollipop.jpg"
			,"marshmallow.jpg"
			};
	static ImageIcon[] img = new ImageIcon[9];
	static JButton[] btn = new JButton[9];
	
	static class MyGUI extends JFrame{
		MyGUI(){
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("랜덤변환예제");
			
			this.setLayout(new GridLayout(3,3,0,0));
			
			
           												
			this.addKeyListener(new KeyAdapter(){
				public void keyReleased(KeyEvent e){
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
			
			
			
			setSize(300,300);
			setVisible(true);
			
		}
	}
	
	
	public static int[] makeRandom(){
		//섞일 숫자 9개를 구한다
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