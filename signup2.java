package bank;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class signup2 extends JFrame implements ActionListener {
    JButton next;
    JRadioButton r1,r2,M1,M2;
    JComboBox com1,com2,com3,com4,com5,com6;
    JTextField text5,text6;
    String formno;
    signup2(String formno)
    {
        super("APPLICATION FORM");
        JLabel l11=new JLabel("PAGE2 :");
        l11.setBounds(300, 30, 600, 40);
        l11.setFont(new Font("Raleway",Font.BOLD,22));
        add(l11);

        JLabel l12=new JLabel("ADDITONAL DATAILS :");
        l12.setBounds(300, 60, 600, 40);
        l12.setFont(new Font("Raleway",Font.BOLD,22));
        add(l12);

        JLabel l13=new JLabel("RELIGION :");
        l13.setBounds(100, 120, 100, 30);
        l13.setFont(new Font("Raleway",Font.BOLD,18));
        add(l13);

        String religion[]={"Hindu","Muslim","Sikh","Christian","jaen","Other"};
       com1=new JComboBox(religion);
       com1.setBackground(new Color(173, 157, 108));
       com1.setFont(new Font("Raleway",Font.BOLD,18));
       com1.setBounds(350,120,320,30);
       add(com1);

        JLabel l14=new JLabel("CATEGORY :");
        l14.setBounds(100, 170, 140, 30);
        l14.setFont(new Font("Raleway",Font.BOLD,18));
        add(l14);

        String category[]={"Maratha","OBC","General","EWS","SCBC","Other"};

        com2=new JComboBox(category);
        com2.setBackground(new Color(173, 157, 108));
        com2.setFont(new Font("Raleway",Font.BOLD,18));
        com2.setBounds(350,170,320,30);
        add(com2);




        JLabel l15=new JLabel("INCOME :");
        l15.setBounds(100, 220, 100, 30);
        l15.setFont(new Font("Raleway",Font.BOLD,18));
        add(l15);

        String income[]={"Null","<1,50,000","<2,50,000","<5,00,000","Up to 10,00,000","Above 10,00,000"};

        com3=new JComboBox(income);
        com3.setBackground(new Color(173, 157, 108));
        com3.setFont(new Font("Raleway",Font.BOLD,18));
        com3.setBounds(350,220,320,30);
        add(com3);

        JLabel l16=new JLabel("EDUCATIONAL :");
        l16.setBounds(100, 270, 160, 30);
        l16.setFont(new Font("Raleway",Font.BOLD,18));
        add(l16);

        String Education[]={"Non_Graduate","Graduate","Post_Graduate","Doctrate","Engineer","Other"};
        com4=new JComboBox(Education);
        com4.setBackground(new Color(173, 157, 108));
        com4.setFont(new Font("Raleway",Font.BOLD,18));
        com4.setBounds(350,270,320,30);
        add(com4);


        JLabel l17=new JLabel("OCCUPATION :");
        l17.setBounds(100, 340, 160, 30);
        l17.setFont(new Font("Raleway",Font.BOLD,18));
        add(l17);

        String Occupation[]={"Salaried","Self_Employee","Business","Student","Retired","Other"};
        com5=new JComboBox(Occupation);
        com5.setBackground(new Color(173, 157, 108));
        com5.setFont(new Font("Raleway",Font.BOLD,18));
        com5.setBounds(350,340,320,30);
        add(com5);


        JLabel l18=new JLabel("PAN NUMBER :");
        l18.setBounds(100, 390, 160, 30);
        l18.setFont(new Font("Raleway",Font.BOLD,18));
        add(l18);
        text5=new JTextField();
        text5.setBounds(350,390,320,30);
        text5.setFont(new Font("Raleway",Font.BOLD,18));
        add(text5);



        JLabel l19=new JLabel("ADHAR NUMBER :");
        l19.setBounds(100, 440, 180, 30);
        l19.setFont(new Font("Raleway",Font.BOLD,18));
        add(l19);
        text6=new JTextField();
        text6.setBounds(350,440,320,30);
        text6.setFont(new Font("Raleway",Font.BOLD,18));
        add(text6);



        JLabel l20=new JLabel("SENIOR CITIZEN :");
        l20.setBounds(100, 490, 180, 30);
        l20.setFont(new Font("Raleway",Font.BOLD,18));
        add(l20);

        r1=new JRadioButton("YES");
        r1.setBounds(350,490,100,30);
        r1.setBackground(new Color(173, 157, 108));
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        add(r1);

        r2=new JRadioButton("No");
        r2.setBounds(460,490,100,30);
        r2.setBackground(new Color(173, 157, 108));
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        add(r2);


        JLabel l21=new JLabel("EXISTING ACCOUNT :");
        l21.setBounds(100, 540, 220, 30);
        l21.setFont(new Font("Raleway",Font.BOLD,18));
        add(l21);

        M1=new JRadioButton("YES");
        M1.setBounds(350,540,100,30);
        M1.setBackground(new Color(173, 157, 108));
        M1.setFont(new Font("Raleway",Font.BOLD,14));
        add(M1);

        M2=new JRadioButton("No");
        M2.setBounds(460,540,100,30);
        M2.setBackground(new Color(173, 157, 108));
        M2.setFont(new Font("Raleway",Font.BOLD,14));
        add(M2);

        ButtonGroup bg1=new ButtonGroup();
        bg1.add(r1);
        bg1.add(r2);
        bg1.add(M1);
        bg1.add(M2);


        JLabel l22=new JLabel("FORM NO:");
        l22.setBounds(700, 10, 120, 30);
        l22.setFont(new Font("Raleway",Font.BOLD,12));
        add(l22);

        JLabel l23=new JLabel(formno);
        l23.setBounds(760, 10, 60, 30);
        l23.setFont(new Font("Raleway",Font.BOLD,12));
        add(l23);

        next=new JButton("NEXT");
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(570,640 ,100 ,30 );
        next.addActionListener(this);
        add(next);


        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2=i1.getImage().getScaledInstance(100, 100,Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(150, 5, 100, 100);
        add(image);

        this.formno=formno;







        setLayout(null);
        setSize(850,750);
        setLocation(450,80);
        setUndecorated(true);
        getContentPane().setBackground(new Color(173, 157, 108));
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {

String rel=(String)com1.getSelectedItem();
String cate=(String)com2.getSelectedItem();
String inc=(String)com3.getSelectedItem();
String edu=(String)com4.getSelectedItem();
String occ=(String) com5.getSelectedItem();

String pan=text5.getText();
String adhar=text6.getText();

String scitizen="null";
if((r1.isSelected()))
{
    scitizen="YES";
}else if (r2.isSelected())
{
    scitizen="NO";
}
        String eaccount="null";
        if((r1.isSelected()))
        {
            eaccount="YES";
        }else if (r2.isSelected())
        {
            eaccount="NO";
        }
        try
        {
            if(text5.getText().equals("") || text6.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null,"fill all the field");
            }else {
                shri shri2=new shri();
                String q="insert into signup2 values('"+formno+"','"+rel+"','"+cate+"','"+inc+"','"+edu+"','"+occ+"','"+pan+"','"+adhar+"','"+scitizen+"','"+eaccount+"')";
                shri2.statement.executeUpdate(q);
                new signup3(formno);
                setVisible(false);

            }

        }catch (Exception E)
        {
            E.printStackTrace();
        }


    }

    public static void main(String[] args) {
        new signup2("");

    }
}
