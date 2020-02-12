
package questionsdb;

import java.sql.*;


public class QuestionsDB
{

    /**
     *
     */
    private Question q[];
    public QuestionsDB(String subject,String questionNum)
    {
        
        try
         {
            String Query="Select * from $sub where questionnum='$qnum'";
            Query=Query.replace("$qnum", questionNum);
            Query=Query.replace("$sub", subject);
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/qp","root","");
             
            Statement stmt=con.createStatement();
                
            q=new Question[getNumOfData(Query)];
            
            ResultSet rs=stmt.executeQuery(Query);
            for(int i=0;rs.next();i++)
            {
                q[i]=new Question();
                q[i].id=rs.getString("id");
                
                q[i].question=rs.getString("question");
                q[i].weightage=rs.getString("Weightage");
            }
            con.close();
         
         }
         catch(Exception e)
         {
             e.printStackTrace();
         }
        
    }
    public String getQuestionByID(String temp) 
    {
        for(int i=0;i<q.length;i++)
            {
               if(q[i].id.equals(temp))
                   return q[i].question;
            }
        return "";

    }
    public String getWeightage(String temp) 
    {
        for(int i=0;i<q.length;i++)
            {
               if(q[i].id.equals(temp))
                   return q[i].weightage;
            }
        return "";

    }
    public Question[] getQuestions()
    {
        return q;
    }
    public final int getNumOfData(String Query) throws Exception
    {
        int i;
        
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/qp","root","");
             
            Statement stmt=con.createStatement();
            
            ResultSet rs=stmt.executeQuery(Query);
            
            for(i=0;rs.next();i++)
            {
            }
            return i;
           
          
    }

    /**
     *
     * @param i
     * @param q
     */
   public boolean checkID(String i)
    {
       for(int j=0;j<q.length;j++)
       {
           if(i.equals(q[j].id))
               return true;
       }
       return false;
     }
        
    
    public void editQuestion(String subject,String i,String q,String w)
    {
        try
        {
            String Query="update $sub set question=?,weightage=?  where id=?";
            Query=Query.replace("$sub", subject);
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/qp","root","");
             
            PreparedStatement stmt=con.prepareStatement(Query);
            stmt.setString(1,q);
            stmt.setString(2,w);
            stmt.setString(3,i);
            
            
            stmt.executeUpdate();
            
            con.close();
         
                
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public void addQuestion(String subject,String qnum,String q,String w)
    {
        try
        {
            String Query="insert into $sub(`questionnum`,`question`,`weightage`) values(?,?,?)";
            Query=Query.replace("$sub", subject);
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/qp","root","");
             
            PreparedStatement stmt=con.prepareStatement(Query);
            stmt.setString(1,qnum);
            stmt.setString(2,q);
            stmt.setString(3,w);
            
            stmt.execute();
            
            con.close();
         
                
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public void deleteQuestion(String subject,String i)
    {
        try
        {
            String Query="delete from $sub where id=?";
            Query=Query.replace("$sub", subject);
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/qp","root","");
             
            PreparedStatement stmt=con.prepareStatement(Query);
            stmt.setString(1,i);
            
            
            
            stmt.execute();
            
            con.close();
         
                
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    
    public static void main(String args[])
    {
             
    }
}
