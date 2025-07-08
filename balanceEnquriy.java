package bank;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class balanceEnquriy extends JFrame implements ActionListener

{
    String pin;
    JLabel l5;
    JButton b1;
    balanceEnquriy( String pin)
    {
        this.pin=pin;
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2=i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l3=new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);

        JLabel l4=new JLabel("Your Correct Balance Is :");
        l4.setForeground(Color.WHITE);
        l4.setFont(new Font("System",Font.BOLD,16));
        l4.setBounds(430,180,700,35);
        l3.add(l4);

        l5=new JLabel();
        l5.setForeground(Color.WHITE);
        l5.setFont(new Font("System",Font.BOLD,16));
        l5.setBounds(430,220,400,35);
        l3.add(l5);

        b1=new JButton("BACK");
        b1.setBounds(700,406,150,35);
        b1.setBackground(new Color(47, 57, 58));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        l3.add(b1);

        int Balance=0;
        try
        {
            shri shri18=new shri();
            ResultSet rs=shri18.statement.executeQuery("select * from bank1 where pin='"+pin+"'");
            while(rs.next())
            {

                    if(rs.getString("type").equals("Deposit"))
                    {
                        Balance+=Integer.parseInt(rs.getString("amount"));
                    }else {
                        Balance-=Integer.parseInt(rs.getString("amount"));
                    }
            }

        }catch (Exception E)
        {
            E.printStackTrace();
        }

        l5.setText(""+Balance);


        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
setVisible(false);
new main_class(pin);
    }

    public static void main(String[] args) {
        new balanceEnquriy("");

    }
}
