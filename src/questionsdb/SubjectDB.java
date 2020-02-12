/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questionsdb;

import java.sql.*;


/**
 *
 * @author Bibek
 */
public class SubjectDB {
    private String subject[];
    
    public SubjectDB()
    {
        try
         {
            String Query="Select * from subject";
            
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/qp","root","");
             
            Statement stmt=con.createStatement();
                
            subject=new String[getNumOfData()];
            
            ResultSet rs=stmt.executeQuery(Query);
            for(int i=0;rs.next();i++)
            {
                subject[i]=rs.getString("name");
            }
            con.close();
         
         }
         catch(Exception e)
         {
             e.printStackTrace();
         }
    }
    public final int getNumOfData() 
    {
        int i=0;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String Query="Select * from subject";
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/qp","root","");
             
            Statement stmt=con.createStatement();
            
            ResultSet rs=stmt.executeQuery(Query);
            
            for(i=0;rs.next();i++)
            {
            }
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
          return i;
    }
    
    public String[] getSubjects()
    {
        return subject;
    }
   public void addSubject(String n)
   {
       try
        {
            String Query="insert into subject values(?)";
            
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/qp","root","");
             
            PreparedStatement stmt=con.prepareStatement(Query);
            stmt.setString(1,n);
                                   
            stmt.execute();
            createTable(n);
            con.close();
         
                
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public void deleteSubject(String n)
    {
        try
        {
            String Query="delete from subject where name=?";
            
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/qp","root","");
             
            PreparedStatement stmt=con.prepareStatement(Query);
            stmt.setString(1,n);
                  
            stmt.execute();
            deleteTable(n);
            
            con.close();
    
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public boolean isDuplicate(String n)
    {
        for(int i=0;i<subject.length;i++)
        {
            if(subject[i].toLowerCase().equals(n.toLowerCase()))
            {
                return true;
            }
        }
        return false;
    }
    private void createTable(String n)
    {
         try
        {
            String Query=" create table if not exists $sub(ID int not null primary key auto_increment,questionnum varchar(3),question varchar(600),weightage int)";
            Query=Query.replace("$sub", n);
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/qp","root","");
             
            PreparedStatement stmt=con.prepareStatement(Query);
            
                                   
            stmt.execute();
            
            con.close();
         
                
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    private void deleteTable(String n)
    {
         try
        {
            String Query="drop table $sub";
            Query=Query.replace("$sub", n);
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/qp","root","");
             
            PreparedStatement stmt=con.prepareStatement(Query);
            
                                   
            stmt.execute();
            
            con.close();
         
                
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
         
}
