package com.develogical;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class QueryProcessorTest {

	QueryProcessor queryProcessor = new QueryProcessor();

	@Test
	public void returnsEmptyStringIfCannotProcessQuery() throws Exception {
		assertThat(queryProcessor.process("test"), is(""));
	}

	@Test
	public void knowsAboutShakespeare() throws Exception {
		assertThat(queryProcessor.process("Shakespeare"), containsString("playwright"));
	}

	@Test
	public void knowsAboutImperial() throws Exception {
		assertThat(queryProcessor.process("Imperial"),
				containsString("university"));
	}

	@Test
	public void isNotCaseSensitive() throws Exception {
		assertThat(queryProcessor.process("what is 7 plus 10"), containsString("17"));
	}

    @Test
    public void canPerformSynchroSummon() throws Exception {
        assertThat(queryProcessor.process("synchro"), containsString("tunes"));
    }

	@Test
	public void addTwoNumbers() throws Exception {
		assertThat(queryProcessor.process("5655e3d0: which of the following numbers is the largest: 499, 69"), containsString("499"));
	}

}
