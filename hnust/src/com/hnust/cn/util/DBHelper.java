package com.hnust.cn.util;

import java.awt.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

/****
 * 连接sqlserver数据库测试
 * @author zhuzg
 *
 */
public class DBHelper {
	
	private static DBHelper dbHelper = new DBHelper();
	
    public DBHelper() {
        try {
//            Class.forName("net.sourceforge.jtds.jdbc.Driver");
        	 Class.forName("com.microsoft.jdbc.sqlserver.SQLServerDriver");
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "数据库连接失败"
                    + e.getMessage());
        }
    }
    
    /**
     * 连接数据库
     * 
     * @return Connection
     */
    public static Connection getConn() {
        try {
            Connection conn = null; // ������ݿ�����
//            String url = "jdbc:jtds:sqlserver://localhost:1433/hnust"; 
            String url = "jdbc:microsoft:sqlserver://localhost:1433;DatabaseName=hnust";
            String username = "sa"; // ��ݿ���û���
            String password = "0128"; // ��ݿ�����
            conn = DriverManager.getConnection(url, username, password); // ��������
            return conn; // ��������
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"数据库连接失败" + e.getMessage());
                  
            return null;
        }
    }
    
    public static void main(String[] args) throws SQLException {
		DBHelper dbHelper = new DBHelper();
		Connection connection = dbHelper.getConn();
		PreparedStatement ps = connection.prepareStatement("select * from person");
//		ps.setString(1, "zhuzg");
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
		}
		
	}
}
