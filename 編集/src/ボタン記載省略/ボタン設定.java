package ボタン記載省略;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ボタン設定 extends JFrame {

	public static void set(JFrame a){
		JButton btn1 = new JButton("〇");
		JButton btn2 = new JButton("↑");
		JButton btn3 = new JButton("↓");
		JButton btn4 = new JButton("→");
		JButton btn5 = new JButton("←");
		//	Container contentPane = frame.getContentPane();
		//	contentPane.add(btn, BorderLayout.CENTER);
		a.add(btn1,BorderLayout.CENTER);
		a.add(btn2,BorderLayout.NORTH);
		a.add(btn3,BorderLayout.SOUTH);
		a.add(btn4,BorderLayout.EAST);
		a.add(btn5,BorderLayout.WEST);
	}
}
