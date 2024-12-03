package com.xyy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCDemo {
    public static void main(String[] args) throws Exception{
//        Class.forName("com.mysql.cj.jdbc.Driver");
//        String url = "jdbc:mysql://localhost:3306/dbdemo";
//        String user = "root";
//        String password = "985211";
//        Connection conn = DriverManager.getConnection(url, user, password);
//        System.out.println("Connection successful!");
//        String sql = "update account set money = 2000 where id = 1";
//        Statement stmt = conn.createStatement();
//        int count = stmt.executeUpdate(sql);
//        System.out.println("Update" + count);
//        stmt.close();
//        conn.close();
        //---------------1~7
        //1.加载驱动程序
//        Class.forName("com.mysql.cj.jdbc.Driver");
        //2.创建连接
        String url = "jdbc:mysql://localhost:3306/dbdemo";
        String user = "root";
        String password = "985211";
        Connection conn = DriverManager.getConnection(url, user, password);
        //3.创建sql语句
        String sql = "update account set money = 2000 where id = 1";
        //4.创键执行sql语句的对象
        Statement stat = conn.createStatement();
        //5.执行sql语句
        int count = stat.executeUpdate(sql);
        //6.处理执行结果
        System.out.println("Update: " + count);
        //7.关闭资源
        stat.close();
        conn.close();
    }
}
