package ders11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MySQLIntegration {
	
	private static final String DB_URL = "jdbc:mysql://localhost:3306/";
	private static final String USER = "root";
	private static final String PASSWORD = "root";

	public static void main(String[] args) throws SQLException {
		// exercise1();
		// exercise2();
		// exercise3();
		// exercise4();
		// exercise5();
		// exercise6();
		lab();
	}

	static void exercise1() throws SQLException {
		Connection con = DriverManager.getConnection(DB_URL, USER, PASSWORD);
		Statement st = con.createStatement();
		
		String sql = "CREATE DATABASE STUDENT";
		
		st.executeUpdate(sql);
		
		System.out.println("Database is created...");
	}
	static void exercise2() throws SQLException {
		Connection con = DriverManager.getConnection(DB_URL+"student", USER, PASSWORD);
		Statement st = con.createStatement();
		
		String sql = """
		CREATE TABLE login (
		  id INT not NULL,
		  name VARCHAR(45) NULL,
		  surname VARCHAR(45) NULL,
		  password VARCHAR(45) NULL,
		  PRIMARY KEY (id))
		""";
		
		st.executeUpdate(sql);
		
		System.out.println("Database table is created...");
	}
	static void exercise3() throws SQLException {
		Connection con = DriverManager.getConnection(DB_URL+"student", USER, PASSWORD);
		Statement st = con.createStatement();
		
		String sql = """
		INSERT INTO LOGIN VALUES(102,'Mahmut','Mehmet','mm123')
		""";
		
		st.executeUpdate(sql);
		
		System.out.println("Database element is created...");
	}
	static void exercise4() throws SQLException {
		Connection con = DriverManager.getConnection(DB_URL+"student", USER, PASSWORD);
		Statement st = con.createStatement();
		
		String query = """
		SELECT * FROM LOGIN
		""";
		
		ResultSet rs = st.executeQuery(query);

		while (rs.next()) {
			System.out.print("ID: "+rs.getInt("id")+" ");
			System.out.print("Name: "+rs.getString("name")+" ");
			System.out.print("Surname: "+rs.getString("surname")+" ");
			System.out.print("Password: "+rs.getString("password")+"\n");
		}
	}
	static void exercise5() throws SQLException {
		Connection con = DriverManager.getConnection(DB_URL+"student", USER, PASSWORD);
		Statement st = con.createStatement();
		
		String sql = """
		UPDATE LOGIN SET password='hh123' where id in (101)
		""";
		
		st.executeUpdate(sql);
		
		System.out.println("Database element is updated...");
	}
	static void exercise6() throws SQLException {
		Connection con = DriverManager.getConnection(DB_URL+"student", USER, PASSWORD);
		Statement st = con.createStatement();
		
		/*String query = """
		SELECT * FROM LOGIN WHERE id=101
		""";*/

		String query = """
		SELECT * FROM LOGIN WHERE name like '%sa%'
		""";
		
		ResultSet rs = st.executeQuery(query);

		while (rs.next()) {
			System.out.print("ID: "+rs.getInt("id")+" ");
			System.out.print("Name: "+rs.getString("name")+" ");
			System.out.print("Surname: "+rs.getString("surname")+" ");
			System.out.print("Password: "+rs.getString("password")+"\n");
		}
	}
	
	static void lab() throws SQLException {
		Scanner input  = new Scanner(System.in);
		
		System.out.println("\nLogin System");
		System.out.print("Full Name: ");
		String fullName = input.nextLine();
		
		if (!fullName.contains(" ")) {
			input.close();
			lab();
			return;
		}
		
		String name = fullName.split(" ")[0];
		String surname = fullName.split(" ")[1];

		System.out.print("Password: ");
		String password = input.nextLine();
		
		input.close();
		
		name = name.replaceAll("'", "").replaceAll("\\*", "");
		surname = surname.replaceAll("'", "").replaceAll("\\*", "");
		password = password.replaceAll("'", "").replaceAll("\\*", "");
		
		Connection con = DriverManager.getConnection(DB_URL+"student", USER, PASSWORD);
		Statement st = con.createStatement();

		String query = "SELECT * FROM LOGIN WHERE name='"+name+"' and surname='"+surname+"'";
		
		ResultSet rs = st.executeQuery(query);

		boolean foundUser = rs.next();
		if (!foundUser) {
			System.out.println("User not found.");
			return;
		}
		
		while (foundUser) {
			if (!password.equals(rs.getString("password"))) {
				foundUser = rs.next();
				continue;
			}
			
			System.out.print("ID: "+rs.getInt("id")+" ");
			System.out.print("Name: "+rs.getString("name")+" ");
			System.out.print("Surname: "+rs.getString("surname")+" ");
			System.out.print("Password: "+rs.getString("password")+"\n");
			System.out.println("\nSuccessful login");
			return;
		}

		System.out.println("Login Unsuccessful!");
	}

}
