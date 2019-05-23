//Name: Lyubomir Kostov
//Date: 29.11.2017
//Project: tdd Coursework
/*Tests are run with the following user input:
	 * 3
	 * Bob
	 * 354 Dinsdale road
	 * 07369874531
	 * Marketing
	 * 24.03.2015
	 * 1
	 * Salesman
	 * First
	 * 01.06.2014
	 * 4658
	 * Jack
	 * 618 Barrack street
	 * 07398743498
	 * Engineering
	 * 24.01.2014
	 * 1
	 * Engineer
	 * First
	 * 07.02.2010
	 * 3698
	 * Bob
	 * 15 Colchester street
	 * 07397132046
	 * IT
	 * 27.11.2017
	 * 2
	 * Programmer
	 * Passed
	 * 20.01.2016
	 * Tester
	 * First
	 * 20.01.2016
	 * 9876
	 * 
	 * Added input: the qualification you want to add the the person with the given ID
	 * Plumber
	 * Passed
	 * 29.11.2017
	 */
package com.example.tddCoursework;

import static org.junit.Assert.*;

import java.awt.List;

import org.junit.Test;

public class addQualificationTest extends AbstractLoggingJUnitTest
{
	RecordManager a = new RecordManager();
	@Test
	public void test() 
	{
		
		a.addQualification(3698);
		assertEquals(2, a.getEmployees().get(a.searchByID(3698)).getQualifications().size());
		assertEquals("Plumber", a.getEmployees().get(a.searchByID(3698)).getQualifications().get(1).getName());
		assertEquals("Passed", a.getEmployees().get(a.searchByID(3698)).getQualifications().get(1).getLevel());
		assertEquals("29.11.2017", a.getEmployees().get(a.searchByID(3698)).getQualifications().get(1).getDate());
	}
}
