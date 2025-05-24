package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AdminDAO {
	private final String ADMIN_HOTEN = "Nguyen Thi Thanh Tinh";
	private final String ADMIN_USERNAME = "admin";
    private final String ADMIN_PASSWORD = "admin123";

    public boolean checkLogin(String hoten, String username, String password) {
        return ADMIN_HOTEN.equals(hoten)&&ADMIN_USERNAME.equals(username) && ADMIN_PASSWORD.equals(password);
    }
   
//    public boolean checkLogin(String username, String password) {
//        String sql = "SELECT * FROM admin_users WHERE username=? AND password=?";
//        try (Connection conn = DBUtil.getConnection();
//             PreparedStatement ps = conn.prepareStatement(sql)) {
//
//            ps.setString(1, username);
//            ps.setString(2, password);
//            ResultSet rs = ps.executeQuery();
//            return rs.next();
//        } catch (Exception e) {
//            e.printStackTrace();
//            return false;
//        }
//    }
}

