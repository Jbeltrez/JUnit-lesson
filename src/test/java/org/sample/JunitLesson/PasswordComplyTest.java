package org.sample.JunitLesson;

import static org.junit.jupiter.api.Assertions.*; 
import org.junit.jupiter.api.Test; 
import junit.test.PasswordComply;


public class PasswordComplyTest {
	
	@Test 
	void testDoesPasswordComply() {
		boolean expectedResult  = true; 
		PasswordComply password = new PasswordComply("abcd1234"); 
		boolean actualResult = password.doesPasswordComply(); 
		assertEquals(expectedResult, actualResult, "Password conditions failed!"); 
		System.out.println("Password conditions success!"); 
		
		
		
	}
	@Test
	void testDoesPasswordExist() { 
		PasswordComply password = new PasswordComply("abcd1234");
		assertThrows(java.sql.SQLDataException.class, () -> password.doesNotAlreadyExist(), "SQL Exception was thrown.");
	}
	
	@Test 
	void testEmptyPassword() { 
		PasswordComply password = new PassComply("Abcd1234!"); 
		assertThrows(NullPointerException.class())
	}
	
}
