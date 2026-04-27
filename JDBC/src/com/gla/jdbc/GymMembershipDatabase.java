package com.gla.jdbc;
import java.sql.*;
public class GymMembershipDatabase {
public static void main(String[] args) throws Exception {
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college_db","root","root");
con.createStatement().executeUpdate("INSERT INTO members VALUES(1,'Rahul','Premium',6)");
ResultSet rs = con.createStatement().executeQuery("SELECT * FROM members WHERE type='Premium'");
while(rs.next()) System.out.println(rs.getString(2));
con.createStatement().executeUpdate("UPDATE members SET months=months+3 WHERE id=1");
con.createStatement().executeUpdate("DELETE FROM members WHERE id=1");
con.close();
}}