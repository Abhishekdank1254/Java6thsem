import java.awt.*;
import javax.swing.*;
public class ShapeDemo extends JFrame{
	private class MyPanel extends JPanel {
		
	}
	private MyPanel pnl=new MyPanel();
	public ShapeDemo()
	{
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(pnl);
		setVisible(true);	
	}
	public static void main(String...strings)
	{
		ShapeDemo demo=new ShapeDemo();
	}
}
