package org.wecancodeit.columbus.restfulcities;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class StateTest {

	@Test
	public void stateShouldHaveAbbreviation() {
		State undertest = new State("OH");
		
		String check = undertest.getAbbrv();
		
		assertThat(check, is("OH"));
	}

	
}
