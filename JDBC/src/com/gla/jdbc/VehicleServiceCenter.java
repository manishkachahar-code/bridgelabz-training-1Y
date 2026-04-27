package com.gla.jdbc;
import java.sql.*;
public class VehicleServiceCenter {
public static void main(String[] args) throws Exception {
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college_db","root","root");
con.createStatement().executeUpdate("INSERT INTO vehicles VALUES('UP01','Amit','Pending')");
ResultSet rs = con.createStatement().executeQuery("SELECT * FROM vehicles WHERE status='Pending'");
while(rs.next()) System.out.println(rs.getString(2));
con.createStatement().executeUpdate("UPDATE vehicles SET status='Completed' WHERE regNo='UP01'");
con.createStatement().executeUpdate("DELETE FROM vehicles WHERE regNo='UP01'");
con.close();
}}