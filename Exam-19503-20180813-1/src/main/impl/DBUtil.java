package main.impl;

import java.sql.*;

/**
 * Created by ZhangHao on 2018/8/13.
 */
public class DBUtil {
    private static final String URL="jdbc:mysql://localhost:3306/sakila?serverTimezone=GMT%2B8";
    private static final String USER="root";
    private  static final String PASSWORD="zhanghao";

    private static Connection conn = null;
    protected PreparedStatement ps;
    protected ResultSet rs;


    public static Connection getConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn= DriverManager.getConnection(URL,USER,PASSWORD);
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }catch (SQLException e){
            e.printStackTrace();
        }
        return conn;
    }
    public static Connection getConn(){
        return conn;
    }
    public void closeDB(ResultSet rs, PreparedStatement ps, Connection conn) {

        try {
            if (rs != null) {
                rs.close();
            }
            if (ps != null) {
                ps.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    // 测试是否连接上数据库
    public static void main(String[] args) {
        DBUtil dao = new DBUtil();
        System.out.println(dao.getConnection());
    }


}
