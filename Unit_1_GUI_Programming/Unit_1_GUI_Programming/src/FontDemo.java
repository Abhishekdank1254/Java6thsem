import java.awt.*;
import javax.swing.*;
public class FontDemo extends JFrame{
	private class MyPanel extends JPanel {
		private Font f= new Font("Ariel",3,30);
		public void paint(Graphics g)
		{ 
			Graphics2D g2d=(Graphics2D)g;
			g2d.drawString("Hello Class",0,50);
			g2d.setFont(f);
			g2d.drawString("Hello Class",50,100);
			FontMetrics fm= getFontMetrics(f);
			System.out.println(fm.getHeight());
		}
	}
	private MyPanel pnl=new MyPanel();
	public FontDemo()
	{
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(pnl);
		setVisible(true);	
	}
	public static void main(String...strings)
	{
		FontDemo demo=new FontDemo();
	}
}
