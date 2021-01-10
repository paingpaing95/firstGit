package com.best.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.book.model.LoginUser;
import com.book.model.Register;

public class BookStoreDao {
	
	public boolean saveRegister(Register ruser)throws Exception {
		String result="Data entered ";
		String sql="insert into register(username,password,confirmpassword) values(?,?,?)";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstoredb","root","root");   
			PreparedStatement pstmt=con.prepareStatement(sql);
			pstmt.setString(1, ruser.getUsername());
			pstmt.setString(2, ruser.getPassword());
			pstmt.setString(3, ruser.getConfirmpassword());
			int status =pstmt.executeUpdate();
			
			if(status>0){
				return true;
			}else
				return false;
			
		}catch(Exception e) {
				throw e;
		}
			
	}
	
//	public ArrayList<LoginUser> getLogin() {
//		ArrayList<LoginUser> ulist =new ArrayList<LoginUser>();
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");  
//			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstoredb","root","root");
//			String s="select * from login";
//			Statement stmt=con.createStatement();
//			ResultSet rs=stmt.executeQuery(s);
//			
//			while(rs.next()) {
//				LoginUser luser =new LoginUser(rs.getInt("id"),rs.getString("name"),rs.getString("password"),rs.getString("role"));
//				ulist.add(luser);
//			}
//		}catch(Exception e) {
//			e.getMessage();
//		}
//		return ulist;
//		
//	}
	
}
