package isTest;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
public class BorderLayoutDemo  {
	private JFrame frm=new JFrame("GridLayout Demo");
	private BorderLayout layout= new BorderLayout();
	public BorderLayoutDemo()
	{
		frm.setLayout(layout);
		frm.add(new JButton("Button 1"),BorderLayout.EAST);
		frm.add(new JButton("Button 2"),"West");
		frm.add(new JButton("Button 3"),"North");
		frm.add(new JButton("Button 4"),"South");
		frm.add(new JButton("Button 5"),"Center");
		frm.setSize(300, 200);
		frm.setDefaultCloseOperation(3);
		frm.setVisible(true);
	}
	public static void main(String[] args) {
		new BorderLayoutDemo();
	}
}
