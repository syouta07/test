package ボタン記載省略;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		
/* メソッドを呼び出してボタンを設定する方法 */

		ボタン設定 a = new ボタン設定();
		ボタン設定.set(a);

		a.setVisible(true);

		a.setSize(300, 200);

		
/* メソッドを使用せずにボタンを生成する */
		
		//フレームの外枠を作る
		JFrame b = new JFrame("外枠");

		//ボタンを生成して名前を引数で渡す
		JButton btn1 = new JButton("ボタン名");

		//ボタンをフレームのセンターに表示
		b.add(btn1,BorderLayout.CENTER);

		//フレームをみえるように表示
		b.setVisible(true);

		//表示するサイズを決める
		b.setSize(300, 200);
	}
}
//センターにボタンを表示
