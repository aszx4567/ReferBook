package _ExJDBC;

import java.sql.*;

public class ConnectionTest {
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
			String sql = "select * from city";
			// 5. 질의 실행
			rst = stmt.executeQuery(sql);
			// 6. 실행결과 출력하기 
			while(rst.next()){
				int id = rst.getInt(1);                                    //숫자는 컬럼을 의미함
				String name = rst.getString(2);
				String ccode = rst.getString(3);
				String district = rst.getString(4);
				int population = rst.getInt(5);
				
				//System.out.println(id + "  " +name+ "  " +ccode+ "  " +district+ "  " +population);
				System.out.printf("%5d %30s %8s %25s %7d \n", id, name, ccode, district, population);
			}//end while
			
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
