package _ExJDBC;

import java.sql.*;

public class DeleteTest {
//버전5.대의 방법
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rst = null;
		
		try{
			// 1. Driver Loading
			Class.forName("com.mysql.jdbc.Driver");
			//2. connecting
			String url = "jdbc:mysql://localhost:3306/world?useSSL=false";           //기본포트일 경우 안넣어도됨 기본은3306   			                
			String userName = "root";                    
			String password = "tkddls6222";         			   
			conn =DriverManager.getConnection(url, userName, password); 
			System.out.println("connection success");
			// 3. 질의수행을위한 statement 작성
			stmt = conn.createStatement();
			// 4. sql query 구성
			String sql = "delete from city where id = 4086";
			// 5. 질의 실행
			stmt.executeUpdate(sql);
			System.out.println("delete success");
			 
	
			
		}
		catch(ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
		}
		catch(SQLException e) {
			System.out.println("SQL 예외사항" +e);
		}
		finally{   //자원반납
			try{
				if(conn != null && !conn.isClosed()){
					conn.close();
				}
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
