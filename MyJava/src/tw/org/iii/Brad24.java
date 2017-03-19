package tw.org.iii;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Brad24 extends JFrame{
	private JButton open, save, exit;
	
	Brad24(){
		// super();
		super("視窗城市");
		setLayout(new FlowLayout());
		open = new JButton("Open");
		save = new JButton("Save");
		exit = new JButton("Exit");
		
		add(open); add(save); add(exit);
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Brad24();
	}

}
