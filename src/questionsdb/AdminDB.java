/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questionsdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import admin.AdminOptions;
import encryptdecrypt.EncryptDecrypt;

/**
 *
 * @author Bibek
 */
public class AdminDB {
    private User user[];
    
    public AdminDB()
    {
        try
        {
            String Query="Select * from admin";
            
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/qp","root","");
             
            Statement stmt=con.createStatement();
            
            ResultSet rs=stmt.executeQuery(Query);
            user =new User[getNumOfData()];
            
            for(int i=0;rs.next();i++)
            {
            user[i]=new User();
            user[i].name=rs.getString("Name");
            user[i].password=rs.getString("Password");
            }
            
            con.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    private int getNumOfData()
    {
        int i=0;
         try
        {
             String Query="Select * from admin";
            
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/qp","root","");
             
            Statement stmt=con.createStatement();
            
            ResultSet rs=stmt.executeQuery(Query);
            for(i=0;rs.next();i++)
            {
                
            } 
            con.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return i;
    }
    public void setPassword(String n,String pass)
    {
        pass =EncryptDecrypt.encrypt(pass);
        try
        {
            String Query="update admin set password=?  where name=?";
            
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/qp","root","");
             
            PreparedStatement stmt=con.prepareStatement(Query);
            stmt.setString(1,pass);
            stmt.setString(2,n);
            
            
            stmt.executeUpdate();
            
            con.close();
         
                
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public boolean validateLogin(String name,String pass)
    {
        pass =EncryptDecrypt.encrypt(pass);
        for(int i=0;i<user.length;i++)
        {
            if(user[i].name.equals(name) && user[i].password.equals(pass))
            {
                AdminOptions.setCurrentUser(user[i].name);
               
                return true;
            }
        }
        return false;
    }
    public boolean checkPassword(String s)
    { 
        return validateLogin(AdminOptions.getCurrentUser(),s);
            
    }
}
