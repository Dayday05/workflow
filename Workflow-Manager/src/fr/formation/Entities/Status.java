package fr.formation.Entities;

import java.util.HashMap;
import java.util.Map;

public enum Status {
  
	
	TODO(0), IN_PROGRESS(1), DONE(2);

	private int order;
	
	private Status(int order) {
		this.order=order;
	}
	
	private static Map<Integer,Status> CACHE;
	
	
	static {
		CACHE = new HashMap<>();
		Status[] tabStatus= values();
		for (int i = 0; i < tabStatus.length; i++) {
			Status cuurent = tabStatus[i];
			CACHE.put(cuurent.order, cuurent);
		}
		
	}
	
	
	
}
