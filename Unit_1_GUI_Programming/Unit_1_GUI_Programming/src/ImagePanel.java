import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.accessibility.Accessible;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
public class ImagePanel  extends JPanel implements ActionListener{
	private JFileChooser file=new JFileChooser();
	private ImageIcon ico;
	private JButton btn=new JButton("Choose Photo");
	public ImagePanel()
	{
		add(btn);
		btn.addActionListener(this);
	}
	public void paint(Graphics g)
	{ 
		if(ico!=null)
		{
			Image img=ico.getImage();
			int h=img.getHeight(this);
			int w=img.getWidth(this);
			g.drawImage(img, 20, 50, w/2, h/2,Color.black,this);
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		file.showOpenDialog(this);
		ico=new ImageIcon(file.getSelectedFile().toString());
		repaint();
	}
}
