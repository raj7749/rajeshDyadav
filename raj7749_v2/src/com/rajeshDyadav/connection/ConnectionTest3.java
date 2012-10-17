package com.rajeshDyadav.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ConnectionTest3
{
    public static void main(String[] args) throws Exception
    {
	Connection conn = null;
	Class.forName("oracle.jdbc.driver.OracleDriver");
	conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.205:1521:ITM90", "qms", "qms");
	conn.setAutoCommit(false);

	PreparedStatement pStmt = null;
	ResultSet rs = null;
	String query = "", refType2 = "C", refId = "0000000316", tmp = "";
	int feedbkIdCount = -1, confirmedCount = -1;
	ArrayList<String> fActionSetList = new ArrayList<String>();

	query = "SELECT ACTION_SET, CONFIRMED FROM ACTIONFEEDBACK WHERE REF_TYPE = ? AND REF_ID = ?";
	pStmt = conn.prepareStatement(query);
	pStmt.setString(1, refType2);
	pStmt.setString(2, refId);
	rs = pStmt.executeQuery();
	fActionSetList.clear();
	while (rs.next())
	{
	    fActionSetList.add(rs.getString("ACTION_SET"));
	    //tmp = rs.getString("CONFIRMED");
	    //if ("Y".equalsIgnoreCase(tmp)) confirmedCount++;
	    //confirmedCount = ("Y".equalsIgnoreCase(rs.getString("CONFIRMED")))?confirmedCount++:confirmedCount;	    
	    confirmedCount = "Y".equalsIgnoreCase(rs.getString("CONFIRMED"))?++confirmedCount:confirmedCount;
	    feedbkIdCount++;
	}
	rs.close();
	pStmt.close();
	rs = null;
	pStmt = null;

	System.out.println("^^^^^^^ inside insertIntoPlanOfAction methodargs5 ^^^^^^^");
	System.out.println("feedBackIdCount ..> " + feedbkIdCount);
	System.out.println("confirmedCount ..> " + confirmedCount);
	System.out.println("fActionSet ..> " + fActionSetList.toString());
    }
}
