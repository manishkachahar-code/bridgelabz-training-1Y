package com.gla.jdbc;
import java.sql.*;
public class EmployeeManager {
public static void main(String[] args) throws Exception {
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college_db","root","root");
con.createStatement().executeUpdate("INSERT INTO employee VALUES(1,'Ram',35000)");
ResultSet rs = con.createStatement().executeQuery("SELECT * FROM employee WHERE salary > 30000");
while(rs.next()) System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDouble(3));
con.createStatement().executeUpdate("UPDATE employee SET salary = salary*1.10 WHERE id=1");
con.createStatement().executeUpdate("DELETE FROM employee WHERE salary < 15000");
con.close();
}}