import java.awt.*;
import javax.swing.*;
public class StrokeDemo extends JFrame{

	public void paint(Graphics g)
	{ 
		Graphics2D g2d=(Graphics2D)g;
		float f[]= {10,1,10};
		BasicStroke stroke = 
				new BasicStroke(5, 0, 1, 1, f, 0);
		//explore other stroke designs
		g2d.setStroke(stroke);
		g2d.drawLine(20, 20, 20, 300);
	}
	public StrokeDemo()
	{
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);	
	}
	public static void main(String...strings)
	{
		StrokeDemo demo=new StrokeDemo();
	}
}
