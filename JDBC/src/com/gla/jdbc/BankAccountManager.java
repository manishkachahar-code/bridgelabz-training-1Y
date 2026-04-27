package com.gla.jdbc;
import java.sql.*;
public class BankAccountManager {
public static void main(String[] args) throws Exception {
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college_db","root","root");
con.createStatement().executeUpdate("INSERT INTO accounts VALUES(1,'Raj',15000)");
ResultSet rs = con.createStatement().executeQuery("SELECT * FROM accounts WHERE balance > 10000");
while(rs.next()) System.out.println(rs.getString(2));
con.createStatement().executeUpdate("UPDATE accounts SET balance=balance+5000 WHERE accNo=1");
con.createStatement().executeUpdate("DELETE FROM accounts WHERE accNo=1");
con.close();
}}