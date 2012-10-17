package com.rajeshDyadav.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Iterator;

public class ConnectionTest4
{
    public static void main(String[] args) throws Exception
    {
	ArrayList<String> fActionSetList = new ArrayList<String>();
	fActionSetList.add("RDY01");fActionSetList.add("RDY02");
	
	ArrayList<String> arrTemp = new ArrayList<String>();
	Iterator<String> it = fActionSetList.iterator();
	while (it.hasNext())
	{
	    arrTemp.add("'" + it.next() + "'");
	}
	String actionSet = arrTemp.toString().substring(1, arrTemp.toString().length() - 1);
	System.out.println(actionSet);
	//actionSet = actionSet.substring(1, actionSet.length()-1);
	//System.out.println(actionSet);
	
	Connection conn = null;
	Class.forName("oracle.jdbc.driver.OracleDriver");
	conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.205:1521:ITM90", "qms", "qms");
	conn.setAutoCommit(false);

	PreparedStatement pStmt = null;
	ResultSet rs = null;
	String sql = "";
	
	
	String temp = "DI00000002";
	//String b = "'RDY02     ', 'RDY01     '";

	//sql = "SELECT A.STD_INSTR,A.ROLE_CODE__PFMR,A.ROLE_CODE__ESCL1,  A.ROLE_CODE__ESCL2,A.ROLE_CODE__ESCL3,ASETD.TIME_FRAME,A.ACTION_TYPE,  A.DESCR,W.DESCR FROM ACTIONSETDET ASETD,ACTION A,WF_ROLE W WHERE  A.ACTION_CODE = ASETD.ACTION_CODE AND A.ACTION_CODE = 'DI00000002'  AND ASETD.ACTION_SET IN ('RDY02     ', 'RDY01     ')  AND W.ROLE_CODE (+)= A.ROLE_CODE__PFMR";
	sql = "SELECT A.STD_INSTR,A.ROLE_CODE__PFMR,A.ROLE_CODE__ESCL1, " +
		    " A.ROLE_CODE__ESCL2,A.ROLE_CODE__ESCL3,ASETD.TIME_FRAME,A.ACTION_TYPE, " +
		    " A.DESCR,W.DESCR FROM ACTIONSETDET ASETD,ACTION A,WF_ROLE W WHERE " +
		    " A.ACTION_CODE = ASETD.ACTION_CODE AND A.ACTION_CODE = ? " +
		    " AND ASETD.ACTION_SET IN ("+ actionSet +") " +
		    " AND W.ROLE_CODE (+)= A.ROLE_CODE__PFMR";
	pStmt = conn.prepareStatement(sql);
	pStmt.setString(1, temp);
	rs = pStmt.executeQuery();
	if(rs.next())
	{
	    System.out.println("Record Found");
	}
	rs.close();
	pStmt.close();
	rs = null;
	pStmt = null;
    }
}
