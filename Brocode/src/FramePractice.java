 import java.awt.Color;

import javax.swing.*;
 public class FramePractice{
	 public static void main(String []arg) {
		 JFrame frame=new JFrame("test");
		 frame.setSize(350,500);
		 frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		 frame.setVisible(true);
		 frame.setTitle("test");
		 frame.setResizable(true);
		 ImageIcon img1=new ImageIcon("src/Logo.jpg");
	     frame.setIconImage(img1.getImage());
	     frame.getContentPane().setBackground(new Color(0,0,0));
	 }
 }