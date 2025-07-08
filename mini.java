package bank;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class mini extends JFrame implements ActionListener {
    JButton b1;
    String pin;
    mini(String pin)
    {
        this.pin=pin;
        setSize(400,600);
        setLocation(20,20);
        setUndecorated(true);
        getContentPane().setBackground(new Color(242, 237, 243));
        setLayout(null);

        JLabel l1=new JLabel();
        l1.setBounds(20,140,400,200);
        add(l1);

        JLabel l2=new JLabel("TechCoder S.R");
        l2.setFont(new Font("System",Font.BOLD,15));
        l2.setBounds(150,20,200,20);
        add(l2);

        JLabel l3=new JLabel();
        l3.setBounds(20,80,300,20);
        add(l3);


        JLabel l4=new JLabel();
        l4.setBounds(20,400,300,20);
        add(l4);

        try
        {
            shri s=new shri();
            ResultSet rs=s.statement.executeQuery("select * from login where pin='"+pin+"'");
            while(rs.next())
            {
                l3.setText("card Number:"+rs.getString("card_number").substring(0,3)+"XXXXXXXXXXXX"+rs.getString("card_number").substring(12));

            }

        }catch(Exception ex)
        {
            ex.printStackTrace();
        }

try {
    int Balance = 0;
    shri s1 = new shri();
    ResultSet resultSet=s1.statement.executeQuery("select * from bank1 where pin='"+pin+"'");
    while(resultSet.next())
    {
        l1.setText(l1.getText()+"<html>" +resultSet.getString("date")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+resultSet.getString("type")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+resultSet.getString("amount")+"<br><br><html>");


        if(resultSet.getString("type").equals("Deposit"))
        {
            Balance+=Integer.parseInt(resultSet.getString("amount"));
        }else{
            Balance-=Integer.parseInt(resultSet.getString("amount"));
        }

    }
    l4.setText("Your Total Balance"+Balance);
}


catch(Exception E)
{
    E.printStackTrace();
}

b1=new JButton("EXIST");
b1.setBounds(20,500,100,25);
b1.setBackground(new Color(47, 57, 58));
b1.setForeground(Color.WHITE);
b1.addActionListener(this);
add(b1);
setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        new main_class(pin);
        setVisible(false);

    }

    public static void main(String[] args) {
        new mini("");

    }
}
