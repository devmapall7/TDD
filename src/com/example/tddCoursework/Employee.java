//Name: Lyubomir Kostov
//Date: 26.11.2017
//Project: tdd Coursework
//Added addQualificaation that wasn't a part of the original UML chart hadn't thought aabout that method
package com.example.tddCoursework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Employee 
{
	//All the information we need to store for an Employee
	private String name;
	private String address;
	private String phoneNumber;
	private String department;
	private String date;
	private List<Qualifications> qualifications;
	private final int staffID;
	//Constructor that works with user input
	public Employee()
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Name of employee: ");
		name = keyboard.nextLine();
		System.out.print("Address: ");
		address = keyboard.nextLine();
		System.out.print("Phone Number: ");
		phoneNumber = keyboard.nextLine();
		System.out.print("Department: ");
		department = keyboard.nextLine();
		System.out.print("Date: ");
		date = keyboard.next();
		System.out.print("Number of qualifications: ");
		int a = keyboard.nextInt();
		qualifications = new ArrayList<Qualifications>();
		for (int i=0;i<a;i++)
		{
			System.out.println("Qualification " + (i+1) + ": ");
			qualifications.add(new Qualifications());
		}
		System.out.print("Staff ID: ");
		staffID = keyboard.nextInt();
	}
	//Getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public String getDepartment() {
		return department;
	}
	public String getDate() {
		return date;
	}
	public int getStaffID() {
		return staffID;
	}
	public List<Qualifications> getQualifications()
	{
		return qualifications;
	}
	//Method that will be used to add a qualification to an employee
	public void addQualification(Qualifications qualification)
	{
		qualifications.add(qualification);
	}
	// toString method used for easier testing of the features
	public String toString()
	{
		String a = String.format("Name: %s%n", name);
		a+= "Address: " + address + "\n";
		a+= "Phone Number: " + phoneNumber + "\n";
		a+= "Department: " + department + "\n";
		a+= "Start Date: " + date + "\n";
		a+= "Qualifications: " + "\n";
		for (Qualifications q: qualifications)
		{
			a+= q + "\n";
		}
		a+= "Staff ID: " + staffID + "\n";
		return a;
	}
}
