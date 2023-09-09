import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class reserv extends JFrame implements ActionListener
{
public JFrame f;                                                                                                    //frame for the main page
public JButton b1,b2,b3,b4,b5,b6;                                                                                   //buttons for the main page
public JLabel l;

reserv()
{
f=new JFrame("online reservation system");
l=new JLabel();
b1=new JButton();
b2=new JButton();
b3=new JButton();
b4=new JButton();
b5=new JButton();
b6=new JButton();

l.setText("WELCOME TO THE ONLINE TRAIN RESERVATION SYSTEM");                                                     //setting text,bounds,color and font to label
l.setBounds(100,50,850,27);
l.setForeground(Color.blue);
l.setFont(new Font("times new roman",Font.BOLD,27));

b1.setText("BOOK TICKET");                                                                                      //setting text,bounds,color and font to button
b1.setBounds(350,200,150,90);
b1.setBackground(Color.orange);
b1.setForeground(Color.black);
b1.addActionListener(this);

b2.setText("MY BOOKINGS");
b2.setBounds(350,320,150,90);
b2.setBackground(Color.orange);
b2.setForeground(Color.black);
b2.addActionListener(this);

b3.setText("PNR ENQUIRY");
b3.setBounds(350,440,150,90);
b3.setBackground(Color.orange);
b3.setForeground(Color.black);
b3.addActionListener(this);

b4.setText("REFUND HISTORY");
b4.setBounds(550,200,150,90);
b4.setBackground(Color.orange);
b4.setForeground(Color.black);
b4.addActionListener(this);

b5.setText("CANCEL TICKETS");
b5.setBounds(550,320,150,90);
b5.setBackground(Color.orange);
b5.setForeground(Color.black);
b5.addActionListener(this);

b6.setText("LAST TRANSACTION");
b6.setBounds(550,440,150,90);
b6.setBackground(Color.orange);
b6.setForeground(Color.black);
b6.addActionListener(this);


f.add(l);                                                                               //adding labels and all 6 buttons to the front page
f.add(b1);
f.add(b2);
f.add(b3);
f.add(b4);
f.add(b5);
f.add(b6);
f.getContentPane().setBackground(Color.white);
f.setSize(1200,850);
f.setLayout(null);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.setVisible(true);
}


public class mybooking extends JFrame                                                                             //new class for my booking
{
public JFrame f1;                                                                                               //new frame to be open by clicking on my booking part
public JLabel l1;

mybooking()
{
f1=new JFrame("my bookings");
l1=new JLabel();

l1.setText("THERE IS NO SUCH BOOKING AT PRESENT!");
l1.setBounds(300,200,850,27);
l1.setForeground(Color.black);
l1.setFont(new Font("times new roman",Font.BOLD,27));


f1.add(l1);
f1.getContentPane().setBackground(Color.white);
f1.setSize(1200,850);
f1.setLayout(null);
f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f1.setVisible(true);
}
}                                                                                                              //closing of my booking part


public class pnr extends JFrame implements ActionListener                                                      //new class for pnr enquiry
{
public JFrame f2;                                                                                             //new frame to be open by clicking on  pnr enquiry
public JLabel l2;
public JTextField t;
public JButton b7;

pnr()
{
f2=new JFrame("pnr enquiry");
l2=new JLabel();
t=new JTextField();
b7=new JButton();

b7.setText("enter");                                                                                         //adding text,bound,color to the button
b7.setBounds(550,370,150,40);
b7.setBackground(Color.white);
b7.setForeground(Color.black);
b7.addActionListener(this);

t.setBounds(350,300,600,27);
t.setFont(new Font("times new roman",Font.PLAIN,27));

l2.setText("search pnr");
l2.setBounds(550,250,550,27);
l2.setForeground(Color.black);
l2.setFont(new Font("times new roman",Font.BOLD,27));


f2.add(b7);
f2.add(t);
f2.add(l2);
f2.getContentPane().setBackground(Color.white);
f2.setSize(1200,850);
f2.setLayout(null);
f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f2.setVisible(true);
}

 
public class pnr1 extends JFrame                                                                    //new class for enter button of pnr enquiry part
{
public JFrame f7;                                                                                    //new frame to be open by clicking on enter button part
public JLabel l24,l25,l26,l27,l28,l29,l30,l31,l32;

pnr1()
{
f7=new JFrame("pnr enquiry");
l24=new JLabel();
l25=new JLabel();
l26=new JLabel();
l27=new JLabel();
l28=new JLabel();
l29=new JLabel();
l30=new JLabel();
l31=new JLabel();
l32=new JLabel();

l24.setText("NAINI DOON JAN (12092)");
l24.setBounds(200,200,400,25);
l24.setForeground(Color.black);
l24.setFont(new Font("times new roman",Font.BOLD,27));

l25.setText("PNR:");
l25.setBounds(700,200,100,25);
l25.setForeground(Color.black);
l25.setFont(new Font("times new roman",Font.BOLD,27));

l26.setText("2748411487");
l26.setBounds(800,200,550,25);
l26.setForeground(Color.red);
l26.setFont(new Font("times new roman",Font.BOLD,27));

l27.setText("Sat,09 sept");
l27.setBounds(200,230,150,23);
l27.setForeground(Color.gray);
l27.setFont(new Font("times new roman",Font.PLAIN,27));

l28.setText("Najibabad JN(NBD)");
l28.setBounds(200,280,250,25);
l28.setForeground(Color.black);
l28.setFont(new Font("times new roman",Font.BOLD,27));

l29.setText("Dehradun(DDN)");
l29.setBounds(700,280,200,25);
l29.setForeground(Color.black);
l29.setFont(new Font("times new roman",Font.BOLD,27));

l30.setText("1 adult|GENERAL|Second Sitting(2S)|NAJIBABAD JN(NBD)");
l30.setBounds(250,400,700,25);
l30.setForeground(Color.gray);
l30.setFont(new Font("times new roman",Font.PLAIN,27));

l31.setText("Passenger 1 status");
l31.setBounds(200,500,300,25);
l31.setForeground(Color.black);
l31.setFont(new Font("times new roman",Font.BOLD,27));

l32.setText("cancelled");
l32.setBounds(200,540,200,25);
l32.setForeground(Color.red);
l32.setFont(new Font("times new roman",Font.BOLD,27));


f7.add(l24);
f7.add(l25);
f7.add(l26);
f7.add(l27);
f7.add(l28);
f7.add(l29);
f7.add(l30);
f7.add(l31);
f7.add(l32);
f7.getContentPane().setBackground(Color.white);
f7.setSize(1200,850);
f7.setLayout(null);
f7.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f7.setVisible(true);
}
}   

                                                                                                         //closing of enter button part of pnr enquiry
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b7)
new pnr1();
}
}                                                                                                        //closing of pnr class


public class refund extends JFrame                                                                      //new class for refund history
{
public JFrame f3;                                                                                      //new frame to be open by clicking on refund part
public JLabel l3,l4,l5,l6,l7,l8;

refund()
{
f3=new JFrame("refund history");
l3=new JLabel();

l3.setText("THERE IS NO SUCH REFUND RECORD!");
l3.setBounds(300,200,550,27);
l3.setForeground(Color.black);
l3.setFont(new Font("times new roman",Font.BOLD,27));


f3.add(l3);
f3.getContentPane().setBackground(Color.white);
f3.setSize(1200,850);
f3.setLayout(null);
f3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f3.setVisible(true);
}
}                                                                                                                 //closing of refund part


public class cancel extends JFrame                                                                                //new class for cancel part
{
public JOptionPane op;

cancel()
{
op=new JOptionPane();
op.showMessageDialog(null,"No transaction found","info",JOptionPane.WARNING_MESSAGE);
}
}                                                                                                               //closing of cancel part


public class last extends JFrame                                                                               //new class for last transaction part                                        
{
public JFrame f4;
public JLabel l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17;

last()
{
f4=new JFrame("last transaction");
l4=new JLabel();
l5=new JLabel();
l6=new JLabel();
l7=new JLabel();
l8=new JLabel();
l9=new JLabel();
l10=new JLabel();
l11=new JLabel();
l12=new JLabel();
l13=new JLabel();
l14=new JLabel();
l15=new JLabel();
l16=new JLabel();
l17=new JLabel();

l4.setText("PNR");
l4.setBounds(300,150,200,22);
l4.setForeground(Color.black);
l4.setFont(new Font("times new roman",Font.PLAIN,22));

l5.setText("2748411487");
l5.setBounds(600,150,200,22);
l5.setForeground(Color.black);
l5.setFont(new Font("times new roman",Font.PLAIN,22));

l6.setText("Transaction ID");
l6.setBounds(300,180,200,22);
l6.setForeground(Color.black);
l6.setFont(new Font("times new roman",Font.PLAIN,22));

l7.setText("111000333366");
l7.setBounds(600,180,200,22);
l7.setForeground(Color.black);
l7.setFont(new Font("times new roman",Font.PLAIN,22));

l8.setText("Status");
l8.setBounds(300,210,200,22);
l8.setForeground(Color.black);
l8.setFont(new Font("times new roman",Font.PLAIN,22));

l9.setText("Booked");
l9.setBounds(600,210,200,22);
l9.setForeground(Color.green);
l9.setFont(new Font("times new roman",Font.PLAIN,22));

l10.setText("Journey date");
l10.setBounds(300,240,200,22);
l10.setForeground(Color.black);
l10.setFont(new Font("times new roman",Font.PLAIN,22));

l11.setText("21 Aug,2023 | 9:51");
l11.setBounds(600,240,200,22);
l11.setForeground(Color.black);
l11.setFont(new Font("times new roman",Font.PLAIN,22));

l12.setText("Booking date");
l12.setBounds(300,270,200,22);
l12.setForeground(Color.black);
l12.setFont(new Font("times new roman",Font.PLAIN,22));

l13.setText("15 Aug,2023 | 2:21");
l13.setBounds(600,270,200,22);
l13.setForeground(Color.black);
l13.setFont(new Font("times new roman",Font.PLAIN,22));

l14.setText("From");
l14.setBounds(300,300,200,22);
l14.setForeground(Color.black);
l14.setFont(new Font("times new roman",Font.PLAIN,22));

l15.setText("NBD");
l15.setBounds(600,300,200,22);
l15.setForeground(Color.black);
l15.setFont(new Font("times new roman",Font.PLAIN,22));

l16.setText("To");
l16.setBounds(300,330,200,22);
l16.setForeground(Color.black);
l16.setFont(new Font("times new roman",Font.PLAIN,22));

l17.setText("DDN");
l17.setBounds(600,330,200,22);
l17.setForeground(Color.black);
l17.setFont(new Font("times new roman",Font.PLAIN,22));


f4.add(l4);
f4.add(l5);
f4.add(l6);
f4.add(l7);
f4.add(l8);
f4.add(l9);
f4.add(l10);
f4.add(l11);
f4.add(l12);
f4.add(l13);
f4.add(l14);
f4.add(l15);
f4.add(l16);
f4.add(l17);
f4.getContentPane().setBackground(Color.white);
f4.setSize(1200,850);
f4.setLayout(null);
f4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f4.setVisible(true);
}
}                                                                                                          //closing of last transaction part


public class book extends JFrame implements ActionListener                                                 //new class for book ticket part
{
public JFrame f5;
public JLabel l18,l19,l20,l21,l22;
public JButton b8;
public JTextField t1,t2;
public JComboBox<String> c1,c2,c3;
String [] classtype={"Anubhuti class (EA)", "AC First Class (1A)", "AC Second Class (2A)", "AC Third Class (3A)", "AC Chair Car (CC)", "AC 3 Economy (3E)", "Sleeper (SL)", "First Class (FC)", "Second Sitting (2S)"};
String [] quotatype={"General", "Ladies", "Tatkal", "Lower Berth/sr.Citizen", "Premium Tatkal", "Person with disability"};
String [] dates={"10 sep","11 sep","12 sep","13 sep","14 sep","15 sep","16 sep","17 sep","18 sep","19 sep","20 sep","21 sep","22 sep","23 sep","24 sep","25 sep","26 sep","27 sep","28 sep","29 sep","30 sep","1 oct","2 oct","3 oct","4 oct","5 oct","6 oct","7 oct","8 oct","9 oct","10 oct"};

book()
{
f5=new JFrame("book ticket");
l18=new JLabel();
l19=new JLabel();
l20=new JLabel();
l21=new JLabel();
l22=new JLabel();
b8=new JButton();
t1=new JTextField();
t2=new JTextField();
c1=new JComboBox<>(classtype);
c2=new JComboBox<>(quotatype);
c3=new JComboBox<>(dates);

l18.setText("FROM");
l18.setBounds(300,100,100,25);
l18.setForeground(Color.black);
l18.setFont(new Font("times new roman",Font.BOLD,25));

t1.setBounds(250,140,200,25);
t1.setFont(new Font("times new roman",Font.PLAIN,25));

l19.setText("To");
l19.setBounds(600,100,100,25);
l19.setForeground(Color.black);
l19.setFont(new Font("times new roman",Font.BOLD,25));

t2.setBounds(550,140,200,25);
t2.setFont(new Font("times new roman",Font.PLAIN,25));

l20.setText("CLASS");
l20.setBounds(300,180,100,25);
l20.setForeground(Color.black);
l20.setFont(new Font("times new roman",Font.BOLD,25));

c1.setBounds(250,220,200,27);
c1.setFont(new Font("times new roman",Font.PLAIN,20));

l21.setText("QUOTA");
l21.setBounds(600,180,100,25);
l21.setForeground(Color.black);
l21.setFont(new Font("times new roman",Font.BOLD,25));

c2.setBounds(550,220,200,27);
c2.setFont(new Font("times new roman",Font.PLAIN,20));

l22.setText("CHOOSE DATE");
l22.setBounds(400,300,200,25);
l22.setForeground(Color.black);
l22.setFont(new Font("times new roman",Font.BOLD,25));

c3.setBounds(400,340,200,27);
c3.setFont(new Font("times new roman",Font.PLAIN,20));

b8.setText("SEARCH TRAIN");
b8.setBounds(300,400,400,27);
b8.setForeground(Color.white);
b8.setBackground(Color.red);
b8.setFont(new Font("italian",Font.BOLD,25));
b8.addActionListener(this);


f5.add(l18);
f5.add(t1);
f5.add(l19);
f5.add(t2);
f5.add(l20);
f5.add(c1);
f5.add(l21);
f5.add(c2);
f5.add(l22);
f5.add(c3);
f5.add(b8);
f5.getContentPane().setBackground(Color.white);
f5.setSize(1200,850);
f5.setLayout(null);
f5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f5.setVisible(true);
}


public class book1 extends JFrame implements ActionListener                                               //new class for search train part of book ticket
{
public JFrame f6;
public JLabel l33,l34,l35,l36;
public JButton b9;

book1()
{
f6=new JFrame();
l33=new JLabel();
l34=new JLabel();
l35=new JLabel();
l36=new JLabel();
b9=new JButton();

l33.setText("HEMKUNT EXPRESS(14610)");
l33.setBounds(200,100,500,27);
l33.setForeground(Color.black);
l33.setFont(new Font("times new roman",Font.BOLD,25));

l34.setText("7:10");
l34.setBounds(200,150,100,25);
l34.setForeground(Color.black);
l34.setFont(new Font("times new roman",Font.BOLD,25));

l35.setText("__01h:20m__");
l35.setBounds(350,150,150,25);
l35.setForeground(Color.gray);
l35.setFont(new Font("times new roman",Font.BOLD,25));

l36.setText("8:30");
l36.setBounds(700,150,100,25);
l36.setForeground(Color.black);
l36.setFont(new Font("times new roman",Font.BOLD,25));

b9.setText("BOOK TICKET");
b9.setBounds(300,300,400,27);
b9.setForeground(Color.white);
b9.setBackground(Color.red);
b9.setFont(new Font("italian",Font.BOLD,25));
b9.addActionListener(this);


f6.add(l33);
f6.add(l34);
f6.add(l35);
f6.add(l36);
f6.add(b9);
f6.getContentPane().setBackground(Color.white);
f6.setSize(1200,850);
f6.setLayout(null);
f6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f6.setVisible(true);
}


public class book2 extends JFrame implements ActionListener                                      //new class for book ticket button of part book ticket
{
public JFrame f8;
public JLabel l37,l38,l39;
public JTextField t4,t5;
public JButton b10;
public JComboBox<String> c4;
String [] genders={"female","male","prefer not to say"};

book2()
{
f8=new JFrame();
l37=new JLabel();
l38=new JLabel();
l39=new JLabel();
b10=new JButton();
t4=new JTextField();
t5=new JTextField();
c4=new JComboBox<>(genders);

l37.setText("YOUR NAME");
l37.setBounds(300,200,200,27);
l37.setForeground(Color.black);
l37.setFont(new Font("times new roman",Font.BOLD,25));

t4.setBounds(600,200,200,25);
t4.setFont(new Font("times new roman",Font.PLAIN,25));

l38.setText("AGE");
l38.setBounds(300,300,100,25);
l38.setForeground(Color.black);
l38.setFont(new Font("times new roman",Font.BOLD,25));

t5.setBounds(600,300,200,25);
t5.setFont(new Font("times new roman",Font.PLAIN,25));

l39.setText("GENDER");
l39.setBounds(300,400,150,25);
l39.setForeground(Color.black);
l39.setFont(new Font("times new roman",Font.BOLD,25));

c4.setBounds(600,400,200,25);
c4.setFont(new Font("times new roman",Font.PLAIN,25));

b10.setText("BOOK NOW");
b10.setBounds(400,500,300,27);
b10.setForeground(Color.white);
b10.setBackground(Color.red);
b10.setFont(new Font("italian",Font.BOLD,25));
b10.addActionListener(this);


f8.add(l37);
f8.add(t4);
f8.add(l38);
f8.add(t5);
f8.add(l39);
f8.add(c4);
f8.add(b10);
f8.getContentPane().setBackground(Color.white);
f8.setSize(1200,850);
f8.setLayout(null);
f8.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f8.setVisible(true);
}


public class book3 extends JFrame                                                          //new class for book now button of book ticket
{
public JFrame f9;
public JLabel l40;

book3()
{
f9=new JFrame();
l40=new JLabel();

l40.setText("YOUR TICKET IS BOOKED!");
l40.setBounds(400,300,500,30);
l40.setForeground(Color.green);
l40.setFont(new Font("times new roman",Font.BOLD,25));

f9.add(l40);
f9.getContentPane().setBackground(Color.white);
f9.setSize(1200,850);
f9.setLayout(null);
f9.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f9.setVisible(true);
}
}                                                                                                 //closing of book now part


public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b10)
new book3();
}
}                                                                                                 //closing of book ticket button part
public void actionPerformed(ActionEvent e)
{

if(e.getSource()==b9)
new book2();
}
}                                                                                              //closing of search train part
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b8)
new book1();
}
}                                                                                           //closing of book ticket part


public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
{
 new book();
}
if(e.getSource()==b2)
{
 new mybooking();
}
if(e.getSource()==b3)
{
 new pnr();
}
if(e.getSource()==b4)
{
 new refund();
}
if(e.getSource()==b5)
{
 new cancel();
}
if(e.getSource()==b6)
{
 new last();
}
}

public static void main(String [] args)
{
new reserv();
}
}