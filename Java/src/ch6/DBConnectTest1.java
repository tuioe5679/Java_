package ch6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnectTest1 {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/haksa?serverTiemzone=UTC";
		String id = "root";
		String pw = "1234";
		
		Statement stmt;
		ResultSet result;
		Connection conn;
		
		try {
			//1.URL�� ������ JDBC ����̹� �ε� 
			Class.forName("com.mysql.cj.jdbc.Driver");
			//2.�̸��� �н����带 �̿��Ͽ� �����ͺ��̽� ���� 
			conn = DriverManager.getConnection(url,id,pw);
			System.out.println("�����ͺ��̽� ���� ����!");
			
			stmt = conn.createStatement();
			
//			stmt.executeUpdate("insert into student values('jykim', '20210003')");
//			stmt.executeUpdate("insert into student values('grpark', '20210004')");
			stmt.executeUpdate("delete from student where id=20210003");
			result = stmt.executeQuery("select * from student");
			while(result.next()) {
				String name = result.getString("name");
				String ids = result.getString("id");
				System.out.println("����: " + name + "���̵�: " + ids);
			}
			result.close();
			stmt.close();
			conn.close();
		}catch(ClassNotFoundException e) {
			System.out.println("JDBC ����̹� �ε� ����");
		}catch(SQLException e) {
			System.out.println("DB ���� ����");
		}

	}

}
