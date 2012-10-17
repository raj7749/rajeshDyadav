//package com.rajeshDyadav.connection;
//
//import ibase.system.config.ConnDriver;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//
//public class ConnectionTest
//{
//    public static void main(String[] args) throws Exception
//    {
//	ConnDriver connDriver = null;
//	Connection conn = null;
//
//	connDriver = new ConnDriver();
//	conn = connDriver.getConnectDB("DriverITM");
//	conn.setAutoCommit(false);
//	connDriver = null;
//
//	PreparedStatement pStmt = null;
//	ResultSet rs = null;
//	String sql = null;
//
//	String tranId = "";
//
//	sql = "";
//
//	pStmt = conn.prepareStatement(sql);
//	pStmt.setString(1, tranId);
//	rs = pStmt.executeQuery();
//	
//	while(rs.next())
//	{
//	    
//	}
//	
//	if (!rs.isClosed()) 
//	{
//	    rs.close();
//	    rs = null;
//	}
//	if (!pStmt.isClosed())
//	{
//	    pStmt.close();
//	    pStmt = null;
//	}
//	if (!conn.isClosed())
//	{
//	    conn.close();
//	    conn = null;
//	}
//    }
//}
