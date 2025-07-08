package bank;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class pin extends JFrame implements ActionListener {
    String pin;
    JButton b1,b2;
    JPasswordField p1,p2;
    pin(String pin)
    {
        this.pin=pin;
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2=i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l3=new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);

        JLabel l4=new JLabel("CHANGE YOUR PIN :");
        l4.setForeground(Color.WHITE);
        l4.setFont(new Font("System",Font.BOLD,16));
        l4.setBounds(430,180,400,35);
        l3.add(l4);


        JLabel l5=new JLabel("NEW PIN :");
        l5.setForeground(Color.WHITE);
        l5.setFont(new Font("System",Font.BOLD,16));
        l5.setBounds(430,220,150,35);
        l3.add(l5);

        p1=new JPasswordField();
        p1.setBounds(600,220,180,25);
        p1.setFont(new Font("Raleway",Font.BOLD,22));
        p1.setBackground(new Color(47, 57, 58));
        p1.setForeground(Color.WHITE);
        l3.add(p1);

        JLabel l6=new JLabel("RE-ENTER NEW PIN :");
        l6.setForeground(Color.WHITE);
        l6.setFont(new Font("System",Font.BOLD,16));
        l6.setBounds(430,250,400,35);
        l3.add(l6);

        p2=new JPasswordField();
        p2.setBounds(600,255,180,25);
        p2.setFont(new Font("Raleway",Font.BOLD,22));
        p2.setBackground(new Color(47, 57, 58));
        p2.setForeground(Color.WHITE);
        l3.add(p2);





        b1=new JButton("CHANGE");
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


        setSize(1550,1080);
        setLayout(null);
        setLocation(0,0);
        setUndecorated(true);
        setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {

        try
        {
            String pin1=p1.getText();
            String pin2=p2.getText();

            if(!pin1.equals(pin2))
            {
                JOptionPane.showMessageDialog(null,"PIN DOES NOT MATCH");
                return;
            }
            if(e.getSource()==b1)
            {
                if(p1.getText().equals(""))
                {
                    JOptionPane.showMessageDialog(null,"ENTER NEW PIN");
                    return;
                }
                if(p2.getText().equals(""))
                {
                    JOptionPane.showMessageDialog(null,"RE-ENTER NEW PIN");
                    return;

                }
                shri s1=new shri();
                String q1="update  bank1 set pin='"+pin1+"' where pin='"+pin+"'";
                String q2="update  login set pin='"+pin1+"' where pin='"+pin+"'";
                String q3="update  signup3 set pin='"+pin1+"' where pin='"+pin+"'";
                s1.statement.executeUpdate(q1);
                s1.statement.executeUpdate(q2);
                s1.statement.executeUpdate(q3);
                JOptionPane.showMessageDialog(null,"PIN CHANGED");
                setVisible(false);
                new main_class(pin);


            } else if (e.getSource()==b2) {
                new main_class(pin);
                setVisible(false);

            }


        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new pin("");
    }
}
