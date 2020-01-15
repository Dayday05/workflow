package fr.formation.Entities;

import java.time.LocalDate;

public class Task {
	
 private Long id;
 
 private String description;
 
 private LocalDate date;

public Long getId() {
	return id;
}

public String getDescription() {
	return description;
}

public LocalDate getDate() {
	return date;
}
 
 public void next() {
	 
 }
 
}
