package com.gla.jdbc;
import java.sql.*;
public class CustomerDirectory {
public static void main(String[] args) throws Exception {
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college_db","root","root");
con.createStatement().executeUpdate("INSERT INTO customers VALUES(1,'Aman','9999')");
ResultSet rs = con.createStatement().executeQuery("SELECT * FROM customers WHERE name LIKE 'A%'");
while(rs.next()) System.out.println(rs.getString(2));
con.createStatement().executeUpdate("UPDATE customers SET phone='8888' WHERE id=1");
con.createStatement().executeUpdate("DELETE FROM customers WHERE id=1");
con.close();
}}