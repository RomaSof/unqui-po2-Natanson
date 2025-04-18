package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class WorkTeam {
	
	private String teamName;
	private ArrayList<Person> team;
	
	public WorkTeam(String name, ArrayList<Person> team) {
		this.teamName = name;
		this.team = team;
	}
	
	//returns the name of the team
	public String getName() { return teamName; }
	
	//returns the average age of the team
	public int getAverageAge() {
		validateGetAverageAge();
		int ages = 0;
		for(Person i : team) {
			ages = ages + i.age();
		}
		return ages / team.size();
	}
	
	private void validateGetAverageAge(){
		if(team.isEmpty()) {
			throw new IllegalArgumentException("team list must not be empty");
		}
	}

}
