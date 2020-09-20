package chan.code.samples;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class InfrrdTest {

	@Test
	void testException() {
	    Throwable exception = assertThrows(IllegalArgumentException.class, () -> InfrrdAssignment.pillowMatch(0, 0));
	    assertEquals("invalid inputs", exception.getMessage());

	}


	@Test
	void testbasic() {
	    assertEquals(9, InfrrdAssignment.pillowMatch(11, 4));

	}

	@Test
	void testbasic2() {
	    assertEquals(3, InfrrdAssignment.pillowMatch(5, 2));

	}
}