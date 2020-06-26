package com.luv2code.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	private String emailAddress;
	private String team;
	
	//create a no-arg constructor
	public CricketCoach() {
		System.out.println(" CricketCoach : inside no-arg constructor ");
	}
	
	
	
	/**
	 * @return the emailAddress
	 */
	public String getEmailAddress() {
		return emailAddress;
	}



	/**
	 * @return the team
	 */
	public String getTeam() {
		return team;
	}



	/**
	 * @param emailAddress the emailAddress to set
	 */
	public void setEmailAddress(String emailAddress) {
		System.out.println(" CricketCoach : setEmailAddress ");
		this.emailAddress = emailAddress;
	}



	/**
	 * @param team the team to set
	 */
	public void setTeam(String team) {
		System.out.println(" CricketCoach : setTeam ");
		this.team = team;
	}



	/**
	 * @param fortuneService the fortuneService to set
	 */
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println(" CricketCoach : inside setFortuneService ");
		this.fortuneService = fortuneService;
	}



	@Override
	public String getDailyWorkout() {
		return "practice fast boling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
