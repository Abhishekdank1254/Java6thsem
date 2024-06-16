import java.awt.event.*;
import javax.swing.*;
public class EventDemo implements ActionListener{
	private JFrame frm=new JFrame("Event Demo");
	private JButton btn =new JButton("Click");
	private JPanel pnl=new JPanel();
	public EventDemo()
	{
		frm.setContentPane(pnl);
		pnl.add(btn);
		btn.addActionListener(this);
		frm.setSize(500,300);
		frm.setVisible(true);
		frm.setDefaultCloseOperation(3);
	}
	public void actionPerformed(ActionEvent e)
	{
		JOptionPane.showMessageDialog(frm,"Hello Class");
	}
	public static void main(String[] args) {
		new EventDemo();
	}
}
