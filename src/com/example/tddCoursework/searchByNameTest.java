//Name: Lyubomir Kostov
//Date: 28.11.2017
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

import java.util.List;

import org.junit.Test;

public class searchByNameTest extends AbstractLoggingJUnitTest
{
	RecordManager a = new RecordManager();
	List<Employee> e;
	@Test
	public void test() 
	{
		e= a.searchByName("Bob");
		assertEquals(2,e.size());
		for (Employee q: e)
		{
			assertEquals("Bob",q.getName());
		}
	}
	
}
