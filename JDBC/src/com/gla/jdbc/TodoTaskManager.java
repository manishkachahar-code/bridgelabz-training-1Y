package com.gla.jdbc;
import java.sql.*;
public class TodoTaskManager {
public static void main(String[] args) throws Exception {
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college_db","root","root");
con.createStatement().executeUpdate("INSERT INTO tasks VALUES(1,'Study','Pending')");
ResultSet rs = con.createStatement().executeQuery("SELECT * FROM tasks WHERE status='Pending'");
while(rs.next()) System.out.println(rs.getString(2));
con.createStatement().executeUpdate("UPDATE tasks SET status='Completed' WHERE id=1");
con.createStatement().executeUpdate("DELETE FROM tasks WHERE id=1");
con.close();
}}