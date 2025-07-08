package bank;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class withdrawl extends JFrame implements ActionListener {
    String pin;
    TextField text1;
    JButton b1,b2;

    withdrawl(String pin)

    {
        this.pin=pin;
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2=i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l3=new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);

        JLabel l4=new JLabel("MAXIMUM WITHDRAW IS RS 10000:");
        l4.setForeground(Color.WHITE);
        l4.setFont(new Font("System",Font.BOLD,16));
        l4.setBounds(460,180,700,35);
        l3.add(l4);

        JLabel l5=new JLabel("Please Enter Your Amount:");
        l5.setForeground(Color.WHITE);
        l5.setFont(new Font("System",Font.BOLD,16));
        l5.setBounds(460,220,400,35);
        l3.add(l5);

        text1=new TextField();
        text1.setBounds(460,260,320,25);
        text1.setFont(new Font("Raleway",Font.BOLD,22));
        text1.setBackground(new Color(47, 57, 58));
        text1.setForeground(Color.WHITE);
        l3.add(text1);

        b1=new JButton("WITHDREW");
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
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1) {
            try {
                String amount = text1.getText();
                Date date = new Date();
                if (text1.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Please Enter The Amount");

                } else {
                    shri shri1 = new shri();
                    ResultSet r1 = shri1.statement.executeQuery("select * from bank1 where pin='" + pin + "'");
                    int balance = 0;
                    while (r1.next()) {
                        if (r1.getString("type").equals("Deposit")) {
                            balance += Integer.parseInt(r1.getString("amount"));
                        } else {
                            balance -= Integer.parseInt(r1.getString("amount"));
                        }
                    }
                    if (balance < Integer.parseInt(amount)) {
                        JOptionPane.showMessageDialog(null, "Insufficient Balance");
                        return;

                    }
                    String q5 = "insert into bank1 values('" + pin + "','" + date + "','withdrawl','" + amount + "')";
                    shri1.statement.executeUpdate(q5);
                    JOptionPane.showMessageDialog(null, "Rs. " + amount + "Debited Successfully");
                    setVisible(false);
                    new main_class(pin);
                }
            } catch (Exception E) {
                E.printStackTrace();
            }
        } else if (e.getSource()==b2)
        {
            setVisible(false);
            new main_class(pin);

        }

    }

    public static void main(String[] args) {
        new withdrawl("");

    }
}
