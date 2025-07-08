package bank;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class signup3 extends JFrame implements ActionListener {
    String formno;
    JButton e,s;
    JCheckBox c1,c2,c3,c4,c5,c6;
    JRadioButton r1,r2,M1,M2;
    signup3( String formno)
    {
        this.formno=formno;
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2=i1.getImage().getScaledInstance(100, 100,Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(150, 5, 100, 100);
        add(image);


        JLabel l111=new JLabel("PAGE 3 :");
        l111.setBounds(280, 40, 400, 40);
        l111.setFont(new Font("Raleway",Font.BOLD,22));
        add(l111);

        JLabel l112=new JLabel(" ACCOUNT DETAILS:");
        l112.setBounds(280, 70, 400, 40);
        l112.setFont(new Font("Raleway",Font.BOLD,22));
        add(l112);

        JLabel l113=new JLabel(" ACCOUNT TYPE :");
        l113.setBounds(100, 140, 200, 30);
        l113.setFont(new Font("Raleway",Font.BOLD,18));
        add(l113);

        r1=new JRadioButton("SAVING ACCOUNT");
        r1.setBounds(100,180,200,30);
        r1.setBackground(new Color(190, 208, 208));
        r1.setFont(new Font("Raleway",Font.BOLD,16));
        add(r1);

        r2=new JRadioButton("FIXED DEPOSIT ACCOUNT");
        r2.setBounds(350,180,300,30);
        r2.setBackground(new Color(190, 208, 208));
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        add(r2);

        M1=new JRadioButton("CURRENT ACCOUNT");
        M1.setBounds(100,220,250,30);
        M1.setBackground(new Color(190, 208, 208));
        M1.setFont(new Font("Raleway",Font.BOLD,16));
        add(M1);

        M2=new JRadioButton("RECURRENT DEPOSIT ACCOUNT");
        M2.setBounds(350,220,400,30);
        M2.setBackground(new Color(190, 208, 208));
        M2.setFont(new Font("Raleway",Font.BOLD,14));
        add(M2);

    ButtonGroup bg1=new ButtonGroup();
    bg1.add(r1);
    bg1.add(r2);
    bg1.add(M1);
    bg1.add(M2);

        JLabel l114=new JLabel(" CARD NUMBER :");
        l114.setBounds(100, 300, 200, 30);
        l114.setFont(new Font("Raleway",Font.BOLD,18));
        add(l114);

        JLabel l115=new JLabel(" YOUR 16-DIGIT CARD NUMBER :");
        l115.setBounds(100, 330, 200, 20);
        l115.setFont(new Font("Raleway",Font.BOLD,12));
        add(l115);

        JLabel l116=new JLabel(" XXXX-XXXX-XXXX-6317 :");
        l116.setBounds(330, 300, 250, 30);
        l116.setFont(new Font("Raleway",Font.BOLD,18));
        add(l116);

        JLabel l117=new JLabel(" IT WOULD APPEAR ON ATM CARD/CHEQUE BOOK AND STATEMENTS  :");
        l117.setBounds(330, 330, 500, 20);
        l117.setFont(new Font("Raleway",Font.BOLD,12));
        add(l117);

        JLabel l118=new JLabel(" PIN  :");
        l118.setBounds(100, 370, 200, 30);
        l118.setFont(new Font("Raleway",Font.BOLD,18));
        add(l118);

        JLabel l119=new JLabel(" XXXX :");
        l119.setBounds(330, 370, 200, 30);
        l119.setFont(new Font("Raleway",Font.BOLD,18));
        add(l119);

        JLabel l1120=new JLabel(" 4-DIGIT PASSWORD :");
        l1120.setBounds(100, 400, 200, 20);
        l1120.setFont(new Font("Raleway",Font.BOLD,12));
        add(l1120);

        JLabel l21=new JLabel(" SERVICES REQUIRED :");
        l21.setBounds(100, 450, 250, 30);
        l21.setFont(new Font("Raleway",Font.BOLD,18));
        add(l21);

    c1=new JCheckBox("ATM CARD ");
    c1.setBackground(new Color(190, 208, 208));
    c1.setFont(new Font("Raleway",Font.BOLD,16));
    c1.setBounds(100,500,200,30);
    add(c1);

        c2=new JCheckBox("INTERNET BANKING ");
        c2.setBackground(new Color(190, 208, 208));
        c2.setFont(new Font("Raleway",Font.BOLD,16));
        c2.setBounds(350,500,200,30);
        add(c2);

        c3=new JCheckBox("MOBILE BANKING ");
        c3.setBackground(new Color(190, 208, 208));
        c3.setFont(new Font("Raleway",Font.BOLD,16));
        c3.setBounds(100,550,200,30);
        add(c3);

        c4=new JCheckBox("EMAIL ALERTS ");
        c4.setBackground(new Color(190, 208, 208));
        c4.setFont(new Font("Raleway",Font.BOLD,16));
        c4.setBounds(350,550,200,30);
        add(c4);


        c5=new JCheckBox("CHEQUE BOOK ");
        c5.setBackground(new Color(190, 208, 208));
        c5.setFont(new Font("Raleway",Font.BOLD,16));
        c5.setBounds(100,600,200,30);
        add(c5);

        c6=new JCheckBox("E-STATEMENT ");
        c6.setBackground(new Color(190, 208, 208));
        c6.setFont(new Font("Raleway",Font.BOLD,16));
        c6.setBounds(350,600,200,30);
        add(c6);

JCheckBox c7= new JCheckBox("I HERE BY DECLEARES THAT THE ABOVE ENTERED DETAILS CORRECT TO THE BEST OF MY KNLOWLEDGE.",true);
        c7.setBackground(new Color(190, 208, 208));
        c7.setFont(new Font("Raleway",Font.BOLD,12));
        c7.setBounds(100,680,700,20);
        add(c7);


        JLabel l22=new JLabel("FORM NO:");
        l22.setBounds(700, 10, 120, 30);
        l22.setFont(new Font("Raleway",Font.BOLD,12));
        add(l22);

        JLabel l23=new JLabel(formno);
        l23.setBounds(760, 10, 60, 30);
        l23.setFont(new Font("Raleway",Font.BOLD,12));
        add(l23);

        s=new JButton("SUBMIT");
        s.setFont(new Font("Raleway",Font.BOLD,14));
        s.setBackground(Color.BLACK);
        s.setForeground(Color.WHITE);
        s.setBounds(250,720 ,100 ,30 );
        s.addActionListener(this);
        add(s);

        e=new JButton("CANCEL");
        e.setFont(new Font("Raleway",Font.BOLD,14));
        e.setBackground(Color.BLACK);
        e.setForeground(Color.WHITE);
        e.setBounds(420,720 ,100 ,30 );
        e.addActionListener(this);
        add(e);





        getContentPane().setBackground(new Color(190, 208, 208));
        setSize(850,800);
        setLayout(null);
        setLocation(400,20);
        setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String atype="null";
        if(r1.isSelected())
        {
            atype="SAVING ACCOUNT";
        }else if(r2.isSelected())
        {
            atype="FIXED DEPOSIT ACCOUNT";
        }else if (M1.isSelected())
        {
            atype="CURRENT ACCOUNT";
        }else if(M2.isSelected())
        {
            atype="RECURRENT DEPOSIT ACCOUNT";
        }
        Random ran=new Random();
        long first7=(ran.nextLong()% 90000000L)+1409963000000000L;
        String cardno=""+Math.abs(first7);
        long first3=(ran.nextLong()%9000L)+1000L;
        String pin=""+Math.abs(first3);

        String fac="";
        if(c1.isSelected())
        {
            fac = fac+"ATM CARD";
        }else if(c2.isSelected())
        {
            fac=fac+"INTERNET BANKING";

        }else if(c3.isSelected())
        {
            fac=fac+"MOBILE BANKING";
        }else if(c4.isSelected())
        {
            fac=fac+"EMAIL ALERTS";

        }else if(c5.isSelected())
        {
            fac=fac+"CHEQUE BOOK";
        }else if (c6.isSelected())
        {
            fac=fac+"E-STATEMENT";
        }
        try
        {
            if(e.getSource()==s)
                {
                    if(atype.equals(""))
                    {
                        JOptionPane.showMessageDialog(null,"please enter a type all details");
                    }else {
                        shri shri3=new shri();

                        String q1="insert into signup3 values('"+formno+"','"+atype+"','"+cardno+"','"+pin+"','"+fac+"')";
                        String q2="insert into login values('"+formno+"','"+cardno+"','"+pin+"')";
                        shri3.statement.executeUpdate(q1);
                        shri3.statement.executeUpdate(q2);
                        JOptionPane.showMessageDialog(null,"CARD NUMBER :"+cardno+"\nPIN :"+pin);
                        new Deposit1(pin);
                        setVisible(false);



                    }
                } else if (e.getSource()==s)
                {
                    System.exit(0);


            }

        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new signup3("");


    }
}
