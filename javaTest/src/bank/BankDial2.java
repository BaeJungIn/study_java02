package bank;

import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTextField;


public class  BankDial2 extends JDialog implements ActionListener{
   protected BankCust cust;
   public Panel pa1;
   public Label lb1, lb2, lb3, lb4, lb5,lb6,lb7;
   public JTextField name_jt, pw_jt, number_jt;
   public JButton join_b, cancel_b;
   
   public BankDial2(BankMain frame) {
      setTitle("������ȸ");
      pa1 = new Panel(new GridLayout(6, 2));
      lb1 = new Label("���̵�");
      lb2 = new Label("�н�����");
      lb3 = new Label("");
      lb4 = new Label("");
      lb5 = new Label("");
      lb6 = new Label("");
      name_jt = new JTextField();
      pw_jt = new JTextField();
      number_jt = new JTextField();
      join_b = new JButton("���");
      cancel_b = new JButton("���");
      
      pa1.add(lb3);
      pa1.add(lb5);
      pa1.add(lb1);
      pa1.add(name_jt);
      pa1.add(lb2);
      pa1.add(pw_jt);
      pa1.add(lb4);
      pa1.add(lb6);
      pa1.add(join_b);
      pa1.add(cancel_b);
   
      add(pa1);
      
       setSize(250, 200);
       setLocation(700, 200);
   }



   @Override
   public void actionPerformed(ActionEvent e) {
      // TODO Auto-generated method stub
      
   }
}