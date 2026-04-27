package com.gla.jdbc;
import java.sql.*;
public class LibraryBookManager {
public static void main(String[] args) throws Exception {
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college_db","root","root");
con.createStatement().executeUpdate("INSERT INTO books VALUES(1,'Java','James','Available')");
ResultSet rs = con.createStatement().executeQuery("SELECT * FROM books WHERE status='Available'");
while(rs.next()) System.out.println(rs.getString(2));
con.createStatement().executeUpdate("UPDATE books SET status='Issued' WHERE id=1");
con.createStatement().executeUpdate("DELETE FROM books WHERE id=1");
con.close();
}}