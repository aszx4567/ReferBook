package _0829Ex;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class problem01 {
	static class mygui extends JFrame{
		mygui(){
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("안드로이드");
			this.setLayout(new GridLayout(3,3,10,10));
			
			String[] imgname = {"eclair.jpg", "froyo.jpg","gingerbread.jpg",
					"honeycomb.jpg", "icecream.jpg","jellybean.jpg","kitkat.jpg","lollipop.jpg"
					,"marshmallow.jpg"
					};
			ImageIcon[] img = new ImageIcon[9];
			JButton[] btn = new JButton[9];
			for(int i = 0;i<9;i++){
				img[i] = new ImageIcon("image/android/" + imgname[i]);
				btn[i] = new JButton(img[i]);
				mygui.this.add(btn[i]);
			}
			setSize(300,300);
			setVisible(true);
		}
	}
	public static void main (String[] agrs){
		new mygui();
	}

}