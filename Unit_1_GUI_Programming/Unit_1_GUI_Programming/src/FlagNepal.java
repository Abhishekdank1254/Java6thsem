import java.awt.*;
import java.awt.geom.GeneralPath;
import java.nio.file.Path;

import javax.swing.*;
public class FlagNepal extends JFrame{
	private class MyPanel extends JPanel {
		public void paint(Graphics g)
		{ 
			Graphics2D g2d=(Graphics2D)g;
			BasicStroke stroke = 
					new BasicStroke(15,BasicStroke.CAP_BUTT,BasicStroke.JOIN_MITER);
			g2d.setStroke(stroke);
			g2d.setColor(Color.blue);
			int x[]= {10,10,300,50,250};
			int y[]= {10,300,300,150,75};
			//outer border
			g2d.drawPolygon(x,y,5);
			//inner red
			g2d.setColor(Color.RED);
			g2d.fillPolygon(x,y,5);
			
			// moon
			stroke = 
					new BasicStroke(1,BasicStroke.CAP_BUTT,BasicStroke.JOIN_MITER);
			g2d.setStroke(stroke);
			g2d.setColor(Color.WHITE);
			//g2d.drawArc(50, 50, 300, 60,110,60);
			GeneralPath p= new GeneralPath();
			p.moveTo(50, 50);
			p.quadTo(10, 30,150,50);
			p.moveTo(50, 50);
			p.quadTo(60, 60, 150, 50);
			g2d.draw(p);
		}
	}
	private MyPanel pnl=new MyPanel();
	public FlagNepal()
	{
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(pnl);
		setVisible(true);	
	}
	public static void main(String...strings)
	{
		FlagNepal demo=new FlagNepal();
	}
}
