import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class AgeTest 
{
	private int input;
	private String output;
	private Age age;
	public AgeTest(int input,String output)
	{
		this.input=input;
		this.output=output;
	}
	@Before
	public void ageint()
	{
		age=new Age();
	}
	@Parameterized.Parameters
	public static Collection ageget()
	{
		return Arrays.asList(new Object[][]{
			{14,"Not Elegible to vote"},
			{20,"Elegible to vote"}
			});
	}
	@Test
	public void test() 
	{
		assertEquals(output,age.election(input));
	}
}
