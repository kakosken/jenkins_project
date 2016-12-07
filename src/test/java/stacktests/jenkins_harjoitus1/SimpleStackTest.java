/**
 * 
 */
package stacktests.jenkins_harjoitus1;

import static org.junit.Assert.assertEquals;

import java.util.EmptyStackException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import stacktests.jenkins_harjoitus1.SimpleStack;

/**
 * @author oppi
 *
 */
//@RunWith(MockitoJUnitRunner.class)
public class SimpleStackTest {
	   
	@Test//(expected=ArrayIndexOutOfBoundsException.class)
	public void testPeek() {
		// yksikkötestaaminen, eli lisätty @Test...
		// ylläoleville @-kohdille importtaa ekat vaihtoehdot joka kohtaan
		SimpleStack<Integer> intStack = new SimpleStack(Integer.class, (10));
		
		for(int i=0;i<10;i++)
		{
			intStack.push(i);
		}
		int j = intStack.peek();
		assertEquals(9, j);
	}
	
	@Test//(expected=ArrayIndexOutOfBoundsException.class)
	public void testPop() {
		SimpleStack<Integer> intStack = new SimpleStack(Integer.class, (10));
		intStack.push(1);
		intStack.push(2);
		intStack.push(3);
		intStack.push(4);
		
		int value = 0;
		
		while (!intStack.isEmpty()) {
            value = intStack.pop();
            //System.out.print(value + " ");
        }
		
		assertEquals(1, value);
	}
	
	@Test(expected=ArrayIndexOutOfBoundsException.class)
	public void testPeekIndexOutOfBoundsLow() {
		SimpleStack<Integer> intStack = new SimpleStack(Integer.class, (10));
		intStack.push(1);
		intStack.push(2);
		intStack.push(3);
		intStack.push(4);
		
		int value = 0;
		
		while(!intStack.isEmpty()){
			value = intStack.pop();
		}
		
		value = intStack.pop();
		//assertEquals(0,value);
	}
	
	/* suositeltavaa, että olis tavaraa taulussa
	 * eli alempana testPeekIndexOf ... low ja ... high
	@Test(expected=ArrayIndexOutOfBoundsException.class)
	public void testPeekEmpty() {
		SimpleStack<Integer> intStack = new SimpleStack(Integer.class, (10));
		intStack.peek();
	}
	*/
	
	@Test(expected=StackEmptyException.class)
	public void testPopEmpty() throws StackEmptyException {
		SimpleStack<Integer> intStack = new SimpleStack(Integer.class, (10));
		intStack.push(1);
		intStack.push(2);
		intStack.push(3);
		intStack.push(4);
		
		int value = 0;
		
		while(!intStack.isEmpty()){
			value = intStack.pop2();
		}
		value = intStack.pop2(); // exception not handled!
		//assertEquals(0,value);
	}
	
	@Test(expected=ArrayIndexOutOfBoundsException.class)
	public void testPeekIndexOutOfBoundsHigh() {
		int arraySize = 10;
		
		SimpleStack<Integer> intStack = new SimpleStack(Integer.class, (10));
		for (int i = 0; i <= arraySize; i++){
			intStack.push(i);
		}
		/*
		intStack.push(1);
		intStack.push(2);
		intStack.push(3);
		intStack.push(4);
		intStack.push(5);
		intStack.push(6);
		intStack.push(7);
		intStack.push(8);
		intStack.push(9);
		intStack.push(10);
		intStack.push(11);
		*/
	}

}
