//Name: Lyubomir Kostov
//Date: 26.11.2017
//Project: tdd Coursework
package com.example.tddCoursework;

import java.util.Scanner;

public class Qualifications 
{
	//All the information we need to store inside Qualificaations
	private String name;
	private String level;
	private String date;
	//Constructor that works with user input
	public Qualifications()
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Name of qualification: ");
		name = keyboard.nextLine();
		System.out.print("Level of qualification: ");
		level = keyboard.next();
		System.out.print("Date of qualification: ");
		date = keyboard.next();
	}
	//Constructor that works with parameters
	public Qualifications(String name, String level, String date)
	{
		this.name=name;
		this.level=level;
		this.date=date;
	}
	//Getters and setters
	public String getName() {
		return name;
	}
	public String getLevel() {
		return level;
	}
	public String getDate() {
		return date;
	}
	//toString method for easier testing of all the features
	public String toString()
	{
		String a = String.format("Qualification Name: %s%n", name);
		a+= "Qualification Level: " + level + "\n";
		a+= "Qualification Date: " + date + "\n";
		return a;
	}
}
