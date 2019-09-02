package _07_Injecting_Literal_Value;

import _07_Injecting_Literal_Value.FortuneService;

public class CricketCoach implements Coach {

   private FortuneService fortuneService;

    private String emailAdress;

    private String team;

    // no-arg constructor method
    public CricketCoach(){

        System.out.println("CricketCoach : inside no-arg constructor method ");
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getEmailAdress() {
        return emailAdress;
    }

    public void setEmailAdress(String emailAdress) {
        this.emailAdress = emailAdress;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getDailyWork() {
        return " CricketCoach : get Daily Work methods ";
    }

    public String getDailyFortune() {
        return fortuneService.getFortuneService();
    }
}
