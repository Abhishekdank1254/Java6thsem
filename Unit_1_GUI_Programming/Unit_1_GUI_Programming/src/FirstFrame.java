import java.awt.*;
import javax.swing.*;
public class FirstFrame extends JFrame{
	private JLabel lbl=new JLabel("Hello Class");
	private JButton btn=new JButton("Click");
	private JPanel container=new JPanel();
	public FirstFrame()
	{
		setSize(300, 200);
		setTitle("First Frame");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(container);
		container.add(lbl);
		container.add(btn);
		setVisible(true);
	}
	public static void main(String...strings)
	{
		FirstFrame f=new FirstFrame();
	}
}