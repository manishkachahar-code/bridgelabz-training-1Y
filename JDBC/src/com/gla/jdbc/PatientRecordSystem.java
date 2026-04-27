package com.gla.jdbc;
import java.sql.*;
public class PatientRecordSystem {
public static void main(String[] args) throws Exception {
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college_db","root","root");
con.createStatement().executeUpdate("INSERT INTO patients VALUES(1,'Ravi','Fever')");
ResultSet rs = con.createStatement().executeQuery("SELECT * FROM patients WHERE disease='Fever'");
while(rs.next()) System.out.println(rs.getString(2));
con.createStatement().executeUpdate("UPDATE patients SET disease='Cold' WHERE id=1");
con.createStatement().executeUpdate("DELETE FROM patients WHERE id=1");
con.close();
}}