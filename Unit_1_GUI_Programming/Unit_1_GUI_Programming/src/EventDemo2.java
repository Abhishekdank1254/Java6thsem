import java.awt.event.*;
import javax.swing.*;
public class EventDemo2{
	class MyListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			JOptionPane.showMessageDialog(frm, "Hello Class");
		}
	}
	private JFrame frm=new JFrame("Event Demo");
	private JButton btn =new JButton("Click");
	private JPanel pnl=new JPanel();
	private MyListener listener = new MyListener();
	
	public EventDemo2()
	{
		frm.setContentPane(pnl);
		pnl.add(btn);
		btn.addActionListener(listener);
		frm.setSize(500,300);
		frm.setVisible(true);
		frm.setDefaultCloseOperation(3);
	}
	public static void main(String[] args) {
		new EventDemo2();
	}
}
