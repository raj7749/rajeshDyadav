package com.rajeshDyadav.hibernate.example02;
public class ContactBean
{
    private int id;
    private String name;
    private String department;
    private String contact;

    public int getId()
    {
	return id;
    }

    public String getName()
    {
	return name;
    }

    public String getDepartment()
    {
	return department;
    }

    public String getContact()
    {
	return contact;
    }

    public void setId(int val)
    {
	id = val;
    }

    public void setName(String string)
    {
	name = string;
    }

    public void setDepartment(String string)
    {
	department = string;
    }

    public void setContact(String string)
    {
	contact = string;
    }
}