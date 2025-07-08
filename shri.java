package bank;

import java.sql.*;

public class shri {
    Connection conn1;
    Statement statement;
    public shri()
    {
        try{
            conn1= DriverManager.getConnection("jdbc:mysql://localhost:3306/banksystem1","root","shrinath6317");
            statement=conn1.createStatement();

        }
        catch (Exception e)
        {

            e.printStackTrace();
        }

    }
}

