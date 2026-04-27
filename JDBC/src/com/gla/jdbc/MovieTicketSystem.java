package com.gla.jdbc;
import java.sql.*;
public class MovieTicketSystem {
public static void main(String[] args) throws Exception {
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college_db","root","root");
con.createStatement().executeUpdate("INSERT INTO movies VALUES(1,'KGF',50)");
ResultSet rs = con.createStatement().executeQuery("SELECT * FROM movies WHERE seats>0");
while(rs.next()) System.out.println(rs.getString(2));
con.createStatement().executeUpdate("UPDATE movies SET seats=seats-1 WHERE id=1");
con.createStatement().executeUpdate("DELETE FROM movies WHERE id=1");
con.close();
}}