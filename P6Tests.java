import static org.junit.Assert.*;
import org.junit.Test;

public class P6Tests {
		
	// Here we test calculateMax to make sure it is able to handle a 0-length array as input
	@Test
	public void testHandlingOfNoArguments(){
		String[] arr = new String[0];
		try{
			Sieve.calculateMax(arr);
			fail("Expected IllegalArgumentException to be thrown.");
		}catch(IllegalArgumentException iae){
			// This blank catch block just feels so wrong
		}
	}
	
	// Here we test the base case for calculateMax
	@Test
	public void testBaseCase(){
		String[] arr = new String[1];
		arr[0] = "50";
		try{
			Sieve.calculateMax(arr);
		}catch(IllegalArgumentException iae){
			fail("This was supposed to go smoothly");
		}
	}
	
	
}