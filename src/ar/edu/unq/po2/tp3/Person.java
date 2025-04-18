package ar.edu.unq.po2.tp3;

import java.time.LocalDate;
import java.time.Period;

public class Person {
	
	private String name;
	private String surname;
	private LocalDate dob;
	
	//Instantiates a person
	public Person(String n, String s, LocalDate d) {
		this.name = n;
		this.surname = s;
		this.dob = d;
	}
	
	//returns the age of a person
	public int age() {
		LocalDate today = LocalDate.now();
		//calculates the distance between 2 dates (the date of birth and today)
		Period period = Period.between(dob, today);
		//returns the distance in years which is the age 
		return period.getYears();
	}
	
	public boolean isYoungerThan(Person p) {
		return this.age() < p.age();
	}
	
	//getters
	
	public String getName() { return name; }
	
	public String getSurname() { return surname; }
	
	public LocalDate getDateOfBirth() { return dob; }

}
