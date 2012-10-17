package com.rajeshDyadav.hibernate.example01;
public class ContactBean
{
    private String empCode;
    private String empName;
    private String deptCode;
    private String empContact;
    private String empAddress;
    private String empGender;

    public String getEmpCode()
    {
	return empCode;
    }

    public String getEmpName()
    {
	return empName;
    }

    public String getDeptCode()
    {
	return deptCode;
    }

    public String getEmpContact()
    {
	return empContact;
    }

    public String getEmpAddress()
    {
	return empAddress;
    }

    public String getEmpGender()
    {
	return empGender;
    }

    public void setEmpCode(String string)
    {
	empCode = string;
    }

    public void setEmpName(String string)
    {
	empName = string;
    }

    public void setDeptCode(String string)
    {
	deptCode = string;
    }

    public void setEmpContact(String string)
    {
	empContact = string;
    }

    public void setEmpAddress(String string)
    {
	empAddress = string;
    }

    public void setEmpGender(String string)
    {
	empGender = string;
    }
}