package _06_InjectionTypes;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;

    // no-arg constructor method
    public CricketCoach(){

        System.out.println("CricketCoach : inside no-arg constructor method ");
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getDailyWork() {
        return " CricketCoach : get Daily Work methods ";
    }

    public String getDailyFortune() {
        return null;
    }
}
