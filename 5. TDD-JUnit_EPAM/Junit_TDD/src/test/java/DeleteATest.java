import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tdd.DeleteA;
public class DeleteATest {
	/*
	 * 1. ABCD -> BCD
	 * 2. AACD -> CD
	 * 3. BBAA -> BBAA
	 * 4. AABAA -> BAA
	 * 5. AAAAA -> AAA
	 */
	
	DeleteA deleteA;
	 
	@BeforeEach
	void setUp() {
		deleteA=new DeleteA(); 
	}
	
	@Test
	void testABCD() {
		assertEquals("BCD",deleteA.remove("ABCD"));
	}
	
	@Test
	void testAACD() {
		assertEquals("CD",deleteA.remove("AACD"));
	}
	
	@Test
	void testBBAA() {
		assertEquals("BBAA",deleteA.remove("BBAA"));
	}
	
	@Test
	void testAABAA() {
		assertEquals("BAA",deleteA.remove("AABAA"));
	}
	
	@Test
	void testAAAAA() {
		assertEquals("AAA",deleteA.remove("AAAAA"));
	}
}
