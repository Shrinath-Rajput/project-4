package bank;


import com.toedter.calendar.JDateChooser;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;
import javax.swing.plaf.ColorUIResource;

public class signup extends JFrame implements ActionListener {
    JDateChooser jd1;
    JButton button1,button2;
    JRadioButton r1,r2,M1,M2,M3;
    JTextField text1,text2,text3,text4,text5,text6,text7,text8,text9,text10,text11,text12,text13,text14;

    Random ran = new Random();
    long first4 =(ran.nextLong()% 9000L)+1000L;
    String first =" "+Math.abs(first4);
    signup()
    {
super("APPLICATION FORM");
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2=i1.getImage().getScaledInstance(100, 100,Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(25, 10, 100, 100);
        add(image);

JLabel label1=new JLabel("APPLICATION FORM NO:"+first);
label1.setBounds(160, 20, 600, 40);
label1.setFont(new Font("Raleway",Font.BOLD,38));
add(label1);


JLabel label2=new JLabel("PAGE 1:");
label2.setBounds(330, 70, 600, 30);
label2.setFont(new Font("Raleway",Font.BOLD,22));
add(label2);


JLabel label3=new JLabel("PERSONAL DETAILS:");
label3.setBounds(290, 90, 600, 30);
label3.setFont(new Font("Raleway",Font.BOLD,22));
add(label3);

JLabel labelname=new JLabel("NAME :");
labelname.setBounds(100, 190, 100, 30);
labelname.setFont(new Font("Raleway",Font.BOLD,20));
add(labelname);

text1=new JTextField();
text1.setFont(new Font("Raleway",Font.BOLD,14));
text1.setBounds(300, 190, 400, 30);
add( text1);


JLabel labelname2=new JLabel("FATHER'S NAME :");
labelname2.setBounds(100, 240, 200, 30);
labelname2.setFont(new Font("Raleway",Font.BOLD,20));
add(labelname2);

text2=new JTextField();
text2.setFont(new Font("Raleway",Font.BOLD,14));
text2.setBounds(300, 240, 400, 30);
add( text2);


JLabel dob1=new JLabel("DATE OF BIRTH :");
dob1.setBounds(100, 340, 200, 30);
dob1.setFont(new Font("Raleway",Font.BOLD,20));
add(dob1);

jd1=new JDateChooser();
jd1.setForeground(new Color(105,105,105));
jd1.setBounds(300,340,400,30);
add(jd1);


JLabel l1=new JLabel("GENDER :");
l1.setBounds(100, 290, 200, 30);
l1.setFont(new Font("Raleway",Font.BOLD,20));
add(l1);

r1=new JRadioButton("MALE ");
r1.setBounds(300,290 ,90 ,30 );
r1.setBackground(new Color(222,255,228));
r1.setFont(new Font("Raleway",Font.BOLD,14));
add(r1);

r2=new JRadioButton("FEMALE ");
r2.setBounds(450,290 ,100 ,30 );
r2.setBackground(new Color(222,255,228));
r2.setFont(new Font("Raleway",Font.BOLD,14));
add(r2);


ButtonGroup b1=new ButtonGroup();
b1.add(r1);
b1.add(r2);


JLabel l2=new JLabel("EMIAL ADDRESS :");
l2.setBounds(100, 390, 200, 30);
l2.setFont(new Font("Raleway",Font.BOLD,20));
add(l2);

text4=new JTextField();
text4.setFont(new Font("Raleway",Font.BOLD,14));
text4.setBounds(300, 390, 400, 30);
add( text4);



JLabel l3=new JLabel("MARITAL STATUS :");
l3.setBounds(100, 440, 200, 30);
l3.setFont(new Font("Raleway",Font.BOLD,20));
add(l3);

M1=new JRadioButton("MARRIED");
M1.setBounds(300,440,100 ,30 );
M1.setBackground(new Color(222,255,228));
M1.setFont(new Font("Raleway",Font.BOLD,14));
add(M1);

M2=new JRadioButton("UNMARRIED");
M2.setBounds(450,440,120 ,30 );
M2.setBackground(new Color(222,255,228));
M2.setFont(new Font("Raleway",Font.BOLD,14));
add(M2);

M3=new JRadioButton("OTHER");
M3.setBounds(635,440,100 ,30 );
M3.setBackground(new Color(222,255,228));
M3.setFont(new Font("Raleway",Font.BOLD,14));
add(M3);


ButtonGroup b2=new ButtonGroup();
b2.add(M1);
b2.add(M2);
b2.add(M3);


JLabel l4=new JLabel("ADDRESS :");
l4.setBounds(100, 490, 200, 30);
l4.setFont(new Font("Raleway",Font.BOLD,20));
add(l4);

text6=new JTextField();
text6.setFont(new Font("Raleway",Font.BOLD,14));
text6.setBounds(300, 490, 400, 30);
add( text6);




JLabel l5=new JLabel("CITY :");
l5.setBounds(100, 540, 200, 30);
l5.setFont(new Font("Raleway",Font.BOLD,20));
add(l5);

text7=new JTextField();
text7.setFont(new Font("Raleway",Font.BOLD,14));
text7.setBounds(300, 540, 400, 30);
add( text7);


JLabel l6=new JLabel("PIN CODE :");
l6.setBounds(100, 590, 200, 30);
l6.setFont(new Font("Raleway",Font.BOLD,20));
add(l6);

text8=new JTextField();
text8.setFont(new Font("Raleway",Font.BOLD,14));
text8.setBounds(300, 590, 400, 30);
add( text8);


JLabel l7=new JLabel("STATE :");
l7.setBounds(100, 640, 200, 30);
l7.setFont(new Font("Raleway",Font.BOLD,20));
add(l7);

text9=new JTextField();
text9.setFont(new Font("Raleway",Font.BOLD,14));
text9.setBounds(300, 640, 400, 30);
add( text9);


button1=new JButton("NEXT");
button1.setFont(new Font("Raleway",Font.BOLD,20));
button1.setBackground(Color.BLACK);
button1.setForeground(Color.WHITE);
button1.setBounds(620,710 ,100 ,30 );
button1.addActionListener(this);
add(button1);


getContentPane().setBackground(new ColorUIResource(222,255,228));
        setLayout(null);
        setSize(850, 800);
        setLocation(360, 40);
        setUndecorated(true);
        setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String formno=first;
        String name=text1.getText();
        String firstname=text2.getText();
        String dob=((JTextField)jd1.getDateEditor().getUiComponent()).getText();
        String gender=null;
        if(r1.isSelected())
        {
            gender="male";
        }else if(r2.isSelected())
        {
            gender="female";
        }
        String email=text4.getText();
        String marital=null;
        if(M1.isSelected())
        {
            marital="MARRIED";

        }else if(M2.isSelected())
        {
            marital="UNMARRIED";

        }else if(M3.isSelected())
        {
            marital="OTHER";
        }
        String address=text6.getText();
        String city=text7.getText();
        String pincode=text8.getText();
        String state=text9.getText();
        try
        {
           if(text1.getText().equals(""))
           {
               JOptionPane.showMessageDialog(null,"Fill all the fields");


           }else
           {
               shri shri1=new shri();
               String q="insert into signup values('"+formno+"','"+name+"','"+firstname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pincode+"','"+state+"')";
               shri1.statement.executeUpdate(q);
               new signup2(formno);
               setVisible(false);
           }



        }catch (Exception ex)
        {
            ex.printStackTrace();
        }

    }

        public static void main(String[] args) {
        new signup();
        
    }

}
