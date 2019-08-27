package _06_InjectionTypes;

public class BaseBallCoach implements Coach {

    private FortuneService fortuneService;

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getDailyWork() {
        return "Spend 30 hours on baseBallCoach .  ";
    }

    public String getDailyFortune() {
        return fortuneService.getFortuneService();
    }
}
