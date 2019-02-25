package com.how2java.BaseKnowledge.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @Description:
 * @Author: LYS
 * @Date: 2019/1/18 13:38
 */
public class TestJebc {
    public static void main(String[] args) {
        Connection c = null;
        Statement s = null;
        //初始化驱动
        try {
            //驱动类com.mysql.jdbc.Driver
            //就在 mysql-connector-java-5.0.8-bin.jar中
            //如果忘记了第一个步骤的导包，就会抛出ClassNotFoundException
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/train?characterEncoding=UTF-8", "root", "123456");
            s = c.createStatement();
            for (int i = 0; i < 100; i++) {
                String sql = "insert into hero values(null," + "'lys'" + "," + 313.0f + "," + 50 + ")";
                s.execute(sql);
            }
            System.out.println("获取 Statement对象： " + s);
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // 数据库的连接时有限资源，相关操作结束后，养成关闭数据库的好习惯
            // 先关闭Statement
            if (s != null) {
                try {
                    s.close();
                } catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            // 后关闭Connection
            if (c != null) {
                try {
                    c.close();
                } catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }
}
