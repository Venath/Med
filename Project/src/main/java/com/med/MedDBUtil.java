package com.med;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class MedDBUtil {
	
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
    
//	public static boolean validate(String username, String password) {
//		
//		try {
//			con = DBConnect.getConnection();
//			stmt = con.createStatement();
//			String sql = "select * from customer where username='"+username+"' and password='"+password+"'";
//			rs = stmt.executeQuery(sql);
//			
//			if (rs.next()) {
//				isSuccess = true;
//			} else {
//				isSuccess = false;
//			}
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//		return isSuccess;
//	}
//	
//	public static List<Med> getCustomer(String userName) {
//		
//		ArrayList<Med> customer = new ArrayList<>();
//		
//		try {
//			
//			con = DBConnect.getConnection();
//			stmt = con.createStatement();
//			String sql = "select * from customer where username='"+userName+"'";
//			rs = stmt.executeQuery(sql);
//			
//			while (rs.next()) {
//				int id = rs.getInt(1);
//				String name = rs.getString(2);
//				String email = rs.getString(3);
//				String phone = rs.getString(4);
//				String username = rs.getString(5);
//				String password = rs.getString(6);
//				
//				Med cus = new Med(id,name,email,phone,username,password);
//				customer.add(cus);
//			}
//			
//		} catch (Exception e) {
//			
//		}
//		
//		return customer;	
//	}
    
    public static boolean insertmed(String name, String category, String dosage, String productPrice, String quantity, String description) {
    	
    	boolean isSuccess = false;
    	
    	try {
    		con = DBConnect.getConnection();
    		stmt = con.createStatement();
    	    String sql = "insert into medicine values (0,'"+name+"','"+category+"','"+dosage+"',"+productPrice+","+quantity+",'"+description+"')";
    		int rs = stmt.executeUpdate(sql);
    		
    		if(rs > 0) {
    			isSuccess = true;
    		} else {
    			isSuccess = false;
    		}
    		
    	}
    	catch (Exception e) {
    		e.printStackTrace();
    	}
 	
    	return isSuccess;
    }
    
//    public static boolean updatecustomer(String id, String name, String email, String phone, String username, String password) {
//    	
//    	try {
//    		
//    		con = DBConnect.getConnection();
//    		stmt = con.createStatement();
//    		String sql = "update customer set name='"+name+"',email='"+email+"',phone='"+phone+"',username='"+username+"',password='"+password+"'"
//    				+ "where id='"+id+"'";
//    		int rs = stmt.executeUpdate(sql);
//    		
//    		if(rs > 0) {
//    			isSuccess = true;
//    		}
//    		else {
//    			isSuccess = false;
//    		}
//    		
//    	}
//    	catch(Exception e) {
//    		e.printStackTrace();
//    	}
//    	
//    	return isSuccess;
//    }
// 
//    public static List<Med> getCustomerDetails(String Id) {
//    	
//    	int convertedID = Integer.parseInt(Id);
//    	
//    	ArrayList<Med> cus = new ArrayList<>();
//    	
//    	try {
//    		
//    		con = DBConnect.getConnection();
//    		stmt = con.createStatement();
//    		String sql = "select * from customer where id='"+convertedID+"'";
//    		rs = stmt.executeQuery(sql);
//    		
//    		while(rs.next()) {
//    			int id = rs.getInt(1);
//    			String name = rs.getString(2);
//    			String email = rs.getString(3);
//    			String phone = rs.getString(4);
//    			String username = rs.getString(5);
//    			String password = rs.getString(6);
//    			
//    			Med c = new Med(id,name,email,phone,username,password);
//    			cus.add(c);
//    		}
//    		
//    	}
//    	catch(Exception e) {
//    		e.printStackTrace();
//    	}	
//    	return cus;	
//    }
//    
//    
//    public static boolean deleteCustomer(String id) {
//    	
//    	int convId = Integer.parseInt(id);
//    	
//    	try {
//    		
//    		con = DBConnect.getConnection();
//    		stmt = con.createStatement();
//    		String sql = "delete from customer where id='"+convId+"'";
//    		int r = stmt.executeUpdate(sql);
//    		
//    		if (r > 0) {
//    			isSuccess = true;
//    		}
//    		else {
//    			isSuccess = false;
//    		}
//    		
//    	}
//    	catch (Exception e) {
//    		e.printStackTrace();
//    	}
//    	
//    	return isSuccess;
//    }
//    
//    
//    
//    
//    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
