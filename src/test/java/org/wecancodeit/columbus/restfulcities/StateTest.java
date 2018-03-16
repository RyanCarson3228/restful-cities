package org.wecancodeit.columbus.restfulcities;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import javax.annotation.Resource;
//import javax.persistence.EntityManager;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
public class StateTest {
	
	@Resource
	StateRepository stateRepo;
	
	@Resource
	TestEntityManager entityManager;
	
	
	

	@Test
	public void stateShouldHaveAbbreviation() {
		State undertest = new State("OH", null);
		
		String check = undertest.getAbbrv();
		
		assertThat(check, is("OH"));
	}

	@Test
	public void assertThatStateWasAddedToRepo() {
		State underTest = new State("OH", null);
		long stateId = underTest.getId();
		
		entityManager.flush();
		entityManager.clear();
		
		stateRepo.findOne(stateId);
		
		assertThat(stateRepo.findOne(stateId), is(underTest));
		
	}
}
