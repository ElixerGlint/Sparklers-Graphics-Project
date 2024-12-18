import java.awt.Color;

import javax.swing.JFrame;

public class Happy {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		frame.setSize(1000, 800);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Color bgColor = new Color(100,100,0);
		frame.getContentPane().setBackground(bgColor);
		NewYear MMXXV = new NewYear(150,bgColor,20);
		frame.add(MMXXV);
		int shade = 0;
		frame.setVisible(true);int delta = 1;
		while(true) {
			bgColor = new Color(shade,shade,0);
			MMXXV.setBg(bgColor);
			Thread.sleep(20);
			shade+=delta;
			if(shade==0||shade==255)
				delta*=-1;
			frame.repaint();
		}
		
		
	}

}