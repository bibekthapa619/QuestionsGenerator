/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questionsdb;

import encryptdecrypt.EncryptDecrypt;
import java.sql.*;
import useroptions.*;
/**
 *
 * @author Bibek
 */
public class UsersDB {
    
    private User user[];
    
    public UsersDB()
    {
        try
        {
            String Query="Select * from users";
            
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
             String Query="Select * from users";
            
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
    public String[] getUsers()
    {
        String temp[]=new String[user.length];
        for(int i=0;i<user.length;i++)
        {
            temp[i]=new String();
            temp[i]=user[i].name;
        }
        return temp;
    }
    public void deleteUser(String n)
    {
         try
        {
            String Query="delete from users where name=?";
            
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/qp","root","");
             
            PreparedStatement stmt=con.prepareStatement(Query);
            stmt.setString(1,n);
         
            stmt.executeUpdate();
            
            con.close();
         
                
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public void addUser(String n,String pass)
    {
        pass =EncryptDecrypt.encrypt(pass);
        try
        {
            String Query="insert into users values(?,?)";
            
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/qp","root","");
             
            PreparedStatement stmt=con.prepareStatement(Query);
            stmt.setString(1,n);
            stmt.setString(2,pass);
                                   
            stmt.execute();
    
            con.close();
         
                
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
     public boolean isDuplicate(String n)
    {
        for(int i=0;i<user.length;i++)
        {
            if(user[i].name.toLowerCase().equals(n.toLowerCase()))
            {
                return true;
            }
        }
        return false;
    }
    public void setPassword(String n,String pass)
    {
        pass =EncryptDecrypt.encrypt(pass);
        try
        {
            String Query="update users set password=?  where name=?";
            
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
                UserOptions.setCurrentUser(user[i].name);
               
                return true;
            }
        }
        return false;
    }
    public boolean checkPassword(String s)
    { 
        return validateLogin(UserOptions.getCurrentUser(),s);
            
    }
            
}
