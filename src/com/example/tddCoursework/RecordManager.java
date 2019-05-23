//Name: Lyubomir Kostov
//Date: 26.11.2017
//Project: tdd Coursework
//Added searchByID method which I didn't put on the UML chart to begin with
package com.example.tddCoursework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RecordManager 
{
	//All the information needed in a RecordManager
	private List<Employee> employees;
	//Constructor that works with user input
	public RecordManager()
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Number of Employees: ");
		int a = keyboard.nextInt();
		employees = new ArrayList<Employee>();
		for (int i=0;i<a;i++)
		{
			System.out.println("Employee " + (i+1) + ": ");
			employees.add(new Employee());
		}
	}
	//get method for the only property inside the claass
	public List<Employee> getEmployees() 
	{
		return employees;
	}
	//toString method for easier testing of features
	public String toString()
	{
		String a = "Record Manager";
		a+="\n";
		int i=1;
		for (Employee e: employees)
		{
			a+= "Employee " + i + "\n";
			a+= e + "\n";
			i++;
		}
		return a;
	}
	// Method that searches for all Employee objects with a given name
	public List<Employee> searchByName(String name)
	{
		List<Employee> k= new ArrayList<Employee>();
		//Iterate through the list and find all items with the given name
		for (Employee e: employees)
		{
			// if names are equal add to list
			if (e.getName().equals(name)) k.add(e);
		}
		//Return the list that was created with the given name
		return k;
	}
	//Method that searches for an Employee by looking at their unique staffID and comparing it with a given id
	public int searchByID(int id)
	{
		int i=0;
		//Iterate through the list and find the item with the given id(id's are unique so there should be only one)
		for (Employee e: employees)
		{
			// Return the position where the object we are searching for is 
			if (e.getStaffID()==id) return i;
			i++;
		}
		// If there is no object with the given staff id return -1 (impossible arraylist position)
		return -1;
	}
	// Method used to edit the details (name and address) of an Employee given their ID
	public void edit(int id, String name, String address)
	{
		int k;
		// Call searchByID to find the position of the element
		k= searchByID(id);
		// Set the fields we need to with the given values
		employees.get(k).setName(name);
		employees.get(k).setAddress(address);
	}
	// Method used to add a qualification to an Employee given their ID
	public void addQualification(int id)
	{
		// Usual constructor for Qualifications. User inputs the qualifications he wants to add for person with given id
		Qualifications q = new Qualifications();
		// Call searchByID to find the position of the element
		int k = searchByID(id);
		// Call the addQualification method inside Employee that adds the newly created qualification to the end of the list of Employees
		employees.get(k).addQualification(q);
	}
}
