package _ExJDBC;

import java.sql.*;

public class DeleteTest {
//����5.���� ���
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rst = null;
		
		try{
			// 1. Driver Loading
			Class.forName("com.mysql.jdbc.Driver");
			//2. connecting
			String url = "jdbc:mysql://localhost:3306/world?useSSL=false";           //�⺻��Ʈ�� ��� �ȳ־�� �⺻��3306   			                
			String userName = "root";                    
			String password = "tkddls6222";         			   
			conn =DriverManager.getConnection(url, userName, password); 
			System.out.println("connection success");
			// 3. ���Ǽ��������� statement �ۼ�
			stmt = conn.createStatement();
			// 4. sql query ����
			String sql = "delete from city where id = 4086";
			// 5. ���� ����
			stmt.executeUpdate(sql);
			System.out.println("delete success");
			 
	
			
		}
		catch(ClassNotFoundException e) {
			System.out.println("����̹� �ε� ����");
		}
		catch(SQLException e) {
			System.out.println("SQL ���ܻ���" +e);
		}
		finally{   //�ڿ��ݳ�
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
