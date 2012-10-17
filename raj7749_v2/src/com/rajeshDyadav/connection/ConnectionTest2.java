package com.rajeshDyadav.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ConnectionTest2
{
    public static void main(String[] args) throws Exception
    {
	Connection conn = null;
	Class.forName("oracle.jdbc.driver.OracleDriver");
	conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.205:1521:ITM90", "lck", "lck");
	conn.setAutoCommit(false);

	
	PreparedStatement pStmt = null;
	ResultSet rs = null;
	String sql = null;
	
	String empCode = "";
	String qty = "";	
	String tranId = "00001";
	
	sql = " select empcode as ec, " +   
		" ((case when absentdays is null then 0 else absentdays end) - (case when absentdays is null then 0 else absentdays end)) as ab," +
		" empcode " +
 		" from ry_employee_detail2 " +
 		" where empcode = ? ";	

	pStmt = conn.prepareStatement(sql);
	pStmt.setString(1, tranId);
	rs = pStmt.executeQuery();
	
	System.out.println(empCode);
	while(rs.next())
	//if(rs.next())
	{
	    System.out.println(rs.getString("empcode"));
	}
	
	if (!rs.isClosed()) 
	{
	    rs.close();
	    rs = null;
	}
	if (!pStmt.isClosed())
	{
	    pStmt.close();
	    pStmt = null;
	}
	if (!conn.isClosed())
	{
	    conn.close();
	    conn = null;
	}
    }
}
