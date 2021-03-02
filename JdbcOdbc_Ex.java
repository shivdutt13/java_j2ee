package core.string.stringBuffer.stringBuilder;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcOdbc_Ex {
	
	private static Connection con=null;
	private static Statement st=null;
	private static PreparedStatement pst=null;
	private static ResultSet rs=null;
	
	public static Connection getConnection(){
		try{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			con = DriverManager.getConnection("jdbc:odbc:samvedna");
		}catch(Exception e){
			e.printStackTrace();
		}
		return con;
	}
	
	private static void useStatement() throws SQLException {
		st = con.createStatement();
		rs = st.executeQuery("Select * from tbl_shareExperience");
		while(rs.next()){
			System.out.println(rs.getString("sye_name")+"\t"
					+rs.getString("sye_email")+"\t"
					+rs.getString("sye_experience"));
		}
		
		rs.close();
		st.close();
	}
	
	private static void usePreparedStatement() throws SQLException {
		pst = con.prepareStatement("insert into tbl_shareExperience values('Vikas','jamesroddi@gmail.com','GOOD EXPERIENCE')");
		pst.execute();
		
		pst.close();
	}
	
	public static void main(String[] args) {

		try {
			con = JdbcOdbc_Ex.getConnection();
			
			useStatement();
			usePreparedStatement();
			useStatement();
			
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}