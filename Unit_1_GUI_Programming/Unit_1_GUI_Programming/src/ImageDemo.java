import java.awt.event.*;
import javax.swing.*;
public class ImageDemo implements ActionListener {
private JFrame frm = new JFrame("Event Demo");
private JButton button1 = new JButton("Add");
private JButton button2 = new JButton("Sum");
private JButton button3 = new JButton("Mul");
private JButton button4 = new JButton("Div");
private JButton button5 = new JButton("Vat");
 

private JPanel pnl = new JPanel();
private JTextField num1=new JTextField(15);
private JTextField num2=new JTextField(15);
public ImageDemo() {
 

frm.add(pnl);
pnl.add(num1);
pnl.add(num2);
 

pnl.add(button1);
pnl.add(button2);
pnl.add(button3);
pnl.add(button4);
pnl.add(button5);
 

button1.addActionListener(this);
button2.addActionListener(this);
button3.addActionListener(this);
button4.addActionListener(this);
button5.addActionListener(this);
 

frm.setSize(500,500);
frm.setVisible(true);
frm.setDefaultCloseOperation(3);
}
 public void actionPerformed(ActionEvent e) {
float number1 = Float.parseFloat(num1.getText());
float number2 = Float.parseFloat(num2.getText());
float number = number1+number2;
JOptionPane.showMessageDialog(frm, "Sum of number is "+number);
 }
public static void main(String[] args) {
 
      ImageDemo d = new ImageDemo();
}
 

}