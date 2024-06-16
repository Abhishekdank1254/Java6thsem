import java.awt.event.*;
import javax.swing.*;
public class EventDemo3{
	private JFrame frm=new JFrame("Event Demo");
	private JButton btn =new JButton("Click");
	private JPanel pnl=new JPanel();
	public EventDemo3()
	{
		frm.setContentPane(pnl);
		pnl.add(btn);
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(frm, "Hello Class");
			}
		});
		frm.setSize(500,300);
		frm.setVisible(true);
		frm.setDefaultCloseOperation(3);
	}
	public static void main(String[] args) {
		new EventDemo3();
	}
}
