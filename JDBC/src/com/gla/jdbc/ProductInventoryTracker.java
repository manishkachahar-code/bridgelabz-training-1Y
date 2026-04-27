package com.gla.jdbc;
import java.sql.*;
public class ProductInventoryTracker {
public static void main(String[] args) throws Exception {
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college_db","root","root");
con.createStatement().executeUpdate("INSERT INTO product VALUES(1,'Pen',5),(2,'Book',20),(3,'Pencil',8)");
ResultSet rs = con.createStatement().executeQuery("SELECT * FROM product WHERE qty < 10");
while(rs.next()) System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
con.createStatement().executeUpdate("UPDATE product SET qty=50 WHERE pid=1");
con.createStatement().executeUpdate("DELETE FROM product WHERE pid=3");
con.close();
}}