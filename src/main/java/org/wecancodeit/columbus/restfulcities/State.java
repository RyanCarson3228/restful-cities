package org.wecancodeit.columbus.restfulcities;

import javax.persistence.Entity;

@Entity
public class State {

	public State(String abbrv) {
//		abbrv = "OH";
	}

	public String getAbbrv() {
		return ("OH");
	}
	
}
