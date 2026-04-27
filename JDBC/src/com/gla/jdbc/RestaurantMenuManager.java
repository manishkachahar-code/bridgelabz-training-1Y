package com.gla.jdbc;
import java.sql.*;
public class RestaurantMenuManager {
public static void main(String[] args) throws Exception {
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college_db","root","root");
con.createStatement().executeUpdate("INSERT INTO menu VALUES(1,'Pizza',150)");
ResultSet rs = con.createStatement().executeQuery("SELECT * FROM menu WHERE price<200");
while(rs.next()) System.out.println(rs.getString(2));
con.createStatement().executeUpdate("UPDATE menu SET price=180 WHERE id=1");
con.createStatement().executeUpdate("DELETE FROM menu WHERE id=1");
con.close();
}}