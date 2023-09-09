import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


class task extends JFrame implements ActionListener
{
public JFrame f;                                                                                                             //main frame
public JLabel l;                                                                                                           //label for welcome the quiz
public JLabel l1;                                                                                                         //label for entering the name
public JLabel l2;                                                                                                          //label for quiz quiz quiz
public JTextField t1;                                                                                                    //textfield for name
public JButton b1;                                                                                                         //button for rules
public JButton b2;                                                                                                       //button for back

task()                   
{
f=new JFrame();
l=new JLabel();
l1=new JLabel();
l2=new JLabel();
t1=new JTextField();
b1=new JButton();
b2=new JButton();

l.setText("WELCOME TO THE QUIZ");                                                                                              //adding text,font,color to label
l.setFont(new Font("times new roman",Font.BOLD,50));
l.setForeground(Color.black);

l2.setText("quiz! quiz! quiz!");                                                                                               //adding text,font,color,and bounds to label 2
l2.setForeground(Color.blue);
l2.setFont(new Font("arial black",Font.PLAIN,30));
l2.setBounds(800,80,300,30);

l1.setText("enter your name");                                                                                                 //adding text,font,color,and bounds to label 1
l1.setForeground(Color.red);
l1.setFont(new Font("italic",Font.PLAIN,30));
l1.setBounds(800,150,300,30);

t1.setSize(300,150);                                                                                                         //adding size and bound to text field 1
t1.setBounds(760,200,300,30);

b1.addActionListener(this);                                                                                                 //adding text,color,bound and action listener to button 1
b1.setText("proceed");
b1.setForeground(Color.blue);
b1.setBounds(760,250,140,30);

b2.addActionListener(this);                                                                                                  //adding text,color,bound and action listener to button 2
b2.setText("back");
b2.setForeground(Color.blue);
b2.setBounds(920,250,140,30);

f.add(b1);                                                                                                                  //adding buttons,text field,labels to the frame
f.add(b2);
f.add(t1);
f.add(l2);
f.add(l1);
f.add(l);
f.getContentPane().setBackground(Color.yellow);
f.setSize(1200,900);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.setVisible(true);
}


public class rules extends JFrame implements ActionListener                                                                //another class for another frame which is going to appear when clicked on proceed button
{ 
public JLabel l3;                                                                                                          //label for writing welcome(person name)to quiz
public JFrame f1;                                                                                                          //frame after clicking on proceed
public JLabel l4;                                                                                                          //label for proceed
public JButton b3,b4;                                                                                                      //button 3 for back button and b4 for start button
String name;

rules(String name)
{
l3=new JLabel();                                                      
l4=new JLabel();
f1=new JFrame();
b3=new JButton();
b4=new JButton();
this.name=name;

l3.setBounds(50,20,700,30);                                                                                                 //adding text,font,color,and bounds to label 3                                                                   
l3.setText("welcome " +name + " to quiz");
l3.setForeground(Color.blue);
l3.setFont(new Font("viner hand itc",Font.PLAIN,30));

l4.setBounds(20,35,1100,650);                                                                                               //adding text,font,color,and bounds to label 4
l4.setForeground(Color.black);
l4.setFont(new Font("times new roman",Font.PLAIN,30));
l4.setText(                                                                                                                 //adding rules 
"<html>"+
"1. Language.the quizzes are all in English." + "<br><br>" +
"2. Cheating. Anyone suspected by an official of cheating will be disqualified. You must not use any mobile device during a quiz competition." + "<br><br>" +
"3. Late Arrival. If a player arrives after a competition has begun, they will not be allowed into the quiz room as it could disrupt other players.Please don’t be late." + "<br><br>" +
"4. Disruptive Behaviour. Anyone deemed by an official to be purposely disrupting an event or causing upset/annoyance/distress to another player/organiser will be removed." + "<br><br>" +
"5.crying is allowed but please do so quitely." + "<br><br>" +
"GOOD LUCK!" + "<br><br>" +
"<html>"
 );

b3.addActionListener(this);                                                                                                 //adding text,color,bound and action listener to button 3                                                           
b3.setText("back");
b3.setForeground(Color.blue);
b3.setBounds(500,650,100,40);

b4.addActionListener(this);                                                                                                 //adding text,color,bound and action listener to button 4
b4.setText("start");
b4.setForeground(Color.blue);
b4.setBounds(700,650,100,40);


f1.add(l3);                                                                                                                  //adding buttons,text field,labels to the frame
f1.add(l4);
f1.add(b3);
f1.add(b4);
f1.getContentPane().setBackground(Color.gray);
f1.setSize(1200,900);
f1.setLayout(null);
f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f1.setVisible(true);
}


public class start extends JFrame implements ActionListener                                                                 //another class for another frame which is going to appear when clicked on start button
{
public JFrame f2;                                                                                                          //frame after clicking on start button
public JLabel l5,l6,qno;                                                                                                  //label for start the quiz now,this is the question and question number
public JRadioButton r1,r2,r3,r4;                                                                                          //radiobuttons for options                    
public JButton next,submit;                                                                                               //buttons for next and submit
ButtonGroup o;


public static int ans_given=0;                          
 int count=0;
int score=0;
String ques[][]=new String[10][5];                                                                                       //string for questions
String ans[][]=new String[10][2];                                                                                        //string for answers
String userans[][]=new String[10][1];                                                                                    //string for user input answers

start()
{
qno=new JLabel();
l5=new JLabel();
l6=new JLabel();
f2=new JFrame();
r1=new JRadioButton();
r2=new JRadioButton();
r3=new JRadioButton();
r4=new JRadioButton();
next=new JButton();
submit=new JButton();
o=new ButtonGroup();


qno.setText("q");                                                                                                           //adding text,color,font and bound to question number
qno.setForeground(Color.black); 
qno.setFont(new Font("tamhor",Font.BOLD,60));
qno.setBounds(130,110,100,100);

l5.setText("start the quiz now");                                                                                            //adding text,font,color,and bounds to label 5                                                                 
l5.setForeground(Color.red);
l5.setFont(new Font("tamhor",Font.BOLD,70));
l5.setBounds(400,30,500,70);

l6.setText("this is the question");                                                                                          //adding text,font,color,and bounds to label 6
l6.setForeground(Color.black);
l6.setFont(new Font("tamhor",Font.PLAIN,30));
l6.setBounds(200,110,1000,100);


f2.add(l6);

ques[0][0]="Number of primitive data types in Java are?";                                                                    //adding questions and its options in a string
ques[0][1]="6";
ques[0][2]="7";
ques[0][3]="8";
ques[0][4]="9";
ques[1][0]=" Arrays in java are-  ";
ques[1][1]="object references";
ques[1][2]="objects";
ques[1][3]="primitive datatypes";
ques[1][4]="none";
ques[2][0]= "What does GUI stand for?";
ques[2][1]="Graphical User Interface"; 
ques[2][2]="General User Interface ";
ques[2][3]="Graphics Utility Interface"; 
ques[2][4]="Graphical Utility Interface"; 
ques[3][0]="Which package contains the Java Swing classes? ";
ques[3][1]="java.lang";
ques[3][2]="java.io"; 
ques[3][3]="java.util"; 
ques[3][4]="javax.swing";
ques[4][0]="Which class is used to create a button in Java Swing?";
ques[4][1]="JButton"; 
ques[4][2]="JLabel"; 
ques[4][3]="JRadioButton"; 
ques[4][4]="JTextArea"; 
ques[5][0]="What is the purpose of the setVisible() method in JFrame?"; 
ques[5][1]="To set the size of the frame";
ques[5][2]="To set the title of the frame"; 
ques[5][3]="To make the frame visible on the screen";
ques[5][4]="To close the frame"; 
ques[6][0]="_____ is used to find and fix bugs in the Java programs.";
ques[6][1]="JVM";
ques[6][2]="JRE";
ques[6][3]="JDK";
ques[6][4]="JDB";
ques[7][0]="Which method of the Class.class is used to determine the name of a class represented by the class object as a String?";
ques[7][1]="getClass()";
ques[7][2]="intern()";
ques[7][3]="getName()";
ques[7][4]="toString()";
ques[8][0]="Which of the following is not a Java features?";
ques[8][1]="Dynamic";
ques[8][2]="Architecture Neutral";
ques[8][3]="Use of pointers";
ques[8][4]="Object-oriented";
ques[9][0]="Which event listener interface is used for handling button click events? ";
ques[9][1]="ActionListener";
ques[9][2]="ItemListener"; 
ques[9][3]="MouseListener";
ques[9][4]="KeyListener"; 


ans[0][1]="8";                                                                                                                   //adding solution to the ans string
ans[1][1]="objects";
ans[2][1]="Graphical User Interface"; 
ans[3][1]="javax.swing";
ans[4][1]="JButton"; 
ans[5][1]="To make the frame visible on the screen";
ans[6][1]="JDB";
ans[7][1]="getName()";
ans[8][1]="Use of pointers";
ans[9][1]="ActionListener";


r1.setBackground(Color.gray);                                                                                                    //adding text,colour,bounds in radiobutton 1
r1.setForeground(Color.black);
r1.setBounds(250,200,200,30);
r1.setText("option1");

r2.setBackground(Color.gray);                                                                                                   //adding text,colour,bounds in radiobutton 2
r2.setForeground(Color.black);
r2.setBounds(250,240,200,30);
r2.setText("option2");

r3.setBackground(Color.gray);                                                                                                   //adding text,colour,bounds in radiobutton 3
r3.setForeground(Color.black);
r3.setBounds(250,280,200,30);
r3.setText("option3");

r4.setBackground(Color.gray);                                                                                                   //adding text,colour,bounds in radiobutton 4
r4.setForeground(Color.black);
r4.setBounds(250,320,200,30);
r4.setText("option4");

o.add(r1);                                                                                                                      //adding radiobuttons r1,r2,r3,r4 to the button group
o.add(r2);
o.add(r3);
o.add(r4);

next.setBackground(Color.red);                                                                                                   //adding text,color,bound,and action listener to the button next
next.setForeground(Color.black);
next.setText("next");
next.setBounds(1000,450,110,30);
next.addActionListener(this);

submit.setBackground(Color.red);                                                                                                 //adding text,color,bound,and action listener to the button submit
submit.setForeground(Color.black);
submit.setText("submit");
submit.setBounds(1000,500,110,30);
submit.addActionListener(this);
submit.setEnabled(false);


f2.add(qno);
f2.add(next);
f2.add(submit);
f2.add(r1);
f2.add(r2);
f2.add(r3);
f2.add(r4);
f2.add(l5);
f2.setSize(1200,900);
f2.getContentPane().setBackground(Color.gray);
f2.setLayout(null);
f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
test(count);                                                                                                                        //calling of function test
ans();                                                                                                                              //calling of function ans
f2.setVisible(true);
}


public void ans()                                                                                                                   //function ans
{
if(ans_given==1)
{
ans_given=0;
}
else if(o.getSelection()==null)
{
userans[count][0]=" ";
}
else
{
userans[count][0]=o.getSelection().getActionCommand();
count++;
test(count);
}
}


public void test(int count)                                                                                                          //function test
{
qno.setText(" " + (count+1) + ".");
l6.setText(ques[count][0]);
r1.setText(ques[count][1]);
r1.setActionCommand(ques[count][1]);
r2.setText(ques[count][2]);
r2.setActionCommand(ques[count][2]);
r3.setText(ques[count][3]);
r3.setActionCommand(ques[count][3]);
r4.setText(ques[count][4]);
r4.setActionCommand(ques[count][4]);
o.clearSelection();
}


public class number extends JFrame                                                                                                   //another class for another frame which is going to open to when clicked on submit button
{
public JFrame f3;
public JLabel l7,l8,l9;

number(int score)
{

l7=new JLabel();
l8=new JLabel();
l9=new JLabel();
f3=new JFrame();

l7.setText("Thanks for attempting the quiz!");                                                                                        //adding text,font,color,and bounds to label 7
l7.setBounds(400,100,700,60);
l7.setFont(new Font("times new roman",Font.PLAIN,40));
l7.setForeground(Color.green);
l7.setBackground(Color.black);

l8.setText("WELL DONE!");                                                                                                            //adding text,font,color,and bounds to label 8
l8.setBounds(400,250,700,70);
l8.setFont(new Font("times new roman",Font.PLAIN,40));
l8.setForeground(Color.blue);
l8.setBackground(Color.black);

l9.setText("your score is  " + score);                                                                                               //adding text,font,color,and bounds to label 9
l9.setBounds(400,400,7000,60);
l9.setForeground(Color.red);
l9.setFont(new Font("tahoma",Font.BOLD,40));
l8.setBackground(Color.black);

f3.add(l7);
f3.add(l8);
f3.add(l9);
f3.setSize(1200,900);
f3.getContentPane().setBackground(Color.gray);
f3.setLayout(null);
f3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f3.setVisible(true);
}
}


public void actionPerformed(ActionEvent e)                                                                                            //action performed method for class number
{
if(e.getSource()==next)
{
ans_given=1;
if(o.getSelection()==null)
{
userans[count][0]=" ";
}
else
{
userans[count][0]=o.getSelection().getActionCommand();
}
if(count==8)
{
next.setEnabled(false);
submit.setEnabled(true);
}
count++;
test(count);
}

if(e.getSource()==submit)
{
ans_given=1;
if(o.getSelection()==null)
{
userans[count][0]=" ";
}
else
{
userans[count][0]=o.getSelection().getActionCommand();
}
for(int i=0;i<userans.length;i++)
{
if(userans[i][0].equals(ans[i][1]))
{
score=score+10;
}
else
{
score=score+0;
}
}
f2.setVisible(false);
new number(score);
}
}
}                                                                                                                                       //method  for class number closes here                                                                          


public void actionPerformed(ActionEvent e)                                                                                              //action performed method for rule class where there are two buttons back and start                                                  
{
if(e.getSource()==b3)
{
b3.setVisible(false);
new task();
}
else if(e.getSource()==b4)
{
new start();
}
}
}                                                                                                                                       //method  for class rule closes here


public void actionPerformed(ActionEvent e)                                                                                              // action performed method for class task where there are two buttons proceed and back
{
if(e.getSource()==b2)
{
f.setVisible(false);
}
else if(e.getSource()==b1)
{
String name=t1.getText();
new rules(name);
}
}                                                                                                                                         //method for class task closes here


public static void main(String [] args)                                                                                                   //main function for calling main class(task)
{
new task();
}
}