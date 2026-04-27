package com.gla.jdbc;
import java.sql.*;
public class BookstoreSalesTracking {
public static void main(String[] args) throws Exception {
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college_db","root","root");
con.createStatement().executeUpdate("INSERT INTO sales VALUES(1,'DSA',2,500)");
ResultSet rs = con.createStatement().executeQuery("SELECT * FROM sales WHERE quantity>1");
while(rs.next()) System.out.println(rs.getString(2));
con.createStatement().executeUpdate("UPDATE sales SET quantity=3 WHERE id=1");
con.createStatement().executeUpdate("DELETE FROM sales WHERE id=1");
con.close();
}}