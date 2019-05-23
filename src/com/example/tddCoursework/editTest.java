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
	 */
package com.example.tddCoursework;

import static org.junit.Assert.*;

import org.junit.Test;

public class editTest  extends AbstractLoggingJUnitTest 
{
	RecordManager a = new RecordManager();
	@Test
	public void test() 
	{
		a.edit(4658, "Carl", "118 Doncaster Road");
		assertEquals("Carl", a.getEmployees().get(a.searchByID(4658)).getName());
		assertEquals("118 Doncaster Road", a.getEmployees().get(a.searchByID(4658)).getAddress());
	}
	
}
