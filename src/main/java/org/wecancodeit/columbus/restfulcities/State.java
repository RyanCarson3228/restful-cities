package org.wecancodeit.columbus.restfulcities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class State {
	
	@Id
	@GeneratedValue
	private Long id;

	public State() {}
	
	public State(String abbrv, Long id) {
		
	}

	public String getAbbrv() {
		return ("OH");
	}
	
	public Long getId() {
		return 1L;
	}
	
	@Override
	public int hashCode() {
		return ((Long).id).hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj){
			return true;
		}
		if(obj == null || getClass() != obj.getClass()){
			return false;
		}
	}
	
}
