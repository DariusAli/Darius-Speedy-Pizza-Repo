/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package darius_speedy_pizza;

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Darius Ali
 */
public class Darius_Speedy_Pizza extends JFrame implements ActionListener,ItemListener {
    final int Individual=7;
    final int Small=9;
    final int Large= 11;
    final int Toppings= 1;
    int Extra_Cheese = 0;
    int total_price = 0;

    ImageIcon icon1= new ImageIcon(new ImageIcon("../Speedy Pizza/logo.jpg").getImage().getScaledInstance(150,150, Image.SCALE_DEFAULT));
    
    JLabel image = new JLabel(icon1);
    JLabel lb1= new JLabel("Antonio's Pizza", JLabel.LEFT);
    JLabel lb2= new JLabel("Enter Name" , JLabel.LEFT);
    JTextField f1= new JTextField(19);
    JLabel phone= new JLabel("Enter Contact Phone #" , JLabel.LEFT);
    JTextField phone_field = new JTextField(8);
    JLabel credit_card = new JLabel("Enter Credit Card #", JLabel.LEFT);
    JTextField credit_card_field = new JTextField(16);
    JLabel address = new JLabel("Enter Address", JLabel.LEFT);
    JTextField address_field = new JTextField(50);
  
    JButton order = new JButton("Order");
    JButton Clear= new JButton("Clear"); 
    JButton Exit= new JButton("Exit");
    
    JLabel lb3 = new JLabel("Select toppings:");
    JCheckBox box1= new JCheckBox("Pepperoni:- $" + Toppings,false);  
    JCheckBox box2= new JCheckBox("Ham:- $" + Toppings,false);
    JCheckBox box3= new JCheckBox("Mushrooms:- $" + Toppings,false);
    JCheckBox box4= new JCheckBox("Extra Cheese:-$" + Extra_Cheese,false);
    JCheckBox box5= new JCheckBox("Pineapple:-$" + Toppings,false);
    
    JLabel lb4= new JLabel("Select Size:");
    JCheckBox box6= new JCheckBox("Individual:- $" + Individual,false);
    JCheckBox box7= new JCheckBox("Small:- $" + Small,false);
    JCheckBox box8= new JCheckBox("Large:- $" + Large,false);
    
    JLabel lb5= new JLabel("Total Price:");
    JTextField f2 = new JTextField(4);
    
    Darius_Speedy_Pizza()
  {
   super("Speed's Pizza ");
  
   order.setActionCommand("Order");
   Clear.setActionCommand("Clear");
   f2.setText("$" + total_price);
   lb1.setFont(new Font("Algerian",Font.ITALIC,17));
   add(lb1);
   lb2.setFont(new Font("Times New Roman",Font.BOLD,17));
   add(lb2);
   phone.setFont(new Font("Times New Roman",Font.BOLD,17));
   add(phone);
   credit_card.setFont(new Font("Times New Roman",Font.BOLD,17));
   add(credit_card);
   address.setFont(new Font("Times New Roman",Font.BOLD,17));
   add(address);
   lb3.setFont(new Font("Times New Roman",Font.BOLD,17));
   add(lb3);
   lb4.setFont(new Font("Times New Roman",Font.BOLD,17));
   add(lb4);
   lb5.setFont(new Font("Times New Roman",Font.BOLD,17));
   add(lb5);


   JPanel p1= new JPanel();
   p1.setLayout(new FlowLayout(FlowLayout.CENTER)); 
   p1.setPreferredSize( new Dimension( 650, 150 ) );
   p1.add(lb1);
   p1.add(image);
   
   
  order.addActionListener(this);
  Clear.addActionListener(this);
  Exit.addActionListener(this);
 
  JPanel p2= new JPanel();
  p2.setLayout(new FlowLayout(FlowLayout.CENTER));
  p2.setPreferredSize( new Dimension( 1500, 50 ) );
  p2.add(p1);
  p2.add(lb2);
  p2.add(f1);
 
  add(p2);
  
  JPanel p_Phone= new JPanel();
  p_Phone.setLayout(new FlowLayout(FlowLayout.CENTER));
  p_Phone.setPreferredSize( new Dimension( 1500, 50 ) );
  p_Phone.add(p1);
  p_Phone.add(p2);
  p_Phone.add(phone);
  p_Phone.add(phone_field);
 
  add(p_Phone);
  
  JPanel p_Credit_Card= new JPanel();
  p_Credit_Card.setLayout(new FlowLayout(FlowLayout.CENTER));
  p_Credit_Card.setPreferredSize( new Dimension( 1500, 50 ) );
  p_Credit_Card.add(p1);
  p_Credit_Card.add(p2);
  p_Credit_Card.add(p_Phone);
  p_Credit_Card.add(credit_card);
  p_Credit_Card.add(credit_card_field);
 
  add(p_Credit_Card);
  
  JPanel p_Address= new JPanel();
  p_Address.setLayout(new FlowLayout(FlowLayout.CENTER));
  p_Address.setPreferredSize( new Dimension( 1500, 50 ) );
  p_Address.add(p1);
  p_Address.add(p2);
  p_Address.add(p_Phone);
  p_Address.add(p_Credit_Card);
  p_Address.add(address);
  p_Address.add(address_field);
  
  add(p_Address);
 
 box1.addItemListener(this);
 box2.addItemListener(this);
 box3.addItemListener(this);
 box4.addItemListener(this);
 box5.addItemListener(this);
 box6.addItemListener(this);
 box7.addItemListener(this);
 box8.addItemListener(this);
 
  
 
  

 JPanel p3 = new JPanel();
 p3.setLayout(new FlowLayout(FlowLayout.CENTER));
 p3.setPreferredSize( new Dimension( 1500, 50 ) );
 p3.add(p1);
 p3.add(p2);
 p3.add(p_Phone);
 p3.add(p_Credit_Card);
 p3.add(p_Address);
 p3.add(lb3);
 p3.add(box1);
 p3.add(box2);
 p3.add(box3);
 p3.add(box4);
 p3.add(box5);
 

 
 
 

 JPanel p4 = new JPanel();
 p4.setLayout(new FlowLayout(FlowLayout.CENTER));
 p4.setPreferredSize( new Dimension( 2200, 50 ) );
 p4.add(p1);
 p4.add(p2);
 p4.add(p_Phone);
 p4.add(p_Credit_Card);
 p4.add(p_Address);
 p4.add(p3);
 p4.add(lb4);
 p4.add(box6);
 p4.add(box7);
 p4.add(box8);
 
 add(p4);

 JPanel p5 = new JPanel();
 p5.setLayout(new FlowLayout(FlowLayout.CENTER));
 p5.setPreferredSize( new Dimension( 2200, 50 ) );
 p5.add(p1);
 p5.add(p2);
 p5.add(p_Phone);
 p5.add(p_Credit_Card);
 p5.add(p_Address);
 p5.add(p3);
 p5.add(p4);
 p5.add(lb5);
 p5.add(f2);
 add(p5);

 JPanel p6 = new JPanel();
 p6.setLayout(new FlowLayout(FlowLayout.CENTER));
 p6.add(p1);
 p6.add(p2);
 p6.add(p_Phone);
 p6.add(p_Credit_Card);
 p6.add(p_Address);
 p6.add(p3);
 p6.add(p4);
 p6.add(p5);
 p6.add(order);
 p6.add(Clear);
 p6.add(Exit);
 add(p6);


 
 
 
  
 }//ends constructor
    
public void actionPerformed(ActionEvent ae)
{
 if(ae.getActionCommand().equals("Clear"))
  {
    f1.setText("");
    f2.setText("$0");
    box1.setSelected(false);
    box2.setSelected(false);
    box3.setSelected(false);
    box4.setSelected(false);
    box5.setSelected(false);
    box6.setSelected(false);
    box7.setSelected(false);
    box8.setSelected(false); 
    
  }
  if(ae.getActionCommand().equals("Order"))
  {
   String name = f1.getText();
   String phone_num = phone_field.getText();
   String address_order = address_field.getText();
   String toppings1 = " ";
   String toppings2 = " ";
   String toppings3 = " ";
   String toppings4 = " ";
   String toppings5 = " ";
   String size1 = " ";
   String size2 = " ";
   String size3 = " ";
   if(box1.isSelected())
   {
       toppings1 = " Pepperoni ";
   }
   if(box2.isSelected())
   {
       toppings2 = " Ham ";
   }
   if(box3.isSelected())
   {
       toppings3 = " Mushrooms ";
   }
   if(box4.isSelected())
   {
       toppings4 = " Extra Cheese ";
   }
   if(box5.isSelected())
   {
       toppings5 = " Pineapple ";
   }
   if(box6.isSelected())
   {
        size1 = " Individual ";
   }
   if(box7.isSelected())
   {
        size2 = " Small ";
   }
   if(box8.isSelected())
   {
        size3 = " Large ";
   }
   JOptionPane.showMessageDialog(null,"Customer Name: " + name +  "\n" + "\n" + "Phone #: " + phone_num +"\n" + "\n"+"Address: "+ address_order +"\n" + "\n" + "Toppings: " + toppings1 + toppings2 + toppings3 + toppings4 + toppings5 + "\n" + "\n" + "Size: " + size1 + size2 + size3 + "\n" + "\n" +  "Total Price: $" + total_price  + "\n" + "\n" + "Thank you for chosing to dine at Antonio's Pizza"); 
  }
  if(ae.getActionCommand().equals("Exit"))
  {
   System.exit(0);
  }
}


 public void itemStateChanged(ItemEvent ie)
 {
  Object source= ie.getSource();
  int select = ie.getStateChange();
  
  if(source == box1)
  {
  if(select==ItemEvent.SELECTED)
  {
   total_price= total_price + Toppings ; 
  }
  else
  {
   total_price= total_price - Toppings;
  }
  }//ends 1st source if
  if(source == box2)
  { 
   if(select==ItemEvent.SELECTED)
  {
   total_price= total_price + Toppings ; 
  }
  else
  {
   total_price= total_price - Toppings ;
  }  
  }//ends 2nd source if
  

   if(source == box3)
  {
   if(select==ItemEvent.SELECTED)
  {
   total_price= total_price + Toppings ; 
  }
  else
  {
   total_price= total_price - Toppings ;
  }
  }//ends 3rd source if
   
   

   if(source==box4)
  {
   if(select==ItemEvent.SELECTED)
  {
   total_price= total_price + Toppings ; 
  }
  else
  {
   total_price= total_price - Toppings;
  }
  }//ends 4th source if
   

    if(source==box5)
  {
    if(select==ItemEvent.SELECTED)
  {
   total_price= total_price + Toppings ; 
  }
  else
  {
   total_price= total_price - Toppings;
  }
   }
  

   if(source==box6)
  {
   if(select==ItemEvent.SELECTED)
  {
   total_price= total_price + Individual ; 
  }
  else
  {
   total_price= total_price - Individual ;
  }
  }//ends 6th source if
  
 

   if(source==box7)
  {
   if(select==ItemEvent.SELECTED)
  {
   total_price= total_price + Small ; 
  }
  else
  {
   total_price= total_price - Small;
  }
  }


  if(source==box8)
  {
   if(select==ItemEvent.SELECTED)
   {
    total_price= total_price+ Large;
   }
   else
   {
    total_price=total_price- Large;
   }
  }
  f2.setText("$" + total_price);

 }//ends Method
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Darius_Speedy_Pizza sp = new Darius_Speedy_Pizza();
        sp.setSize(730,670);
        sp.setLocationRelativeTo(null);
        sp.setVisible(true);
        sp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
