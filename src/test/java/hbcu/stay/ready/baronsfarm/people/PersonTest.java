package hbcu.stay.ready.baronsfarm.people;

import hbcu.stay.ready.baronsfarm.people.Person;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PersonTest {
	private Person person;

	@Before
	public void setUp(){
		person = new Person("Ryder");
	}

	@Test
	public void getName(){

		String expected = "Ryder";
		String actual = person.getName();
		Assert.assertEquals("SameName",expected,actual);
	}


	@Test
	public void makeNoise(){
		String actual = person.makeNoise("Let's harvest!!");
		String expected = "Let's harvest!!";
		Assert.assertEquals(expected,actual);
	}

	@Test
	public void eat(){

	}
}