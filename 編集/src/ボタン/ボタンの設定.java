package ボタン;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ボタンの設定 extends JFrame{
	 ボタンの設定(String title){
		setTitle(title);
		setBounds(500,100,300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//センターにボタンを表示
		JButton Center1 = new JButton("真ん中");
		Container center2 = getContentPane();
		center2.add(Center1,BorderLayout.CENTER);

		//上にボタンを表示
		JButton Noth1 = new JButton("↑");
		Container noth2 = getContentPane();
		noth2.add(Noth1,BorderLayout.NORTH);

		//下のボタンを表示
		JButton South1 = new JButton("↓");
		Container south2 = getContentPane();
		south2.add(South1,BorderLayout.SOUTH);

		//右にボタンを表示
		JButton Sast1 = new JButton("→");
		Container sast2 = getContentPane();
		sast2.add(Sast1,BorderLayout.EAST);

		//左にボタンを表示
		JButton West1 = new JButton("←");
		Container west2 = getContentPane();
		west2.add(West1,BorderLayout.WEST);
	}

}
