package database;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class DBconnenct {
	private static final String dbDriver="com.mysql.cj.jdbc.Driver";
	private static final String url = "jdbc:mysql://localhost:3306/pos?serverTiemzone=UTC&useUnicode=true&characterEncoding=UTF8";
	private static final String id = "root";
	private static final String pw = "1234";
	public static Connection conn =null;

	public static void main(String[] args) {
		System.out.println(ItemDAO.getInstance().getAllItems());
//		int num = 0;
//
//		Statement stmt;
//		
//
//		try {
//			Scanner stdin = new Scanner(System.in);
//			stmt = conn.createStatement();
//			ResultSet result = stmt.executeQuery("select * from item");
//			while(result.next()) {
//				String id = result.getString("id");
//				String name = result.getString("item_name");
//				String stock = result.getString("item_stock");
//				String price = result.getString("item_price");
//				System.out.println(id+name+stock+price);
//			}
//			result.close();
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
	}
	public static Connection connect() {
		try {
			Class.forName(dbDriver);
			conn = DriverManager.getConnection(url,id,pw);
			System.out.println("데이터베이스 연결 성공!");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,"데이터베이스 연결 실패!","경고",JOptionPane.WARNING_MESSAGE);
		}
		return conn;
		
	}
	public static void close() {
		try {
			if(conn!=null) {
				System.out.println("Connection close");
				conn.close();
			}
		} catch (Exception e) {
			System.out.println("Connection closing Failed :" + e.getMessage());
			e.printStackTrace();
		}
	}

}
