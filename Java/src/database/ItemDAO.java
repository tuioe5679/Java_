package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

public class ItemDAO {

	private static ItemDAO instance = new ItemDAO();
	public static ItemDAO getInstance() {
		return instance;
	}

	public Vector<Item> getAllItems() {
		Vector<Item> list = new Vector<Item>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String price = null;
		String sql = "select * from item";
		try {
			conn = DBconnenct.connect();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Item itme = null;
				itme.setId(rs.getInt("id"));
				itme.setItem_name(rs.getString("item_name"));
				itme.setItem_price(rs.getInt("item_price"));
				itme.setItem_stock(rs.getInt("item_stock"));
				list.add(itme);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			DBconnenct.close();
		}
		return list;
	}

}
