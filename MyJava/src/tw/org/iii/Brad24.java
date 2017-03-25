package tw.org.iii;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.LayoutManager;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Brad24 extends JFrame{
	private JButton open, save, exit;
	private MyPainter3 myPainter;
	
	Brad24(){
		// super();
		super("視窗城市");
		setLayout(new BorderLayout());
		
		open = new JButton("Open");
		save = new JButton("Save");
		exit = new JButton("Exit");
		myPainter = new MyPainter3();
		
		JPanel top = new JPanel(new FlowLayout());
		top.add(open); top.add(save); top.add(exit);
		
		add(top, BorderLayout.NORTH);
		add(myPainter, BorderLayout.CENTER);
		
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Brad24();
	}

}
