import java.awt.*;
import javax.swing.*;
public class test{
	private JFrame frm=new JFrame("grade");
	public GridLayout(){
		frm.setLayout(new GridLayout(2,2));
		frm.add(new JButton("b1"));

		frm.add(new JButton("b2"));

		frm.add(new JButton("b3"));

		frm.add(new JButton("b4"));
		
		setTitle("Grid Layout");
		
	}
	private void setTitle(String string) {
		// TODO Auto-generated method stub
		
	}

}
