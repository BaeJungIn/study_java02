package bank;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;

public class BankMain extends JFrame implements ActionListener{
   public JFrame frame;
   public JPanel pn1,pn2;
   public JTextField tf1, tf2, tf3;
   public JTextArea ta1, ta2, ta3;
   public JLabel lb1, lb2, lb3, lb4, lb5, lb6, lb7, lb8,lb9,lb10,lb11, lb12, lb13, lb14, lb15, lb16, lb17, lb18;
   public JButton btn1, btn2, btn3, btn4, btn5 , btn6;
   public JDialog dialog;
   public int x,y;
   static String name;
   static String pw;
   static String id;
   BankMember member;
   BankDial1 dialog1;
   BankDial2 dialog2;
   BankDial3 dialog3;
   BankDial4 dialog4;
   ImageIcon img ;
   JLabel imgbox;
   Container cPane;
   Scanner scan= new Scanner(System.in);
   public BankList[] list;
   
   public BankMain() {
   
       dialog1 = new BankDial1(this);
       dialog2 = new BankDial2(this);
       dialog3 = new BankDial3(this);
       dialog4 = new BankDial4(this);
       pn2 = new JPanel(new GridLayout(7, 1));
       pn1 = new JPanel(new BorderLayout());
       pn1.setBackground(Color.pink);
       pn2.setBackground(Color.white);
       ta1 = new JTextArea(20,20);
       ta2 = new JTextArea();
       ta3 = new JTextArea();
       lb1 = new JLabel();
       lb2 = new JLabel();
       lb3 = new JLabel();
       lb4 = new JLabel();
       lb5 = new JLabel();
       lb6 = new JLabel();
       lb7 = new JLabel();
       lb8 = new JLabel();
       lb9 = new JLabel();
       lb10 = new JLabel();
       lb11 = new JLabel();
       lb12 = new JLabel();
       lb13 = new JLabel();
       lb14 = new JLabel();
       lb15 = new JLabel();
       lb16 = new JLabel();
       lb17 = new JLabel();
       lb18 = new JLabel("Bank Application");
       btn1 = new JButton("���µ��");
       btn2 = new JButton("������ȸ");
       btn3 = new JButton("�Ա�");
       btn4 = new JButton("���");
       btn5 = new JButton("����");
       btn1.setBackground(Color.white);
       btn2.setBackground(Color.white);
       btn3.setBackground(Color.white);
       btn4.setBackground(Color.white);
       btn5.setBackground(Color.white);
       tf1 = new JTextField();
       tf2 = new JTextField();
       tf3 = new JTextField();
       
       pn1.add(lb18, "Center");
       pn2.add(lb17);
       pn2.add(lb16);
       pn2.add(lb15);
       pn2.add(lb8);
       pn2.add(btn1);
       pn2.add(lb4);
       
       pn2.add(lb9);
       pn2.add(btn2);
       pn2.add(lb5);
       
       pn2.add(lb10);
       pn2.add(btn3);
       pn2.add(lb6);
       
       pn2.add(lb11);
       pn2.add(btn4);
       pn2.add(lb7);
       
       pn2.add(lb12);
       pn2.add(btn5);
       pn2.add(lb13);
       
       pn2.add(lb3);
       pn2.add(lb14);
       
       add(pn1,"North");
       add(pn2,"South");
       

       btn1.addActionListener(new ActionListener() {
         
         @Override
         public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            dialog1.setVisible(true);
            dialog1.setSize(250, 200);
            dialog1.setLocation(700, 200);
         }
      });
      
       btn2.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
               // TODO Auto-generated method stub
               dialog2.setVisible(true);
               dialog2.setSize(250, 200);
               dialog2.setLocation(700, 200);
            }
         });
       
       btn3.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
               // TODO Auto-generated method stub
               dialog3.setVisible(true);
               dialog3.setSize(250, 200);
               dialog3.setLocation(700, 200);
            }
         });
       
       btn4.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
               // TODO Auto-generated method stub
               dialog4.setVisible(true);
               dialog4.setSize(250, 200);
               dialog4.setLocation(700, 200);
            }
         });
       
       add(pn1);

       setSize(500,500);
       setLocation(600, 100);
       setVisible(true);
       
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      }
   
   public int inputNum() {
      return scan.nextInt();
   }
   
   public String inputNumber() {
      return scan.next();
   }
   
   public int inputMoney() {
      return scan.nextInt();
   }
   
   public String inputName() {
      return scan.next();
   }
   
   public String inputId() {
      return scan.next();
   }

   @Override
   public void actionPerformed(ActionEvent e) {
      // TODO Auto-generated method stub
      
   }
   
   public static void main(String[] args) {
      new BankMain();
   }

}