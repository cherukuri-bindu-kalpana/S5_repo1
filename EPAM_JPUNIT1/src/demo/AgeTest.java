package demo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AgeTest 
{
	Age age;
	@Before
	public void inti()
	{
		age=new Age();
	}
	@Test
	public void test() 
	{
		assertEquals("Elegible to vote",age.election(19));
	}

}
