import javax.swing.*;
public class AudioDemo extends JFrame{
	private AudioPanel pnl;
	
	public AudioDemo() 
	{
		pnl =new AudioPanel();
		this.add(pnl);
		this.setSize(200,200);
		this.setTitle("Audio Player");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	public static void main(String...strings)
	{
		new AudioDemo();
	}
}
