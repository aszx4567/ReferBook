package _ExJDBC;

import java.sql.*;

public class ConnectionTest {
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
			String sql = "select * from city";
			// 5. ���� ����
			rst = stmt.executeQuery(sql);
			// 6. ������ ����ϱ� 
			while(rst.next()){
				int id = rst.getInt(1);                                    //���ڴ� �÷��� �ǹ���
				String name = rst.getString(2);
				String ccode = rst.getString(3);
				String district = rst.getString(4);
				int population = rst.getInt(5);
				
				//System.out.println(id + "  " +name+ "  " +ccode+ "  " +district+ "  " +population);
				System.out.printf("%5d %30s %8s %25s %7d \n", id, name, ccode, district, population);
			}//end while
			
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
