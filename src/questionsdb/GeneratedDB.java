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
public class GeneratedDB {
    private String subject;
    
    public GeneratedDB(String sub)
    {
        subject=sub;
        
        
    }
    
    public Question[] getQuestionPaper() throws Exception
    {
        Question q[]=new Question[15];
        String questionNum[]={"1a","1b","2a","2b","3a","3b","4a","4b","5a","5b","6a","6b","7a","7b","7c"};
        
         
            String Query=new String();
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/qp","root","");
            PreparedStatement stmt;
            
            for(int i=0;i<12;i++)
            {
                q[i]=new Question();
                    Query="Select * from $sub where questionnum=? order by rand()";
                                
                Query=Query.replace("$sub", subject);
                stmt=con.prepareStatement(Query);
                stmt.setString(1,questionNum[i]);
                do
                {
                    if(i%2==1 && !checkQuestionPresence(questionNum[i],q[i-1].weightage))
                    {
                        q[i].weightage="0";
                        q[i].id="0";
                        q[i].question="";
                        q[i].weightage="";
                        break;
                    }
                    ResultSet rs=stmt.executeQuery();
                    rs.next();
                    q[i].question=rs.getString("question");
                    q[i].id=rs.getString("ID");
                    q[i].weightage=rs.getString("weightage");
                    q[i].questionNum=rs.getString("questionnum");
                }while(i%2==1 && q[i-1].weightage.equals(q[i].weightage));
            }
            for(int i=12;i<15;i++)
            {
                q[i]=new Question();
                Query="Select * from $sub where questionnum=? order by rand()";
                Query=Query.replace("$sub", subject);
                stmt=con.prepareStatement(Query);
                stmt.setString(1,questionNum[i]);
                ResultSet rs=stmt.executeQuery();
                rs.next();
                q[i].question=rs.getString("question");
                q[i].id=rs.getString("ID");
                q[i].weightage=rs.getString("weightage");
                q[i].questionNum=rs.getString("questionnum");
            }
            con.close();
         
        
        return q;
    }
    private boolean checkQuestionPresence(String qn,String w) throws Exception
    {
       
       Class.forName("com.mysql.jdbc.Driver");
            
       Connection con=DriverManager.getConnection("jdbc:mysql://localhost/qp","root","");
       PreparedStatement stmt;
       String Query="Select * from $sub where questionnum=? and weightage!=?";
                                
       Query=Query.replace("$sub", subject);
       stmt=con.prepareStatement(Query);
       stmt.setString(1,qn);
       stmt.setString(2,w);
       ResultSet rs=stmt.executeQuery();
            
       
       boolean a= rs.next();
       con.close();
       return a;
    }
    
   
    
}
