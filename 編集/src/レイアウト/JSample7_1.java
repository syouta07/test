package レイアウト;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class JSample7_1 extends JFrame{

	public static void main(String[] args) {
		JSample7_1 frame = new JSample7_1("MyTitle");
		frame.setVisible(true);

	}


	JSample7_1(String title){
	    setTitle(title);
	    setBounds(100, 100, 600, 400);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	    ImageIcon icon = new ImageIcon("./icon.png");
	    setIconImage(icon.getImage());
	    setLayout(new FlowLayout());
	  }


}
