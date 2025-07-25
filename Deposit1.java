package bank;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Deposit1 extends JFrame implements ActionListener
{
    String pin;
    TextField text1;
    JButton b1,b2;

    Deposit1(String pin)
    {
        this.pin=pin;
ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
Image i2=i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
ImageIcon i3=new ImageIcon(i2);
JLabel l3=new JLabel(i3);
l3.setBounds(0,0,1550,830);
add(l3);

JLabel l4=new JLabel("ENTER AMOUNT YOU WANTS TO DEPOSIT :");
l4.setForeground(Color.WHITE);
l4.setFont(new Font("System",Font.BOLD,16));
l4.setBounds(460,180,400,35);
l3.add(l4);

text1=new TextField();
text1.setBounds(460,230,320,25);
text1.setFont(new Font("Raleway",Font.BOLD,22));
text1.setBackground(new Color(47, 57, 58));
text1.setForeground(Color.WHITE);
l3.add(text1);

        b1=new JButton("DEPOSIT");
        b1.setBounds(700,362,150,35);
        b1.setBackground(new Color(47, 57, 58));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        l3.add(b1);


        b2=new JButton("BACK");
        b2.setBounds(700,406,150,35);
        b2.setBackground(new Color(47, 57, 58));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        l3.add(b2);



        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setUndecorated(true);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        try
        {
            String amount=text1.getText();
            Date date=new Date();
            if(e.getSource()==b1)
            {
                if(text1.getText().equals(""))
                {
                    JOptionPane.showMessageDialog(null,"Please Enter The Amount You Want To Deposit");
                }
                else
                {
                    shri s=new shri();
                    String q3="insert into bank1 values('"+pin+"','"+date+"','Deposit','"+amount+"')";
                    s.statement.executeUpdate(q3);
                    JOptionPane.showMessageDialog(null,"Rs"+amount+"Deposit Successfully");
                    setVisible(false);
                    new main_class(pin);
                }
            }else if (e.getSource()==b2)
            {
                setVisible(false);
                new main_class(pin);
            }
        }catch (Exception E)
        {
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Deposit1("");

    }
}
