package レイアウト;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class 呼び出される側  extends JFrame{

	呼び出される側(String title){
		setBounds(100,100,300,200);
		setTitle(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		ImageIcon icon = new ImageIcon("./icon.png");
		setIconImage(icon.getImage());
	}
}
