import java.io.*;  
import java.sql.*;  
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;  
import javax.servlet.http.*;  
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
// import the Vector class from util package.

@WebServlet(name = "Find", urlPatterns={"/find"})

public class Find extends HttpServlet {  
  
public void doGet(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
  
response.setContentType("text/html");  
PrintWriter out = response.getWriter();  
          
String contactno=request.getParameter("roll");  
int roll=Integer.valueOf(contactno);  
          
try{  
Class.forName("oracle.jdbc.driver.OracleDriver");  
Connection con=DriverManager.getConnection(  
"jdbc:oracle:thin:@localhost:1521:xe","system","oracle");  
              
PreparedStatement ps=con.prepareStatement("select * from result where rollno=?");  
ps.setInt(1,roll);  
              
out.print("<table width=50% border=1>");  
out.print("<caption>Result:</caption>");  
  
ResultSet rs=ps.executeQuery();  
              
/* Printing column names */  
ResultSetMetaData rsmd=rs.getMetaData();  
int total=rsmd.getColumnCount();  
out.print("<tr>");  
for(int i=1;i<=total;i++)  
{  
out.print("<th>"+rsmd.getColumnName(i)+"</th>");  
}  
  
out.print("</tr>");  
              
/* Printing result */  
  
while(rs.next())  
{  
//out.print("<tr><td>"+rs.getInt(1)+"</td><td>"+rs.getString(2)+"  
//</td><td>"+rs.getString(3)+"</td><td>"+rs.getString(4)+"</td></tr>");  
                  
}  
  
out.print("</table>");  
              
}catch (Exception e2) {e2.printStackTrace();}  
          
finally{out.close();}  
  
}  
}  