import java.lang.*;
import java.sql.*;
public class JDBC{
public static void main(String[] args) throws Exception
{
    String url="jdbc:mysql://localhost:3306/madhu";                                    //xxx -> database name 
    String username="root";                                                           // yyy ->enter username 
    String password="Madhumitha06052006";                                                           //zzz -> enter password
    String query="select * from students";
    
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con=DriverManager.getConnection(url,username,password);
    Statement ob=con.createStatement();
    ResultSet ob1=ob.executeQuery(query);
    
    while(ob1.next()){
    System.out.print("name:" + ob1.getString(1) + "||");
    System.out.print("regno:" + ob1.getString(2) + "||");
    System.out.print("dept:" + ob1.getString(3) + "||");
    System.out.print("\n");
    }
    con.close();
}
}