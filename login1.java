package bank;

import bank.signup;


import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.*;

public class login1 extends JFrame implements ActionListener {
    JLabel label1, label2, label3;
    JTextField tx1;
    JPasswordField pass1;
    JButton b1, b2, b3;

    login1() {
        super("BANK MANGEMENT SYSTEM");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350, 10, 100, 100);
        add(image);

        ImageIcon ii1 = new ImageIcon(ClassLoader.getSystemResource("icon/card.png"));
        Image ii2 = ii1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon ii3 = new ImageIcon(ii2);
        JLabel iimage = new JLabel(ii3);
        iimage.setBounds(630, 350, 100, 100);
        add(iimage);

        label1 = new JLabel("WELCOME TO  ATM");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("AvantFarde", Font.BOLD, 38));
        label1.setBounds(230, 125, 450, 40);
        add(label1);

        label2 = new JLabel("CARD NO:");
        label2.setFont(new Font("Ralway", Font.BOLD, 28));
        label2.setForeground(Color.WHITE);
        label2.setBounds(150, 190, 375, 30);
        add(label2);

        tx1 = new JTextField(15);
        tx1.setBounds(325, 190, 230, 30);
        tx1.setFont(new Font("Arial", Font.BOLD, 14));
        add(tx1);

        label3 = new JLabel("PIN :");
        label3.setFont(new Font("Ralway", Font.BOLD, 28));
        label3.setForeground(Color.WHITE);
        label3.setBounds(150, 250, 375, 30);
        add(label3);

        pass1 = new JPasswordField(15);
        pass1.setBounds(325, 250, 230, 30);
        pass1.setFont(new Font("Arial", Font.BOLD, 14));
        add(pass1);

        b1 = new JButton("SIGNIN");
        b1.setFont(new Font("Arial", Font.BOLD, 14));
        b1.setForeground(Color.WHITE);
        b1.setBackground(Color.BLACK);
        b1.setBounds(300, 300, 100, 30);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("CLEAR");
        b2.setFont(new Font("Arial", Font.BOLD, 14));
        b2.setForeground(Color.WHITE);
        b2.setBackground(Color.BLACK);
        b2.setBounds(430, 300, 100, 30);
        b2.addActionListener(this);
        add(b2);

        b3 = new JButton("SIGN UP");
        b3.setFont(new Font("Arial", Font.BOLD, 14));
        b3.setForeground(Color.WHITE);
        b3.setBackground(Color.BLACK);
        b3.setBounds(300, 350, 230, 30);
        b3.addActionListener(this);
        add(b3);

        ImageIcon iii1 = new ImageIcon(ClassLoader.getSystemResource("icon/backbg.png"));
        Image iii2 = iii1.getImage().getScaledInstance(850, 480, Image.SCALE_DEFAULT);
        ImageIcon iii3 = new ImageIcon(iii2);
        JLabel iiimage = new JLabel(iii3);
        iiimage.setBounds(0, 0, 850, 480);
        add(iiimage);

        setLayout(null);
        setSize(850, 480);
        setLocation(450, 200);
        setUndecorated(true);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        try {

            if (e.getSource() == b1) {
                shri shri5 = new shri();
                String cardno = tx1.getText();
                String pin = pass1.getText();
                String q7 = "select * from login where card_number='" + cardno + "' and pin='" + pin + "'";
                ResultSet resultset = shri5.statement.executeQuery(q7);
                if (resultset.next()) {
                    setVisible(false);
                    new main_class(pin);
                } else {
                    JOptionPane.showMessageDialog(null, "Please Enter correct card number And Pin");
                }
            } else if (e.getSource() == b2) {

                tx1.setText("");
                pass1.setText("");
            } else if (e.getSource() == b3) {

                new signup();
                setVisible(false);
            }
        } catch (Exception E) {

            E.printStackTrace();

        }

    }

    public static void main(String[] args) {
        new login1();

    }
}
