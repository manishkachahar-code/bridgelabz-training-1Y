package com.gla.jdbc;
import java.sql.*;
public class CourseEnrollmentSystem {
public static void main(String[] args) throws Exception {
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college_db","root","root");
con.createStatement().executeUpdate("INSERT INTO enrollments VALUES(1,'Hariom','Java')");
ResultSet rs = con.createStatement().executeQuery("SELECT * FROM enrollments WHERE course='Java'");
while(rs.next()) System.out.println(rs.getString(2));
con.createStatement().executeUpdate("UPDATE enrollments SET course='Python' WHERE id=1");
con.createStatement().executeUpdate("DELETE FROM enrollments WHERE id=1");
con.close();
}}